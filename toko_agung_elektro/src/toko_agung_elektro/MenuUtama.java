/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_agung_elektro;

import javax.swing.WindowConstants;

/**
 *
 * @author PLJC-PC
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mnNew = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        mnExit = new javax.swing.JMenuItem();
        menuMaster = new javax.swing.JMenu();
        mnDataBarang = new javax.swing.JMenuItem();
        mnDataPelanggan = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        mnPenjualan = new javax.swing.JMenuItem();
        menuLaporan = new javax.swing.JMenu();
        mnLapBarang = new javax.swing.JMenuItem();
        mnLapPelanggan = new javax.swing.JMenuItem();
        mnLapPenjualan = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 48)); // NOI18N
        jLabel1.setText("TOKO AGUNG ELECTRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(797, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(698, Short.MAX_VALUE))
        );

        menuFile.setText("File");

        mnNew.setText("New");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        menuFile.add(mnNew);

        mnSave.setText("Save");
        mnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveActionPerformed(evt);
            }
        });
        menuFile.add(mnSave);

        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        menuFile.add(mnExit);

        jMenuBar1.add(menuFile);

        menuMaster.setText("Master");

        mnDataBarang.setText("Data Barang");
        menuMaster.add(mnDataBarang);

        mnDataPelanggan.setText("Data Pelanggan");
        menuMaster.add(mnDataPelanggan);

        jMenuBar1.add(menuMaster);

        menuTransaksi.setText("Transaksi");

        mnPenjualan.setText("Penjualan");
        mnPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPenjualanActionPerformed(evt);
            }
        });
        menuTransaksi.add(mnPenjualan);

        jMenuBar1.add(menuTransaksi);

        menuLaporan.setText("Laporan");

        mnLapBarang.setText("Lap Barang");
        menuLaporan.add(mnLapBarang);

        mnLapPelanggan.setText("Lap Pelanggan");
        menuLaporan.add(mnLapPelanggan);

        mnLapPenjualan.setText("Lap Penjualan");
        menuLaporan.add(mnLapPenjualan);

        jMenuBar1.add(menuLaporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnNewActionPerformed

    private void mnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnSaveActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPenjualanActionPerformed
        // TODO add your handling code here:
        FormTransaksiPenjualan f =new FormTransaksiPenjualan();
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        f.setTitle("Form Penjualan");
        
        
        
    }//GEN-LAST:event_mnPenjualanActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenu menuMaster;
    private javax.swing.JMenu menuTransaksi;
    private javax.swing.JMenuItem mnDataBarang;
    private javax.swing.JMenuItem mnDataPelanggan;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnLapBarang;
    private javax.swing.JMenuItem mnLapPelanggan;
    private javax.swing.JMenuItem mnLapPenjualan;
    private javax.swing.JMenuItem mnNew;
    private javax.swing.JMenuItem mnPenjualan;
    private javax.swing.JMenuItem mnSave;
    // End of variables declaration//GEN-END:variables
}
