package oop.lesson3.animal;

public class Dog extends Animal {
    private static final String name = "Собака";
    private static final String food = "кость";
    private static final String location = "будка";

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

