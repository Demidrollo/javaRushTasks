package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
   ArrayList<String> strings =new ArrayList<>();

   for(int i = 0; i<5; i++){
   strings.add(bufferedReader.readLine());
  }
   for(int i=1; i<=13; i++){
   strings.add(0,strings.get(4));
   strings.remove(5);
  }
   for (int i=0; i<5; i++) {
       System.out.println(strings.get(i));
   }
 }
}
