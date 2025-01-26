
import ShapeClasses.*;
import java.awt.Color;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        int w = 800;
        int h = 600;
        JFrame f = new JFrame();
        Rectangle Rect1 = new Rectangle(new Point(100, 100), new Point(300, 300),Color.RED);
        Square Square1 = new Square(new Point(500, 200), 50, Color.CYAN);
        Ellipse Ellipse1 = new Ellipse(new Point(300, 300), 100, 200, Color.BLUE);
        Polygon Polygon1 = new Polygon(new Point[] {new Point(10,10),new Point(200,200),new Point(300,400)}, Color.BLACK);
        RegularPolygon RegPolygon1 = new RegularPolygon(new Point(600,300), 20, 5, Color.BLACK);
        Shape[] shapeArray = {Rect1,Square1,Ellipse1,Polygon1,RegPolygon1,
        
            new RegularPolygon(new Point(400,300), 5, 25, Color.BLACK)
        };
        DrawingCanvas dc = new DrawingCanvas(w, h, shapeArray);
        f.setSize(w, h);
        f.setTitle("Canvas");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
