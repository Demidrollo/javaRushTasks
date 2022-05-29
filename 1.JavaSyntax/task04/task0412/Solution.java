package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Положительное и отрицательное число
*/
class Additional {
    public static void positiveNegativeNumber(int num) {
        if (num < 0)
            System.out.println(num + 1);
        if (num > 0)
            System.out.println(num * 2);
        if (num == 0)
            System.out.println(num);
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int number = Integer.parseInt(bufferedReader.readLine());

        Additional.positiveNegativeNumber(number);

    }

}