package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

//   Вариант №1 - c созданием переменной массива и присвоением ей StackTraceElement

    /* public static void log(String string) {
    //Создание ссылочной переменной Elements (массив способный хранить элементы StackTraceElement). Присваение ссылки на объект
    StackTraceElement[] Elements = Thread.currentThread().getStackTrace();
    //Узнаем имя класса метода который вызвал метод log и присваемой переменной типа (класса) String
    String className = Elements[2].getClassName();
    //Узнаем имя метода который вызвал метод log и присваемой переменной типа (класса) String
    String methodName = Elements[2].getMethodName();
    //Выполняем вывод информации на экран, согласн примеру указаному в условии задачи
    System.out.println(className + ": "+ methodName + ": " + string);
    }*/

//  Компактный вариант без создания переменных

    public static void log(String text) {
        //напишите тут ваш код
     System.out.println( Thread.currentThread().getStackTrace()[2].getClassName() + ": "+ Thread.currentThread().getStackTrace()[2].getMethodName()+": "+text);

    }
}
