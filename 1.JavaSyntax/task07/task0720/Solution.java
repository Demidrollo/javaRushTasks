package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
     ArrayList<String> strings = new ArrayList<String>();
     for(int i=0; i<n; i++){
       strings.add(reader.readLine());
     }
       for(int i=0; i<m; i++){
       strings.add(strings.get(0));
       strings.remove(0);
     }
       for (int i=0; i<strings.size(); i++) {
           System.out.println(strings.get(i));
       }
    }
}
