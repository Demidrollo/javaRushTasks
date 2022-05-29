package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> famelySalary = new HashMap<String, Integer>();

        famelySalary.put("Andreanov", 550);
        famelySalary.put("Puskin", 600);
        famelySalary.put("Sarhay", 12032);
        famelySalary.put("BatMan", 122);
        famelySalary.put("MaxPayn", 0);
        famelySalary.put("Dox", 12);
        famelySalary.put("SPEED", 121221);
        famelySalary.put("Dread", 121221212);
        famelySalary.put("Marek", 999999999);
        famelySalary.put("DogyStyle", -223);

        return famelySalary;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        boolean delete = false;
        String  key=null;

        ArrayList<String> keys = new ArrayList<>();
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pairs = iterator.next();
            if (pairs.getValue() < 500) {
                keys.add(pairs.getKey());
            }
        }
        for (int i = 0; i<keys.size(); i++){
            map.remove(keys.get(i));
        }

    }

    public static void main(String[] args) {
    Map map = createMap();
    removeItemFromMap(map);
       /* removeItemFromMap(map);*/



    }
}