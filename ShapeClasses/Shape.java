package ShapeClasses;

import java.awt.Color;
import java.awt.Graphics2D;

public class Shape {

    protected Color color;
    protected Point[] points;
    public Shape(Point[] points,Color color){
        this.color = color;
        this.points = points;
    }
    public void draw(Graphics2D g2d) {
        System.out.println("Derive from Shape");
    }
    public void translation(int deltaX,int deltaY){
        for (Point i : this.points){
            i.x+=deltaX;
            i.y+=deltaY;
        }
    }
}
