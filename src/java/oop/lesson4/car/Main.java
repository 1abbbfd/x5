package oop.lesson4.car;

public class Main {

    public static void main(String[] args) {
        Car lorry = new Lorry(
                "toyota",
                "truck",
                5000,
                1,
                new Engine(100, 101)
        );

        Car sportCar = new SportCar(
                "ferrari",
                "sport car",
                1000,
                400,
                new Engine(100, 101)
        );

        for (Car car : new Car[]{lorry, sportCar}) {
            car.printInfo();
        }
    }
}
