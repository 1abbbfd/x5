package paterns.computer.components.storage;

public class ST200HDD implements StorageDevice {
    private static final String manufacturer = "Western Digita";
    private final int memorySize = 1;
    private final Type type = Type.SDD;
    private static final String formFactor = "Form factor";

    @Override
    public void info() {
        System.out.println("Установлен жесткий диск со следующими характеристиками:");
        System.out.println("производитель - " + manufacturer);
        System.out.println("форм-фактор - " + formFactor);
        System.out.println("тип - " + type);
        System.out.println("объем памяти - " + memorySize);
    }
}
