package com.kruvalgen.javalearn.homeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Реализовать метод checkInterval.
 Метод должен проверять попало ли целое число в интервал от 20 до 50 и сообщить
 результат на экран в следующем виде: "Число а не содержится в интервале." или
 "Число а содержится в интервале.", где а - аргумент метода.
*/
public class Fourth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number: ");
        int num = Integer.parseInt(reader.readLine());
        checkInterval(num);
    }
    public static void checkInterval(int num){
        if(num >= 20 && num <= 50){
            System.out.println("Number in interval");
        }else{
            System.out.println("Number is not interval");
        }
    }
}
