/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Classes.*;
/**
 *
 * @author Abhinav
 */
public class ReserveSeats extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReserveSeats
     */
    
    String flightID = "";
    
    public ReserveSeats() {
        initComponents();
        
    }
    
    public ReserveSeats(String flightID, String seatAvailability){
        initComponents();
        //print the selcted FlightID
        this.flightID = flightID;
        printFIDText.setText(flightID);
        
        //assign the number of available seats from each seat class to an array
        String [] check = seatAvailability.split("@");
        
        //print the number of available seats from each seat class on the ReserveSeats window
        fClassText.setText(check[0]);
        bClassText.setText(check[1]);
        eClassText.setText(check[2]);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        printFIDText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bClassBtn = new javax.swing.JButton();
        fClassBtn = new javax.swing.JButton();
        eClassBtn = new javax.swing.JButton();
        fClassText = new javax.swing.JTextField();
        bClassText = new javax.swing.JTextField();
        eClassText = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setClosable(true);
        setTitle("Choose a Seat Class");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Flight ID : ");

        printFIDText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printFIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFIDTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seat Availability");

        bClassBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bClassBtn.setText("Business Class");
        bClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClassBtnActionPerformed(evt);
            }
        });

        fClassBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fClassBtn.setText("First Class");
        fClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fClassBtnActionPerformed(evt);
            }
        });

        eClassBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eClassBtn.setText("Economy Class");
        eClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eClassBtnActionPerformed(evt);
            }
        });

        fClassText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fClassTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printFIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(fClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bClassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(fClassText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bClassText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(eClassText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(printFIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fClassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bClassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eClassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fClassBtnActionPerformed
        FirstClass seat = new FirstClass(flightID);
        seat.setVisible(true);
        this.getDesktopPane().add(seat);
        this.dispose();
    }//GEN-LAST:event_fClassBtnActionPerformed

    private void bClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClassBtnActionPerformed
        BusinessClass seat = new BusinessClass(flightID);
        seat.setVisible(true);
        this.getDesktopPane().add(seat);
        this.dispose();
    }//GEN-LAST:event_bClassBtnActionPerformed

    private void eClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eClassBtnActionPerformed
        EconomyClass seat = new EconomyClass(flightID);
        seat.setVisible(true);
        this.getDesktopPane().add(seat);
        this.dispose();
    }//GEN-LAST:event_eClassBtnActionPerformed

    private void fClassTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fClassTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fClassTextActionPerformed

    private void printFIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printFIDTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClassBtn;
    private javax.swing.JTextField bClassText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton eClassBtn;
    private javax.swing.JTextField eClassText;
    private javax.swing.JButton fClassBtn;
    private javax.swing.JTextField fClassText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField printFIDText;
    // End of variables declaration//GEN-END:variables
}
