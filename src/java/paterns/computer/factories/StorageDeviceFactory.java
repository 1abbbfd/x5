package paterns.computer.factories;

import paterns.computer.components.StorageDevice;

public class StorageDeviceFactory extends ComponentFactory {
    @Override
    public Component createComponent() {
        return new StorageDevice();
    }
}
