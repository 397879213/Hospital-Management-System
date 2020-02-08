/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysadminRole;

/**
 *
 * @author lsrajput
 */
import Business.Ecosystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class ManagePatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientsJPanel
     */
    private JPanel displayJPanel;
    private Ecosystem ecosystem;
    public ManagePatientsJPanel(JPanel displayJPanel,Ecosystem ecosystem) {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.ecosystem = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        createPatientBtn = new javax.swing.JButton();
        managePatientRequestBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Enterprise <Grey Sloan Medical Centre>");

        createPatientBtn.setText("Create Patient");
        createPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientBtnActionPerformed(evt);
            }
        });

        managePatientRequestBtn.setText("Manage Patient Request");
        managePatientRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientRequestBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(managePatientRequestBtn)
                            .addComponent(createPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(createPatientBtn)
                .addGap(48, 48, 48)
                .addComponent(managePatientRequestBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientBtnActionPerformed
        CardLayout layout = (CardLayout)this.displayJPanel.getLayout();
        this.displayJPanel.add(new CreatepatientsJPanel(displayJPanel, ecosystem));
        layout.next(displayJPanel);
    }//GEN-LAST:event_createPatientBtnActionPerformed

    private void managePatientRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientRequestBtnActionPerformed
        CardLayout layout = (CardLayout)this.displayJPanel.getLayout();
        this.displayJPanel.add(new ManagePatientRequestJPanel(displayJPanel, ecosystem));
        layout.next(displayJPanel);
    }//GEN-LAST:event_managePatientRequestBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createPatientBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePatientRequestBtn;
    // End of variables declaration//GEN-END:variables
}
