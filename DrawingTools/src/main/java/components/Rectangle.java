package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(Point p1, Point p2) {
        super(p1, p2);
        width = -(p1.x - p2.x);
        height = -(p1.y - p2.y);        
    }
    
    @Override
    public void draw(Graphics g, Color color) {
        g.setColor(color);
        g.drawRect(p1.x, p1.y, width, height);
    }
}