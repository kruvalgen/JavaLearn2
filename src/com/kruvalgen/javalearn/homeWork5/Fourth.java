package com.kruvalgen.javalearn.homeWork5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Вывести на экран квадрат 10х10 из букв P используя цикл while.
*/
public class Fourth {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10){
            int j = 1;
            while (j < 10){
                System.out.print("P");
                j++;
            }
            System.out.println("P");
            i++;

        }
    }
}
