package com.javarush.task.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вызовов get
*/

public class Solution {
    public static void main(String[] args) {
        List fill1 = fill(new ArrayList());
        List fill2 = fill(new LinkedList());

        System.out.println(getGetTimeInMs(fill1));
        System.out.println(getGetTimeInMs(fill2));

//        System.out.println(getGetTimeInMs(fill(new ArrayList())));
//        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // напишите тут ваш код
        Date time0 = new Date();
        get10000(list);
        Date time1 = new Date();
        return  time1.getTime()-time0.getTime();

    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
