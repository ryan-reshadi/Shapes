package Shapes.ShapeClasses;

import java.awt.Color;
import java.awt.Graphics2D;

public class Shape {

    protected Color color;
    protected Point[] points;
    public Shape(Color color,Point[] points){
        this.color = color;
        this.points = points;
    }
    public void draw(Graphics2D g2d) {
        System.out.println("Derive from Shape");
    }

}
