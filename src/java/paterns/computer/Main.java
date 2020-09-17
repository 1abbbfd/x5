package paterns.computer;

import paterns.computer.components.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Types, Map<String, Object>> accessory = Map.of(
                Types.GRAPHIC_CARD, Map.of(
                        "Manufacture", "Radeon",
                        "MemorySize", 2048,
                        "MemoryType", "GDDR4",
                        "Cooling", GraphicsCard.Cooling.ACTIVE
                ),
                Types.RAM, Map.of(
                        "Manufacture", "Sumsung",
                        "MemorySize", 2048,
                        "MemoryType", "DDR4",
                        "Frequency", 1866
                ),
                Types.PROCESSOR, Map.of(
                        "Cache", 4,
                        "Manufacture", "intel",
                        "ClockPurity", 4500,
                        "Name", "i9",
                        "NumberOfCores", 8

                ),
                Types.STORAGE_DEVICE, Map.of(
                        "Manufacture", "Seagate",
                        "MemorySize", 2048,
                        "Type", StorageDevice.Type.SDD,
                        "FormFactor", "type"
                ),
                Types.MONITOR, Map.of(
                        "Manufacture", "DELL"
                )
        );

        Computer computer = new Computer();
        computer.build(accessory);
    }
}
