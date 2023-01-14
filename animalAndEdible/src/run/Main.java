package run;

import animal.Animal;
import animal.Tiger;
import chicken.Chicken;
import edible.Apple;
import edible.Edible;
import edible.Fruit;
import edible.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal i: animals) {
            System.out.println(i.makeSound());
            if (i instanceof Chicken){
                Edible i1 = (Chicken) i;
                System.out.println(i1.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit i: fruits) {
            System.out.println(i.howToEat());
        }
    }
}