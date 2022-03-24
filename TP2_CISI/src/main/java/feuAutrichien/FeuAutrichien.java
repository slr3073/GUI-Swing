package feuAutrichien;

import java.awt.Color;
import javax.swing.Timer;

public class FeuAutrichien extends javax.swing.JFrame {

    public FeuAutrichien() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        marcheButton = new javax.swing.JButton();
        arretButton = new javax.swing.JButton();
        panneButton = new javax.swing.JButton();
        redPane = new javax.swing.JPanel();
        orangePane = new javax.swing.JPanel();
        greenPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        marcheButton.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        marcheButton.setText("MARCHE");
        marcheButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcheButtonActionPerformed(evt);
            }
        });

        arretButton.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        arretButton.setText("ARRET");
        arretButton.setEnabled(false);
        arretButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arretButtonActionPerformed(evt);
            }
        });

        panneButton.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        panneButton.setText("PANNE");
        panneButton.setEnabled(false);
        panneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panneButtonActionPerformed(evt);
            }
        });

        redPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout redPaneLayout = new javax.swing.GroupLayout(redPane);
        redPane.setLayout(redPaneLayout);
        redPaneLayout.setHorizontalGroup(
            redPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        redPaneLayout.setVerticalGroup(
            redPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        orangePane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout orangePaneLayout = new javax.swing.GroupLayout(orangePane);
        orangePane.setLayout(orangePaneLayout);
        orangePaneLayout.setHorizontalGroup(
            orangePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        orangePaneLayout.setVerticalGroup(
            orangePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        greenPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout greenPaneLayout = new javax.swing.GroupLayout(greenPane);
        greenPane.setLayout(greenPaneLayout);
        greenPaneLayout.setHorizontalGroup(
            greenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        greenPaneLayout.setVerticalGroup(
            greenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(redPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marcheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orangePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(greenPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(arretButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(redPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(marcheButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orangePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(arretButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greenPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panneButton)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Timer timerRouge = new Timer(2000,(ae) -> {
        timerRougeTicked(ae);
    });
    
    private Timer timerRougeOrange = new Timer(1000,(ae) -> {
        timerRougeOrangeTicked(ae);
    });
    
    private Timer timerVert = new Timer(3000,(ae) -> {
        timerVertTicked(ae);
    });
    
    private Timer timerVertCligno = new Timer(1000,(ae) -> {
        timerVertClignoTicked(ae);
    });
    
    private Timer timerOffCligno = new Timer(1000,(ae) -> {
        timerOffClignoTicked(ae);
    });
    
    private Timer timerOrange = new Timer(1500,(ae) -> {
        timerOrangeTicked(ae);
    });
    
    private Timer timerOrangePanne = new Timer(1000,(ae) -> {
        timerOrangePanneTicked(ae);
    });
    
    private Timer timerOffPanne = new Timer(500,(ae) -> {
        timerOffPanneTicked(ae);
    });
    
    
    //States
    private enum State {
        INIT,
        ROUGE,
        ROUGE_ORANGE,
        VERT,
        VERT_CLIGNO,
        OFF_CLIGNO,
        ORANGE,
        ORANGE_PANNE,
        OFF_PANNE
    }
    
    private State state = State.INIT;
    
    //Transitions
    private void activateInit(){
        timerRouge.stop();
        timerRougeOrange.stop();
        timerVert.stop();
        timerOffCligno.stop();
        timerVertCligno.stop();
        timerOrange.stop();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(true);
        arretButton.setEnabled(false);
        panneButton.setEnabled(false);
    }
    
    private void activateRouge(){
        timerRouge.start();
        timerRougeOrange.stop();
        timerVert.stop();
        timerOffCligno.stop();
        timerVertCligno.stop();
        timerOrange.stop();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateRougeOrange(){
        timerRouge.stop();
        timerRougeOrange.start();
        timerVert.stop();
        timerOffCligno.stop();
        timerVertCligno.stop();
        timerOrange.stop();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateVert(){
        timerRouge.stop();
        timerRougeOrange.stop();
        timerVert.start();
        timerOffCligno.stop();
        timerVertCligno.stop();
        timerOrange.stop();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateOffCligno(){
        timerRouge.stop();
        timerRougeOrange.stop();
        timerVert.stop();
        timerOffCligno.start();
        timerVertCligno.stop();
        timerOrange.stop();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateVertCligno(){
        timerRouge.stop();
        timerRougeOrange.stop();
        timerVert.stop();
        timerOffCligno.stop();
        timerVertCligno.start();
        timerOrange.stop();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateOrange(){
        timerRouge.stop();
        timerRougeOrange.stop();
        timerVert.stop();
        timerOffCligno.stop();
        timerVertCligno.stop();
        timerOrange.start();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateOrangePanne(){
        timerRouge.stop();
        timerRougeOrange.stop();
        timerVert.stop();
        timerOffCligno.stop();
        timerVertCligno.stop();
        timerOrange.stop();
        timerOrangePanne.start();
        timerOffPanne.stop();
        marcheButton.setEnabled(true);
        arretButton.setEnabled(true);
        panneButton.setEnabled(false);
    }
    
    private void activateOffPanne(){
        timerRouge.stop();
        timerRougeOrange.stop();
        timerVert.stop();
        timerOffCligno.stop();
        timerVertCligno.stop();
        timerOrange.stop();
        timerOrangePanne.stop();
        timerOffPanne.start();
        marcheButton.setEnabled(true);
        arretButton.setEnabled(true);
        panneButton.setEnabled(false);
    }

    //Actions
    private void lightOff(){
        redPane.setBackground(new Color(242,242,242));
        greenPane.setBackground(new Color(242,242,242));
        orangePane.setBackground(new Color(242,242,242));
    }
    
    private void lightRouge(){
        redPane.setBackground(new Color(255,51,51));
        greenPane.setBackground(new Color(242,242,242));
        orangePane.setBackground(new Color(242,242,242));
    }
    
    private void lightRougeOrange(){
        redPane.setBackground(new Color(255,51,51));
        greenPane.setBackground(new Color(242,242,242));
        orangePane.setBackground(new Color(255,153,0));
    }
    
    private void lightOrange(){
        redPane.setBackground(new Color(242,242,242));
        greenPane.setBackground(new Color(242,242,242));
        orangePane.setBackground(new Color(255,153,0));
    }
    
    private void lightVert(){
        redPane.setBackground(new Color(242,242,242));
        greenPane.setBackground(new Color(102,204,0));
        orangePane.setBackground(new Color(242,242,242));
    }
    
    //Compteurs
    private int n = 0;
    
    //Events
    private void marcheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcheButtonActionPerformed
        switch (state) {
            case INIT:
                n = 0;
                lightRouge();
                state = State.ROUGE;
                activateRouge();
                break;
            case ROUGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case OFF_CLIGNO:
                //interdit
                break;
            case VERT_CLIGNO:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ORANGE_PANNE:
                n = 0;
                lightRouge();
                state = State.ROUGE;
                activateRouge();
                break;
            case OFF_PANNE:
                n = 0;
                lightRouge();
                state = State.ROUGE;
                activateRouge();
                break;    
        }
    }//GEN-LAST:event_marcheButtonActionPerformed

    private void arretButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arretButtonActionPerformed
        switch (state) {
            case INIT:
                //interdit
                break;
            case ROUGE:
                n = 0;
                state = State.INIT;
                activateInit();
                lightOff();
                break;
            case ROUGE_ORANGE:
                n = 0;
                state = State.INIT;
                activateInit();
                lightOff();
                break;
            case VERT:
                n = 0;
                state = State.INIT;
                activateInit();
                lightOff();
                break;
            case OFF_CLIGNO:
                n = 0;
                state = State.INIT;
                activateInit();
                lightOff();
                break;
            case VERT_CLIGNO:
                n = 0;
                state = State.INIT;
                activateInit();
                lightOff();
                break;
            case ORANGE:
                n = 0;
                state = State.INIT;
                activateInit();
                lightOff();
                break;
            case ORANGE_PANNE:
                n = 0;
                state = State.INIT;
                activateInit();
                lightOff();
                break;
            case OFF_PANNE:
                n = 0;
                state = State.INIT;
                activateInit();
                lightOff();
                break;    
        }
    }//GEN-LAST:event_arretButtonActionPerformed

    private void panneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panneButtonActionPerformed
        switch (state) {
            case INIT:
                //interdit
                break;
            case ROUGE:
                n = 0;
                state = State.ORANGE_PANNE;
                activateOrangePanne();
                lightOrange();
                break;
            case ROUGE_ORANGE:
                n = 0;
                state = State.ORANGE_PANNE;
                activateOrangePanne();
                lightOrange();
                break;
            case VERT:
                n = 0;
                state = State.ORANGE_PANNE;
                activateOrangePanne();
                lightOrange();
                break;
            case OFF_CLIGNO:
                n = 0;
                state = State.ORANGE_PANNE;
                activateOrangePanne();
                lightOrange();
                break;
            case VERT_CLIGNO:
                n = 0;
                state = State.ORANGE_PANNE;
                activateOrangePanne();
                lightOrange();
                break;
            case ORANGE:
                n = 0;
                state = State.ORANGE_PANNE;
                activateOrangePanne();
                lightOrange();
                break;
            case ORANGE_PANNE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;    
        }
    }//GEN-LAST:event_panneButtonActionPerformed
    
    private void timerRougeTicked(java.awt.event.ActionEvent evt) {                                            
        switch (state) {
            case INIT:
                //interdit
                break;
            case ROUGE:
                n = 0;
                state = State.ROUGE_ORANGE;
                activateRougeOrange();
                lightRougeOrange();
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case OFF_CLIGNO:
                //interdit
                break;
            case VERT_CLIGNO:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;    
        }
    }
    
    private void timerRougeOrangeTicked(java.awt.event.ActionEvent evt) {                                            
        switch (state) {
            case INIT:
                //interdit
                break;
            case ROUGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                n = 0;
                state = State.VERT;
                activateVert();
                lightVert();
                break;
            case VERT:
                //interdit
                break;
            case OFF_CLIGNO:
                //interdit
                break;
            case VERT_CLIGNO:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;    
        }
    }
    
    private void timerVertTicked(java.awt.event.ActionEvent evt) {                                            
        switch (state) {
            case INIT:
                //interdit
                break;
            case ROUGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                n = 0;
                state = State.OFF_CLIGNO;
                activateOffCligno();
                lightOff();
                break;
            case OFF_CLIGNO:
                //interdit
                break;
            case VERT_CLIGNO:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;    
        }
    }
    
    private void timerVertClignoTicked(java.awt.event.ActionEvent evt) {                                            
        switch (state) {
            case INIT:
                //interdit
                break;
            case ROUGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case OFF_CLIGNO:
                //interdit
                break;
            case VERT_CLIGNO:
                if (n > 2){
                    state = State.ORANGE;
                    activateOrange();
                    lightOrange();
                    n = 0;
                } else {
                    state = State.OFF_CLIGNO;
                    activateOffCligno();
                    lightOff();
                    n++;
                }
                
                break;
            case ORANGE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;    
        }
    }
    
    private void timerOffClignoTicked(java.awt.event.ActionEvent evt) {                                            
        switch (state) {
            case INIT:
                //interdit
                break;
            case ROUGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case OFF_CLIGNO:
                n = n;
                state = State.VERT_CLIGNO;
                activateVertCligno();
                lightVert();
                break;
            case VERT_CLIGNO:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;    
        }
    }
    
    private void timerOrangeTicked(java.awt.event.ActionEvent evt) {                                            
        switch (state) {
            case INIT:
                //interdit
                break;
            case ROUGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case OFF_CLIGNO:
                //interdit
                break;
            case VERT_CLIGNO:
                //interdit
                break;
            case ORANGE:
                n = 0;
                state = State.ROUGE;
                activateRouge();
                lightRouge();
                break;
            case ORANGE_PANNE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;    
        }
    }
    
    private void timerOrangePanneTicked(java.awt.event.ActionEvent evt) {                                            
        switch (state) {
            case INIT:
                //interdit
                break;
            case ROUGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case OFF_CLIGNO:
                //interdit
                break;
            case VERT_CLIGNO:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ORANGE_PANNE:
                n = 0;
                state = State.OFF_PANNE;
                activateOffPanne();
                lightOff();
                break;
            case OFF_PANNE:
                //interdit
                break;    
        }
    }
    
    private void timerOffPanneTicked(java.awt.event.ActionEvent evt) {                                            
        switch (state) {
            case INIT:
                //interdit
                break;
            case ROUGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case OFF_CLIGNO:
                //interdit
                break;
            case VERT_CLIGNO:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
            case OFF_PANNE:
                n = 0;
                state = State.ORANGE_PANNE;
                activateOrangePanne();
                lightOrange();
                break;    
        }
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeuAutrichien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arretButton;
    private javax.swing.JPanel greenPane;
    private javax.swing.JButton marcheButton;
    private javax.swing.JPanel orangePane;
    private javax.swing.JButton panneButton;
    private javax.swing.JPanel redPane;
    // End of variables declaration//GEN-END:variables
}
