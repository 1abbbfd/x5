package oop.lesson4.car;

public class SportCar extends Car {
    private final int maxSpeed;

    public SportCar(String carModel, String carClass, int weight, int maxSpeed, Engine motor) {
        super(carModel, carClass, weight, motor);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    void printInfo() {
        System.out.println("Предельная скорость: " + maxSpeed);
        System.out.println("Марка автомобиля: " + super.carModel);
        System.out.println("Класс автомобиля: " + super.carClass);
        System.out.println("Вес автомобиля: " + super.weight);
        System.out.println("Мощность мотора: " + super.motor.getManufacturer());
        System.out.println("Производитель мотора: " + super.motor.getPower());
    }
}
