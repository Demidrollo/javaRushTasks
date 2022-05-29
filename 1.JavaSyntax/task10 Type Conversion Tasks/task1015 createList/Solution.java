package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] mas = new ArrayList [10];
        for(int i=0; i<mas.length; i++){
            for(int a=0; a<10; a++){
                mas[i] = new ArrayList<String>();
                mas[i].add("Лист:" + i + " Строка:" + a);
                System.out.println("Лист:" + i + " Строка:" + a);
            }
        }
        return mas;
    }


    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}