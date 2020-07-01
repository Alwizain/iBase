/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi.program;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class login extends javax.swing.JFrame {
    String user = "root";
    String pwd = "";
    String url = "jdbc:mysql://localhost/gudang";
    
    
    /**
     * Creates new form login
     */
    public login(java.awt.Frame parent, boolean modal) {
        initComponents();
    }
    
    void login(){
        try {
            Connection con = DriverManager.getConnection(url,user,pwd);
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM login WHERE username='"+txtusername.getText()+"' AND password='"+txtpass.getText()+"' ");
            if(rs.next()){
                if("ADMIN".equals(rs.getString("hak_akses"))){
                    this.dispose();
                    new menuadmin().setVisible(true);
                }else if ("USER".equals(rs.getString("hak_akses"))){
                    this.dispose();
                    new menu().setVisible(true);
                }else {
                
                }
            }else{
                JOptionPane.showMessageDialog(null, "Login Gagal!! Mungkin Username atau Password Anda salah");
            }
        } catch (Exception e) {
        }
    }

    login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblclose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btlogin = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblclose.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\close1.png")); // NOI18N
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });
        jPanel1.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\user.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\pass.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Login");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 228, -1, -1));

        btlogin.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\bt.png")); // NOI18N
        btlogin.setOpaque(false);
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });
        btlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btloginKeyPressed(evt);
            }
        });
        jPanel1.add(btlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 130, 40));

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 250, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\login.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btloginKeyPressed
       
    }//GEN-LAST:event_btloginKeyPressed

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginActionPerformed
        login();
    }//GEN-LAST:event_btloginActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblcloseMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              login dialog = new login(new javax.swing.JFrame(), true);
              dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                  @Override
                  public void windowClosing(java.awt.event.WindowEvent e) {
                      System.exit(0);
                  }
              });
              dialog.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
