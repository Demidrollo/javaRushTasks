package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> listOfnumbers = new ArrayList<>();
    try {
        while (true) {
            listOfnumbers.add(Integer.parseInt(bufferedReader.readLine()));
        }
    }
    catch (Exception e)
    {
        for (Integer number :listOfnumbers) {
            System.out.println(number);
        }
    }


        //напишите тут ваш код
    }
}
