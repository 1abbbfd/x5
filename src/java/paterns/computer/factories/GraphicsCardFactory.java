package paterns.computer.factories;

import paterns.computer.components.GraphicsCard;

public class GraphicsCardFactory extends ComponentFactory {
    @Override
    public Component createComponent() {
        return new GraphicsCard();
    }
}
