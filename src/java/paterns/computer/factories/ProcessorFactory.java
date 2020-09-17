package paterns.computer.factories;

import paterns.computer.components.Processor;

public class ProcessorFactory extends ComponentFactory {
    @Override
    public Component createComponent() {
        return new Processor();
    }
}
