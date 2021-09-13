package com.kruvalgen.javalearn.homeWork3;


/*
Ввести с клавиатуры число n.
Вывести на экран надпись «Я зарабатываю $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number n:");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Я буду зарабатывать " + n + "$ в час" );
    }
}
