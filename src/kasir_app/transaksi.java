/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir_app;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import java.util.Date;

/**
 *
 * @author Muh Israjab DS
 */

public class transaksi extends javax.swing.JFrame {
 private PreparedStatement stat;
 private ResultSet rs;
 private DefaultTableModel model = null;
 koneksi k = new koneksi();
  
    public transaksi() {
        Icon();
        initComponents();
        k.connect();
        inputIdtransaksi.setVisible(false);
       refreshTable();
       refreshCombo();
    }

          Icon icon = new javax.swing.ImageIcon(getClass().getResource("success-icon.png"));
    
    
    public class trans extends transaksi{
            int id_transaksi,id_masakan,harga,jumlah_beli,total_bayar;
            String nama_pelanggan,tanggal,nama_masaskan;
        public trans() {
            this.nama_pelanggan = inputnamapelanggan.getText();
            String combo = idmasakancombobox.getSelectedItem().toString();
            String[] arr = combo.split(":");
            this.id_masakan = Integer.parseInt(arr[0]);
            try {
                Date date = inputtanggal.getDate();
                DateFormat dateformat =  new SimpleDateFormat("YYYY-MM-dd");
                this.tanggal = dateformat.format(date);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            this.nama_masaskan = arr[1];
            this.harga = Integer.parseInt(arr[2]);
            this.jumlah_beli = Integer.parseInt(inputjumlahbeli.getText());
            this.total_bayar = this.harga*this.jumlah_beli;
        }
        
    }
    
    
      public void refreshTable()
       {
            model = new DefaultTableModel();
            model.addColumn("ID MASAKAN");
            model.addColumn("NAMA PELANGGAN");
            model.addColumn("ID MASAKAN");
            model.addColumn("TANGGAL");
            model.addColumn("NAMA MASAKAN");
            model.addColumn("HARGA");
            model.addColumn("JUMLAH BELI");
            model.addColumn("TOTAL BAYAR");
            tblmenumasakan.setModel(model);
           try {
               stat = k.getCon().prepareStatement("SELECT*FROM viewtransaksi WHERE status = 'Tersedia'");
               rs = stat.executeQuery();
               while(rs.next()){
                   Object[] data = {
                       rs.getString(1),
                       rs.getString(2),
                       rs.getString(3),
                       rs.getString(4),
                       rs.getString(5),
                       rs.getString(6),
                       rs.getString(7),
                       rs.getString(8)
                   };
                   model.addRow(data);
               }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
           inputIdtransaksi.setText("");
           inputnamapelanggan.setText("");
           inputjumlahbeli.setText("");
           inputtotalbayar.setText("");
        }
      
      public void refreshCombo(){
          try {
              this.stat = k.getCon().prepareStatement("select*from tbl_menu "
                      + "where status = 'Tersedia'");
              this.rs = this.stat.executeQuery();
              while(rs.next()){
                  idmasakancombobox.addItem(rs.getString("id_masakan")+":"+
                          rs.getString("nama_masakan")+":"+rs.getString("harga"));
              }
              
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e.getMessage());
          }
      }
      
      
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeltransaksi = new javax.swing.JLabel();
        inputIdtransaksi = new javax.swing.JTextField();
        inputnamapelanggan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idmasakancombobox = new javax.swing.JComboBox<>();
        btninputmenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputjumlahbeli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputtotalbayar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmenumasakan = new javax.swing.JTable();
        btninput = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnlabellogout = new javax.swing.JLabel();
        btnlabelback = new javax.swing.JLabel();
        inputtanggal = new com.toedter.calendar.JDateChooser();
        bgtrantrantransaksi = new javax.swing.JLabel();
        bgtransaksi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1018, 1068));
        getContentPane().setLayout(null);

        labeltransaksi.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        labeltransaksi.setForeground(new java.awt.Color(255, 255, 255));
        labeltransaksi.setText("TRANSAKSI");
        getContentPane().add(labeltransaksi);
        labeltransaksi.setBounds(424, 95, 138, 30);

        inputIdtransaksi.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        inputIdtransaksi.setEnabled(false);
        getContentPane().add(inputIdtransaksi);
        inputIdtransaksi.setBounds(194, 195, 6, 0);

        inputnamapelanggan.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        getContentPane().add(inputnamapelanggan);
        inputnamapelanggan.setBounds(170, 220, 535, 41);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Pelanggan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 190, 153, 23);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Maskasakan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 290, 137, 23);

        idmasakancombobox.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        getContentPane().add(idmasakancombobox);
        idmasakancombobox.setBounds(170, 320, 535, 41);

        btninputmenu.setBackground(new java.awt.Color(0, 0, 0));
        btninputmenu.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btninputmenu.setForeground(new java.awt.Color(255, 255, 255));
        btninputmenu.setText("CEK MENU");
        btninputmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btninputmenu);
        btninputmenu.setBounds(767, 387, 155, 41);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tanggal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 380, 71, 23);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jumlah Beli");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 480, 107, 23);

        inputjumlahbeli.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        getContentPane().add(inputjumlahbeli);
        inputjumlahbeli.setBounds(170, 510, 535, 41);

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Bayar ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 580, 111, 23);

        inputtotalbayar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        inputtotalbayar.setEnabled(false);
        getContentPane().add(inputtotalbayar);
        inputtotalbayar.setBounds(170, 610, 535, 41);

        tblmenumasakan.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        tblmenumasakan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "Nama Pelanggan", "ID Masakan", "Tanggal", "Jumlah Beli", "Total Bayar"
            }
        ));
        tblmenumasakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmenumasakanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmenumasakan);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 812, 1018, 255);

        btninput.setBackground(new java.awt.Color(0, 0, 0));
        btninput.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btninput.setForeground(new java.awt.Color(255, 255, 255));
        btninput.setText("INPUT ");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });
        getContentPane().add(btninput);
        btninput.setBounds(150, 680, 140, 41);

        btnupdate.setBackground(new java.awt.Color(0, 0, 0));
        btnupdate.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(370, 680, 140, 41);

        btndelete.setBackground(new java.awt.Color(0, 0, 0));
        btndelete.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(590, 680, 140, 41);

        btnlabellogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/logout.png"))); // NOI18N
        btnlabellogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabellogoutMouseClicked(evt);
            }
        });
        getContentPane().add(btnlabellogout);
        btnlabellogout.setBounds(930, 0, 80, 88);

        btnlabelback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/BackButton .png"))); // NOI18N
        btnlabelback.setText("jLabel8");
        btnlabelback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelbackMouseClicked(evt);
            }
        });
        getContentPane().add(btnlabelback);
        btnlabelback.setBounds(0, 0, 150, 60);

        inputtanggal.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        getContentPane().add(inputtanggal);
        inputtanggal.setBounds(170, 420, 530, 40);

        bgtrantrantransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/bgtrantransaksi.png"))); // NOI18N
        bgtrantrantransaksi.setText("jLabel7");
        getContentPane().add(bgtrantrantransaksi);
        bgtrantrantransaksi.setBounds(1, -4, 1020, 1068);

        bgtransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/bgtransaksi.png"))); // NOI18N
        getContentPane().add(bgtransaksi);
        bgtransaksi.setBounds(-600, -100, 1920, 1270);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
           if(inputIdtransaksi.getText().isEmpty() || inputnamapelanggan.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"DATA TIDAK BOLEH KOSONG BRO!","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
        try {
        trans t = new trans();
            t.id_transaksi = Integer.parseInt(inputIdtransaksi.getText());
            this.stat = k.getCon().prepareStatement("UPDATE tbl_transaksi SET nama_pelanggan=?,"
                    + "id_masakan=?,tanggal=?,jml_beli=?,total_beli=? WHERE id_transaksi=?");
            this.stat.setString(1, t.nama_pelanggan);
            this.stat.setInt(2, t.id_masakan);
            this.stat.setString(3, t.tanggal);
            this.stat.setInt(4, t.jumlah_beli);
            this.stat.setInt(5, t.total_bayar);
            this.stat.setInt(6, t.id_transaksi);
            this.stat.executeUpdate();
            refreshTable();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DI UBAH !","Information",JOptionPane.INFORMATION_MESSAGE,icon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
           }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnlabellogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabellogoutMouseClicked
        // TODO add your handling code here:
        login l = new login();
        l.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnlabellogoutMouseClicked

    private void btnlabelbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelbackMouseClicked
        // TODO add your handling code here:
        menu_admin m = new menu_admin();
        m.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnlabelbackMouseClicked

    private void btninputmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputmenuActionPerformed
        // TODO add your handling code here:
        crudMenu c = new crudMenu();
        c.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btninputmenuActionPerformed

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
         if(inputnamapelanggan.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"DATA TIDAK BOLEH KOSONG BRO !","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
        try {
              PreparedStatement validate = k.getCon().prepareStatement("SELECT * FROM tbl_transaksi WHERE nama_pelanggan = '"+inputnamapelanggan.getText()+"'");
            this.rs = validate.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "DATA TRANSAKSI INI SUDAH ADA SILAHKAN BIKIN YANG BARU BRO !","Error",JOptionPane.ERROR_MESSAGE);
            }else{
            trans t = new trans();
            inputtotalbayar.setText(""+t.total_bayar);
            this.stat = k.getCon().prepareStatement("insert into tbl_transaksi values (?,?,?,?,?,?)");
            this.stat.setInt(1, 0);
            this.stat.setString(2, t.nama_pelanggan);
            this.stat.setInt(3, t.id_masakan);
            this.stat.setString(4, t.tanggal);
            this.stat.setInt(5, t.jumlah_beli);
            this.stat.setInt(6, t.total_bayar);
            int pilihan = JOptionPane.showConfirmDialog(null
                    , "Tanggal : " +t.tanggal+
                         "\nNama_Pelanggan " +t.nama_pelanggan+
                          "\nPembelian : " + t.jumlah_beli + " "+t.nama_masaskan+
                   "\nTotal Bayar : "+t.total_bayar+"\n" ,
                    "Apakah Ingin Tambah Transaksi ?",
                   JOptionPane.YES_NO_OPTION);
            if (pilihan == JOptionPane.YES_OPTION) {
                this.stat.executeUpdate();
                
                refreshTable();
            } else if(pilihan == JOptionPane.YES_NO_OPTION){
                refreshTable();
            }
            }
        } catch (Exception e) {
        }
         }
    }//GEN-LAST:event_btninputActionPerformed

    private void tblmenumasakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmenumasakanMouseClicked
        inputIdtransaksi.setText(model.getValueAt(tblmenumasakan.getSelectedRow(), 0).toString());
        inputnamapelanggan.setText(model.getValueAt(tblmenumasakan.getSelectedRow(), 1).toString());
        inputjumlahbeli.setText(model.getValueAt(tblmenumasakan.getSelectedRow(), 6).toString());
        inputtotalbayar.setText(model.getValueAt(tblmenumasakan.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tblmenumasakanMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       
         if(inputIdtransaksi.getText().isEmpty()){
           JOptionPane.showMessageDialog(this,"DATA GAGAL DI HAPUS SILAHKAN KLIK DATA PADA TABEL YANG INGIN DI HAPUS !","Error",JOptionPane.ERROR_MESSAGE);
       }else{
        try {
          trans t = new trans();
            t.id_transaksi = Integer.parseInt(inputIdtransaksi.getText());
            this.stat = k.getCon().prepareStatement("DELETE FROM tbl_transaksi WHERE id_transaksi=?");
            this.stat.setInt(1, t.id_transaksi);
            this.stat.executeUpdate();
            refreshTable();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DI HAPUS !","Information",JOptionPane.INFORMATION_MESSAGE,icon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
         }
            
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgtransaksi;
    private javax.swing.JLabel bgtrantrantransaksi;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btninputmenu;
    private javax.swing.JLabel btnlabelback;
    private javax.swing.JLabel btnlabellogout;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> idmasakancombobox;
    private javax.swing.JTextField inputIdtransaksi;
    private javax.swing.JTextField inputjumlahbeli;
    private javax.swing.JTextField inputnamapelanggan;
    private com.toedter.calendar.JDateChooser inputtanggal;
    private javax.swing.JTextField inputtotalbayar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeltransaksi;
    private javax.swing.JTable tblmenumasakan;
    // End of variables declaration//GEN-END:variables

     private void Icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("apk-logo .png")));
    }
}
