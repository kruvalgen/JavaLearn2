package com.kruvalgen.javalearn.homeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/
public class Firth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a;
        int b;
        int sum = 0;

        while (true){
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            sum = a + b;
            if(a == -1){
                System.out.println(sum);
                break;
            }
            System.out.println(sum);
        }

    }
}
