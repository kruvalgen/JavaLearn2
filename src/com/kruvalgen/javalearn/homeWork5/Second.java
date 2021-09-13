package com.kruvalgen.javalearn.homeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
pro
2
Пример вывода:
pro
pro
*/
public class Second {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        int num = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= num; i++) {
            System.out.println(str);
        }
    }
}
