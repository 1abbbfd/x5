package paterns.computer.components;

import paterns.computer.factories.Component;

public class Processor implements Component {
    private String manufacturer;
    private int clockPurity;
    private int numberOfCores;
    private int cache;
    private String name;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setClockPurity(int clockPurity) {
        this.clockPurity = clockPurity;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void install() {
        System.out.println("Установлен процессор со следующими характеристиками:");
        System.out.println("производитель - " + manufacturer);
        System.out.println("частота - " + clockPurity);
        System.out.println("количество ядер - " + numberOfCores);
        System.out.println("объем кэша - " + cache);
        System.out.println("имя - " + name);
    }
}
