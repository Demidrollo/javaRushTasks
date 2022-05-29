package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberInput = Integer.parseInt(reader.readLine());

        if (numberInput > 0) {


            int[] numbers = new int[numberInput];

            for (int i = 0; i <= numbers.length - 1; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());
            }
            int maximum = numbers[0];
            for (int i = 0; i <= numbers.length - 2; i++) {
                if (maximum < numbers[i + 1]) {
                    maximum = numbers[i + 1];
                }
            }
            System.out.println(maximum);
         }
        }
}
