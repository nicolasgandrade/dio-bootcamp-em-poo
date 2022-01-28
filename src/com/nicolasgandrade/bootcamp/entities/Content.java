package com.nicolasgandrade.bootcamp.entities;

public abstract class Content {

    protected static final int XP_DEFAULT = 100;

    private String title;
    private String description;

    public abstract int calculateXp();

    public Content() {
    }

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
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
}
