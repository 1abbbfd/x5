package paterns.computer.factories;

import paterns.computer.components.Monitor;

public class MonitorFactory extends ComponentFactory{
    @Override
    public Component createComponent() {
        return new Monitor();
    }
}
