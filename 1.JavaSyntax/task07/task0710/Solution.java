package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

  ArrayList<String> strings = new ArrayList<String>();
  for (int i=0; i<10; i++){
      strings.add(null);
  }
  /*for (int i = 0; i<10; i++ ){
      System.out.println(strings.get(i));
  }*/


  for (int i = 0; i<10; i++){
      strings.set(9 - i, bufferedReader.readLine());
  }
  for (int i = 0; i<strings.size() ; i++){
      System.out.println(strings.get(i));
  }
 }
}
