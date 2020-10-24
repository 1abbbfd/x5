package paterns.computer.factories;

import paterns.computer.components.graphic.GraphicCard;
import paterns.computer.components.graphic.GraphicCardType;
import paterns.computer.components.graphic.IntelHD;
import paterns.computer.components.graphic.RTX3080;

public class GraphicsCardFactory {

    public GraphicCard createGraphicCard(GraphicCardType type) {
        switch (type){
            case RTX3080:
                return new RTX3080();
            case IntelHD:
                return new IntelHD();
        }
        return null;
    }
}
