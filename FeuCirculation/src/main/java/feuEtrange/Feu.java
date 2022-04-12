package feuEtrange;

import java.awt.Color;
import javax.swing.Timer;

public class Feu extends javax.swing.JFrame {

    public Feu() {
        initComponents();
    }
    
    private final static int X1 = 1000;
    private final static int X2 = 1000;
    private final static int X3 = 1000;
    private final static int X4 = 1000;
    private final static int X5 = 1000;
    private final static int X6 = 1000;

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

    private Timer tOrange = new Timer(X1, this::tOrange);
    
    private Timer tOrangeRouge = new Timer(X2,this::tOrangeRouge);
    
    private Timer tVert = new Timer(X3,this::tVert);
    
    private Timer tVertOrange = new Timer(X4, this::tVertOrange);
    
    private Timer tOffP = new Timer(X5, this::tOffP);
    
    private Timer tOrangeP = new Timer(X6, this::tOrangeP);
    
    //States
    private enum State {
        INIT,
        ORANGE,
        ROUGE_ORANGE,
        VERT,
        VERT_ORANGE,
        OFF_PANNE,
        ORANGE_PANNE
    }
    
    private State state = State.INIT;
    
    //Transitions
    
    private void activateInit(){
        tOrange.stop();
        tOrangeRouge.stop();
        tVert.stop();
        tVertOrange.stop();
        tOffP.stop();
        tOrangeP.stop();
        marcheButton.setEnabled(true);
        arretButton.setEnabled(false);
        panneButton.setEnabled(false);
    }
    
    private void activateOrange(){
        tOrange.start();
        tOrangeRouge.stop();
        tVert.stop();
        tVertOrange.stop();
        tOffP.stop();
        tOrangeP.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateOrangeRouge(){
        tOrange.stop();
        tOrangeRouge.start();
        tVert.stop();
        tVertOrange.stop();
        tOffP.stop();
        tOrangeP.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateVert(){
        tOrange.stop();
        tOrangeRouge.stop();
        tVert.start();
        tVertOrange.stop();
        tOffP.stop();
        tOrangeP.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateVertOrange(){
        tOrange.stop();
        tOrangeRouge.stop();
        tVert.stop();
        tVertOrange.start();
        tOffP.stop();
        tOrangeP.stop();
        marcheButton.setEnabled(false);
        arretButton.setEnabled(true);
        panneButton.setEnabled(true);
    }
    
    private void activateOffP(){
        tOrange.stop();
        tOrangeRouge.stop();
        tVert.stop();
        tVertOrange.start();
        tOffP.start();
        tOrangeP.stop();
        marcheButton.setEnabled(true);
        arretButton.setEnabled(true);
        panneButton.setEnabled(false);
    }
    
    private void activateOrangeP(){
        tOrange.stop();
        tOrangeRouge.stop();
        tVert.stop();
        tVertOrange.start();
        tOffP.stop();
        tOrangeP.start();
        marcheButton.setEnabled(true);
        arretButton.setEnabled(true);
        panneButton.setEnabled(false);
    }

    //Actions
    
    /**
     * Allume Orange eteint le reste
     */
    private void alOrange(){
        ampouleRouge.eteindre();
        ampouleOrange.allumer();
        ampouleVerte.eteindre();
    }
    
    /**
     * Allume Orange et Rouge eteint Vert
     */
    private void alOrangeRouge(){
        ampouleRouge.allumer();
        ampouleOrange.allumer();
        ampouleVerte.eteindre();
    }
    
    /**
     * Allume Vert eteint le reste
     */
    private void alVert(){
        ampouleRouge.eteindre();
        ampouleOrange.eteindre();
        ampouleVerte.allumer();
    }
    
    /**
     * Eteint tout
     */
    private void alOff(){
        ampouleRouge.eteindre();
        ampouleOrange.eteindre();
        ampouleVerte.eteindre();
    }
    
    /**
     * Allume Vert et Orange eteint Rouge
     */
    private void alVertOrange(){
        ampouleRouge.eteindre();
        ampouleOrange.allumer();
        ampouleVerte.allumer();
    }
    
    //Events
    private void marcheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcheButtonActionPerformed
        switch (state){
            case INIT:
                state = State.ORANGE;
                activateOrange();
                alOrange();
                break;
            case ORANGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case VERT_ORANGE:
                //interdit
                break;
            case OFF_PANNE:
                state = State.ORANGE;
                activateOrange();
                alOrange();
                break;
            case ORANGE_PANNE:
                state = State.ORANGE;
                activateOrange();
                alOrange();
                break;
        }
    }//GEN-LAST:event_marcheButtonActionPerformed

    private void arretButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arretButtonActionPerformed
        switch (state){
            case INIT:
                //interdit
                break;
            case ORANGE:
                state = State.INIT;
                activateInit();
                alOff();
                break;
            case ROUGE_ORANGE:
                state = State.INIT;
                activateInit();
                alOff();
                break;
            case VERT:
                state = State.INIT;
                activateInit();
                alOff();
                break;
            case VERT_ORANGE:
                state = State.INIT;
                activateInit();
                alOff();
                break;
            case OFF_PANNE:
                state = State.INIT;
                activateInit();
                alOff();
                break;
            case ORANGE_PANNE:
                state = State.INIT;
                activateInit();
                alOff();
                break;
        }
    }//GEN-LAST:event_arretButtonActionPerformed

    private void panneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panneButtonActionPerformed
        switch (state){
            case INIT:
                //interdit
                break;
            case ORANGE:
                state = State.OFF_PANNE;
                activateOffP();
                alOff();
                break;
            case ROUGE_ORANGE:
                state = State.OFF_PANNE;
                activateOffP();
                alOff();
                break;
            case VERT:
                state = State.OFF_PANNE;
                activateOffP();
                alOff();
                break;
            case VERT_ORANGE:
                state = State.OFF_PANNE;
                activateOffP();
                alOff();
                break;
            case OFF_PANNE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
        }
    }//GEN-LAST:event_panneButtonActionPerformed
    
