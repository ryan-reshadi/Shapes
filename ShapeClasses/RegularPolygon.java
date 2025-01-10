package ShapeClasses;

import java.awt.Color;

public class RegularPolygon extends Polygon {
    int sides;
    int sideLength;
    double angle;
    Point center;
    public RegularPolygon(Point center,int sides, int sideLength, Color color){
        super(new Point[sides],color);
        this.center = center;
        this.sides = sides;
        this.sideLength=sideLength;
        this.angle = 2 * Math.PI/sides;
        this.update();
    }
    public void update (){
        for (int i=0; i<sides;i++){
            this.points[i]=new Point((int) (this.center.x + sideLength * Math.cos(i * this.angle)), (int) (this.center.y + sideLength * Math.sin(i * this.angle)));
        }
    }
}
