package com.kruvalgen.javalearn.homeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Реализовать метод closeToFive.
 Метод должен выводить на экран ближайшее к 5 из двух чисел, записанных в
 аргументах метода. Например, среди чисел 3 и 6 ближайшее к пяти 6.
 Если оба числа на равной длине к 5, то вывести на экран любое из них.
*/
public class Firth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first num");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter second num");
        int num2 = Integer.parseInt(reader.readLine());

        closeToFive(num1, num2);
    }
    public static void closeToFive(int num1, int num2){

        if (num1 < num2){
            System.out.println(Math.abs(num1));
        }else if(num1 > num2){
            System.out.println(Math.abs(num2));
        }

    }
}
