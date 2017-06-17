package com;

import javax.persistence.Embeddable;


/**
 * Created by User on 15.06.2017.
 */
@Embeddable
public class Department {

    private int year;
    private  String title;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
}
}
