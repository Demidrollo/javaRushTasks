package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
//        map.put("Andreanov", "Andrey");
//        map.put("Andreanov", "Kiril");
//        map.put("Matveev", "Kiril");
        for (int i = 0; i<10; i++){
            map.put("Famaly"+i, "Name"+i);
        }
    return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countTheSameFirstName=0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name))
            countTheSameFirstName++;
        }
    return countTheSameFirstName;
    }
    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countTheSameLastName = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if(pair.getKey().equals(lastName))
            countTheSameLastName++;
        }
    return countTheSameLastName;
    }

    public static void main(String[] args) {

    }
}
