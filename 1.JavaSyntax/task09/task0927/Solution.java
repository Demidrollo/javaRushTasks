package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

    public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }
    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> catsMap = new HashMap<String, Cat>();
        for(int i=0; i<10; i++){
            catsMap.put("Tom"+i,new Cat("Tom"+i));
        }
        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> catSet = new HashSet<>();

        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Cat> pairs = iterator.next();
            catSet.add(pairs.getValue());
        }
   /*
        // foreach для Map вместо итератора
        for (Map.Entry<String, Cat> cat: map.entrySet()) {
            System.out.println(cat.getKey()+ "||" + cat.getValue());
            }
   */

   /*
        // итератор для Set
        Iterator<Cat> iterator1 = catSet.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next().toString().toUpperCase());
        }
    */

    /*
        // foreach для mapSet вместо итератора
        for (Cat  cat: catSet) {
            System.out.println(cat.toString().toUpperCase());
        }
    */
       return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
