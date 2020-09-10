package oop.lesson3.animal;

public class Dog extends Animal {
    private static final String name = "Собака";

    public Dog() {
        food = "кость";
        location = "будка";
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

