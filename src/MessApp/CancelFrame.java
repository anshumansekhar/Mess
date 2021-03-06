/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessApp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anshuman-HP
 */
public class CancelFrame extends javax.swing.JFrame {

    /**
     * Creates new form CancelFrame
     */
    PreparedStatement cancelMeal;
    PreparedStatement addToCancelMeal;
    
    
    java.sql.Date from,to;
    
    String nametoCancel,addresstoCancel;
    public CancelFrame() {
        try {
            initComponents();
            cancelMeal=MainFrame.DBconn.prepareStatement("update cancel set breakfast=?,lunch=?,dinner=?,fromdate=?,todate=? where (name=? AND address=?)");
            addToCancelMeal=MainFrame.DBconn.prepareStatement("insert into  cancel(name,breakfast,lunch,dinner,fromdate,todate,address) values (?,?,?,?,?,?,?)");

        } catch (SQLException ex) {
            Logger.getLogger(CancelFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        nameText = new javax.swing.JTextPane();
        Get = new javax.swing.JButton();
        todayButton = new javax.swing.JButton();
        tommorowButton = new javax.swing.JButton();
        fromText = new javax.swing.JTextField();
        toText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bfastCheck = new javax.swing.JCheckBox();
        lunchCheck = new javax.swing.JCheckBox();
        dinnerCheck = new javax.swing.JCheckBox();
        cancelMealButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(nameText);

        Get.setText("Get");
        Get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetActionPerformed(evt);
            }
        });

        todayButton.setText("Today");
        todayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayButtonActionPerformed(evt);
            }
        });

        tommorowButton.setText("Tommorow");
        tommorowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tommorowButtonActionPerformed(evt);
            }
        });

        fromText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromTextActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Mobile Number", "Address", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        bfastCheck.setText("BreakFast");

        lunchCheck.setText("Lunch");

        dinnerCheck.setText("Dinnner");
        dinnerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinnerCheckActionPerformed(evt);
            }
        });

        cancelMealButton.setText("Cancel Meal");
        cancelMealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelMealButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("From (dd-MM-yyyy)");

        jLabel2.setText("To(dd-MM-yyyy)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Get)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lunchCheck)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(todayButton)
                                    .addGap(43, 43, 43)
                                    .addComponent(tommorowButton)))
                            .addComponent(bfastCheck))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(dinnerCheck))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toText))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(cancelMealButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Get)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(todayButton)
                    .addComponent(tommorowButton)
                    .addComponent(fromText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bfastCheck)
                    .addComponent(lunchCheck)
                    .addComponent(dinnerCheck))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cancelMealButton)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetActionPerformed
        try {
            // TODO add your handling code here:
            String nameToFind=nameText.getText();
            ResultSet set=MainFrame.DBconn.createStatement().executeQuery("select * from customerdetails where name LIKE '"+nameToFind+"%'");
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setNumRows(0);
            while(set.next()){
            Vector row = new Vector();
            row.add(set.getString("name"));
            row.add(set.getLong("mobilenumber"));
            row.add(set.getString("address"));
            row.add(set.getInt("Amount"));
            model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CancelFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GetActionPerformed

    private void todayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayButtonActionPerformed
        // TODO add your handling code here:
        
        DateFormat format=new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal=Calendar.getInstance();
            from= new java.sql.Date(cal.getTime().getTime());
           to= new java.sql.Date(cal.getTime().getTime());
    }//GEN-LAST:event_todayButtonActionPerformed

    private void tommorowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tommorowButtonActionPerformed
        // TODO add your handling code here:
        
        DateFormat format=new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal=Calendar.getInstance();
            cal.add(Calendar.DAY_OF_YEAR, 1);
             
            from= new java.sql.Date(cal.getTime().getTime());
           to= new java.sql.Date(cal.getTime().getTime());
    }//GEN-LAST:event_tommorowButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int row=table.getSelectedRow();
        System.out.println(""+row);
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        nametoCancel=model.getValueAt(row, 0).toString();
        addresstoCancel=model.getValueAt(row, 2).toString();
        System.out.println(""+row+nametoCancel+addresstoCancel);
    }//GEN-LAST:event_tableMouseClicked

    private void cancelMealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelMealButtonActionPerformed
        if(!fromText.getText().equals("From") && !toText.getText().equals("To")){
            try {
                SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
                java.util.Date date = sdf1.parse(fromText.getText()); 
                java.util.Date toDate=sdf1.parse(toText.getText());
                from = new java.sql.Date(date.getTime());
                to=new java.sql.Date(toDate.getTime());
            } catch (ParseException ex) {
                Logger.getLogger(CancelFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            // TODO add your handling code here:
            System.out.println(""+bfastCheck.isSelected()+lunchCheck.isSelected()+dinnerCheck.isSelected()+from+to+nametoCancel+addresstoCancel);
            cancelMeal.setBoolean(1,bfastCheck.isSelected());
            cancelMeal.setBoolean(2,lunchCheck.isSelected());
            cancelMeal.setBoolean(3,dinnerCheck.isSelected());
            cancelMeal.setDate(4,from);
            cancelMeal.setDate(5,to);
            cancelMeal.setString(6,nametoCancel);
            cancelMeal.setString(7,addresstoCancel);
            cancelMeal.execute();
            if(!(cancelMeal.getUpdateCount()>0)){
                System.out.println("Insert");
                addToCancelMeal.setString(1, nametoCancel);
                addToCancelMeal.setBoolean(2,bfastCheck.isSelected());
                addToCancelMeal.setBoolean(3,lunchCheck.isSelected());
                addToCancelMeal.setBoolean(4,dinnerCheck.isSelected());
                addToCancelMeal.setDate(5,from);
                addToCancelMeal.setDate(6,to);
                addToCancelMeal.setString(7,addresstoCancel);
                addToCancelMeal.execute();
    
                System.out.println(""+addToCancelMeal.getUpdateCount());
            }
            JOptionPane.showConfirmDialog(rootPane, "Successfully Canceled","Information",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

           
            System.out.println(""+cancelMeal.getUpdateCount());
        } catch (SQLException ex) {
            Logger.getLogger(CancelFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_cancelMealButtonActionPerformed

    private void fromTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fromTextActionPerformed

    private void dinnerCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinnerCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dinnerCheckActionPerformed

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
            java.util.logging.Logger.getLogger(CancelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Get;
    private javax.swing.JCheckBox bfastCheck;
    private javax.swing.JButton cancelMealButton;
    private javax.swing.JCheckBox dinnerCheck;
    private javax.swing.JTextField fromText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox lunchCheck;
    private javax.swing.JTextPane nameText;
    private javax.swing.JTable table;
    private javax.swing.JTextField toText;
    private javax.swing.JButton todayButton;
    private javax.swing.JButton tommorowButton;
    // End of variables declaration//GEN-END:variables
}
