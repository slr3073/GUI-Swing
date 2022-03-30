package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Shape {
    public Point p1;
    public Point p2;

    public Shape(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public abstract void draw(Graphics g, Color color);
}
