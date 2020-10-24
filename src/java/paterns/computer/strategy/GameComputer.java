package paterns.computer.strategy;

import paterns.computer.components.graphic.GraphicCardType;
import paterns.computer.components.monitor.MonitorType;
import paterns.computer.components.processor.ProcessorType;
import paterns.computer.components.ram.RAMType;
import paterns.computer.components.storage.StorageDeviceType;
import paterns.computer.factories.*;

public class GameComputer extends Computer {
    public GameComputer() {
        super(
                new GraphicsCardFactory().createGraphicCard(GraphicCardType.RTX3080),
                new MonitorFactory().createMonitor(MonitorType.Dell),
                new ProcessorFactory().createProcessor(ProcessorType.I9),
                new RAMFactory().createRAM(RAMType.HyperX),
                new StorageDeviceFactory().createStorageDevice(StorageDeviceType.ST100SSD)
        );
    }
}
