package ShapeClasses;
import java.awt.Color;
import java.awt.Graphics2D;
public class Polygon extends Shape{
    public Polygon(Point[] points, Color color){
        super(points,color);
    }
    public void draw(Graphics2D g2d){
        Color prevColor = g2d.getColor();
        g2d.setColor(this.color);
        for (int j = 0; j < this.points.length - 1; j++) {
            this.points[j].toPoint(g2d, this.points[j + 1]);
        }
        this.points[this.points.length - 1].toPoint(g2d, this.points[0]);
        g2d.setColor(prevColor);
        
    }
}
