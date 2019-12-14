package EmployeeDatabase;

import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class EmplyeeDatabase extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultTableModel model = new DefaultTableModel();

    public EmplyeeDatabase() {
        initComponents();

        conn = EmplyeeDatabase.ConnectDB();

        Object col[] = {"EmpID", "NINumber", "Firstname", "Surname", "Gender", "DoB", "Age", "Salary"};
        model.setColumnIdentifiers(col);
        jTable1.setModel(model);

        UpdateTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbtnExit = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jbtnAddData = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jtbcUpdate = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Employee ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jbtnExit.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jbtnExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hatemi\\Downloads\\PNG ICONS\\exit2.png")); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 620, 150, 50));

        jTextField1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 170, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "NI Number", "Firstname", "Surname", "Gender", "DoB", "Age", "Salary"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 780, 470));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setText("NI Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jTextField2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 170, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setText("Firstname");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jTextField3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 170, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel4.setText("Surname");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jTextField4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 170, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jTextField5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 170, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel6.setText("Date Of Birth");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jTextField6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 170, -1));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel7.setText("Age");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jTextField7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 170, -1));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel8.setText("Salary");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jTextField8.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 170, -1));

        jbtnAddData.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jbtnAddData.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hatemi\\Downloads\\PNG ICONS\\add2.png")); // NOI18N
        jbtnAddData.setText("Insert");
        jbtnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddDataActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAddData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 150, -1));

        jbtnPrint.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jbtnPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hatemi\\Downloads\\PNG ICONS\\print2.png")); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 620, 150, 50));

        jbtnClear.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jbtnClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hatemi\\Downloads\\PNG ICONS\\Clear.png")); // NOI18N
        jbtnClear.setText("Clear");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 170, 40));

        jtbcUpdate.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jtbcUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hatemi\\Downloads\\PNG ICONS\\update2.png")); // NOI18N
        jtbcUpdate.setText("Update");
        jtbcUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbcUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jtbcUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 150, -1));

        jbtnDelete.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jbtnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hatemi\\Downloads\\PNG ICONS\\delete2.png")); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 150, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static Connection ConnectDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:my_db.db");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }

    private JFrame frame;

    // EXIT BUTTON
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("exit");

        if (JOptionPane.showConfirmDialog(frame, "Do you really want to exit ", "Employee Database Managment System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        };

    }//GEN-LAST:event_jbtnExitActionPerformed

    // CLEAR BUTTON
    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed

        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        jTextField8.setText(null);
    }//GEN-LAST:event_jbtnClearActionPerformed

// PRINT BUTTON
    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed

        MessageFormat header = new MessageFormat("Printing in progress");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (PrinterException px) {
            System.err.println("No Printer found" + px.getMessage());
        }

    }//GEN-LAST:event_jbtnPrintActionPerformed

    // INSERT BUTTON
    private void jbtnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddDataActionPerformed
        String sql = "INSERT INTO my_db(EmpID,NINumber, Firstname, Surname, Gender, DoB, Age, Salary)VALUES(?,?,?,?,?,?,?,?)";

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField2.getText());
            pst.setString(3, jTextField3.getText());
            pst.setString(4, jTextField4.getText());
            pst.setString(5, jTextField5.getText());
            pst.setString(6, jTextField6.getText());
            pst.setString(7, jTextField7.getText());
            pst.setString(8, jTextField8.getText());

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserted Sussesfully");

            pst.close();
            rs.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        // clear all textfields after clicking button
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        jTextField8.setText(null);
        UpdateTable();

    }

    // UPDATE TABLE
    public void UpdateTable() {

        conn = EmplyeeDatabase.ConnectDB();
        if (conn != null) {
            String sql = "SELECT * FROM my_db";
            try {
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                Object columData[] = new Object[8];

                while (rs.next()) {
                    columData[0] = rs.getString("EmpID");
                    columData[1] = rs.getString("NINumber");
                    columData[2] = rs.getString("Firstname");
                    columData[3] = rs.getString("Surname");
                    columData[4] = rs.getString("Gender");
                    columData[5] = rs.getString("DoB");
                    columData[6] = rs.getString("Age");
                    columData[7] = rs.getString("Salary");

                    model.addRow(columData);

                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_jbtnAddDataActionPerformed

    // UPDATE BUTTON
    private void jtbcUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbcUpdateActionPerformed

        String sql = "UPDATE my_db SET NINumber = ?, Firstname = ?, Surname=?, Gender=?, DoB=?, Age=?, Salary =? WHERE EmpID = ?";
        try {
            pst = conn.prepareStatement(sql);

            pst.setString(8, jTextField1.getText());
            pst.setString(1, jTextField2.getText());
            pst.setString(2, jTextField3.getText());
            pst.setString(3, jTextField4.getText());
            pst.setString(4, jTextField5.getText());
            pst.setString(5, jTextField6.getText());
            pst.setString(6, jTextField7.getText());
            pst.setString(7, jTextField8.getText());

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Updated Successfully");

            pst.close();
            rs.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        UpdateTable();
    }//GEN-LAST:event_jtbcUpdateActionPerformed

    // DELETE BUTTON
    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed

        String sql = "DELETE FROM my_db WHERE EmpID = ?";
        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, jTextField1.getText());

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        UpdateTable();

    }//GEN-LAST:event_jbtnDeleteActionPerformed

// MOUSE CLICK TO FILL JTEXTFIELDS
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int selectedRowIndex = jTable1.getSelectedRow();

        jTextField1.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jTextField2.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextField3.setText(model.getValueAt(selectedRowIndex, 2).toString());
        jTextField4.setText(model.getValueAt(selectedRowIndex, 3).toString());
        jTextField5.setText(model.getValueAt(selectedRowIndex, 4).toString());
        jTextField6.setText(model.getValueAt(selectedRowIndex, 5).toString());
        jTextField7.setText(model.getValueAt(selectedRowIndex, 6).toString());
        jTextField8.setText(model.getValueAt(selectedRowIndex, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(EmplyeeDatabase.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmplyeeDatabase.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmplyeeDatabase.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmplyeeDatabase.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmplyeeDatabase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton jbtnAddData;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jtbcUpdate;
    // End of variables declaration//GEN-END:variables
}
