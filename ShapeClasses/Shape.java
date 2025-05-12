package ShapeClasses;

import java.awt.Color;
import java.awt.Graphics2D;

public class Shape {
    protected BoundingBox boundingBox;
    protected Color color;
    protected Point[] points;
    protected BoundingBox[] lineBoundingBoxes;
    Point centerPoint;
    public Shape(Point[] points, Color color) {
        this.color = color;
        this.points = points;
        int sumX = 0;
        int sumY = 0;
        for (Point i : points) {
            sumX += i.x;
            sumY += i.y;
        }
        this.centerPoint = new Point(sumX / points.length, sumY / points.length);
        this.lineBoundingBoxes = new BoundingBox[points.length - 1];
    }
    public Shape(Point[] points,Color color, Point centerPoint){
        this.color = color;
        this.points = points;
        this.centerPoint = centerPoint;
        this.lineBoundingBoxes = new BoundingBox[points.length-1];
    }
    public void draw(Graphics2D g2d) {
        System.out.println("Derive from Shape");
    }
    public void translation(int deltaX,int deltaY){
        for (Point i : this.points){
            i.x+=deltaX;
            i.y+=deltaY;
        }
    }
    public void updateBoundingBox(){
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (Point i : this.points){
            if (i.x<minX) minX=i.x;
            if (i.y<minY) minY=i.y;
            if (i.x>maxX) maxX=i.x;
            if (i.y>maxY) maxY=i.y;
        }
        this.boundingBox = new BoundingBox(new Point(minX,minY),new Point(maxX,maxY));
    }
    public void updateLineBoundingBoxes(){
        for (int i=0;i<this.points.length-1;i++){
            this.lineBoundingBoxes[i].bottomRight = new Point(Math.min(lineBoundingBoxes[i].bottomRight.x, lineBoundingBoxes[i+1].bottomRight.x), Math.min(lineBoundingBoxes[i].bottomRight.y, lineBoundingBoxes[i+1].bottomRight.y));
            this.lineBoundingBoxes[i].topLeft = new Point(Math.max(lineBoundingBoxes[i].topLeft.x, lineBoundingBoxes[i+1].topLeft.x), Math.max(lineBoundingBoxes[i].topLeft.y, lineBoundingBoxes[i+1].topLeft.y));
        }
        this.lineBoundingBoxes[this.points.length-1].bottomRight = new Point(Math.min(lineBoundingBoxes[this.points.length-1].bottomRight.x, this.lineBoundingBoxes[0].bottomRight.x), Math.min(lineBoundingBoxes[this.points.length-1].bottomRight.y, this.lineBoundingBoxes[0].bottomRight.y));
        this.lineBoundingBoxes[this.points.length-1].topLeft = new Point(Math.max(lineBoundingBoxes[this.points.length-1].topLeft.x, this.lineBoundingBoxes[0].topLeft.x), Math.max(lineBoundingBoxes[this.points.length-1].topLeft.y, this.lineBoundingBoxes[0].topLeft.y));
    }
    public void updateShapeBoundingBox(){
        this.updateBoundingBox();
        this.updateLineBoundingBoxes();
    }
    public boolean Collide(Point p) {
        Point checker = new Point(p.x, p.y);
        while (this.boundingBox.Collide(checker)){
            for (int i=0;i<this.points.length-1;i++){
                if (this.lineBoundingBoxes[i].Collide(checker)){
                    return true;
                }
            }
            checker.x++;
            checker.y++;
        }
        return false;
    }
    public int lineFromCenter (Point target, int input){
        int slope = (target.y - this.centerPoint.y) / (target.x - this.centerPoint.x);
        int yIntercept = this.centerPoint.y - slope * this.centerPoint.x;
        return slope * input + yIntercept;
    }
}
