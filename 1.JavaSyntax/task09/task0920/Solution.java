package com.javarush.task.task09.task0920;

/* 
Обратный отсчёт Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
                //напишите тут ваш код
            }
        }
    }
