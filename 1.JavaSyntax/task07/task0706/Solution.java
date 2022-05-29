package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader buferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[15];
        int sum1 =0;
        int sum2 =0;
        for (int i=0; i<15; i++){
            numbers[i] = Integer.parseInt(buferedReader.readLine());
        }
        for (int i=0; i<15; i++){
             if (i%2 !=0)
                sum1 = sum1 + numbers[i];
           else sum2 = sum2 + numbers[i];
        }
        if (sum1>sum2)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        if (sum1<sum2)
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
