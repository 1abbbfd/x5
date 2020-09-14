package paterns.computer.components;

import paterns.computer.factories.Component;

public class StorageDevice implements Component {
    private String manufacturer;
    private int memorySize;
    private Type type;
    private String formFactor;

    public enum Type {HDD, SDD}

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public void install() {
        System.out.println("Установлен жесткий диск со следующими характеристиками:");
        System.out.println("производитель - " + manufacturer);
        System.out.println("форм-фактор - " + formFactor);
        System.out.println("тип - " + type);
        System.out.println("объем памяти - " + memorySize);
    }
}
