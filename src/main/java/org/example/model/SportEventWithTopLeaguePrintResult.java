package org.example.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SportEventWithTopLeaguePrintResult {
    private final String sportName;
    private final String regionName;
    private final String leagueName;
    private final List<Event> eventList;

    public SportEventWithTopLeaguePrintResult(String sportName, String regionName, String leagueName) {
        this.sportName = sportName;
        this.regionName = regionName;
        this.leagueName = leagueName;
        this.eventList = new ArrayList<>();
    }

    public String getSportName() {
        return sportName;
    }

    public void createEvent(String name, String startDate, Long id) {
        eventList.add(new Event(name, startDate, id));
    }

    public void addMarketWithRunnersValue(String marketName, String runnerName, String runnerPrice, Long runnerId) {
        Runners runners = new Runners(runnerName, runnerPrice, runnerId);
        eventList.get(eventList.size() - 1).addMarketWithRunners(marketName, runners);
    }

    public void print() {
        System.out.println(this);
        eventList.forEach(event -> {
            System.out.println(event);
            event.marketMap.values().forEach(market -> {
                System.out.println(market);
                market.runnersList.forEach(System.out::println);
            });
        });
    }

    @Override
    public String toString() {
        return String.format("%s, %s %s", sportName, regionName, leagueName);
    }

    private class Event {
        private final String name;
        private final String startTime;
        private final Long id;
        private final Map<String, Market> marketMap;

        public Event(String name, String startTime, Long id) {
            this.name = name;
            this.startTime = startTime;
            this.id = id;
            this.marketMap = new LinkedHashMap<>();
        }

        public void addMarketWithRunners (String marketName, Runners runners) {
            if (marketMap.containsKey(marketName)) {
                marketMap.get(marketName).addRunners(runners);
            } else {
                Market market = new Market(marketName);
                market.addRunners(runners);
                marketMap.put(marketName, market);
            }
        }

        @Override
        public String toString() {
            return String.format("\t%s, %s, %d", name, startTime, id);
        }
    }

    private class Market {
        private final String name;
        private final List<Runners> runnersList;

        public Market(String name) {
            this.name = name;
            this.runnersList = new ArrayList<>();
        }

        public void addRunners(Runners runners) {
            runnersList.add(runners);
        }

        @Override
        public String toString() {
            return String.format("\t\t%s", name);
        }
    }

    private class Runners {
        private final String name;
        private final String price;
        private final Long id;

        public Runners(String name, String price, Long id) {
            this.name = name;
            this.price = price;
            this.id = id;
        }

        @Override
        public String toString() {
            return String.format("\t\t\t%s, %s, %d", name, price, id);
        }
    }

}
