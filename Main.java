package Shapes;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        int w = 800;
        int h = 600;
        JFrame f = new JFrame();
        Shape[] shapeArray = {};
        DrawingCanvas dc = new DrawingCanvas(w, h, shapeArray);
        f.setSize(w, h);
        f.setTitle("Canvas");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
