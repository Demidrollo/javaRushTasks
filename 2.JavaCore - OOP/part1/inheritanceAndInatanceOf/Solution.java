package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
     if(o instanceof Cat){
         return  "Кот";
     }
     if (o instanceof Tiger){
         return "Тигр";
     }
     if (o instanceof Lion){
         return "Лев";
     }
     if (o instanceof Bull){
         return "Бык";
     }
     else {
         return "Животное";
     }

    }

    public static class Cat {
//        String animal = "Кот";
    }

    public static class Tiger {
//        String animal = "Тигр";
    }

    public static class Lion {
//        String animal = "Лев";
    }

    public static class Bull {
//        String animal = "Бык";
    }

    public static class Pig {
//        String animal = "животное";
    }
}
