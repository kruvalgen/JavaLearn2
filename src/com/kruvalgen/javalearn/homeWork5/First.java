package com.kruvalgen.javalearn.homeWork5;
/*
Вывести на экран числа от 1 до 10 используя цикл while.
Вывести на экран числа от 10 до 1 используя цикл while.

Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/


public class First {
    public static void main(String[] args) {
//        int i = 1;
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }
//        int j = 10;
//        while(j >= 1){
//            System.out.println(j);
//            j--;
//        }

        for (int i = 0; i < 100; i+=2) {
            System.out.print(i + " ");
        }
    }
}
