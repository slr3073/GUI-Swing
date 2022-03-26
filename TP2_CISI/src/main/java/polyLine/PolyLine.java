package polyLine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import java.util.List;
import javax.swing.JFrame;

public class PolyLine extends JFrame {

    public PolyLine() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Etats
    private enum State {
        INIT,
        DRAWING
    }
    
    private State state = State.INIT;
    
    // Transitions
    private void activateInit(){}
    
    private void activateDrawing(){}
    
    //Actions
    private void dessinerLigne(Point p1, Point p2){
        
    }
    
    private void effacerLigne(Point p1, Point p2){
        
    }
    
    
    private Point pointTemp = new Point(0, 0);
    private List<Point> points= new ArrayList<>();
    
    // Events
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(SwingUtilities.isLeftMouseButton(evt)){
            clickGauche(evt);
        } else {
            clickDroit(evt);
        }
    }//GEN-LAST:event_formMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        switch(state){
            case INIT:
                state = State.INIT;
                activateInit();
                pointTemp = evt.getPoint();
                points = new ArrayList<>();
                break;
            case DRAWING:
                state = State.DRAWING;
                activateDrawing();
                dessinerLigne(evt.getPoint(), points.get(points.size() - 1));
                effacerLigne(pointTemp, points.get(points.size() - 1));
                pointTemp = evt.getPoint();
                break;
        }
    }//GEN-LAST:event_formMouseMoved

    private void clickGauche(MouseEvent evt){
        switch(state){
            case INIT:
                state = State.DRAWING;
                activateDrawing();
                pointTemp = pointTemp;
                points.add(evt.getPoint());
                break;
            case DRAWING:
                state = State.DRAWING;
                activateDrawing();
                pointTemp = pointTemp;
                points.add(evt.getPoint());
                break;
        }
    }
    
    private void clickDroit(MouseEvent evt){
        System.out.println(evt.getPoint());
        switch(state){
            case INIT:
                state = State.INIT;
                activateInit();
                pointTemp = pointTemp;
                points = new ArrayList<>();
                break;
            case DRAWING:
                if(points.size() > 1){
                    state = State.DRAWING;
                    activateDrawing();
                    effacerLigne(points.get(points.size() - 1), points.get(points.size() - 2));
                    points.remove(points.size() - 1);
                    pointTemp = pointTemp;
                } else {
                    state = State.INIT;
                    activateInit();
                    pointTemp = pointTemp;
                    points = new ArrayList<>();
                }
                break;
        }
    }
    
    private void pressEspace(KeyEvent evt){
        switch(state){
            case INIT:
                state = State.INIT;
                activateInit();
                pointTemp = pointTemp;
                points = new ArrayList<>();
                break;
            case DRAWING:
                state = State.INIT;
                activateInit();
                pointTemp = pointTemp;
                points = new ArrayList<>();
                break;
        }
    }
      
    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        if(" ".equals(String.valueOf(evt.getKeyChar()))){
            pressEspace(evt);
        }
    }//GEN-LAST:event_formKeyTyped

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PolyLine().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
