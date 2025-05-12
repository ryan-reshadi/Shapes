package ShapeClasses;

public class BoundingBox {
    public Point topLeft;
    public Point bottomRight;
    public BoundingBox(Point topLeft, Point bottomRight) {
        this.UpdatePoints(topLeft, bottomRight);
    }
    public boolean Collide(Point p) {
        return (p.x >= topLeft.x && p.x <= bottomRight.x && p.y >= topLeft.y && p.y <= bottomRight.y);
    }
    public boolean Collide(BoundingBox b) {
        return (this.topLeft.x <= b.bottomRight.x && this.bottomRight.x >= b.topLeft.x &&
                this.topLeft.y <= b.bottomRight.y && this.bottomRight.y >= b.topLeft.y);
    }
    public void UpdatePoints(Point p1, Point p2) {
        this.topLeft.x = Math.min(p1.x, p2.x);
        this.topLeft.y = Math.min(p1.y, p2.y);
        this.bottomRight.x = Math.max(p1.x, p2.x);
        this.bottomRight.y = Math.max(p1.y, p2.y);
    }
}
