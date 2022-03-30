package shapeDrawer;

import components.Line;
import components.Oval;
import components.Rectangle;
import components.Shape;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends javax.swing.JPanel {

    public DrawingPanel(ShapeDrawerForm form) {
        this.form = form;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private ShapeDrawerForm form;
    
    // Etats
    private enum State {
        DRAW_LINE,
        DRAW_LINE_PRESSED,
        DRAW_OVAL,
        DRAW_OVAL_PRESSED,
        DRAW_RECTANGLE,
        DRAW_RECTANGLE_PRESSED,
    }
    
    private State state = State.DRAW_LINE;
    
    // Transitions
    private void activateDrawLine(){
        form.setEnableLine(false);
        form.setEnableOval(true);
        form.setEnableRectangle(true);
    }
    
    private void activateDrawLinePressed(){
        form.setEnableLine(false);
        form.setEnableOval(true);
        form.setEnableRectangle(true);
    }
    
    private void activateDrawOval(){
        form.setEnableLine(true);
        form.setEnableOval(false);
        form.setEnableRectangle(true);
    }
    
    private void activateDrawOvalPressed(){
        form.setEnableLine(true);
        form.setEnableOval(false);
        form.setEnableRectangle(true);
    }
    
    private void activateDrawRectangle(){
        form.setEnableLine(true);
        form.setEnableOval(true);
        form.setEnableRectangle(false);
    }
    
    private void activateDrawRectanglePressed(){
        form.setEnableLine(true);
        form.setEnableOval(true);
        form.setEnableRectangle(false);
    }
    
    
    // Events
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        switch (state) {
            case DRAW_LINE:
                //interdit
                break;
            case DRAW_LINE_PRESSED:
                changeTempShape(new Line(tempShape.p1, evt.getPoint()));
                state = State.DRAW_LINE_PRESSED;
                activateDrawLinePressed();
                break;
            case DRAW_OVAL:
                //interdit
                break;
            case DRAW_OVAL_PRESSED:
                changeTempShape(new Oval(tempShape.p1, evt.getPoint()));
                state = State.DRAW_OVAL_PRESSED;
                activateDrawOvalPressed();
                break;
            case DRAW_RECTANGLE:
                //interdit
                break;
            case DRAW_RECTANGLE_PRESSED:
                changeTempShape(new Rectangle(tempShape.p1, evt.getPoint()));
                state = State.DRAW_RECTANGLE_PRESSED;
                activateDrawRectanglePressed();
                break;
        }
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        switch (state) {
            case DRAW_LINE:
                changeTempShape(new Line(evt.getPoint(), evt.getPoint()));
                state = State.DRAW_LINE_PRESSED;
                activateDrawLinePressed();
                break;
            case DRAW_LINE_PRESSED:
                //interdit
                break;
            case DRAW_OVAL:
                changeTempShape(new Oval(evt.getPoint(), evt.getPoint()));
                state = State.DRAW_OVAL_PRESSED;
                activateDrawOvalPressed();
                break;
            case DRAW_OVAL_PRESSED:
                //interdit
                break;
            case DRAW_RECTANGLE:
                changeTempShape(new Rectangle(evt.getPoint(), evt.getPoint()));
                state = State.DRAW_RECTANGLE_PRESSED;
                activateDrawRectanglePressed();
                break;
            case DRAW_RECTANGLE_PRESSED:
                //interdit
                break;
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        switch (state) {
            case DRAW_LINE:
                //interdit
                break;
            case DRAW_LINE_PRESSED:
                drawFinal();
                state = State.DRAW_LINE;
                activateDrawLine();
                break;
            case DRAW_OVAL:
                //interdit
                break;
            case DRAW_OVAL_PRESSED:
                drawFinal();
                state = State.DRAW_OVAL;
                activateDrawOval();
                break;
            case DRAW_RECTANGLE:
                //interdit
                break;
            case DRAW_RECTANGLE_PRESSED:
                drawFinal();
                state = State.DRAW_RECTANGLE;
                activateDrawRectangle();
                break;
        }
    }//GEN-LAST:event_formMouseReleased
    
    public void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        switch (state) {
            case DRAW_LINE:
                //interdit
                break;
            case DRAW_LINE_PRESSED:
                //interdit
                break;
            case DRAW_OVAL:
                state = State.DRAW_LINE;
                activateDrawLine();
                break;
            case DRAW_OVAL_PRESSED:
                //impossible
                break;
            case DRAW_RECTANGLE:
                state = State.DRAW_LINE;
                activateDrawLine();
                break;
            case DRAW_RECTANGLE_PRESSED:
                //impossible
                break;
        }
    }                                          

    public void ovalButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        switch (state) {
            case DRAW_LINE:
                state = State.DRAW_OVAL;
                activateDrawOval();
                break;
            case DRAW_LINE_PRESSED:
                //impossible
                break;
            case DRAW_OVAL:
                //interdit
                break;
            case DRAW_OVAL_PRESSED:
                //interdit
                break;
            case DRAW_RECTANGLE:
                state = State.DRAW_OVAL;
                activateDrawOval();
                break;
            case DRAW_RECTANGLE_PRESSED:
                //impossible
                break;
        }
    }                                          

    public void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        switch (state) {
            case DRAW_LINE:
                state = State.DRAW_RECTANGLE;
                activateDrawRectangle();
                break;
            case DRAW_LINE_PRESSED:
                //impossible
                break;
            case DRAW_OVAL:
                state = State.DRAW_RECTANGLE;
                activateDrawRectangle();
                break;
            case DRAW_OVAL_PRESSED:
                //impossible
                break;
            case DRAW_RECTANGLE:
                //interdit
                break;
            case DRAW_RECTANGLE_PRESSED:
                //interdit
                break;
        }
    }

    private Shape tempShape;
    private List<Shape> shapes = new ArrayList<>();
    
    // Actions
    private void changeTempShape(Shape s) {
        tempShape = s;
        repaint();
    }
    
    private void drawFinal(){
        shapes.add(tempShape);
        tempShape = null;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (Shape shape : shapes)
            shape.draw(g, Color.BLACK);
            

        if(tempShape != null)
            tempShape.draw(g, Color.RED);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
