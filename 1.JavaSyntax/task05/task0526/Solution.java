package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Stive", 32, "Nevskiy");
        Man man2 = new Man("Jack", 23, "Soda");
        Woman woman1 = new Woman("Sali", 24, "Mancheste");
        Woman woman2 = new Woman("Helgas", 26, "Skitels");

        man1.printOut();
        man2.printOut();
        woman1.printOut();
        woman2.printOut();

        System.out.println();
    }

    public static class Person {
        String name;
        int age;
        String address;

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;


        }
        public void printOut(){
            System.out.println(this.name+" "+this.age+" "+this.address);
        }
    }

    public static class Man extends Person {
        public Man(String name, int age, String address) {
            super(name, age, address);
        }
      /*
            this.name = name;
            this.age = age;
            this.address = address;
        } */
    }

    public static class Woman extends Person {
        public Woman(String name, int age, String address) {
            super(name, age, address);
        }
            /*
            this.name = name;
            this.age = age;
            this.address = address;
        }
        */
    }
}
