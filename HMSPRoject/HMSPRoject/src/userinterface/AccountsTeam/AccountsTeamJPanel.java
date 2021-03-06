/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AccountsTeam;

import Business.Department.DepartmentClass;
import Business.Ecosystem;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.OrderDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.AdminRole.ManageEnterpriseJPanel;

/**
 *
 * @author Ashmita
 */
public class AccountsTeamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountsTeamJPanel
     */
    private JPanel displayJPanel;
    private Ecosystem ecosystem;
    private OrderDirectory orderDir;
    public AccountsTeamJPanel(JPanel displayPanel, UserAccount account, DepartmentClass department, Enterprise enterprise) {
        initComponents();
        this.displayJPanel = displayPanel;
        this.orderDir = orderDir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageSalariesBtn = new javax.swing.JButton();
        manageStocksBtn = new javax.swing.JButton();
        managePatientBillsBtn = new javax.swing.JButton();

        manageSalariesBtn.setText("Manage Salaries");
        manageSalariesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSalariesBtnActionPerformed(evt);
            }
        });

        manageStocksBtn.setText("Manage Stocks");
        manageStocksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStocksBtnActionPerformed(evt);
            }
        });

        managePatientBillsBtn.setText("Manage Patient Bills");
        managePatientBillsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientBillsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageSalariesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageStocksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(managePatientBillsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(manageSalariesBtn)
                .addGap(30, 30, 30)
                .addComponent(manageStocksBtn)
                .addGap(30, 30, 30)
                .addComponent(managePatientBillsBtn)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageSalariesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSalariesBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)this.displayJPanel.getLayout();
        displayJPanel.add(new ManageSalariesJPanel(displayJPanel,ecosystem));
        layout.next(displayJPanel);
        
    }//GEN-LAST:event_manageSalariesBtnActionPerformed

    private void manageStocksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStocksBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)this.displayJPanel.getLayout();
        displayJPanel.add(new ManageStocksJPanel(displayJPanel,ecosystem, orderDir));
        layout.next(displayJPanel);
    }//GEN-LAST:event_manageStocksBtnActionPerformed

    private void managePatientBillsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientBillsBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)this.displayJPanel.getLayout();
        displayJPanel.add(new PatientBillsJPanel(displayJPanel,ecosystem));
        layout.next(displayJPanel);
    }//GEN-LAST:event_managePatientBillsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton managePatientBillsBtn;
    private javax.swing.JButton manageSalariesBtn;
    private javax.swing.JButton manageStocksBtn;
    // End of variables declaration//GEN-END:variables
}
