package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        String date = "JANUARY 1 2020";
        System.out.println(date + " = " + isDateOdd(date));
    }
    public static boolean isDateOdd(String date) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);

    Date finishDate = dateFormat.parse(date);
    Date startDate = new Date(finishDate.getYear(), 0, 1);
    long a = (finishDate.getTime() - startDate.getTime()) / 86400000 +1;

//        System.out.println(finishDate.getTime());
//       System.out.println(startDate.getTime()/86400000);

        return a % 2 != 0;
    }
}
