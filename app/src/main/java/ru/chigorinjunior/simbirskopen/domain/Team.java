package ru.chigorinjunior.simbirskopen.domain;

import java.util.List;

public class Team {
    private String name;
    private List<TourResults> tourResults;

    public Team() {
    }

    public Team(String name, List<TourResults> teamResults) {
        this.name = name;
        this.tourResults = teamResults;
    }

    public String getName() {
        return name;
    }

    public List<TourResults> getTourResults() {
        return tourResults;
    }
}
