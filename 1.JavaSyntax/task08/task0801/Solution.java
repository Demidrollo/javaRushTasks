package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> hashSet = new HashSet<String>();

        hashSet.add("арбуз");
        hashSet.add("банан");
        hashSet.add("вишня");
        hashSet.add("груша");
        hashSet.add("дыня");
        hashSet.add("ежевика");
        hashSet.add("женьшень");
        hashSet.add("земляника");
        hashSet.add("ирис");
        hashSet.add("картофель");

        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
   /*     System.out.println();
        for(String i: hashSet){
            System.out.println(i);
        }*/
    }
}
