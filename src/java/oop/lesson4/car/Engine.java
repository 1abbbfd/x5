package oop.lesson4.car;

public class Engine {
    private final int power;
    private final int manufacturer;

    public Engine(int manufacturer, int power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public int getManufacturer() {
        return manufacturer;
    }
}
