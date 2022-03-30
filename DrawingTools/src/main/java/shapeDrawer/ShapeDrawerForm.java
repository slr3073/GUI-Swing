package shapeDrawer;

public class ShapeDrawerForm extends javax.swing.JFrame {

    public ShapeDrawerForm() {
        initComponents();
        drawingPanel1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawingPanel1 = new shapeDrawer.DrawingPanel(this);
        lineButton = new javax.swing.JButton();
        ovalButton = new javax.swing.JButton();
        rectangleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        drawingPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout drawingPanel1Layout = new javax.swing.GroupLayout(drawingPanel1);
        drawingPanel1.setLayout(drawingPanel1Layout);
        drawingPanel1Layout.setHorizontalGroup(
            drawingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
        );
        drawingPanel1Layout.setVerticalGroup(
            drawingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );

        lineButton.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        lineButton.setText("LIGNE");
        lineButton.setEnabled(false);
        lineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButtonActionPerformed(evt);
            }
        });

        ovalButton.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        ovalButton.setText("CERCLE");
        ovalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalButtonActionPerformed(evt);
            }
        });

        rectangleButton.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        rectangleButton.setText("RECTANGLE");
        rectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(drawingPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rectangleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ovalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(drawingPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lineButton)
                .addGap(184, 184, 184)
                .addComponent(ovalButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rectangleButton)
                .addGap(160, 160, 160))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtonActionPerformed
        drawingPanel1.lineButtonActionPerformed(evt);
    }//GEN-LAST:event_lineButtonActionPerformed

    private void ovalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalButtonActionPerformed
        drawingPanel1.ovalButtonActionPerformed(evt);
    }//GEN-LAST:event_ovalButtonActionPerformed

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleButtonActionPerformed
        drawingPanel1.rectangleButtonActionPerformed(evt);
    }//GEN-LAST:event_rectangleButtonActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeDrawerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private shapeDrawer.DrawingPanel drawingPanel1;
    private javax.swing.JButton lineButton;
    private javax.swing.JButton ovalButton;
    private javax.swing.JButton rectangleButton;
    // End of variables declaration//GEN-END:variables
    
    public void setEnableLine(boolean b){
        lineButton.setEnabled(b);
    }
    
    public void setEnableOval(boolean b){
        ovalButton.setEnabled(b);
    }
    
    public void setEnableRectangle(boolean b){
        rectangleButton.setEnabled(b);
    }
}
