package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> stockList = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();

   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

   for(int i=0; i<20; i++){
       stockList.add(Integer.parseInt(bufferedReader.readLine()));
   }
   for(int i=0; i<stockList.size(); i++){
       if(stockList.get(i)%3!=0 && stockList.get(i)%2!=0) {
           list.add(stockList.get(i));
       } else {
           if (stockList.get(i) % 3 == 0) {
               list3.add(stockList.get(i));
              }
              if (stockList.get(i) % 2 == 0) {

               list2.add(stockList.get(i));
           }
       }
   }
   printList(list3);
   printList(list2);
   printList(list);
   }

    public static void printList(ArrayList<Integer> list) {
        for(int i=0; i<list.size(); i++){
         System.out.println(list.get(i));
        }
    }
}
