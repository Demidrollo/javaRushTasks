package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        upCaseOutput(string);
        //напишите тут ваш код
    }

    public static void upCaseOutput(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (i == 0) chars[i] = Character.toUpperCase(chars[i]);
            if (chars[i] == ' ') {
                chars[i+1] = Character.toUpperCase(chars[i+1]);
            }
        }
        System.out.println(String.copyValueOf(chars) );

    }
}
