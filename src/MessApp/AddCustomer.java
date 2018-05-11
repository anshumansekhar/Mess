/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessApp;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Anshuman-HP
 */
public class AddCustomer extends javax.swing.JFrame {
    
    PreparedStatement addStmt;
    
    /**
     * Creates new form AddCustomer
     */
    public AddCustomer() {
        initComponents();
        fullRadio.setVisible(false);
        halfRadio.setVisible(false);
        try {
            addStmt=MainFrame.DBconn.prepareStatement("insert into  customerdetails(SerialNumber,name,address,amount,mobilenumber,breakfast,lunch,dinner,Remarks,Veg,Full,StartDate) values(?,?,?,?,?,?,?,?,?,?,?,?)");
        } catch (SQLException ex) {
            System.out.println("ERROER "+ex);
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        nameText = new javax.swing.JTextField();
        mobileText = new javax.swing.JTextField();
        amountText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        brfastCheck = new javax.swing.JCheckBox();
        lunchCheck = new javax.swing.JCheckBox();
        dinnerCheck = new javax.swing.JCheckBox();
        addCustomer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        remarks = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vegRadio = new javax.swing.JRadioButton();
        nonVegRadio = new javax.swing.JRadioButton();
        fullRadio = new javax.swing.JRadioButton();
        halfRadio = new javax.swing.JRadioButton();
        serialNumberText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        startDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        nameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameTextMouseClicked(evt);
            }
        });
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        mobileText.setText("0");
        mobileText.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                mobileTextAncestorRemoved(evt);
            }
        });
        mobileText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileTextMouseClicked(evt);
            }
        });
        mobileText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileTextActionPerformed(evt);
            }
        });

        amountText.setText("0");
        amountText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amountTextMouseClicked(evt);
            }
        });
        amountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTextActionPerformed(evt);
            }
        });

        addressText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressTextMouseClicked(evt);
            }
        });
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        brfastCheck.setText("BreakFast");

        lunchCheck.setText("Lunch");

        dinnerCheck.setText("Dinner");

        addCustomer.setText("Add ");
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Mobile Number");

        jLabel3.setText("Amount");

        jLabel4.setText("Address");

        jLabel6.setText("Remarks");

        vegRadio.setText("Veg");
        vegRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegRadioActionPerformed(evt);
            }
        });

        nonVegRadio.setText("Non-Veg");
        nonVegRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonVegRadioActionPerformed(evt);
            }
        });

        fullRadio.setText("Full");
        fullRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullRadioActionPerformed(evt);
            }
        });

        halfRadio.setText("Half");
        halfRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfRadioActionPerformed(evt);
            }
        });

        jLabel5.setText("Serial Number");

        jLabel7.setText("Start Date (dd-MM-yyyy)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(addCustomer))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(vegRadio)
                        .addGap(18, 18, 18)
                        .addComponent(nonVegRadio)
                        .addGap(54, 54, 54)
                        .addComponent(fullRadio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(mobileText)
                            .addComponent(amountText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(brfastCheck)
                                        .addGap(42, 42, 42)
                                        .addComponent(lunchCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dinnerCheck))
                                    .addComponent(halfRadio))
                                .addGap(45, 45, 45)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serialNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(25, 25, 25)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobileText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brfastCheck)
                    .addComponent(lunchCheck)
                    .addComponent(dinnerCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vegRadio)
                    .addComponent(nonVegRadio)
                    .addComponent(fullRadio)
                    .addComponent(halfRadio))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addCustomer)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        try {
            
            // TODO add your handling code here:
            String name=nameText.getText();
            String mobileNumber=mobileText.getText();
            String amount=amountText.getText();
            String address=addressText.getText();
            String remarksText=remarks.getText();
            String dateString=startDate.getText();
            java.sql.Timestamp dateTime=null;
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            try { 
                 java.util.Date date= sdf1.parse(dateString);
                 dateTime=new java.sql.Timestamp(date.getTime());
            } catch (ParseException ex) {
                Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            boolean bfast=brfastCheck.isSelected();
            boolean lunch=lunchCheck.isSelected();
            boolean dinner=dinnerCheck.isSelected();
            addStmt.setLong(1,new Long(serialNumberText.getText()));
            addStmt.setString(2,name);
            addStmt.setString(5,mobileNumber);
            addStmt.setInt(4,Integer.parseInt(amount));
            addStmt.setString(3, address);
            addStmt.setBoolean(6, bfast);
            addStmt.setBoolean(7, lunch);
            addStmt.setBoolean(8, dinner);
            addStmt.setString(9,remarksText);
            addStmt.setBoolean(10,vegRadio.isSelected());
            addStmt.setBoolean(11,fullRadio.isSelected());
            addStmt.setTimestamp(12,dateTime);
            addStmt.execute();
            JOptionPane.showConfirmDialog(rootPane, "Successfully Added","Information",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_addCustomerActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nameTextActionPerformed

    private void mobileTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTextActionPerformed

    private void amountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextActionPerformed

    private void nameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextMouseClicked

    private void mobileTextAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mobileTextAncestorRemoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mobileTextAncestorRemoved

    private void amountTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextMouseClicked

    private void addressTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextMouseClicked

    private void mobileTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTextMouseClicked

    private void vegRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegRadioActionPerformed
        // TODO add your handling code here:
        nonVegRadio.setSelected(false);
        fullRadio.setVisible(false);
        halfRadio.setVisible(false);
    }//GEN-LAST:event_vegRadioActionPerformed

    private void nonVegRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonVegRadioActionPerformed
        // TODO add your handling code here:
        vegRadio.setSelected(false);
        fullRadio.setVisible(true);
        halfRadio.setVisible(true);
    }//GEN-LAST:event_nonVegRadioActionPerformed

    private void fullRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullRadioActionPerformed
        // TODO add your handling code here:
        halfRadio.setSelected(false);
    }//GEN-LAST:event_fullRadioActionPerformed

    private void halfRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfRadioActionPerformed
        // TODO add your handling code here:
        fullRadio.setSelected(false);
    }//GEN-LAST:event_halfRadioActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomer;
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField amountText;
    private javax.swing.JCheckBox brfastCheck;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox dinnerCheck;
    private javax.swing.JRadioButton fullRadio;
    private javax.swing.JRadioButton halfRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox lunchCheck;
    private javax.swing.JTextField mobileText;
    private javax.swing.JTextField nameText;
    private javax.swing.JRadioButton nonVegRadio;
    private javax.swing.JTextField remarks;
    private javax.swing.JTextField serialNumberText;
    private javax.swing.JTextField startDate;
    private javax.swing.JRadioButton vegRadio;
    // End of variables declaration//GEN-END:variables
}
