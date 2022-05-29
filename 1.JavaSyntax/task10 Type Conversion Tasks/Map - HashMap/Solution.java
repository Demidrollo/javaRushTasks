package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.HashMap;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        ArrayList<Integer> integers = new ArrayList<Integer>();
        ArrayList<String> strings = new ArrayList<String>();

        int number;
        String numberStr;
        String string;

        while (true) {
            numberStr = reader.readLine();
            if (numberStr.equals("")) {
                break;
            } else {
                number = Integer.parseInt(numberStr);
            string = reader.readLine();
            if (string.equals("")) {
                    hashMap.put(string, number);
                    break;
                }
            }
            hashMap.put(string, number);
        }


 for (Map.Entry entry: hashMap.entrySet()){
            System.out.println(entry.getValue()+ " " + entry.getKey());
        }

    }
}