package oop.lesson4.car;

public class Lorry extends Car {
    static final String TURN_RIGHT = "Грузовик направо";
    static final String TURN_LEFT = "Грузовик налево";
    private final int carryingCapacity;

    public Lorry(String carModel, String carClass, int weight, int carryingCapacity, Engine engine) {
        super(carModel, carClass, weight, engine);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    void start() {
        System.out.println(TURN_RIGHT);
    }

    @Override
    void stop() {
        System.out.println(TURN_LEFT);
    }

    @Override
    void printInfo() {
        System.out.println("Грузоподъемностью кузова: " + carryingCapacity);
        System.out.println("Марка автомобиля: " + super.carModel);
        System.out.println("Класс автомобиля: " + super.carClass);
        System.out.println("Вес автомобиля: " + super.weight);
        System.out.println("Мощность мотора: " + super.motor.getManufacturer());
        System.out.println("Производитель мотора: " + super.motor.getPower());
    }
}
