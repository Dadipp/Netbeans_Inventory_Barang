package inventorybarang;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Win10
 */
public class InventoryBarang extends javax.swing.JFrame {
    
    private String tgl;
    DefaultTableModel model;
    public InventoryBarang() {
        initComponents();
        String [] judul = {"Kode barang", "Nama barang", "Jenis barang", "Stok", "Tanggal masuk brg"};
        model =new DefaultTableModel (judul,0);
        tbdata.setModel(model);
        tampilkan();
        
        Dimension screenSize = 
         Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2); 
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kdbarang = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        nmbarang1 = new javax.swing.JLabel();
        hrgsatuan = new javax.swing.JLabel();
        stok = new javax.swing.JLabel();
        btnTambah = new javax.swing.JToggleButton();
        btnkeluar = new javax.swing.JButton();
        txtnama = new javax.swing.JTextField();
        txtstok = new javax.swing.JTextField();
        jnsbarang = new javax.swing.JLabel();
        cmbbrg = new javax.swing.JComboBox();
        tanggal = new com.toedter.calendar.JDateChooser();
        btnbersih = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Inventory Barang");
        jLabel1.setMaximumSize(new java.awt.Dimension(202, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Input data");

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        kdbarang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        kdbarang.setText("Kode Barang");

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });

        nmbarang1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nmbarang1.setText("Nama Barang");

        hrgsatuan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        hrgsatuan.setText("Tgl masuk barang");

        stok.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        stok.setText("Stok");

        btnTambah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnTambah.setText("Tambahkan");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnkeluar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        txtstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstokActionPerformed(evt);
            }
        });

        jnsbarang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jnsbarang.setText("Jenis Barang");

        cmbbrg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbbrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---PILIH---", "HandPhone", "Laptop", "Aksesoris" }));
        cmbbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbrgActionPerformed(evt);
            }
        });

        tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPropertyChange(evt);
            }
        });

        btnbersih.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnbersih.setText("Bersihkan");
        btnbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbersihActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhapusMouseClicked(evt);
            }
        });
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(49, 49, 49)
                        .addComponent(btnhapus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kdbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nmbarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jnsbarang))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtkode, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(cmbbrg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hrgsatuan)
                            .addComponent(stok)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnbersih, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtstok)
                            .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnkeluar)
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kdbarang)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stok))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nmbarang1)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hrgsatuan))
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnsbarang)
                    .addComponent(cmbbrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkeluar)
                    .addComponent(btnTambah)
                    .addComponent(btnbersih)
                    .addComponent(btnhapus))
                .addGap(34, 34, 34))
        );

        tbdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tbdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbdata);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/uas_pbo","root","");
            cn.createStatement().executeUpdate("Insert into barang values"+"('"+txtkode.getText()+"','"+txtnama.getText()+"','"+cmbbrg.getSelectedItem()+"','"+txtstok.getText()+"','"+tgl+"')");
            tampilkan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ada data yang belum diisi !!");
        }
       
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // Exit
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void txtstokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstokActionPerformed

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void cmbbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbrgActionPerformed

    private void tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPropertyChange
       if(tanggal.getDate()!=null){
           SimpleDateFormat format_tanggal = new SimpleDateFormat("yyyy-MM-dd");
           tgl = format_tanggal.format(tanggal.getDate());
       }
    }//GEN-LAST:event_tanggalPropertyChange

    private void btnbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbersihActionPerformed
        // TODO add your handling code here:
        
     txtkode.setText(null);
     txtnama.setText(null);
     cmbbrg.setSelectedIndex(0);
     txtstok.setText(null);
     tanggal.setDate(null);
    }//GEN-LAST:event_btnbersihActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/uas_pbo","root","");
            cn.createStatement().executeUpdate("delete from barang where Kode_barang ='"+txtkode.getText()+"'");
            tampilkan();
        } catch (SQLException ex) {
            Logger.getLogger(InventoryBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btnhapusMouseClicked

    private void tbdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdataMouseClicked
        int i = tbdata.getSelectedRow();
        
        if(i>-1){
            txtkode.setText(model.getValueAt (i,0) .toString());
            txtnama.setText(model.getValueAt (i,1) .toString());
            txtstok.setText(model.getValueAt (i,3) .toString());
        }
        
        
    }//GEN-LAST:event_tbdataMouseClicked

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
            java.util.logging.Logger.getLogger(InventoryBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnTambah;
    private javax.swing.JButton btnbersih;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JComboBox cmbbrg;
    private javax.swing.JLabel hrgsatuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jnsbarang;
    private javax.swing.JLabel kdbarang;
    private javax.swing.JLabel nmbarang1;
    private javax.swing.JLabel stok;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTable tbdata;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        int row = tbdata.getRowCount();
        for (int a=0; a<row; a++){
                model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/uas_pbo","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM barang");
            while (rs.next()){
                String data []= {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
