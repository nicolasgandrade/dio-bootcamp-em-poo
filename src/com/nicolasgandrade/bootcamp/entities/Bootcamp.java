package com.nicolasgandrade.bootcamp.entities;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private String title;
    private String description;
    private int durationDays;
    private LocalDate initialDate = LocalDate.now();
    private LocalDate finalDate = initialDate.plusDays(durationDays);
    private List<Dev> devs = new ArrayList<>();
    private Set<Content> contentSet = new LinkedHashSet<>();

    public Bootcamp() {
    }

    public Bootcamp(String title, String description, int durationDays) {
        this.title = title;
        this.description = description;
        this.durationDays = durationDays;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }

    public Set<Content> getContentSet() {
        return contentSet;
    }

    public void setContentSet(Set<Content> contentSet) {
        this.contentSet = contentSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return durationDays == bootcamp.durationDays && Objects.equals(title, bootcamp.title) && Objects.equals(description, bootcamp.description) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(devs, bootcamp.devs) && Objects.equals(contentSet, bootcamp.contentSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, initialDate, durationDays, finalDate, devs, contentSet);
    }
}
