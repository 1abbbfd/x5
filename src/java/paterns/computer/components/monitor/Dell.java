package paterns.computer.components.monitor;

public class Dell implements Monitor {
    private static final String Manufacture = "Dell";

    @Override
    public void info() {
        System.out.println("Монитор со следующими характеристиками:");
        System.out.println("производитель - " + Manufacture);
    }
}
