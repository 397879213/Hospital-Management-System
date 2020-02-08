/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AccountsTeam;

import Business.Ecosystem;
import Business.OrderDirectory;
import Business.Orders;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ashmita
 */
public class ManageStocksJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStocksJPanel
     */
    private JPanel displayJPanel;
    private Ecosystem ecosystem;
    private OrderDirectory orderDir;
    public ManageStocksJPanel(JPanel displayPanel, Ecosystem ecosystem, OrderDirectory orderDir) {
        initComponents();
        this.ecosystem = ecosystem;
        this.displayJPanel = displayJPanel;
        //populateOrderGenerated();
    }
public void populateOrderGenerated()
{
    DefaultTableModel dtm = (DefaultTableModel)tblOrdersStocks.getModel();
    dtm.setRowCount(0);
    int totalPrice = 0;
    Date orderDate = new Date();
    for(Orders order:orderDir.getOrderDirectory())
    {
        Object row[] = new Object[4];
        row[0] = order.getDate();
        row[1] = order.getPlacedBy();
        row[2] = order.getDeviceName();
        row[3] = order.getCost();
        totalPrice += order.getCost();
        dtm.addRow(row);
    }
    totalPriceTxtField.setText("" +totalPrice);
   
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdersStocks = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        totalPriceTxtField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Manage Stocks");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Orders generated for this month - December 2018");

        tblOrdersStocks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order date", "Placed By", "Device/Item", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblOrdersStocks);

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Total price = ");

        totalPriceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceTxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPriceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalPriceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(backBtn)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void totalPriceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrdersStocks;
    private javax.swing.JTextField totalPriceTxtField;
    // End of variables declaration//GEN-END:variables
}
