package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number = bufferedReader.readLine();
        for (int i = 0; i<=number.length()-1;i++ ){
          if  (Character.getNumericValue(number.charAt(i))%2 == 0)
              even++;
          else odd++;
        }
        System.out.println("Even: "+ even +  " Odd: "+ odd);
    }
}
