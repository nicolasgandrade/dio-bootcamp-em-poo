package com.nicolasgandrade.bootcamp.entities;

public class Course extends Content {

    private int duration;

    public Course() {
    }

    public Course(String title, String description, int duration) {
        super(title, description);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int calculateXp() {
        return XP_DEFAULT * duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + super.getTitle() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", duration=" + duration +
                '}';
    }
}
