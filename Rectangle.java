package Shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle extends Shape {

    Color color;
    Point[] points;

    public Rectangle(Point p1, Point p2, Color color) {
        this.color = color;
        Point p3 = new Point(p1.x, p2.y);
        Point p4 = new Point(p2.x, p1.y);
        this.points = new Point[]{p1, p3, p2, p4};
    }

    public void draw(Graphics2D g2d) {
        Color prevColor = g2d.getColor();
        g2d.setColor(this.color);
        for (int j = 0; j<this.points.length-1;j++){
            this.points[j].toPoint(g2d, this.points[j+1]);
        }
        this.points[-1].toPoint(g2d, this.points[0]);
        g2d.setColor(prevColor);
        // resets g2d color
    }
}
