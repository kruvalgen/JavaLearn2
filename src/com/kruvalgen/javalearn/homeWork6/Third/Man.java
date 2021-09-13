package com.kruvalgen.javalearn.homeWork6.Third;

public class Man {
    private String name;
    private int age;
    private Woman wife;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Man(String name, int age, Woman wife) {
        this.name = name;
        this.age = age;
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wife=" + wife +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Woman getWoman() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }
}
