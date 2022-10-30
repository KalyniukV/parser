package org.example.service;

import com.fasterxml.jackson.core.type.TypeReference;
import org.example.exception.LoadDataException;
import org.example.exception.SportNotFoundException;
import org.example.util.LoadDataHelper;
import org.example.model.SportsEnum;
import org.example.model.api.sports.Sports;
import org.example.util.MapperHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SportService extends BaseLeoService {
    private final List<Sports> sportsList = new ArrayList<>();
    public SportService() {
        init();
    }

    private void init() {
        try {
            String json = LoadDataHelper.loadData(BaseLeoService.BASE_URL + "sports?ctag=ru-UA&flags=urlv2");
            sportsList.addAll(MapperHelper.toObject(json, new TypeReference<List<Sports>>() {}));
        } catch (IOException | LoadDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Sports> getFilteredSportList() {
        List<Sports> filteredSportList = new ArrayList<>();
        for (SportsEnum sportsEnum : SportsEnum.values()) {
            try {
                filteredSportList.add(
                        sportsList.stream()
                        .filter(sport -> sport.getFamily().equals(sportsEnum.getValue()))
                        .findFirst()
                        .orElseThrow(() -> new SportNotFoundException(sportsEnum.getValue())));
            } catch (SportNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        return filteredSportList;
    }
}
