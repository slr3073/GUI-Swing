package polyLine;

import javax.swing.JFrame;

public class PolyLine extends JFrame {

    public PolyLine() {
        initComponents();
        lineTracingPanel1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lineTracingPanel1 = new polyLine.LineTracingPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lineTracingPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lineTracingPanel1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout lineTracingPanel1Layout = new javax.swing.GroupLayout(lineTracingPanel1);
        lineTracingPanel1.setLayout(lineTracingPanel1Layout);
        lineTracingPanel1Layout.setHorizontalGroup(
            lineTracingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        lineTracingPanel1Layout.setVerticalGroup(
            lineTracingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineTracingPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineTracingPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lineTracingPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lineTracingPanel1KeyTyped

    }//GEN-LAST:event_lineTracingPanel1KeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PolyLine().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private polyLine.LineTracingPanel lineTracingPanel1;
    // End of variables declaration//GEN-END:variables
}
