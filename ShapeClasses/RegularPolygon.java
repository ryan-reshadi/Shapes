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
    private void update (){
        double angleStep = 2 * Math.PI / this.sides;
        double radius = sideLength / (2 * Math.sin(Math.PI / this.sides));
        double startAngle = -Math.PI / 2; // Rotate to start from the top

        for (int i = 0; i < this.sides; i++) {
            this.points[i] = new Point((int) (this.center.x + radius * Math.cos(startAngle + i * angleStep)),(int) (this.center.y + radius * Math.sin(startAngle + i * angleStep)));
        }
    }
    
}
