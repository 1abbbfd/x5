package paterns.computer.factories;

import paterns.computer.components.RAM;

public class RAMFactory extends ComponentFactory {
    @Override
    public Component createComponent() {
        return new RAM();
    }
}
