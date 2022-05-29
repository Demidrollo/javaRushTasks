package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {
          public void run(){
              System.out.println("Human can run");
          }
          public void swim(){
              System.out.println("Human can swim");
          }
    }

    public class Duck implements CanRun, CanFly, CanSwim {
           public void run(){
               System.out.println("Duck can run");
           }
           public void fly() {
               System.out.println("Duck can fly");
           }
           public void swim(){
               System.out.println("Duck can swim");
           }
    }

    public class Penguin implements CanRun, CanSwim {
           public void run(){
               System.out.println("Penguin can run");
           }
           public  void swim(){
               System.out.println("Penguin can swim");
           }
    }

    public class Airplane implements CanFly {
          public void fly(){
              System.out.println("Airplane can fly");
          }
    }
}
