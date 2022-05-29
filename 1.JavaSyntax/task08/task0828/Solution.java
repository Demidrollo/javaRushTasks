package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        chooseMonth(createMonthsMap(), new BufferedReader(new InputStreamReader(System.in)).readLine());

    }
    public static Map<String, Integer> createMonthsMap (){
    Map<String, Integer> mapMonth = new HashMap<>();
        mapMonth.put("January", 1);
        mapMonth.put("February", 2);
        mapMonth.put("March", 3);
        mapMonth.put("April", 4);
        mapMonth.put("May", 5);
        mapMonth.put("June", 6);
        mapMonth.put("July", 7);
        mapMonth.put("August", 8);
        mapMonth.put("September", 9);
        mapMonth.put("October", 10);
        mapMonth.put("November", 11);
        mapMonth.put("December", 12);

    return mapMonth;
    }

    public static void chooseMonth (Map<String, Integer> mapMonth, String nameOfMonth){
      System.out.println(nameOfMonth+" is the "+mapMonth.get(nameOfMonth)+" month");
//        "May is the 5 month"
    }
}
