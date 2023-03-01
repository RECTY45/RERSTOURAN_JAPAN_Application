/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir_app;

import java.awt.Toolkit;

/**
 *
 * @author Muh Israjab DS
 */
public class menu_owner extends javax.swing.JFrame {

    public menu_owner() {
        initComponents();
      Icons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cekmenuButton = new javax.swing.JButton();
        transaksiButton = new javax.swing.JButton();
        laporanButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(582, 745));
        getContentPane().setLayout(null);

        cekmenuButton.setBackground(new java.awt.Color(255, 255, 255));
        cekmenuButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cekmenuButton.setText("CEK MENU MASAKAN");
        cekmenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekmenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cekmenuButton);
        cekmenuButton.setBounds(160, 250, 280, 60);

        transaksiButton.setBackground(new java.awt.Color(255, 255, 255));
        transaksiButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        transaksiButton.setText("TRANSAKSI");
        transaksiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiButtonActionPerformed(evt);
            }
        });
        getContentPane().add(transaksiButton);
        transaksiButton.setBounds(160, 330, 280, 60);

        laporanButton.setBackground(new java.awt.Color(255, 255, 255));
        laporanButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        laporanButton.setText("LAPORAN");
        laporanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(laporanButton);
        laporanButton.setBounds(160, 410, 280, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/logout.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, -20, 100, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/icon.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 20, 200, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/bga.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-330, -490, 1200, 1550);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/icon.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -30, 590, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transaksiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiButtonActionPerformed
         transaksi_owner t = new transaksi_owner();
            t.setVisible(true);
            dispose();
    }//GEN-LAST:event_transaksiButtonActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        login l = new login();
            l.setVisible(true);
            dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void cekmenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekmenuButtonActionPerformed
        // TODO add your handling code here:
        Menu_OwnerC m = new  Menu_OwnerC();
            m.setVisible(true);
            dispose();
    }//GEN-LAST:event_cekmenuButtonActionPerformed

    private void laporanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanButtonActionPerformed
          laporan_owner l = new laporan_owner();
            l.setVisible(true);
            dispose();
    }//GEN-LAST:event_laporanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(menu_owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekmenuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton laporanButton;
    private javax.swing.JButton transaksiButton;
    // End of variables declaration//GEN-END:variables

    private void Icons() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("apk-logo .png")));
    }
}
