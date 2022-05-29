package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList();
        String[] massive;
        massive = new String[4];
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      for(int i=0; i<5; i++){
          numbers.add(Integer.parseInt(bufferedReader.readLine()));
      }
       Collections.sort(numbers);
      for (int i=0; i<5; i++){
          System.out.println(numbers.get(i));
      }


        //напишите тут ваш код
    }
}
