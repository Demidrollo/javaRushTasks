package com.javarush.task.task08.task0824;

import java.util.*;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human holterMasha = new Human("Маша", 16, false);
        Human holterSasha = new Human("Саша", 16, true);
        Human holterVitia = new Human("Витя", 13,true);

        Human holterJack = new Human("Джек", 37, true, new ArrayList<Human>(Arrays.asList(holterMasha, holterSasha, holterVitia)));
        Human holterMaria = new Human ("Мариа", 30, false, new ArrayList<Human>(Arrays.asList(holterMasha, holterSasha, holterVitia)));

        Human holterAleksandr = new Human("Александр", 67, true, new ArrayList<Human>(Arrays.asList(holterJack)));
        Human holterMargarita = new Human("Маргарита", 65, false, new ArrayList<Human>(Arrays.asList(holterJack)));

        Human vansalMark = new Human("Марк", 70, true, new ArrayList<Human>(Arrays.asList(holterMaria)));
        Human vansalSveta = new Human("Светлана", 72, false, new ArrayList<Human>(Arrays.asList(holterMaria)));

        System.out.println(vansalSveta);
        System.out.println(vansalMark);
        System.out.println(holterMargarita);
        System.out.println(holterAleksandr);
        System.out.println(holterMaria);
        System.out.println(holterJack);
        System.out.println(holterVitia);
        System.out.println(holterSasha);
        System.out.println(holterMasha);
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        Human(String name, int age, boolean sex, ArrayList<Human> humans){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.addAll(humans);
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;
                for (int i = 1; i < childCount; i++) {
                 text += ", " + this.children.get(i).name;
                }
            }
            return text;
        }
    }
}
