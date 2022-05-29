package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);


        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
//        Сортировка через 2 массива

/*       Arrays.sort(array);
       int[] newArray = array;
       for (int i=0; i < array.length; i++) {
           array[i] = newArray[array.length-1 - i];
       }*/

//        Сортировка через 1 массив

        Arrays.sort(array);
        int buffer;
        for (int i=0; i<array.length/2; i++){
          buffer = array[i];
          array[i] = array[array.length-1 - i];
          array[array.length-1 - i] = buffer;
        }
    }
}