    private void tOrange(java.awt.event.ActionEvent evt){
        switch (state){
            case INIT:
                //interdit
                break;
            case ORANGE:
                state = State.ROUGE_ORANGE;
                activateOrangeRouge();
                alOrangeRouge();
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case VERT_ORANGE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
        }
    }
    
    private void tOrangeRouge(java.awt.event.ActionEvent evt){
        switch (state){
            case INIT:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                state = State.VERT;
                activateVert();
                alVert();
                break;
            case VERT:
                //interdit
                break;
            case VERT_ORANGE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
        }
    }
    
    private void tVert(java.awt.event.ActionEvent evt){
        switch (state){
            case INIT:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                state = State.VERT_ORANGE;
                activateVertOrange();
                alVertOrange();
                break;
            case VERT_ORANGE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
        }
    }
    
    private void tVertOrange(java.awt.event.ActionEvent evt){
        switch (state){
            case INIT:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case VERT_ORANGE:
                state = State.ORANGE;
                activateOrange();
                alOrange();
                break;
            case OFF_PANNE:
                //interdit
                break;
            case ORANGE_PANNE:
                //interdit
                break;
        }
    }
    
    private void tOffP(java.awt.event.ActionEvent evt){
        switch (state){
            case INIT:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case VERT_ORANGE:
                //interdit
                break;
            case OFF_PANNE:
                state = State.ORANGE_PANNE;
                activateOrangeP();
                alOrange();
                break;
            case ORANGE_PANNE:
                //interdit
                break;
        }
    }
    
    private void tOrangeP(java.awt.event.ActionEvent evt){
        switch (state){
            case INIT:
                //interdit
                break;
            case ORANGE:
                //interdit
                break;
            case ROUGE_ORANGE:
                //interdit
                break;
            case VERT:
                //interdit
                break;
            case VERT_ORANGE:
                //interdit
                break;
            case OFF_PANNE:
                //interdit
                break;
            case ORANGE_PANNE:
                state = State.OFF_PANNE;
                activateOffP();
                alOff();
                break;
        }
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feu().setVisible(true);
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
