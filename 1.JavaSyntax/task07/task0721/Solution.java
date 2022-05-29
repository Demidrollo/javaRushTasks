package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
   public static void main(String[] args) throws IOException {
   int[] array = getInts();
        System.out.print(array[0] + " " + array[array.length-1] );
    }

    public static int[] getInts() throws IOException{
    BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[20];
      for(int i=0; i<array.length; i++) {
      array[i] = Integer.parseInt(bufferedReader1.readLine());
      }
        Arrays.sort(array);
    return array;
    }
}
