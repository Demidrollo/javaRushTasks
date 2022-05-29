package com.javarush.task.task07.task0724;

import java.util.ArrayList;

/*
Семейная перепись
*/
public class Solution {
    public static void main(String[] args) {
    /*  Human alexey = new Human("Алексе",true,70);
      Human masha = new Human("Маша", false, 67);
      Human vitia = new Human("Витя", true,65);
      Human vita = new Human("Вита", false, 65);

      Human vasia = new Human("Вася", true,32, alexey, masha);
      Human tata = new Human("Tata", false,26,vitia, vita);

      Human sasha = new Human("Саша", true,27,alexey,masha);
      Human natasha = new Human("Наташа", false, 22, vitia,vita);

      Human pedro = new Human("Пэдро", true,12,vasia,tata);*/
/*
        System.out.println(alexey.toString());
        System.out.println(masha.toString());
        System.out.println(vitia.toString());
        System.out.println(vita.toString());

        System.out.println(vasia.toString());
        System.out.println(tata.toString());

        System.out.println(sasha.toString());
        System.out.println(natasha.toString());

        System.out.println(pedro.toString());*/

        ArrayList<Human> listOfFamily = new ArrayList<Human>();
        listOfFamily.add(new Human("Алексе",true,70));
        listOfFamily.add(new Human("Маша", false, 67));
        listOfFamily.add(new Human("Витя", true,65));
        listOfFamily.add(new Human("Вита", false, 65));

        listOfFamily.add(new Human("Вася", true,32, listOfFamily.get(0), listOfFamily.get(1)));
        listOfFamily.add(new Human("Тата", true,27,listOfFamily.get(0), listOfFamily.get(1)));
        listOfFamily.add(new Human("Саша", true,27,listOfFamily.get(2),listOfFamily.get(3)));
        listOfFamily.add(new Human("Наташа", false, 22, listOfFamily.get(2),listOfFamily.get(3)));

        listOfFamily.add(new Human("Пэдро", true,12,listOfFamily.get(4),listOfFamily.get(5)));

        for (int i=0; i<listOfFamily.size(); i++){
            System.out.println(listOfFamily.get(i).toString());
        }

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        // напишите тут ваш код
        Human(String name, boolean sex, int age) {
         this.name = name;
         this.sex = sex;
         this.age = age;
        }

        Human(String name, boolean sex, int age,Human father, Human mother){
         this.name = name;
         this.age = age;
         this.sex = sex;

         this.father = father;
         this.mother = mother;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}