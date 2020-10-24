package paterns.computer.factories;

import paterns.computer.components.monitor.Asus;
import paterns.computer.components.monitor.Dell;
import paterns.computer.components.monitor.Monitor;
import paterns.computer.components.monitor.MonitorType;

public class MonitorFactory {

    public Monitor createMonitor(MonitorType type) {
        switch (type){
            case Dell:
                return new Dell();
            case Asus:
                return new Asus();
        }
        return null;
    }
}
