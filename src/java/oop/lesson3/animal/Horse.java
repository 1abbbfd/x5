package oop.lesson3.animal;

public class Horse extends Animal {
    private static final String name = "Лошадь";

    public Horse() {
        food = "трава";
        location = "стойло";
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
