package ams;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class DeleteStudent extends javax.swing.JFrame {

    /**
     * Creates new form Calendar
     */
    Connection con;
    PreparedStatement pst;

    public DeleteStudent() {
        initComponents();
        initialize();
        con = JavaDatabase.ConnectToDB();
    }

    private void initialize() {
        setTitle("Delete Student");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setVisible(true);
    }

    public void DeleteFromStudentDetails() {
        int a1 = Integer.parseInt(tfStudentId.getText());
        String sql = "DELETE FROM student_details WHERE Student_ID = " + a1;
        try {
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Succesfully");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void DeleteFromSubject1() {
        int a2 = Integer.parseInt(tfStudentId.getText());
        String sql = "DELETE FROM subject_1 WHERE Student_ID = " + a2;
        try {
            pst = con.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void DeleteFromSubject2() {
        int a2 = Integer.parseInt(tfStudentId.getText());
        String sql = "DELETE FROM subject_2 WHERE Student_ID = " + a2;
        try {
            pst = con.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void DeleteFromSubject3() {
        int a2 = Integer.parseInt(tfStudentId.getText());
        String sql = "DELETE FROM subject_3 WHERE Student_ID = " + a2;
        try {
            pst = con.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void DeleteFromSubject4() {
        int a2 = Integer.parseInt(tfStudentId.getText());
        String sql = "DELETE FROM subject_4 WHERE Student_ID = " + a2;
        try {
            pst = con.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void DeleteFromSubject5() {
        int a2 = Integer.parseInt(tfStudentId.getText());
        String sql = "DELETE FROM subject_5 WHERE Student_ID = " + a2;
        try {
            pst = con.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void DeleteFromSubject6() {
        int a2 = Integer.parseInt(tfStudentId.getText());
        String sql = "DELETE FROM subject_6 WHERE Student_ID = " + a2;
        try {
            pst = con.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
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
        lbLogin = new javax.swing.JLabel();
        lbStudentId = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        tfStudentId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogin.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbLogin.setText("DELETE STUDENT");
        jPanel1.add(lbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 90));

        lbStudentId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbStudentId.setText("Student Id");
        getContentPane().add(lbStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        btnDelete.setBackground(new java.awt.Color(255, 102, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 750, 40));

        btnBack.setBackground(new java.awt.Color(0, 255, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 750, 40));

        tfStudentId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfStudentId.setToolTipText("");
        tfStudentId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tfStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentIdActionPerformed(evt);
            }
        });
        getContentPane().add(tfStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 750, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DeleteFromStudentDetails();
        DeleteFromSubject1();
        DeleteFromSubject2();
        DeleteFromSubject3();
        DeleteFromSubject4();
        DeleteFromSubject5();
        DeleteFromSubject6();
        tfStudentId.setText("");
        tfStudentId.requestFocus();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        ManagementPortal managePortal = new ManagementPortal();
        managePortal.show();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentIdActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeleteStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbStudentId;
    private javax.swing.JTextField tfStudentId;
    // End of variables declaration//GEN-END:variables
}