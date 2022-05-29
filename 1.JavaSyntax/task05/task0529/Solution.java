package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int sum = 0;

        String input;
        while (true){
            input = bufferedReader.readLine();
            if (input.equals("exit")){
                break;
            } else
                if (input.equals("сумма")){
                    System.out.println(sum);
                    break;
                } else
            sum = sum + Integer.parseInt(input);

        }

    }
}
