/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi.program;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.Statement; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class signup extends javax.swing.JFrame {
     Connection con =null;    
     Statement st = null; 
    /**
     
     */
    public signup() {
        initComponents();
        
    }

    private signup(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     private void hapuslayar(){         
         txtusername.setText("");            
         txtpass.setText("");         
         txtrepass.setText("");     
     }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnama = new javax.swing.JLabel();
        txtpaswd = new javax.swing.JLabel();
        txtrepaswd = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        txtrepass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btdaftar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btkembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnama.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\user.png")); // NOI18N
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtpaswd.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\pass.png")); // NOI18N
        getContentPane().add(txtpaswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtrepaswd.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\pass.png")); // NOI18N
        getContentPane().add(txtrepaswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 250, 30));

        txtpass.setText("password");
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 250, 30));

        txtrepass.setText("password");
        getContentPane().add(txtrepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Daftar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        btdaftar.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\bt.png")); // NOI18N
        btdaftar.setOpaque(false);
        btdaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdaftarActionPerformed(evt);
            }
        });
        getContentPane().add(btdaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 130, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kembali");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        btkembali.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\bt.png")); // NOI18N
        btkembali.setOpaque(false);
        btkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 130, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\login.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btdaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdaftarActionPerformed
        // TODO add your handling code here:
    try{
        if(txtusername.getText().equals("") || txtpass.getPassword().equals("") || txtrepass == txtpass){ 
        JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
        hapuslayar();
        }else{
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/gudang","root","");
            st = con.createStatement();
            String simpan = "INSERT INTO login VALUES ('"+txtusername.getText()+"','"+String.valueOf(txtpass.getPassword())+"')";
            st=con.createStatement();
            int SA = st.executeUpdate(simpan);
            JOptionPane.showMessageDialog(null, "Registrasi Berhasil");
            this.setVisible(false);
            new login(null, true).setVisible(true);
        }
    } catch (Exception e) {
    JOptionPane.showMessageDialog(this,"This Account is Already exist / Duplicate Account ", "Pesan", JOptionPane.WARNING_MESSAGE);
    hapuslayar();
    }
    }//GEN-LAST:event_btdaftarActionPerformed

    private void btkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkembaliActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);         
        new login(null, true).setVisible(true);
    }//GEN-LAST:event_btkembaliActionPerformed
    
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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {             
             public void run() {                
                 signup dialog = new signup(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btdaftar;
    private javax.swing.JButton btkembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txtnama;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JLabel txtpaswd;
    private javax.swing.JPasswordField txtrepass;
    private javax.swing.JLabel txtrepaswd;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
