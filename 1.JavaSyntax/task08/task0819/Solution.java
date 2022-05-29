package com.javarush.task.task08.task0819;

//import com.javarush.task.task06.task0604.Cat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());
        printCats(cats);
        //напишите тут ваш код. step 3 - пункт 3

    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        //напишите тут ваш код. step 2 - пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // step 4 - пункт 4
    }

    public static class Cat {
    }
    // step 1 - пункт 1
}
