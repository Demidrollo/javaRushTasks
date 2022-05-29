package com.javarush.task.task03.task0320;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Скромность украшает программиста
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
 InputStreamReader inputStreamReader =  new InputStreamReader(System.in);
 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

  //System.out.print("Введи имя: ");
  String name = bufferedReader.readLine();
  //System.out.println();

  System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
