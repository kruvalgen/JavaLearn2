package com.kruvalgen.javalearn.homeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
 Если число отрицательное, то увеличить его на 10. Вывести результат на экран.
*/
public class Third {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int num = Integer.parseInt(reader.readLine());
        if(num > 0){
            int a = num * 2;
            System.out.println(a);
        }else if(num < 0){
            int b  = num + 10;
            System.out.println(b);
        }else{
            System.out.println("Number equals zero");
        }

    }
}
