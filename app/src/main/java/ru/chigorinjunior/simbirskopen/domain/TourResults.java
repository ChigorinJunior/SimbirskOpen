package ru.chigorinjunior.simbirskopen.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TourResults {
    private List<Long> questions;

    public TourResults(List<Long> questions) {
        this.questions = questions;
    }

    public TourResults() {
    }
}
