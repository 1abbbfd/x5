package oop.lesson3.animal;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Барсик", "мышь", "дом");
        Animal dog = new Dog("Шарик", "кость", "будка");
        Animal horse = new Horse("Спирит", "трава", "стойло");
        Animal[] animals = new Animal[]{cat, dog, horse};
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
