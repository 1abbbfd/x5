package oop.lesson3.animal;

public class Veterinarian {
    void treatAnimal(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println(cat.getFood() + " " + cat.getLocation());
            return;
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println(dog.getFood() + " " + dog.getLocation());
            return;
        }

        if (animal instanceof Horse) {
            Horse horse = (Horse) animal;
            System.out.println(horse.getFood() + " " + horse.getLocation());
        }
    }
}
