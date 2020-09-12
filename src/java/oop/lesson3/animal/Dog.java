package oop.lesson3.animal;

public class Dog extends Animal {
    private String name;

    public Dog(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
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

