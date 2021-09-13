package com.kruvalgen.javalearn.lesson02;

public class Main {

    public static void main(String[] args) {

        User user = new User(25, "Al");
        user.setAge(26);

        System.out.println(user.getAge());

        User user1 = new User(25, "Al", "543214");

        System.out.println(user1.getName());

    }
}
