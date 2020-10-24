package paterns.computer.strategy;

import paterns.computer.components.graphic.GraphicCardType;
import paterns.computer.components.monitor.MonitorType;
import paterns.computer.components.processor.ProcessorType;
import paterns.computer.components.ram.RAMType;
import paterns.computer.components.storage.StorageDeviceType;
import paterns.computer.factories.*;

public class HomeComputer extends Computer {
    public HomeComputer() {
        super(
                new GraphicsCardFactory().createGraphicCard(GraphicCardType.IntelHD),
                new MonitorFactory().createMonitor(MonitorType.Dell),
                new ProcessorFactory().createProcessor(ProcessorType.I3),
                new RAMFactory().createRAM(RAMType.HyperX),
                new StorageDeviceFactory().createStorageDevice(StorageDeviceType.ST100SSD)
        );
    }
}
