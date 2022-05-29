package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {

        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {

        Integer maх = inputArray[0] , min = inputArray[0];

        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        } else {
            for (int i = 1; i < inputArray.length; i++) {

                if (min > inputArray[i]) {
                    min = inputArray[i];
                }
                if (maх < inputArray[i]) {
                    maх = inputArray[i];
                }
            }
            return new Pair(min, maх);
        }
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}