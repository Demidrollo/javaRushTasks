package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код

        for (int i = 0; i < strings.size(); i++) {
            boolean checkL = false;
            boolean checkR = false;

            for (int j = 0; j < strings.get(i).length(); j++) {
                if (strings.get(i).charAt(j) == 'р') {
                    checkR = true;
                }
                if (strings.get(i).charAt(j) == 'л') {
                    checkL = true;
                }
            }
            if (checkL==false && checkR == true){
                strings.remove(i);
                i--;
            } else
            if(checkL==true && checkR==false) {
                strings.add(i, strings.get(i));
                i++;
            }

        }
         return strings;
    }
}
