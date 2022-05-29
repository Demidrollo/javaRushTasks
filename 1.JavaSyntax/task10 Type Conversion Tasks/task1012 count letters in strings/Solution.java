package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }
        HashMap<Character, Integer> equals = new HashMap<Character,Integer>();
        for (int i = 0; i<alphabet.size(); i++){
            equals.put(alphabet.get(i), 0);
        }

        for (int i = 0; i<list.size(); i++){
            for (int j = 0; j<list.get(i).length(); j++){
                if (equals.containsKey(list.get(i).charAt(j))){
                    equals.put(list.get(i).charAt(j),equals.get(list.get(i).charAt(j))+1);
                }
            }
        }

        list.clear();

//         Вариант №1
        Iterator<Map.Entry<Character, Integer>> itr = equals.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Character, Integer> entry =  itr.next();
            list.add(entry.getKey()+ " " + entry.getValue());
        }

        Collections.sort(list);
        list.add(6, list.get(32));
        list.remove(33);


//        String buffer;
//        for (int i = 0 ; i< list.size(); i++) {
//            for (int j = 0; j < alphabet.size(); j++) {
//                if (list.get(i).charAt(0) == alphabet.get(j)) {
//                    buffer = list.get(i);
//                    list.remove(i);
//                    list.add(j, buffer);
//                }
//            }
//        }


        for (String element:list) {
            System.out.println(element);
        }

        /*
//       Вариант №2
       for(Map.Entry<Character, Integer> entry: equals.entrySet()) {
            // get key // get value
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

//       Вариант №3
       for (Map.Entry entry: equals.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }*/
    }
}
