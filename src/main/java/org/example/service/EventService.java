package org.example.service;

import org.example.exception.LoadDataException;
import org.example.util.LoadDataHelper;
import org.example.model.api.event.Event;
import org.example.model.api.event.Market;
import org.example.model.SportEventWithTopLeaguePrintResult;
import org.example.util.MapperHelper;

import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class EventService extends BaseLeoService {

    public SportEventWithTopLeaguePrintResult getSportEventWithTopLeaguePrintResult(Long eventId) {
        try {
            String json = LoadDataHelper.loadData(BASE_URL + "event/all?ctag=ru-UA&eventId=" + eventId + "&flags=reg,mm2,rrc,nodup,urlv2,smg,outv2");
            Event event = MapperHelper.toObject(json, Event.class);

            SportEventWithTopLeaguePrintResult result = new SportEventWithTopLeaguePrintResult(
                                                            event.getLeague().getSport().getName(),
                                                            event.getLeague().getRegion().getName(),
                                                            event.getLeague().getName());

            result.createEvent(event.getName(), kickoffToStringDate(event.getKickoff()), eventId);

            List<Market> markets = event.getMarkets();
            markets.forEach(market -> {
                market.getRunners().forEach(runner -> {
                    result.addMarketWithRunnersValue(market.getName(), runner.getName(), runner.getPriceStr(), runner.getId());
                });
            });

            return result;
        } catch (IOException | LoadDataException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private String kickoffToStringDate(Long kickoff) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(kickoff),
                Clock.systemUTC().getZone());
        return dateTime.format(formatter) + " UTC";
    }
}