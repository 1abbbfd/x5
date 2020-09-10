package oop.lesson3.animal;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal[] animals = new Animal[]{cat, dog, horse};
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
