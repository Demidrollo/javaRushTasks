package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader inputText = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat inputDateFormater = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat outputDateFormater = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        Date date = inputDateFormater.parse(inputText.readLine());
        System.out.println(outputDateFormater.format(date).toUpperCase());

    }
}
