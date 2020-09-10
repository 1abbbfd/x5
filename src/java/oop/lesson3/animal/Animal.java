package oop.lesson3.animal;

public class Animal {
    protected String food;
    protected String location;

    public void makeNoise() {
        System.out.println("Животное шумит");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void eat() {
        System.out.println("Животноее сть" + food);
    }

    public void sleep() {
        System.out.println("Животное спит в" + location);
    }

}
