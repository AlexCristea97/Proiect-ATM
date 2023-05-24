/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex-PC
 */
public class FastCash extends javax.swing.JFrame {

    /**
     * Creates new form FastCash
     */
    public FastCash() {
        initComponents();
    }

    int MyAccNum;
     public FastCash(int AccountID) {
        initComponents();
        MyAccNum = AccountID;
                GetBalance();
    }
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int oldBalance;
    
    private void GetBalance(){
        String Query = "select * from AccountTbl where AccountID='" +MyAccNum+"'";
                try
                   {
                   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "Atwa6494");
                   st = conn.createStatement();
                   rs = st.executeQuery(Query);
                   
                   if(rs.next()){
                       oldBalance = rs.getInt(8);
                       BalLbl.setText(oldBalance+"$");
                       
                   } else {
                       //JOptionPane.showMessageDialog(this,"wrong account number or PIN ");
                   }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(this, e);
                 
         }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        s100 = new javax.swing.JButton();
        s1000 = new javax.swing.JButton();
        s3500 = new javax.swing.JButton();
        s500 = new javax.swing.JButton();
        s2000 = new javax.swing.JButton();
        s5000 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BalLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("A&C ATM BANK");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ATM MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        s100.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        s100.setText("100");
        s100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s100MouseClicked(evt);
            }
        });

        s1000.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        s1000.setText("1000");
        s1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s1000MouseClicked(evt);
            }
        });

        s3500.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        s3500.setText("3500");
        s3500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s3500MouseClicked(evt);
            }
        });

        s500.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        s500.setText("500");
        s500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s500MouseClicked(evt);
            }
        });

        s2000.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        s2000.setText("2000");
        s2000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s2000MouseClicked(evt);
            }
        });

        s5000.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        s5000.setText("5000");
        s5000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s5000MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LOGOUT");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("A&C ATM BANK");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("FAST CASH");

        BalLbl.setBackground(new java.awt.Color(255, 255, 255));
        BalLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BalLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BalLbl.setText("BALANCE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(s3500)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s5000))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(s1000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(s2000))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(s100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s500)))
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s100)
                    .addComponent(s500))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1000)
                    .addComponent(s2000)
                    .addComponent(BalLbl))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3500)
                    .addComponent(s5000))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s100MouseClicked
        if(oldBalance < 100){
           JOptionPane.showMessageDialog(this, "Not enough Balance");
            } else {
           
           try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "Atwa6494");
           String Query = "Update AccountTbl set Balance=? where AccountID=?";
           PreparedStatement pst = conn.prepareStatement(Query);
           pst.setInt(1, oldBalance-100);
           pst.setInt(2, MyAccNum);
           if(pst.executeUpdate() == 1){
               JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
                this.dispose();
           } else {
               JOptionPane.showMessageDialog(this, "Missing Information");
           } 
           
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
               
           } 
       } 
    }//GEN-LAST:event_s100MouseClicked

    private void s500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s500MouseClicked
        if(oldBalance < 500){
           JOptionPane.showMessageDialog(this, "Not enough Balance");
            } else {
           
           try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "Atwa6494");
           String Query = "Update AccountTbl set Balance=? where AccountID=?";
           PreparedStatement pst = conn.prepareStatement(Query);
           pst.setInt(1, oldBalance-500);
           pst.setInt(2, MyAccNum);
           if(pst.executeUpdate() == 1){
               JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
       this.dispose();
           } else {
               JOptionPane.showMessageDialog(this, "Missing Information");
           } 
           
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
               
           } 
       } 
    }//GEN-LAST:event_s500MouseClicked

    private void s1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1000MouseClicked
        if(oldBalance < 1000){
           JOptionPane.showMessageDialog(this, "Not enough Balance");
            } else {
           
           try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "Atwa6494");
           String Query = "Update AccountTbl set Balance=? where AccountID=?";
           PreparedStatement pst = conn.prepareStatement(Query);
           pst.setInt(1, oldBalance-1000);
           pst.setInt(2, MyAccNum);
           if(pst.executeUpdate() == 1){
               JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
       this.dispose();
           } else {
               JOptionPane.showMessageDialog(this, "Missing Information");
           } 
           
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
               
           } 
       } 
    }//GEN-LAST:event_s1000MouseClicked

    private void s2000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s2000MouseClicked
         if(oldBalance < 2000){
           JOptionPane.showMessageDialog(this, "Not enough Balance");
            } else {
           
           try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "Atwa6494");
           String Query = "Update AccountTbl set Balance=? where AccountID=?";
           PreparedStatement pst = conn.prepareStatement(Query);
           pst.setInt(1, oldBalance-2000);
           pst.setInt(2, MyAccNum);
           if(pst.executeUpdate() == 1){
               JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
       this.dispose();
           } else {
               JOptionPane.showMessageDialog(this, "Missing Information");
           } 
           
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
               
           } 
       } 
    }//GEN-LAST:event_s2000MouseClicked

    private void s3500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s3500MouseClicked
       if(oldBalance < 3500){
           JOptionPane.showMessageDialog(this, "Not enough Balance");
            } else {
           
           try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "Atwa6494");
           String Query = "Update AccountTbl set Balance=? where AccountID=?";
           PreparedStatement pst = conn.prepareStatement(Query);
           pst.setInt(1, oldBalance-3500);
           pst.setInt(2, MyAccNum);
           if(pst.executeUpdate() == 1){
               JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
       this.dispose();
           } else {
               JOptionPane.showMessageDialog(this, "Missing Information");
           } 
           
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
               
           } 
       } 
    }//GEN-LAST:event_s3500MouseClicked

    private void s5000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s5000MouseClicked
        if(oldBalance < 5000){
           JOptionPane.showMessageDialog(this, "Not enough Balance");
            } else {
           
           try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "Atwa6494");
           String Query = "Update AccountTbl set Balance=? where AccountID=?";
           PreparedStatement pst = conn.prepareStatement(Query);
           pst.setInt(1, oldBalance-5000);
           pst.setInt(2, MyAccNum);
           if(pst.executeUpdate() == 1){
               JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
       this.dispose();
           } else {
               JOptionPane.showMessageDialog(this, "Missing Information");
           } 
           
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
               
           } 
       } 
    }//GEN-LAST:event_s5000MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       new MainMenu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalLbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton s100;
    private javax.swing.JButton s1000;
    private javax.swing.JButton s2000;
    private javax.swing.JButton s3500;
    private javax.swing.JButton s500;
    private javax.swing.JButton s5000;
    // End of variables declaration//GEN-END:variables
}
