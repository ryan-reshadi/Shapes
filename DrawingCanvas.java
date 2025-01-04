package Shapes;

import java.awt.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent {

    private int width;
    private int height;
    private Shape[] shapes;

    public DrawingCanvas(int w, int h, Shape[] shapes) {
        this.width = w;
        this.height = h;
        this.shapes = shapes;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setRenderingHints(rh);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, this.width, this.height);
        g2d.setColor(Color.BLACK);

    }
}
