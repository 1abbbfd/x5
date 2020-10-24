package paterns.computer.components.ram;

public class Vengeance implements RAM {
    private static final String manufacturer = "Corsair";
    private int memorySize = 32768;
    private int frequency = 1866;
    private static final String memoryType  = "DDR4";

    @Override
    public void info() {
        System.out.println("Установлена оперативная память со следующими характеристиками:");
        System.out.println("производитель - " + manufacturer);
        System.out.println("объем памяти - " + memorySize);
        System.out.println("частота - " + frequency);
        System.out.println("тип памяти - " + memoryType);
    }
}
