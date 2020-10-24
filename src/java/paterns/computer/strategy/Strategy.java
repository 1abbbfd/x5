package paterns.computer.strategy;

import paterns.computer.TypeOfComputer;

public class Strategy {
    public static Computer build(TypeOfComputer type) {
        switch (type) {
            case Game:
                return new GameComputer();
            case Home:
                return new HomeComputer();
            case Office:
                return new OfficeComputer();
        }
        return null;
    }
}