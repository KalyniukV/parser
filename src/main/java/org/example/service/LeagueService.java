package org.example.service;

import org.example.exception.LoadDataException;
import org.example.util.LoadDataHelper;
import org.example.model.SportEventWithTopLeaguePrintResult;
import org.example.model.api.league.LeagueInfo;
import org.example.model.api.sports.League;
import org.example.model.api.sports.Region;
import org.example.util.MapperHelper;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.stream.Collectors;

public class LeagueService extends BaseLeoService {
    private final EventService eventService = new EventService();

    public List<SportEventWithTopLeaguePrintResult> getPrintEventsInRegionTopLeagueResults(List<Region> regions) {
        return getTopLeaguesFromRegions(regions)
                .stream()
                .map(leagueInfo -> (ArrayList<LinkedHashMap<String, Object>>) leagueInfo.getAdditionalProperties().get("data"))
                .map(dataEventList -> dataEventList.get(0))
                .map(dataEvent -> eventService.getSportEventWithTopLeaguePrintResult((Long) dataEvent.get("id")))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private List<LeagueInfo> getTopLeaguesFromRegions(List<Region> regions) {
        List<LeagueInfo> leagueList = new ArrayList<>();
        regions.forEach(
                region -> region.getLeagues().stream()
                        .filter(League::getTop)
                        .forEach(league -> {
                            try {
                                String json = LoadDataHelper.loadData(BASE_URL + "changes/all?ctag=ru-UA&vtag=9c2cd386-31e1-4ce9-a140-28e9b63a9300&league_id=" + league.getId() + "&hideClosed=true&flags=reg,mm2,rrc,nodup,urlv2");
                                LeagueInfo leagueInfo = MapperHelper.toObject(json, LeagueInfo.class);
                                leagueList.add(leagueInfo);
                            } catch (IOException | LoadDataException e) {
                                System.out.println(e.getMessage());
                            }
                        })
        );
        return leagueList;
    }
}
