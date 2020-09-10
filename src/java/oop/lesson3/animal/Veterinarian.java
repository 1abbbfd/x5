package oop.lesson3.animal;

public class Veterinarian {
    void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }
}
