package oop.lesson3.animal;

public class Cat extends Animal {
    private static final String name = "Кот";
    private static final String food = "мышь";
    private static final String location = "дом";

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

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
