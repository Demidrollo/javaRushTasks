package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> peopleMap = new HashMap<String, String>();
        for (int i=0; i<3; i++){
            peopleMap.put("SecondName"+i, "FirstName");
        }
        for (int i=0; i<3; i++){
            peopleMap.put("SecondName", "FirstName"+i);
        }
        for (int i=0; i<4; i++){
            peopleMap.put("SecondName"+i, "FirstName"+i);
        }
        return peopleMap;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
