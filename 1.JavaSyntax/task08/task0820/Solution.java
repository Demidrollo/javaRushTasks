package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);


        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        for(int i=0; i<4; i++) {
            cats.add(new Cat());
        }
        //напишите тут ваш код
        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<Dog>();
        for (int i=0; i<3; i++){
            dogs.add(new Dog());
        }
        //напишите тут ваш код

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> join = new HashSet<Object>();
        join.addAll(cats);
        join.addAll(dogs);
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()){
           System.out.println(iterator.next());
        }
        //напишите тут ваш код
    }
    public static class Dog{
        Dog(){

        }
    }
    public static class Cat{
        Cat(){

        }
    }
    //напишите тут ваш код
}
