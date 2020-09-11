package oop.lesson3.animal;

public class Cat extends Animal {
    private static final String name = "Кот";

    public Cat() {
        super("мышь", "дом");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " спит");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест " + food);
    }

    public String getName() {
        return name;
    }
}
