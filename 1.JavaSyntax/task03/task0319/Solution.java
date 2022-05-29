package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    String name = bufferedReader.readLine();
    //String string1 = bufferedReader.readLine();
    String number1 = bufferedReader.readLine();
    String number2 = bufferedReader.readLine();


    System.out.println(name + " получает " + number1 + " через "+ number2 + " лет.");
    }
}
