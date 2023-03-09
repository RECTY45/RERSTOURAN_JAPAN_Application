package DashboardOwner;
import Auth.login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;
import javax.swing.Icon;
import Config.koneksi;

/**
 *
 * @author Muh Israjab DS
 */
public class Menu_OwnerC extends javax.swing.JFrame {
 private PreparedStatement stat;
  private ResultSet rs;
  private DefaultTableModel model = null;
  koneksi k = new koneksi();
    private Icon icon;
    /**
     * Creates new form viewMenu
     */
    public Menu_OwnerC() {
        Icon();
        initComponents();
        k.connect();
        refreshTable();
    }

   public class menu extends Menu_OwnerC{
       int id;
       String nama_masakan,harga,status;
        public menu() {
            this.id = 0;
            this.nama_masakan = InputMasakan.getText();
            this.harga = inputHarga.getText();
            this.status = comboStatus.getSelectedItem().toString();
        }
       
   }
    
     public void refreshTable()
       {
            model = new DefaultTableModel();
            model.addColumn("ID MASAKAN");
            model.addColumn("NAMA MASASKAN");
            model.addColumn("HARGA");
            model.addColumn("STATUS MASAKAN");
           tblmasakan.setModel(model);
           try {
               stat = k.getCon().prepareStatement("SELECT * FROM tbl_menu");
               rs = stat.executeQuery();
               while(rs.next()){
                   Object[] data = {
                       rs.getString("id_masakan"),
                       rs.getString("nama_masakan"),
                       rs.getString("harga"),
                       rs.getString("status")
                   };
                   model.addRow(data);
               }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
           inputID.setText("");
           InputMasakan.setText("");
           inputHarga.setText("");
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
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblmasakan = new javax.swing.JTable();
        iconlabel = new javax.swing.JLabel();
        NamaMasakanLabel = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        StatusMasakanLabel = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        InputMasakan = new javax.swing.JTextField();
        inputHarga = new javax.swing.JTextField();
        comboStatus = new javax.swing.JComboBox<>();
        btninput = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        logoutlabel = new javax.swing.JLabel();
        backlabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bgtrancrudmenu = new javax.swing.JLabel();
        bgcrudmenu = new javax.swing.JLabel();

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

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1012, 811));
        getContentPane().setLayout(null);

