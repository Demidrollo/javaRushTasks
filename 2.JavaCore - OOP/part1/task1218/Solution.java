package com.javarush.task.task12.task1218;

/*
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
      public void eat(){
      System.out.println("Dog can eat");
      }
      public void move(){
      System.out.println("Dog can move");
      }
    }

    public class Duck implements CanEat, CanMove, CanFly {
        public void eat() {
            System.out.println("Duck can eat");
        }

        public void move() {
            System.out.println("Duck can move");
        }

        public void fly() {
            System.out.println("Duck can fly");
        }
    }

    public class Car implements CanMove {
      public void move(){
      System.out.println("Car can move");
      }
    }

    public class Airplane implements CanFly, CanMove {
      public void fly(){
      System.out.println("Airplain can fly");
      }
      public void move(){
      System.out.println("Airplain can move");
      }
    }
}