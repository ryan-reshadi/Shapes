package ShapeClasses;

import java.awt.Color;

public class Rectangle extends Polygon {

    public Rectangle(Point p1, Point p2, Color color) {
        super(
                
                new Point[]{
                    p1,
                    new Point(p1.x, p2.y),
                    p2,
                    new Point(p2.x, p1.y)
                },
                color
        );

    }

    // public void draw(Graphics2D g2d) {
    //     Color prevColor = g2d.getColor();
    //     g2d.setColor(this.color);
    //     for (int j = 0; j < this.points.length - 1; j++) {
    //         this.points[j].toPoint(g2d, this.points[j + 1]);
    //     }
    //     this.points[this.points.length - 1].toPoint(g2d, this.points[0]);
    //     g2d.setColor(prevColor);
    //     // resets g2d color
    // }
}
