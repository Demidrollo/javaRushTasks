package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String grandFatherName = reader.readLine();
         Cat grandFather = new Cat(grandFatherName);

         String grandMotherName = reader.readLine();
         Cat grandMother = new Cat(grandMotherName);

         String fatherName = reader.readLine();
         Cat father = new Cat(grandFather, fatherName);

         String motherName = reader.readLine();
         Cat mother = new Cat(motherName, grandMother);

         String sanName = reader.readLine();
         Cat san = new Cat(sanName, grandFather, grandMother, father, mother);

         String daughterName = reader.readLine();
         Cat daughter = new Cat(daughterName, grandFather, grandMother, father, mother);

        System.out.println(grandFather.toString());
        System.out.println(grandMother.toString());
       System.out.println(father.toString());
       System.out.println(mother.toString());
        System.out.println(san.toString());
        System.out.println(daughter.toString());
    }
    public static class Cat {
        public String name;
        public Cat grandMotherInfo;
        public Cat grandFatherInfo;
        public Cat fatherInfo;
        public Cat motherInfo;

        Cat(String name) {
            this.name = name;
        }
        Cat(String name, Cat GrandMother){
            this.name = name;
            this.grandMotherInfo = GrandMother;
        }
        Cat(Cat GrandFather, String name){
            this.name = name;
            this.grandFatherInfo = GrandFather;
        }
        Cat(String name, Cat GrandFather, Cat GrandMother, Cat Father, Cat Mother) {
            this.name = name;
            this.grandFatherInfo = GrandFather;
            this.grandMotherInfo = GrandMother;
            this.fatherInfo = Father;
            this.motherInfo = Mother;
        }
        @Override
        public String toString() {
            if (fatherInfo == null && motherInfo == null && grandFatherInfo == null && grandMotherInfo == null)
            return "The cat's name is "+ name+ ", no mother, no father";
            else if (grandMotherInfo == null)
                 return "The cat's name is "+name+", no mother, father is "+grandFatherInfo.name;
                 else if (grandFatherInfo == null)
                     return "The cat's name is "+name+ ", mother is "+ grandMotherInfo.name+", no father";
                     else return "The cat's name is "+name+", mother is "+ motherInfo.name+ ", father is "+ fatherInfo.name;
        }
    }

}
