package paterns.computer.components;

import paterns.computer.factories.Component;

public class Monitor implements Component {
    private String Manufacture;

    public void setName(String Manufacture) {
        this.Manufacture = Manufacture;
    }

    @Override
    public void install() {
        System.out.println("Монитор со следующими характеристиками:");
        System.out.println("производитель - " + Manufacture);
    }
}
