package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> numbers = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++){
            numbers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        longLine(numbers);
    }
    public static void longLine(List list)
    {
     int count=1;
     ArrayList<Integer> numberOfmembers = new ArrayList<Integer>();
     for (int i=1; i<list.size(); i++){
         if(list.get(i-1).equals(list.get(i))){
             count++;
         } else {
             numberOfmembers.add(count);
             count = 1;
         }

        }
        numberOfmembers.add(count);
        System.out.println(Collections.max(numberOfmembers)) ;
    }
}
