package quatreboutons;

public class QuatreBoutons extends javax.swing.JFrame {

    public QuatreBoutons() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bPrintemps = new javax.swing.JButton();
        bEte = new javax.swing.JButton();
        bHiver = new javax.swing.JButton();
        bAutomne = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bPrintemps.setText("PRINTEMPS");
        bPrintemps.setMinimumSize(new java.awt.Dimension(600, 600));
        bPrintemps.setPreferredSize(new java.awt.Dimension(200, 100));
        bPrintemps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintempsActionPerformed(evt);
            }
        });

        bEte.setText("ETE");
        bEte.setEnabled(false);
        bEte.setMinimumSize(new java.awt.Dimension(600, 600));
        bEte.setPreferredSize(new java.awt.Dimension(200, 100));
        bEte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEteActionPerformed(evt);
            }
        });

        bHiver.setText("HIVER");
        bHiver.setEnabled(false);
        bHiver.setMinimumSize(new java.awt.Dimension(600, 600));
        bHiver.setPreferredSize(new java.awt.Dimension(200, 100));
        bHiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHiverActionPerformed(evt);
            }
        });

        bAutomne.setText("AUTOMNE");
        bAutomne.setEnabled(false);
        bAutomne.setMinimumSize(new java.awt.Dimension(600, 600));
        bAutomne.setPreferredSize(new java.awt.Dimension(300, 100));
        bAutomne.setRequestFocusEnabled(false);
        bAutomne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAutomneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bAutomne, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(bPrintemps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bHiver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bEte, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPrintemps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHiver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAutomne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(343, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Etats
    private enum State {
        PRINTEMPS,
        ETE,
        AUTOMNE,
        HIVER
    }
    
    private State state = State.PRINTEMPS;
    
    
    //Transitions
    private void activerPrintemps(){
        bPrintemps.setEnabled(true);
        bEte.setEnabled(false);
        bHiver.setEnabled(false);
        bAutomne.setEnabled(false);
    }
    
    private void activerEte(){
        bPrintemps.setEnabled(false);
        bEte.setEnabled(true);
        bHiver.setEnabled(false);
        bAutomne.setEnabled(false);
    }
    
    private void activerAutomne(){
        bPrintemps.setEnabled(false);
        bEte.setEnabled(false);
        bHiver.setEnabled(false);
        bAutomne.setEnabled(true);
    }
    
    private void activerHiver(){
        bPrintemps.setEnabled(false);
        bEte.setEnabled(false);
        bHiver.setEnabled(true);
        bAutomne.setEnabled(false);
    }

    //Event Handlers
    private void bPrintempsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintempsActionPerformed
        switch (state) {
            case PRINTEMPS:
                state = State.ETE;
                activerEte();
                break;
            case ETE:
                //interdit
                break;
            case AUTOMNE:
                //interdit
                break;
            case HIVER:
                //interdit
                break;
        }
    }//GEN-LAST:event_bPrintempsActionPerformed

    private void bEteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEteActionPerformed
        switch (state) {
            case PRINTEMPS:
                //interdit
                break;
            case ETE:
                state = State.AUTOMNE;
                activerAutomne();
                break;
            case AUTOMNE:
                //interdit
                break;
            case HIVER:
                //interdit
                break;
        }
    }//GEN-LAST:event_bEteActionPerformed

    private void bAutomneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAutomneActionPerformed
        switch (state) {
            case PRINTEMPS:
                //interdit
                break;
            case ETE:
                //interdit
                break;
            case AUTOMNE:
                state = State.HIVER;
                activerHiver();
                break;
            case HIVER:
                //interdit
                break;
        }
    }//GEN-LAST:event_bAutomneActionPerformed

    private void bHiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHiverActionPerformed
        switch (state) {
            case PRINTEMPS:
                //interdit
                break;
            case ETE:
                //interdit
                break;
            case AUTOMNE:
                //interdit
                break;
            case HIVER:
                state = State.PRINTEMPS;
                activerPrintemps();
                break;
        }
    }//GEN-LAST:event_bHiverActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuatreBoutons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAutomne;
    private javax.swing.JButton bEte;
    private javax.swing.JButton bHiver;
    private javax.swing.JButton bPrintemps;
    // End of variables declaration//GEN-END:variables
}
