package com.javarush.task.task13.task1326;



import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
      // напишите тут ваш код
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<Integer> numbers = new ArrayList<Integer>();

      FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
      
      Scanner scanner = new Scanner(fileInputStream);
      while (scanner.hasNext()) {
       numbers.add( Integer.parseInt(scanner.nextLine()));
      }
        fileInputStream.close();

        Collections.sort(numbers);

        for (Integer number: numbers) {
            if (number %2 == 0){
                System.out.println(number);
            }
        }
    }
}
