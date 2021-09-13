package com.kruvalgen.javalearn.homeWork6.Second;
/*
1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы владельцем каждого питомца была одна и та же женщина.
*/
public class Main {
    public static void main(String[] args) {

        Woman woman = new Woman("Alice", 25);
        Fish fish = new Fish("Poo", 1, woman.getName());
        Cat cat = new Cat("Dody", 2, woman.getName());
        Dog dog = new Dog("Skooby", 3, woman.getName());

        System.out.println(fish.getOwner());
        System.out.println(cat.getOwner());
        System.out.println(dog.getOwner());
    }
}
