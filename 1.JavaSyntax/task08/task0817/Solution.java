package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Surname" + i, "Firstname" + i);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        String comperative = null;
        ArrayList<String> names = new ArrayList<>();
        Iterator<Map.Entry<String, String>> iteratorMap = map.entrySet().iterator();
        while (iteratorMap.hasNext()) {
            Map.Entry<String, String> pair = iteratorMap.next();
            names.add(pair.getValue());
        }
        for (int i=0; i<names.size()-1; i++){
            for (int j=i+1; j<names.size(); j++){
               if (names.get(i).equals(names.get(j)))
                   removeItemFromMapByValue(map, names.get(j));
            }
        }
    }




    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map map = createMap();
        removeTheFirstNameDuplicates(map);
//        System.out.println(map);
    }
}
