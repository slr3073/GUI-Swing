package feuFrancais;

import java.awt.Color;
import javax.swing.Timer;

public class FeuFrancais extends javax.swing.JFrame {

    public FeuFrancais() {
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
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ampouleVerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(panneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ampouleOrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arretButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ampouleRouge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marcheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(marcheButton)
                    .addComponent(ampouleRouge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ampouleOrange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arretButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ampouleVerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneButton))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Timer timerRougeOk = new Timer(2000, this::timerRougeOkTicked);
    
    private Timer timerVertOk = new Timer(3000, this::timerVertOkTicked);
    
    private Timer timerOrangeOk = new Timer(1500, this::timerOrangeOkTicked);
    
    private Timer timerOrangePanne = new Timer(1000, this::timerOrangePanneTicked);
    
    private Timer timerOffPanne = new Timer(500, this::timerOffPanneTicked);
    
    //States
    private enum State {
        INIT,
        ROUGE_OK,
        ORANGE_OK,
        VERT_OK,
        ORANGE_PANNE,
        OFF_PANNE
    }
    
    private State state = State.INIT;
    
    //Transitions
    private void activateInit(){
        timerRougeOk.stop();
        timerVertOk.stop();
        timerOrangeOk.stop();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(true);
        arretButton.setEnabled(false);
        panneButton.setEnabled(false);
    }
    
    private void activateRougeOk(){
        timerRougeOk.start();
        timerVertOk.stop();
        timerOrangeOk.stop();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateVertOk(){
        timerRougeOk.stop();
        timerVertOk.start();
        timerOrangeOk.stop();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateOrangeOk(){
        timerRougeOk.stop();
        timerVertOk.stop();
        timerOrangeOk.start();
        timerOrangePanne.stop();
        timerOffPanne.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateOrangePanne(){
        timerRougeOk.stop();
        timerVertOk.stop();
        timerOrangeOk.stop();
        timerOrangePanne.start();
        timerOffPanne.stop();
        marcheButton.setEnabled(true);
        arretButton.setEnabled(true);
        panneButton.setEnabled(false);
    }
    
    private void activateOffPanne(){
        timerRougeOk.stop();
        timerVertOk.stop();
        timerOrangeOk.stop();
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
    
    private void lightRed(){
        ampouleRouge.allumer();
        ampouleOrange.eteindre();
        ampouleVerte.eteindre();
    }
    
    private void lightOrange(){
        ampouleRouge.eteindre();
        ampouleOrange.allumer();
        ampouleVerte.eteindre();
    }
    
    private void lightGreen(){
        ampouleRouge.eteindre();
        ampouleOrange.eteindre();
        ampouleVerte.allumer();
    }
    
    
    //Events
    private void marcheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcheButtonActionPerformed
        switch(state){
            case INIT:
                state = State.ROUGE_OK;
                activateRougeOk();
                lightRed();
                break;
            case ROUGE_OK:
                //interdit
                break;
            case VERT_OK:
                //interdit
                break;
            case ORANGE_OK:
                //interdit
                break;
            case ORANGE_PANNE:
                state = State.ROUGE_OK;
                activateRougeOk();
                lightRed();
                break;   
            case OFF_PANNE:
                state = State.ROUGE_OK;
                activateRougeOk();
                lightRed();
                break;    
        }
    }//GEN-LAST:event_marcheButtonActionPerformed

    private void arretButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arretButtonActionPerformed
        switch(state){
            case INIT:
                //interdit
                break;
            case ROUGE_OK:
                state = State.INIT;
                activateInit();
                lightOff();
                break;
            case VERT_OK:
                state = State.INIT;
                activateInit();
                lightOff();
                break;
            case ORANGE_OK:
                state = State.INIT;
                activateInit();
                lightOff();
                break;
            case ORANGE_PANNE:
                state = State.INIT;
                activateInit();
                lightOff();
                break;   
            case OFF_PANNE:
                state = State.INIT;
                activateInit();
                lightOff();
                break;    
        }
    }//GEN-LAST:event_arretButtonActionPerformed

    private void panneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panneButtonActionPerformed
        switch(state){
            case INIT:
                //interdit
                break;
            case ROUGE_OK:
                state = State.ORANGE_PANNE;
                activateOrangePanne();
                lightOrange();
                break;
            case VERT_OK:
                state = State.ORANGE_PANNE;
                activateOrangePanne();
                lightOrange();
                break;
            case ORANGE_OK:
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

    private void timerRougeOkTicked(java.awt.event.ActionEvent evt) {                                            
        switch(state){
            case INIT:
                //interdit
                break;
            case ROUGE_OK:
                state = State.VERT_OK;
                activateVertOk();
                lightGreen();
                break;
            case VERT_OK:
                //interdit
                break;
            case ORANGE_OK:
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
    
    private void timerVertOkTicked(java.awt.event.ActionEvent evt) {                                            
        switch(state){
            case INIT:
                //interdit
                break;
            case ROUGE_OK:
                //interdit
                break;
            case VERT_OK:
                state = State.ORANGE_OK;
                activateOrangeOk();
                lightOrange();
                break;
            case ORANGE_OK:
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
    
    private void timerOrangeOkTicked(java.awt.event.ActionEvent evt) {                                            
        switch(state){
            case INIT:
                //interdit
                break;
            case ROUGE_OK:
                //interdit
                break;
            case VERT_OK:
                //interdit
                break;
            case ORANGE_OK:
                state = State.ROUGE_OK;
                activateRougeOk();
                lightRed();
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
        switch(state){
            case INIT:
                //interdit
                break;
            case ROUGE_OK:
                //interdit
                break;
            case VERT_OK:
                //interdit
                break;
            case ORANGE_OK:
                //interdit
                break;
            case ORANGE_PANNE:
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
        switch(state){
            case INIT:
                //interdit
                break;
            case ROUGE_OK:
                //interdit
                break;
            case VERT_OK:
                //interdit
                break;
            case ORANGE_OK:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;   
            case OFF_PANNE:
                state = State.ORANGE_PANNE;
                activateOrangePanne();
                lightOrange();
                break;    
        }
    }  
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeuFrancais().setVisible(true);
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
