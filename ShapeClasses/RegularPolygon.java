package ShapeClasses;

import java.awt.Color;

public class RegularPolygon extends Polygon {
    int sides;
    int sideLength;
    public RegularPolygon(Point center,int sides, int sideLength, Color color){
        super(new Point[]{center},color);
        this.sides = sides;
        this.sideLength=sideLength;
    }
    public void
}
