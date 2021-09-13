package com.kruvalgen.javalearn.lesson02;

public class User {
    private int age;
    private String name;
    private String passportData;

    public User(int age, String name, String passportData) {
        this.age = age;
        this.name = name;
        this.passportData = passportData;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void say(String str){
        System.out.println(str);
    }
}
