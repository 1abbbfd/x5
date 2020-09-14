package paterns.computer;

import paterns.computer.components.*;
import paterns.computer.factories.*;

import java.util.Map;

public class Computer {
    private GraphicsCard graphicsCard;
    private Monitor monitor;
    private Processor processor;
    private RAM ram;
    private StorageDevice storageDevice;

    public void build(Map<Types, Map<String, Object>> map) {
        ComponentFactory componentFactory;
        for (Map.Entry<Types, Map<String, Object>> e : map.entrySet()) {
            switch (e.getKey()) {
                case GRAPHIC_CARD:
                    componentFactory = new GraphicsCardFactory();
                    this.graphicsCard = (GraphicsCard) componentFactory.createComponent();
                    this.graphicsCard.setManufacturer((String) e.getValue().get("Manufacture"));
                    this.graphicsCard.setMemorySize((int) e.getValue().get("MemorySize"));
                    this.graphicsCard.setMemoryType((String) e.getValue().get("MemoryType"));
                    this.graphicsCard.setCooling((GraphicsCard.Cooling) e.getValue().get("Cooling"));
                    this.graphicsCard.install();
                    break;
                case RAM:
                    componentFactory = new RAMFactory();
                    this.ram = (RAM) componentFactory.createComponent();
                    this.ram.setManufacturer((String) e.getValue().get("Manufacture"));
                    this.ram.setMemorySize((int) e.getValue().get("MemorySize"));
                    this.ram.setMemoryType((String) e.getValue().get("MemoryType"));
                    this.ram.setFrequency((int) e.getValue().get("Frequency"));
                    this.ram.install();
                    break;
                case PROCESSOR:
                    componentFactory = new ProcessorFactory();
                    this.processor = (Processor) componentFactory.createComponent();
                    this.processor.setCache((int) e.getValue().get("Cache"));
                    this.processor.setManufacturer((String) e.getValue().get("Manufacture"));
                    this.processor.setClockPurity((int) e.getValue().get("ClockPurity"));
                    this.processor.setNumberOfCores((int) e.getValue().get("NumberOfCores"));
                    this.processor.setName((String) e.getValue().get("Name"));
                    this.processor.install();
                    break;
                case STORAGE_DEVICE:
                    componentFactory = new StorageDeviceFactory();
                    this.storageDevice = (StorageDevice) componentFactory.createComponent();
                    this.storageDevice.setManufacturer((String) e.getValue().get("Manufacture"));
                    this.storageDevice.setMemorySize((int) e.getValue().get("MemorySize"));
                    this.storageDevice.setType((StorageDevice.Type) e.getValue().get("Type"));
                    this.storageDevice.setFormFactor((String) e.getValue().get("FormFactor"));
                    storageDevice.install();
                    break;
                case MONITOR:
                    componentFactory = new MonitorFactory();
                    this.monitor = (Monitor) componentFactory.createComponent();
                    this.monitor.setName((String) e.getValue().get("Manufacture"));
                    monitor.install();
                    break;
            }
        }
    }
}
