package com.kruvalgen.javalearn.homeWork1;

/*
1) Создать три переменных (number1, number2, number3) типа int, присвоить им значение 10, 18, 21 соответственно.
2) Не используя чисел, сделать так, чтобы значение у переменной number1 изменилось на 18
2) Не используя чисел, сделать так, чтобы значение у переменной number2 изменилось на 21
2) Не используя чисел, сделать так, чтобы значение у переменной number3 изменилось на 10
3) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
*/
public class Second {

    public static void numbers() {
        int number1 = 10;
        int number2 = 18;
        int number3 = 21;
        int num;

        num = number1;
        number1 = number2;//18
        number2 = number3;//21
        number3 = num;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }

}