        tblmasakan.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tblmasakan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Masakan", "Nama Masakan", "Harga", "Status Masakan"
            }
        ));
        tblmasakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmasakanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblmasakan);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 560, 1010, 290);

        iconlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/LogoMenuicon .png"))); // NOI18N
        getContentPane().add(iconlabel);
        iconlabel.setBounds(420, 20, 150, 170);

        NamaMasakanLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        NamaMasakanLabel.setForeground(new java.awt.Color(255, 255, 255));
        NamaMasakanLabel.setText("Nama Masakan     :");
        getContentPane().add(NamaMasakanLabel);
        NamaMasakanLabel.setBounds(60, 250, 170, 22);

        hargaLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        hargaLabel.setForeground(new java.awt.Color(255, 255, 255));
        hargaLabel.setText("Harga                     :");
        getContentPane().add(hargaLabel);
        hargaLabel.setBounds(60, 300, 170, 22);

        StatusMasakanLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        StatusMasakanLabel.setForeground(new java.awt.Color(255, 255, 255));
        StatusMasakanLabel.setText("Status Masakan    :");
        getContentPane().add(StatusMasakanLabel);
        StatusMasakanLabel.setBounds(60, 350, 170, 20);

        inputID.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        inputID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDActionPerformed(evt);
            }
        });
        getContentPane().add(inputID);
        inputID.setBounds(230, 222, 6, 0);

        InputMasakan.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        getContentPane().add(InputMasakan);
        InputMasakan.setBounds(240, 240, 520, 40);

        inputHarga.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        getContentPane().add(inputHarga);
        inputHarga.setBounds(240, 290, 520, 40);

        comboStatus.setBackground(new java.awt.Color(204, 255, 255));
        comboStatus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Tidak Tersedia" }));
        comboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStatusActionPerformed(evt);
            }
        });
        getContentPane().add(comboStatus);
        comboStatus.setBounds(240, 340, 520, 40);

        btninput.setBackground(new java.awt.Color(0, 0, 0));
        btninput.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btninput.setForeground(new java.awt.Color(255, 255, 255));
        btninput.setText("INPUT");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });
        getContentPane().add(btninput);
        btninput.setBounds(170, 420, 150, 40);

        btnupdate.setBackground(new java.awt.Color(0, 0, 0));
        btnupdate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(370, 420, 150, 40);

        btndelete.setBackground(new java.awt.Color(0, 0, 0));
        btndelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(570, 420, 150, 40);

        logoutlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/logout.png"))); // NOI18N
        logoutlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlabelMouseClicked(evt);
            }
        });
        getContentPane().add(logoutlabel);
        logoutlabel.setBounds(930, -10, 100, 110);

        backlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/BackButton .png"))); // NOI18N
        backlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlabelMouseClicked(evt);
            }
        });
        getContentPane().add(backlabel);
        backlabel.setBounds(0, 0, 150, 60);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Transaksi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(820, 290, 130, 40);

        bgtrancrudmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/bgmenu.png"))); // NOI18N
        getContentPane().add(bgtrancrudmenu);
        bgtrancrudmenu.setBounds(0, 0, 1010, 810);

        bgcrudmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/cmenu.png"))); // NOI18N
        bgcrudmenu.setText("jLabel1");
        getContentPane().add(bgcrudmenu);
        bgcrudmenu.setBounds(0, -10, 1010, 820);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDActionPerformed

    private void logoutlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlabelMouseClicked
        login l = new login();
        l.setVisible(true);
        this.setVisible(false);
        dispose();
              
    }//GEN-LAST:event_logoutlabelMouseClicked

    private void comboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboStatusActionPerformed

    private void backlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlabelMouseClicked
        // TODO add your handling code here:
        menu_owner m = new menu_owner();
        m.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_backlabelMouseClicked

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        if(InputMasakan.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"DATA TIDAK BOLEH KOSONG BRO !","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            try {
            
           PreparedStatement validate = k.getCon().prepareStatement("SELECT * FROM tbl_menu WHERE nama_masakan = '"+InputMasakan.getText()+"'");
            this.rs = validate.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "NAMA MASAKAN SUDAH ADA SILAHKAN BIKIN YANG BARU BRO !","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                menu m =  new menu();
            this.stat = k.getCon().prepareStatement("INSERT INTO tbl_menu VALUES (?,?,?,?) ");
            stat.setInt(1, 0);
            stat.setString(2,m.nama_masakan);
            stat.setString(3, m.harga);
            stat.setString(4,m.status);
            stat.executeUpdate();
            refreshTable();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DI INPUT !","Information",JOptionPane.INFORMATION_MESSAGE,icon);
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
    }//GEN-LAST:event_btninputActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
            if(inputID.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"DATA GAGAL DI HAPUS SILAHKAN KLIK DATA PADA TABEL YANG INGIN DI HAPUS !","Error",JOptionPane.ERROR_MESSAGE);
       }else{
            try {
            menu m = new menu();
            stat = k.getCon().prepareStatement("DELETE FROM tbl_menu where id_masakan= ?");
            stat.setString(1, inputID.getText());
            stat.executeUpdate();
            refreshTable();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI HAPUS !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tblmasakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmasakanMouseClicked
      inputID.setText(model.getValueAt(tblmasakan.getSelectedRow(), 0).toString());
        InputMasakan.setText(model.getValueAt(tblmasakan.getSelectedRow(), 1).toString());
        inputHarga.setText(model.getValueAt(tblmasakan.getSelectedRow(), 2).toString());
        comboStatus.setSelectedItem(model.getValueAt(tblmasakan.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tblmasakanMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
           if(inputID.getText().isEmpty() || InputMasakan.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"DATA TIDAK BOLEH KOSONG BRO!","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            try {     
                menu m =new menu();
            stat = k.getCon().prepareStatement("UPDATE tbl_menu SET nama_masakan=?,harga=?,status=? WHERE id_masakan=?");
            stat.setString(1, m.nama_masakan);
            stat.setString(2, m.harga);
            stat.setString(3, m.status);
            stat.setString(4, inputID.getText());
            stat.executeUpdate();
            refreshTable();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI UBAH !");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        transaksi_owner t = new transaksi_owner();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_OwnerC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_OwnerC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_OwnerC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_OwnerC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Menu_OwnerC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputMasakan;
    private javax.swing.JLabel NamaMasakanLabel;
    private javax.swing.JLabel StatusMasakanLabel;
    private javax.swing.JLabel backlabel;
    private javax.swing.JLabel bgcrudmenu;
    private javax.swing.JLabel bgtrancrudmenu;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JLabel iconlabel;
    private javax.swing.JTextField inputHarga;
    private javax.swing.JTextField inputID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JTable tblmasakan;
    // End of variables declaration//GEN-END:variables

    private void Icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("apk-logo .png")));
    }
}