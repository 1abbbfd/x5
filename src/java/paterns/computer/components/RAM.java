package paterns.computer.components;

import paterns.computer.factories.Component;

public class RAM implements Component {
    private String manufacturer;
    private int memorySize;
    private int frequency;
    private String memoryType;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public void install() {
        System.out.println("Установлена оперативная память со следующими характеристиками:");
        System.out.println("производитель - " + manufacturer);
        System.out.println("объем памяти - " + memorySize);
        System.out.println("частота - " + frequency);
        System.out.println("тип памяти - " + memoryType);
    }
}
