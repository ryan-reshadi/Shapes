package Shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle extends Shape{
    Color color;
    Point[] points;
    public Rectangle(Point p1, Point p2, Color color){
        this.color = color;
        Point p3 = new Point(p1.x,p2.y);
        Point p4 = new Point(p2.x,p1.y);
        this.points = new Point[]{p1,p3,p2,p4};
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(this.color);
    }
}
