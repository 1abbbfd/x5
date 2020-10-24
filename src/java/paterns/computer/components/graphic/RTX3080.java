package paterns.computer.components.graphic;

public class RTX3080 implements GraphicCard {
    private static final String manufacturer = "NVIDIA";
    private static final int memorySize = 8096;
    private static final String memoryType = "GDDR5";
    private static final Cooling cooling = Cooling.ACTIVE;

    @Override
    public void info() {
        System.out.println("Установлена видеокарта со следующими характеристиками:");
        System.out.println("производитель - " + manufacturer);
        System.out.println("тип памяти - " + memoryType);
        System.out.println("объем памяти - " + memorySize);
        System.out.println("охлаждение - " + cooling);
    }
}
