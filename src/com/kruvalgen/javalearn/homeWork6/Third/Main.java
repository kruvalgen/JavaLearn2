package com.kruvalgen.javalearn.homeWork6.Third;
/*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы объекты стали мужем и женой.
*/
public class Main {
    public static void main(String[] args) {
        Man man = new Man("Nick", 27);
        Woman woman = new Woman("Katrin", 25);

        man.setWife(woman);
        woman.setHusband(man);
        System.out.println(man);
        System.out.println(woman);
    }
}
