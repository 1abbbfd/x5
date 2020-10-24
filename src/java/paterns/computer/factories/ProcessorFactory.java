package paterns.computer.factories;

import paterns.computer.components.processor.I3;
import paterns.computer.components.processor.I9;
import paterns.computer.components.processor.Processor;
import paterns.computer.components.processor.ProcessorType;

public class ProcessorFactory {

    public Processor createProcessor(ProcessorType type) {
        switch (type) {
            case I3:
                return new I3();
            case I9:
                return new I9();
        }

        return null;
    }
}
