package com.kruvalgen.javalearn.homeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» будет получать «число1» через «число2» лет.
Пример:
Alex будет получать 4000 через 5 лет.
*/
public class Second {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = reader.readLine();
        System.out.println("Enter how much money do you want");
        int money = Integer.parseInt(reader.readLine());
        System.out.println("In how many years");
        int years = Integer.parseInt(reader.readLine());
        System.out.println(name + " будет получать " + money + " через " + years + " лет.");
    }
}
