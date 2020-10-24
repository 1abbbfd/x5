package paterns.computer.strategy;

import paterns.computer.components.graphic.GraphicCardType;
import paterns.computer.components.monitor.MonitorType;
import paterns.computer.components.processor.ProcessorType;
import paterns.computer.components.ram.RAMType;
import paterns.computer.components.storage.StorageDeviceType;
import paterns.computer.factories.*;

public class OfficeComputer extends Computer {
    public OfficeComputer() {
        super(
                new GraphicsCardFactory().createGraphicCard(GraphicCardType.IntelHD),
                new MonitorFactory().createMonitor(MonitorType.Asus),
                new ProcessorFactory().createProcessor(ProcessorType.I3),
                new RAMFactory().createRAM(RAMType.Vengeance),
                new StorageDeviceFactory().createStorageDevice(StorageDeviceType.ST200HDD)
        );
    }
}
