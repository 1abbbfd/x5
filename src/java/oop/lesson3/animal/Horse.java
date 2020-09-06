package oop.lesson3.animal;

public class Horse extends Animal {
    private static final String name = "Лошадь";
    private static final String food = "трава";
    private static final String location = "стойло";

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
