package rubberBanding;

import components.Line;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.util.List;


public class DrawingPanel extends JPanel {

    public DrawingPanel() {
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

    // Etats
    private enum State {
        INIT,
        E1
    }
    
    private State state = State.INIT;
    
    // Transitions
    private void activateInit(){}
    
    private void activateE1(){}
    
    // Actions
    private void changeTempLine(Line newTempLine){
        tempLine = newTempLine;
        repaint();
    }
    
    private void traceFinal(){
        lines.add(tempLine);
        tempLine = null;
        clickedPoint = null;
        repaint();
    }
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if(SwingUtilities.isLeftMouseButton(evt)){
            switch(state){
                case INIT:
                    state = State.E1;
                    activateE1();
                    clickedPoint = evt.getPoint();
                    changeTempLine(new Line(clickedPoint, evt.getPoint()));
                    break;
                case E1:
                    //interdit
                    break;
            }
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if(SwingUtilities.isLeftMouseButton(evt)){
            switch(state){
                case INIT:
                    //interdit
                    break;
                case E1:
                    state = State.INIT;
                    activateInit();
                    traceFinal();
                    break;
            }
        }
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
                switch(state){
            case INIT:
                state = State.INIT;
                activateInit();
                break;
            case E1:
                state = State.E1;
                activateE1();
                changeTempLine(new Line(clickedPoint, evt.getPoint()));
                break;
        }
    }//GEN-LAST:event_formMouseDragged
    
    private Point clickedPoint;
    private Line tempLine;
    private List<Line> lines = new ArrayList<>();
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        System.out.println(lines.size());
        for (Line line : lines)
            g.drawLine(line.p1.x, line.p1.y, line.p2.x, line.p2.y);
            

        if(tempLine != null){
            g.setColor(Color.RED);
            g.drawLine(tempLine.p1.x, tempLine.p1.y, tempLine.p2.x, tempLine.p2.y);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
