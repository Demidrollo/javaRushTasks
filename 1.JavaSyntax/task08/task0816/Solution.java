package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Сминов", dateFormat.parse("MAY 2 2016"));
        map.put("Сров", dateFormat.parse("JULY 25 2000"));
        map.put("Dima", dateFormat.parse("FEBRUARY 11 1988"));
        map.put("Valov", dateFormat.parse("JUNE 23 1999"));
        map.put("Saratov", dateFormat.parse("SEPTEMBER 1 2222"));
        map.put("Slo", dateFormat.parse("AUGUST 21 2323"));
        map.put("Saxha", dateFormat.parse("JANUARY 10 1800"));
        map.put("Stol", dateFormat.parse("JULY 23 1999"));
        map.put("Salo", dateFormat.parse("AUGUST 12 1000"));
     //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        ArrayList<String> remove = new ArrayList<String>();
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() < 8 && pair.getValue().getMonth() >4) {
                remove.add(pair.getKey());
            }
        }
        for(int i=0; i<remove.size();i++){
            map.remove(remove.get(i));
        }
    }

    public static void main(String[] args) throws ParseException {
        Map map = createMap();
//        System.out.println(map.size());
        removeAllSummerPeople(map);
//        System.out.println(map.size());
//        System.out.println(map.toString());
    }
}
