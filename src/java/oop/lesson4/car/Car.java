package oop.lesson4.car;

public abstract class Car {
    static final String TURN_RIGHT = "Поворот направо";
    static final String TURN_LEFT = "Поворот налево";
    protected final String carModel;
    protected final String carClass;
    protected final int weight;
    protected final Engine motor;

    public Car(String carModel, String carClass, int weight, Engine motor) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.motor = motor;
    }

    protected abstract void start();

    protected abstract void stop();

    public void turnRight() {
        System.out.println(TURN_RIGHT);
    }

    public void turnLeft() {
        System.out.println(TURN_LEFT);
    }

    protected abstract void printInfo();
}
