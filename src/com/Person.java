package com;

import javax.persistence.*;

/**
 * Created by User on 15.06.2017.
 */
@Entity(name = "TEST")
@Table(name = "App")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    @Column(name = "c1")
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
