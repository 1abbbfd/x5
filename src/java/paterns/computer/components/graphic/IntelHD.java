package paterns.computer.components.graphic;

public class IntelHD implements GraphicCard{
    private static final String manufacturer = "Intel";
    private static final int memorySize = 2048;
    private static final String memoryType = "GDDR5";
    private static final Cooling cooling = Cooling.PASSIVE;

    @Override
    public void info() {
        System.out.println("Установлена видеокарта со следующими характеристиками:");
        System.out.println("производитель - " + manufacturer);
        System.out.println("тип памяти - " + memoryType);
        System.out.println("объем памяти - " + memorySize);
        System.out.println("охлаждение - " + cooling);
    }
}
