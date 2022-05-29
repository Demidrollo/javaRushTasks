package com.javarush.task.task13.task1319;


import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String path = null;
        path = reader();
        fileWriter(path);
    }

    static String reader() throws IOException {
        BufferedReader bufferedReader = null;
        String str = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.fillInStackTrace();
            bufferedReader.close();
            return str;
        }
    }

    static void fileWriter(String path) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\" + path + ".txt"));
        String string;
        do {
            string = reader();
            bufferedWriter.write(string +  "\n");
            if (string.equals("exit"))
            {
                break;
            }
        } while (true);
        bufferedWriter.close();

    }
}

