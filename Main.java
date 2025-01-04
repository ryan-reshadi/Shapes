package Shapes;

import java.awt.Color;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        int w = 800;
        int h = 600;
        JFrame f = new JFrame();
        Rectangle Rect1 = new Rectangle(new Point(100, 100), new Point(300, 300),Color.RED);
        Square Square1 = new Square(new Point(500, 200), 50, Color.CYAN);
        Shape[] shapeArray = {Rect1,Square1};
        DrawingCanvas dc = new DrawingCanvas(w, h, shapeArray);
        f.setSize(w, h);
        f.setTitle("Canvas");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
