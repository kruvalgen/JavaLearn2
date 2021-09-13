package com.kruvalgen.javalearn.homeWork4;
/*
Ввести с клавиатуры два числа, вывести на экран максимальное из них.
Ввести с клавиатуры три числа, вывести на экран минимальное из них.
Ввести с клавиатуры три числа, вывести на экран среднее из них.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number: ");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(reader.readLine());

//        if(num1 > num2){
//            System.out.println(num1 + " bigest " + num2);
//        }else if(num1 < num2){
//            System.out.println(num1 + " smaller " + num2);
//        }else{
//            System.out.println("Numbers equals");
//        }
        System.out.println("Enter third number: ");
        int num3 = Integer.parseInt(reader.readLine());

//        if(num1 < num2 && num1 < num3){
//            System.out.println(num1 + " smaller");
//        }else if (num2 < num1 && num2 < num3){
//            System.out.println(num2 + " smaller");
//        }else {
//            System.out.println(num3 + " smaller");
//        }
        if (num1 < num2 && num1 > num3 || num1 >num2 && num1 < num3){
            System.out.println(num1);
        }else if(num2 < num3 && num2 > num1 || num2 > num3 && num2 < num1){
            System.out.println(num2);
        }else  {
            System.out.println(num3);
        }
    }

}
