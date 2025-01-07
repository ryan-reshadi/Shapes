package ShapeClasses;
import java.awt.Color;
import java.awt.Graphics2D;
public class Ellipse extends Shape {
    int height;
    int width;
    public Ellipse(Point center, int height, int width,Color color){
        super(new Point[]{center},color);
        this.height = height;
        this.width = width;
    }
    public Point getCenter(){
        return this.points[0];
    }
    public void draw(Graphics2D g2d){
        Color prevColor = g2d.getColor();
        g2d.setColor(this.color);
        var center = this.getCenter();
        g2d.drawOval(center.x,center.y, this.width, this.height);
        g2d.setColor(prevColor);
    }
}
