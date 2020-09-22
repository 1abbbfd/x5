package oop.lesson4.car;

public class Lorry extends Car {
    static final String START = "Грузовик поехал";
    static final String STOP = "Грузовик остановился";
    private final int carryingCapacity;

    public Lorry(String carModel, String carClass, int weight, int carryingCapacity, Engine engine) {
        super(carModel, carClass, weight, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public void start() {
        System.out.println(START);
    }

    public void stop() {
        System.out.println(STOP);
    }

    public void printInfo() {
        System.out.println("Грузоподъемностью кузова: " + carryingCapacity);
        System.out.println("Марка автомобиля: " + super.carModel);
        System.out.println("Класс автомобиля: " + super.carClass);
        System.out.println("Вес автомобиля: " + super.weight);
        System.out.println("Мощность мотора: " + super.motor.getPower());
        System.out.println("Производитель мотора: " + super.motor.getManufacturer());
    }
}
