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
        ampouleRouge = new component.Ampoule(Color.RED);
        ampouleOrange = new component.Ampoule(Color.ORANGE);
        ampouleVerte = new component.Ampoule(Color.GREEN);

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

        javax.swing.GroupLayout ampouleRougeLayout = new javax.swing.GroupLayout(ampouleRouge);
        ampouleRouge.setLayout(ampouleRougeLayout);
        ampouleRougeLayout.setHorizontalGroup(
            ampouleRougeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ampouleRougeLayout.setVerticalGroup(
            ampouleRougeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ampouleOrangeLayout = new javax.swing.GroupLayout(ampouleOrange);
        ampouleOrange.setLayout(ampouleOrangeLayout);
        ampouleOrangeLayout.setHorizontalGroup(
            ampouleOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ampouleOrangeLayout.setVerticalGroup(
            ampouleOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ampouleVerteLayout = new javax.swing.GroupLayout(ampouleVerte);
        ampouleVerte.setLayout(ampouleVerteLayout);
        ampouleVerteLayout.setHorizontalGroup(
            ampouleVerteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ampouleVerteLayout.setVerticalGroup(
            ampouleVerteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ampouleRouge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ampouleOrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ampouleVerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marcheButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arretButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ampouleRouge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))
                            .addComponent(ampouleOrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(ampouleVerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(marcheButton)
                        .addGap(59, 59, 59)
                        .addComponent(arretButton)
                        .addGap(55, 55, 55)
                        .addComponent(panneButton)))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Timer timerRouge = new Timer(2000, this::timerRougeTicked);
    
    private Timer timerRougeOrange = new Timer(1000,this::timerRougeOrangeTicked);
    
    private Timer timerVert = new Timer(3000,this::timerVertTicked);
    
    private Timer timerVertCligno = new Timer(1000, this::timerVertClignoTicked);
    
    private Timer timerOffCligno = new Timer(1000, this::timerOffClignoTicked);
    
    private Timer timerOrange = new Timer(1500, this::timerOrangeTicked);
    
    private Timer timerOrangePanne = new Timer(1000, this::timerOrangePanneTicked);
    
    private Timer timerOffPanne = new Timer(500, this::timerOffPanneTicked);
    
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
        ampouleRouge.eteindre();
        ampouleOrange.eteindre();
        ampouleVerte.eteindre();
    }
    
    private void lightRouge(){
        ampouleRouge.allumer();
        ampouleOrange.eteindre();
        ampouleVerte.eteindre();
    }
    
    private void lightRougeOrange(){
        ampouleRouge.allumer();
        ampouleOrange.allumer();
        ampouleVerte.eteindre();
    }
    
    private void lightOrange(){
        ampouleRouge.eteindre();
        ampouleOrange.allumer();
        ampouleVerte.eteindre();
    }
    
    private void lightVert(){
        ampouleRouge.eteindre();
        ampouleOrange.eteindre();
        ampouleVerte.allumer();
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
    private component.Ampoule ampouleOrange;
    private component.Ampoule ampouleRouge;
    private component.Ampoule ampouleVerte;
    private javax.swing.JButton arretButton;
    private javax.swing.JButton marcheButton;
    private javax.swing.JButton panneButton;
    // End of variables declaration//GEN-END:variables
}
