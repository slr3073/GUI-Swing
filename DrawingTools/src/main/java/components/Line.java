package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Line extends Shape {

    public Line(Point p1, Point p2) {
        super(p1, p2);
    }

    @Override
    public void draw(Graphics g, Color color) {
        g.setColor(color);
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
    }
}
