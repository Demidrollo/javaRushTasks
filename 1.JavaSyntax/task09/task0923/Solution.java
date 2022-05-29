package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
//    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();

////    Вариант №1
//        String stringOfVolwels="";
//        String stringOfConsonants="";
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] != ' ')
//            {
//                if (isVowel(chars[i]))
//                    stringOfVolwels = stringOfVolwels + chars[i] + " ";
//                 else stringOfConsonants = stringOfConsonants + chars[i] + " ";
//            }
//        }
//        System.out.print(stringOfVolwels);
//        System.out.println("");
//        System.out.print(stringOfConsonants);

//      Вариант решения №2
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ' && isVowel(chars[i]))
                System.out.print(chars[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ' && !isVowel(chars[i]))
                System.out.print(chars[i] + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}