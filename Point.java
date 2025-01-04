package Shapes;

import java.awt.Graphics2D;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void toPoint(Graphics2D g2d, Point endPoint) {
        g2d.drawLine(this.x, this.y, endPoint.x, endPoint.y);
    }
}
