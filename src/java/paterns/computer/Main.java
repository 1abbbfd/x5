package paterns.computer;

import paterns.computer.strategy.Computer;
import paterns.computer.strategy.Strategy;

public class Main {
    private static final TypeOfComputer type = TypeOfComputer.Game;

    public static void main(String[] args) {
        Computer computer = Strategy.build(type);
    }
}
