package ams;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewAttendance extends javax.swing.JFrame {

    /**
     * Creates new form StudentDetails
     */
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public ViewAttendance() {
        initComponents();
        initialize();
        con = JavaDatabase.ConnectToDB();
        AttendanceTableForSubject1();
        AttendanceTableForSubject2();
        AttendanceTableForSubject3();
        AttendanceTableForSubject4();
        AttendanceTableForSubject5();
        AttendanceTableForSubject6();
    }

    private void initialize() {
        setTitle("View Student Details");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1366, 768);
        setVisible(true);
    }

    public final void AttendanceTableForSubject1() {
//        setSize(1600, 900);
        try {
            String sql = "SELECT * FROM subject_1";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableViewAttendance.setModel(DbUtils.resultSetToTableModel(rs));

            pst.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public final void AttendanceTableForSubject2() {
//        setSize(1600, 900);
        try {
            String sql = "SELECT * FROM subject_2";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableViewAttendance.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public final void AttendanceTableForSubject3() {
//        setSize(1600, 900);
        try {
            String sql = "SELECT * FROM subject_3";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableViewAttendance.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public final void AttendanceTableForSubject4() {
//        setSize(1600, 900);
        try {
            String sql = "SELECT * FROM subject_4";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableViewAttendance.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public final void AttendanceTableForSubject5() {
//        setSize(1600, 900);
        try {
            String sql = "SELECT * FROM subject_5";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableViewAttendance.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public final void AttendanceTableForSubject6() {
//        setSize(1600, 900);
        try {
            String sql = "SELECT * FROM subject_6";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableViewAttendance.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //JScrollPane.setSize(1366, 768);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackColor = new javax.swing.JPanel();
        lbViewStudentDetails = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSub2 = new javax.swing.JButton();
        btnSub1 = new javax.swing.JButton();
        btnSub3 = new javax.swing.JButton();
        btnSub4 = new javax.swing.JButton();
        btnSub5 = new javax.swing.JButton();
        btnSub6 = new javax.swing.JButton();
        spStudentDetails = new javax.swing.JScrollPane();
        studentDetailsTable = new javax.swing.JScrollPane();
        tableViewAttendance = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackColor.setBackground(new java.awt.Color(0, 153, 255));
        panelBackColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbViewStudentDetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbViewStudentDetails.setText("VIEW ATTENDANCE");
        panelBackColor.add(lbViewStudentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        getContentPane().add(panelBackColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 50));

        btnBack.setBackground(new java.awt.Color(0, 255, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 1310, 40));

        btnSub2.setBackground(new java.awt.Color(255, 102, 0));
        btnSub2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSub2.setForeground(new java.awt.Color(255, 255, 255));
        btnSub2.setText("Subject 2");
        btnSub2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSub2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 150, 35));

        btnSub1.setBackground(new java.awt.Color(255, 102, 0));
        btnSub1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSub1.setForeground(new java.awt.Color(255, 255, 255));
        btnSub1.setText("Subject 1");
        btnSub1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSub1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 35));

        btnSub3.setBackground(new java.awt.Color(255, 102, 0));
        btnSub3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSub3.setForeground(new java.awt.Color(255, 255, 255));
        btnSub3.setText("Subject 3");
        btnSub3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSub3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 150, 35));

        btnSub4.setBackground(new java.awt.Color(255, 102, 0));
        btnSub4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSub4.setForeground(new java.awt.Color(255, 255, 255));
        btnSub4.setText("Subject 4");
        btnSub4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSub4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSub4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 150, 35));

        btnSub5.setBackground(new java.awt.Color(255, 102, 0));
        btnSub5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSub5.setForeground(new java.awt.Color(255, 255, 255));
        btnSub5.setText("Subject 5");
        btnSub5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSub5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSub5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 150, 35));

        btnSub6.setBackground(new java.awt.Color(255, 102, 0));
        btnSub6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSub6.setForeground(new java.awt.Color(255, 255, 255));
        btnSub6.setText("Subject 6");
        btnSub6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSub6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSub6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 60, 150, 35));

        tableViewAttendance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tableViewAttendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student_ID", "Name", "Father_Name", "Batch_ID", "Joining_Date"
            }
        ));
        tableViewAttendance.setFillsViewportHeight(true);
        tableViewAttendance.setOpaque(false);
        tableViewAttendance.setShowGrid(true);
        studentDetailsTable.setViewportView(tableViewAttendance);

        spStudentDetails.setViewportView(studentDetailsTable);

        getContentPane().add(spStudentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1310, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        ManagementPortal managePortal = new ManagementPortal();
        managePortal.show();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSub1ActionPerformed
        // TODO add your handling code here:
        AttendanceTableForSubject1();
    }//GEN-LAST:event_btnSub1ActionPerformed

    private void btnSub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSub2ActionPerformed
        // TODO add your handling code here:
        AttendanceTableForSubject2();
    }//GEN-LAST:event_btnSub2ActionPerformed

    private void btnSub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSub3ActionPerformed
        // TODO add your handling code here:
        AttendanceTableForSubject3();
    }//GEN-LAST:event_btnSub3ActionPerformed

    private void btnSub4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSub4ActionPerformed
        // TODO add your handling code here:
        AttendanceTableForSubject4();
    }//GEN-LAST:event_btnSub4ActionPerformed

    private void btnSub5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSub5ActionPerformed
        // TODO add your handling code here:
        AttendanceTableForSubject5();
    }//GEN-LAST:event_btnSub5ActionPerformed

    private void btnSub6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSub6ActionPerformed
        // TODO add your handling code here:
        AttendanceTableForSubject6();
    }//GEN-LAST:event_btnSub6ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSub1;
    private javax.swing.JButton btnSub2;
    private javax.swing.JButton btnSub3;
    private javax.swing.JButton btnSub4;
    private javax.swing.JButton btnSub5;
    private javax.swing.JButton btnSub6;
    private javax.swing.JLabel lbViewStudentDetails;
    private javax.swing.JPanel panelBackColor;
    private javax.swing.JScrollPane spStudentDetails;
    private javax.swing.JScrollPane studentDetailsTable;
    public javax.swing.JTable tableViewAttendance;
    // End of variables declaration//GEN-END:variables
}
