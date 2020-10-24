package paterns.computer.components.processor;

public class I3 implements Processor{
    private static final String manufacturer = "Intel";
    private final int clockPurity = 2000;
    private final int numberOfCores = 2;
    private final int cache = 4;
    private static final String name = "3220";

    @Override
    public void info() {
        System.out.println("Установлен процессор со следующими характеристиками:");
        System.out.println("производитель - " + manufacturer);
        System.out.println("частота - " + clockPurity);
        System.out.println("количество ядер - " + numberOfCores);
        System.out.println("объем кэша - " + cache);
        System.out.println("имя - " + name);
    }
}
