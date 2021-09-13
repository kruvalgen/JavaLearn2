package com.kruvalgen.javalearn.homeWork2;



/*
1) Создать метод convert, который должен конвертировать евро в доллары. В метод должен приходить один аргумент (к-во евро). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/
public class Second {
    public static void main(String[] args) {

        System.out.println(convert(1));
        System.out.println(percent(25));
        print("Hello");

    }
    public static double convert(double EUR){

        double USD = EUR * 0.84;
        return USD;
    }

    public static double percent(double num){
        double res = num + (num / 10);
        return res;
    }
    public static void print(String str){
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }
}
