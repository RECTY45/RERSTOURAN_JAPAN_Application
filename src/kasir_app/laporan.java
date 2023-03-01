package kasir_app;
import java.sql.*;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Muh Israjab DS
 */
public class laporan extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    /**
     * Creates new form laporan
     */
    public laporan() {
        Icon();
        initComponents();
        k.connect();
        Laporan();
    }

    public void Laporan()
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
            tableLaporan.setModel(model);
           try {
               stat = k.getCon().prepareStatement("SELECT * FROM viewtransaksi WHERE status = 'Tersedia'");
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
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backlabel = new javax.swing.JLabel();
        logoutlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLaporan = new javax.swing.JTable();
        cetakbtn = new javax.swing.JButton();
        laporanLabel = new javax.swing.JLabel();
        bgtranLaporanLabel = new javax.swing.JLabel();
        bgLaporanLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 800));
        getContentPane().setLayout(null);

        backlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/BackButton .png"))); // NOI18N
        backlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlabelMouseClicked(evt);
            }
        });
        getContentPane().add(backlabel);
        backlabel.setBounds(0, 0, 171, 50);

        logoutlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/logout.png"))); // NOI18N
        logoutlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlabelMouseClicked(evt);
            }
        });
        getContentPane().add(logoutlabel);
        logoutlabel.setBounds(990, 0, 80, 88);

        tableLaporan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableLaporan);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(-4, 223, 1070, 420);

        cetakbtn.setBackground(new java.awt.Color(0, 0, 0));
        cetakbtn.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        cetakbtn.setForeground(new java.awt.Color(255, 255, 255));
        cetakbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/cetak.png"))); // NOI18N
        cetakbtn.setText("CETAK");
        cetakbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cetakbtn);
        cetakbtn.setBounds(448, 661, 175, 59);

        laporanLabel.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        laporanLabel.setForeground(new java.awt.Color(255, 255, 255));
        laporanLabel.setText(" Laporan");
        getContentPane().add(laporanLabel);
        laporanLabel.setBounds(420, 100, 240, 58);

        bgtranLaporanLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/bgtranLapor.png"))); // NOI18N
        getContentPane().add(bgtranLaporanLabel);
        bgtranLaporanLabel.setBounds(0, 0, 1068, 750);

        bgLaporanLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir_app/bgLaporan.png"))); // NOI18N
        bgLaporanLabel.setText("jLabel2");
        getContentPane().add(bgLaporanLabel);
        bgLaporanLabel.setBounds(1, -4, 1070, 750);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cetakbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakbtnActionPerformed
        try {
            File namafile =  new File("src/laporan/Laporan.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, k.getCon());
            JasperViewer.viewReport(jp,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cetakbtnActionPerformed

    private void backlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlabelMouseClicked
        // TODO add your handling code here:
        menu_admin menu = new menu_admin();
        menu.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_backlabelMouseClicked

    private void logoutlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlabelMouseClicked
        // TODO add your handling code here:
        login l = new login();
        l.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_logoutlabelMouseClicked

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
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backlabel;
    private javax.swing.JLabel bgLaporanLabel;
    private javax.swing.JLabel bgtranLaporanLabel;
    private javax.swing.JButton cetakbtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel laporanLabel;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JTable tableLaporan;
    // End of variables declaration//GEN-END:variables

    private void Icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("apk-logo .png")));
    }
}
