package com.javarush.task.task10.task1007;

//Задача №7 на преобразование целых типов

public class Solution {
    public static void main(String[] args) {
        long l = (int) 1234_564_890L;
//        System.out.println(l);
        int x = (byte) 0b1000_1100_1010;
//        System.out.println(x);
        double m = (byte) 110_987_654_6299.123_34;
//        System.out.println(m);
        float f =  (float) l++ + (long) 10 + (float)++x -  (short)m;
//        System.out.println(f);
        l =  (long) f / 1000;


        System.out.println(l);
//        System.out.println((char)((int) '耰'+  1+2));


    }
}
