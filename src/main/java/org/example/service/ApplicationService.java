package org.example.service;

import org.example.model.api.sports.Sports;
import org.example.model.SportEventWithTopLeaguePrintResult;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


public class ApplicationService {
    private final SportService sportService = new SportService();
    private final LeagueService leagueService = new LeagueService();

    public void init() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CompletableFuture<List<SportEventWithTopLeaguePrintResult>>> futureList = new ArrayList<>();

        List<Sports> filteredSportList = sportService.getFilteredSportList();
        filteredSportList.forEach(sports -> futureList.add(
                CompletableFuture.supplyAsync(() -> leagueService.getPrintEventsInRegionTopLeagueResults(sports.getRegions()), executorService))
        );

        Map<String, List<SportEventWithTopLeaguePrintResult>> resultsMap = new HashMap<>();

        futureList.forEach(future -> {
            try {
                List<SportEventWithTopLeaguePrintResult> printResults = future.get();
                if (!printResults.isEmpty()) {
                    resultsMap.put(printResults.get(0).getSportName(), printResults);
                }
            } catch (ExecutionException e) {
                System.out.println(e.getMessage());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        });

        executorService.shutdown();

        filteredSportList.forEach(sports -> {
            List<SportEventWithTopLeaguePrintResult> printResults = resultsMap.get(sports.getName());
            if (printResults != null) {
                printResults.forEach(SportEventWithTopLeaguePrintResult::print);
            }
        });
    }
}