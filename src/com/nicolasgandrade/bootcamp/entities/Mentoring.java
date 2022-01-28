package com.nicolasgandrade.bootcamp.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mentoring extends Content{

    private int mentoringPower;
    private Date date;

    SimpleDateFormat sdf = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm");

    public Mentoring(String title, String description, int mentoringPower,Date date) {
        super(title, description);
        this.mentoringPower = mentoringPower;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int calculateXp() {
        return XP_DEFAULT * mentoringPower;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + super.getTitle() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", date=" + sdf.format(date) +
                '}';
    }
}
