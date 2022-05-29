package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> strings = new ArrayList<>();
      ArrayList<String> minimalStrings = new ArrayList<>();

      for(int i=0; i<5; i++){
      strings.add(bufferedReader.readLine());
      }

      minimalStrings.add(0,strings.get(0));
      for (int i=1; i<strings.size(); i++){
          if (minimalStrings.get(0).length() == strings.get(i).length()) {
              minimalStrings.add(strings.get(i));
          } else if (minimalStrings.get(0).length() > strings.get(i).length()) {
              minimalStrings.clear();
              minimalStrings.add(strings.get(i));
          }

        }
        for (int i=0; i<minimalStrings.size(); i++ ){
        System.out.println(minimalStrings.get(i));
        }
    }
}
