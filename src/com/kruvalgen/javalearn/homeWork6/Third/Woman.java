package com.kruvalgen.javalearn.homeWork6.Third;

public class Woman {
    private String name;
    private int age;
    private Man husband;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Woman(String name, int age, Man husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", husband=" + husband +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Man getMan() {
        return husband;
    }

    public void setHusband(Man husband) {
        this.husband = husband;
    }
}
