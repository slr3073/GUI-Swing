package polyLine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.List;
import javax.swing.SwingUtilities;

public class DrawingPanel extends JPanel {

    public DrawingPanel() {
        initComponents();
    }
    
    // Etats
    private enum State {
        INIT,
        DRAWING
    }
    
    private State state = State.INIT;
    
    // Transitions
    private void activateInit(){}
    
    private void activateDrawing(){}
    
    // Actions
    public void addPoint(Point p){
        points.add(p);
        repaint();
    }
    
    public void removeLastPoint(){
        if(points.isEmpty()) return;
        
        points.remove(points.size() - 1);
        repaint();
    }
    
    public void changePointTemp(Point p){
        pointTemp = p;
        repaint();
    }
    
    public void clearPoints(){
        points.clear();
        repaint();
    }
     
    private Point pointTemp = new Point(0, 0);
    private List<Point> points = new ArrayList<>();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
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

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(SwingUtilities.isLeftMouseButton(evt)){
            clickGauche(evt);
        } else if(SwingUtilities.isRightMouseButton(evt)) {
            clickDroit(evt);
        }
    }//GEN-LAST:event_formMouseClicked

    private void clickGauche(MouseEvent evt){
        switch(state){
            case INIT:
                clearPoints();
                addPoint(evt.getPoint());
                state = State.DRAWING;
                activateDrawing();
                break;
            case DRAWING:
                addPoint(evt.getPoint());
                state = State.DRAWING;
                activateDrawing();
                break;
        }
    }
    
    private void clickDroit(MouseEvent evt){
        switch(state){
            case INIT:
                state = State.INIT;
                activateInit();
                break;
            case DRAWING:
                if(points.size() > 1){
                    removeLastPoint();
                    state = State.DRAWING;
                    activateDrawing();
                } else {
                    removeLastPoint();
                    state = State.INIT;
                    activateInit();
                }
                break;
        }
    }
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        switch(state){
            case INIT:
                changePointTemp(evt.getPoint());
                state = State.INIT;
                activateInit();
                break;
            case DRAWING:
                changePointTemp(evt.getPoint());
                state = State.DRAWING;
                activateDrawing();
                break;
        }
    }//GEN-LAST:event_formMouseMoved

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        if(" ".equals(" ")){
            switch(state){
                case INIT:
                    state = State.INIT;
                    activateInit();
                    break;
                case DRAWING:
                    state = State.INIT;
                    activateInit();
                    pointTemp = points.get(points.size() - 1);
                    repaint();
                    break;
            }
        }
    }//GEN-LAST:event_formKeyTyped
    
    @Override
    public void paintComponent(Graphics g){  
        super.paintComponent(g);
        
        g.setColor(state == State.INIT ? Color.RED : Color.BLACK);
        if(points.size() > 1){
            for (int i = 0; i < points.size() - 1; i++) {
                Point p1 = points.get(i);
                Point p2 = points.get(i + 1);
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }
        
        if(points.size() >= 1 && state != State.INIT){
            g.setColor(Color.GREEN);
            Point lastPoint = points.get(points.size() - 1);
            g.drawLine(lastPoint.x, lastPoint.y, pointTemp.x, pointTemp.y);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
