package com.javarush.task.task13.task1318;


import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        try {
            runner();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void runner() throws IOException {

        BufferedReader bufferedReader = null;
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            System.out.println("Введите путь к файлу");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String path = bufferedReader.readLine();

            inputStream = new FileInputStream(path);
            bufferedInputStream = new BufferedInputStream(inputStream);

            while (bufferedInputStream.available() > 0) {
                System.out.print((char) bufferedInputStream.read());
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            runner();
        } finally {
            bufferedReader.close();
            inputStream.close();
            bufferedInputStream.close();
        }

    }
}
