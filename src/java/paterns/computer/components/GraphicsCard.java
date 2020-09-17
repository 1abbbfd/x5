package paterns.computer.components;

import paterns.computer.factories.Component;

public class GraphicsCard implements Component {
    private String manufacturer;
    private int memorySize;
    private String memoryType;
    private Cooling cooling;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
    }

    public enum Cooling {
        ACTIVE,
        PASSIVE
    }

    @Override
    public void install() {
        System.out.println("Установлена видеокарта со следующими характеристиками:");
        System.out.println("производитель - " + manufacturer);
        System.out.println("тип памяти - " + memoryType);
        System.out.println("объем памяти - " + memorySize);
        System.out.println("охлаждение - " + cooling);
    }
}
