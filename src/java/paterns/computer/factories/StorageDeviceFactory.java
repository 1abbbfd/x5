package paterns.computer.factories;

import paterns.computer.components.storage.ST100SSD;
import paterns.computer.components.storage.ST200HDD;
import paterns.computer.components.storage.StorageDevice;
import paterns.computer.components.storage.StorageDeviceType;

public class StorageDeviceFactory {

    public StorageDevice createStorageDevice(StorageDeviceType type) {
        switch (type){
            case ST100SSD:
                return new ST100SSD();
            case ST200HDD:
                return new ST200HDD();
        }
        return null;
    }
}
