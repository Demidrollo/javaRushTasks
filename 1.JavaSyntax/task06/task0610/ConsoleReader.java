package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();

    }

    public static int readInt() throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return Integer.parseInt(bufferedReader.readLine());
    }

    public static double readDouble() throws Exception {
        Scanner scanner = new Scanner(System.in);
       return scanner.nextDouble();

    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();


    }

    public static void main(String[] args) throws Exception {

    }
}
