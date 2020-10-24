package paterns.computer.components.monitor;

public class Asus implements Monitor {
    private static final String Manufacture = "Asus";

    @Override
    public void info() {
        System.out.println("Монитор со следующими характеристиками:");
        System.out.println("производитель - " + Manufacture);
    }
}