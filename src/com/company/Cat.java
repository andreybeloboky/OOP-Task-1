package com.company;

public class Cat {

    private int age;
    String name;

    /**
     * @param age  -age cat have written user;
     * @param name -name cat have written user;
     */
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * @return - age cat;
     */
    public int ageCat() {
        return age;
    }
}