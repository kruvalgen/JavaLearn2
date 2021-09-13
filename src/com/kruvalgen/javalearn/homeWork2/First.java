package com.kruvalgen.javalearn.homeWork2;
/*
1) Создать метод sum, который должен суммировать 2 числа.
1) Создать метод multy, который должен умножить 2 числа.
1) Создать метод subt, который должен вычесть второе число из первого.
1) Создать метод div, который должен делить 2 числа.
*/

public class First {

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(multy(8,2));
        System.out.println(subt(7, 9));
        System.out.println(div(12, 8));

    }

    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }

    public static int multy( int a, int b){
        int c = a * b;
        return c;
    }

    public static int subt(int a, int b){
        int c = a - b;
        return c;
    }
    public  static double div(double a, double b){
        double c  = a / b;
        return c;
    }

}
