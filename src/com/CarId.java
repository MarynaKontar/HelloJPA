package com;

import javax.persistence.Embeddable;

/**
 * Created by User on 15.06.2017.
 */
@Embeddable
public class CarId {
    private int age;
    private String model;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
