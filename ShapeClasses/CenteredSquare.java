package ShapeClasses;

import java.awt.Color;

public class CenteredSquare extends RegularPolygon{
    public CenteredSquare(Point centerPoint, int sideLength, Color color){
        super(centerPoint,4,sideLength,color);
    }
}
