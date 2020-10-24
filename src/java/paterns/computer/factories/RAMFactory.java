package paterns.computer.factories;

import paterns.computer.components.ram.HyperX;
import paterns.computer.components.ram.RAM;
import paterns.computer.components.ram.RAMType;
import paterns.computer.components.ram.Vengeance;

public class RAMFactory{

    public RAM createRAM(RAMType type) {
        switch (type){
            case HyperX:
                return new HyperX();
            case Vengeance:
                return new Vengeance();

        }
        return null;
    }
}
