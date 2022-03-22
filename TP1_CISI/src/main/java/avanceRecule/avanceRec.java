package avanceRecule;

import javax.swing.Timer;

public class avanceRec extends javax.swing.JFrame {

    private Timer timerMinus = new Timer(1000,(ae) -> {
        timerMinusActionPerformed(ae);
    });
    
    private Timer timerPlus = new Timer(1000,(ae) -> {
        timerPlusActionPerformed(ae);
    });
    
    public avanceRec() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        leftButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startButton.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        stopButton.setText("Stop");
        stopButton.setEnabled(false);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        jLabel1.setText("0");

        leftButton.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        leftButton.setText("«");
        leftButton.setEnabled(false);
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        rightButton.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        rightButton.setText("»");
        rightButton.setEnabled(false);
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(618, 618, 618)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(243, 243, 243)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(leftButton)
                    .addComponent(rightButton)
                    .addComponent(stopButton))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //States
    private enum State {
        E1,
        E2,
        E3,
        E4
    }
    
    private State state = State.E1; 
    
    //Transitions
    private void activeE1(){
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
        rightButton.setEnabled(false);
        leftButton.setEnabled(false);
        timerMinus.stop();
        timerPlus.start();
    }
    
    private void activeE2(){
        startButton.setEnabled(false);
        stopButton.setEnabled(true);
        rightButton.setEnabled(false);
        leftButton.setEnabled(true);
        timerMinus.stop();
        timerPlus.start();
    }
    
    private void activeE3(){
        startButton.setEnabled(false);
        stopButton.setEnabled(true);
        rightButton.setEnabled(true);
        leftButton.setEnabled(false);
        timerMinus.start();
        timerPlus.stop();
    }
    
    private void activeE4(){
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
        rightButton.setEnabled(false);
        leftButton.setEnabled(false);
        timerMinus.stop();
        timerPlus.stop();
    }
    
    private int n = 0;
    private int m = 0;
    
    //Actions
    private void A1(){
        jLabel1.setText("0");
    }
    
    private void A2(){
        jLabel1.setText("Pouf");
    }
    
    private void A3(){
        jLabel1.setText(String.valueOf(Integer.parseInt(jLabel1.getText()) + 1));
    }
    
    private void A4(){
        jLabel1.setText(String.valueOf(Integer.parseInt(jLabel1.getText()) - 1));
    }
    
    
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        switch (state) {
            case E1:
                n = 0;
                m = 0;
                A1();
                state = State.E2;
                activeE2();
                break;
            case E2:
                //interdit
                break;
            case E3:
                //interdit
                break;
            case E4:
                n = 0;
                m = 0;
                A1();
                state = State.E2;
                activeE2();
                break;
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        switch (state) {
            case E1:
                //interdit
                break;
            case E2:
                n = 0;
                m = 0;
                A2();
                state = State.E1;
                activeE1();
                break;
            case E3:
                n = 0;
                m = 0;
                A2();
                state = State.E1;
                activeE1();
                break;
            case E4:
                //interdit
                break;
        }
    }//GEN-LAST:event_stopButtonActionPerformed

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        switch (state) {
            case E1:
                //interdit
                break;
            case E2:
                m = n;
                n = n;
                state = State.E3;
                activeE3();
                break;
            case E3:
                //interdit
                break;
            case E4:
                //interdit
                break;
        }
    }//GEN-LAST:event_leftButtonActionPerformed

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
        switch (state) {
            case E1:
                //interdit
                break;
            case E2:
                //interdit
                break;
            case E3:
                n = m;
                n = n;
                state = State.E2;
                activeE2();
                break;
            case E4:
                //interdit
                break;
        }
    }//GEN-LAST:event_rightButtonActionPerformed

     private void timerPlusActionPerformed(java.awt.event.ActionEvent evt) {                                            
        switch (state) {
            case E1:
                //interdit
                break;
            case E2:
                if(n < 10){
                    n++;
                    m=m;
                    state = State.E2;
                    activeE2();
                    A3();
                } else {
                    n = 0;
                    m = 0;
                    state = State.E4;
                    activeE4();
                }
                break;
            case E3:
                //interdit
                break;
            case E4:
                //interdit
                break;
        }
    }  
     
    private void timerMinusActionPerformed(java.awt.event.ActionEvent evt) {                                            
        switch (state) {
            case E1:
                //interdit
                break;
            case E2:
                //interdit
                break;
            case E3:
                if(m > 0){
                    m--;
                    n=n;
                    state = State.E3;
                    activeE3();
                    A4();
                } else {
                    n = 0;
                    m = 0;
                    state = State.E4;
                    activeE4();
                }
                break;
            case E4:
                //interdit
                break;
        }
    }  
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(avanceRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(avanceRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(avanceRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(avanceRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new avanceRec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton leftButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}
