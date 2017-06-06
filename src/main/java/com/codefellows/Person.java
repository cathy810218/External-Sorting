package com.codefellows;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by cathyoun on 6/5/17.
 */
public class Person {
    private int age;
    private String name;
    private String countryOfOrigin;
    private String currentCity;
    private String identification;

    public Person() {

    }
    public Person(int age, String name, String countryOfOrigin, String currentCity, String identification) {
        this.age = age;
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.currentCity = currentCity;
        this.identification = identification;
    }

    public Person(int age, String name) {

    }

    public void setAge(int age) {
        this.age = age;
    }
}
