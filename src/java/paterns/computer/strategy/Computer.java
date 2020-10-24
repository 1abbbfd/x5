package paterns.computer.strategy;

import paterns.computer.components.graphic.GraphicCard;
import paterns.computer.components.monitor.Monitor;
import paterns.computer.components.processor.Processor;
import paterns.computer.components.ram.RAM;
import paterns.computer.components.storage.StorageDevice;

public abstract class Computer {
    public final GraphicCard graphicCard;
    public final Monitor monitor;
    public final Processor processor;
    public final RAM ram;
    public final StorageDevice storageDevice;

    public Computer(GraphicCard graphicCard, Monitor monitor, Processor processor, RAM ram, StorageDevice storageDevice) {
        this.graphicCard = graphicCard;
        this.monitor = monitor;
        this.processor = processor;
        this.ram = ram;
        this.storageDevice = storageDevice;
    }
}
