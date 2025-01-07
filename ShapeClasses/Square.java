package ShapeClasses;

import java.awt.Color;

public class Square extends Rectangle {
    public Square(Point topLeft, int length, Color color){
        super(topLeft,new Point(topLeft.x+length,topLeft.y+length),color);
    }
}
