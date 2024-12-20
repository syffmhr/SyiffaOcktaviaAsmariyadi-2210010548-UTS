
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class InventarisBarang extends javax.swing.JFrame {

    /**
     * Creates new form InventarisBarang
     */
    public InventarisBarang() {
        initComponents();
        
        start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKategori = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtKeterangan = new javax.swing.JTextField();
        txtLokasi = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEkspor = new javax.swing.JButton();
        btnImpor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Inventaris Barang Klinik", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Detail Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Kode Barang :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nama Barang :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Kategori :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Jumlah :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tahun Perolehan :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Keterangan :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Lokasi :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel7, gridBagConstraints);

        txtKode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtKode, gridBagConstraints);

        txtNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtNama, gridBagConstraints);

        txtKategori.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtKategori, gridBagConstraints);

        txtJumlah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJumlahKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtJumlah, gridBagConstraints);

        txtKeterangan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtKeterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeteranganActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtKeterangan, gridBagConstraints);

        txtLokasi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtLokasi, gridBagConstraints);

        txtTahun.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTahun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTahunKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtTahun, gridBagConstraints);

        btnTambah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTambah.setText("Tambah");

        btnUbah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUbah.setText("Ubah");

        btnBatal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBatal.setText("Batal");

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHapus.setText("Hapus");

        btnEkspor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEkspor.setText("Ekspor");

        btnImpor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnImpor.setText("Impor");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        tabelBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO", "Kode Barang", "Nama Barang", "Kategori", "Jumlah", "Tahun Perolehan", "Keterangan", "Lokasi"
            }
        ));
        jScrollPane1.setViewportView(tabelBarang);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        txtCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel4.add(txtCari, gridBagConstraints);

        btnCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCari.setText("Cari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel4.add(btnCari, gridBagConstraints);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEkspor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImpor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnUbah)
                            .addComponent(btnBatal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEkspor)
                            .addComponent(btnImpor)
                            .addComponent(btnHapus))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKeteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeteranganActionPerformed

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Masukkan jumlah berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtJumlahKeyTyped

    private void txtTahunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTahunKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Masukkan tahun yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTahunKeyTyped

        private void loadBarang() {
        DefaultTableModel tableModel = (DefaultTableModel) tabelBarang.getModel();
        tableModel.setRowCount(0); 
        try (ResultSet rs = Barang.getBarang()) {
            while (rs != null && rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("kode"),
                        rs.getString("nama"),
                        rs.getString("kategori"),
                        rs.getString("jumlah"),
                        rs.getString("tahun"),
                        rs.getString("keterangan"),
                        rs.getString("lokasi")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private class addBarangListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String kode = txtKode.getText();
            String nama = txtNama.getText();
            String kategori = txtKategori.getText();
            String jumlah = txtJumlah.getText();
            String tahun = txtTahun.getText();
            String keterangan = txtKeterangan.getText();
            String lokasi = txtLokasi.getText();
            if (!kode.isEmpty() && !nama.isEmpty() && !kategori.isEmpty()) {
            Barang barang = new Barang(kode, nama, kategori, jumlah, tahun, keterangan, lokasi);
            Barang.tambahBarang(barang);
            loadBarang();
            bersihkanField();
        } else {
            JOptionPane.showMessageDialog(null, "Inputan tidak boleh kosong!");
        }
        }
    }

private class ubahBarangListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel tableModel = (DefaultTableModel) tabelBarang.getModel();
        int barisAktif = tabelBarang.getSelectedRow();
        if (barisAktif >= 0) {
            int id = Integer.parseInt(tableModel.getValueAt(barisAktif, 0).toString());
            String kode = txtKode.getText();
            String nama = txtNama.getText();
            String kategori = txtKategori.getText();
            String jumlah = txtJumlah.getText();
            String tahun = txtTahun.getText();
            String keterangan = txtKeterangan.getText();
            String lokasi = txtLokasi.getText();

            if (!kode.isEmpty() && !nama.isEmpty() && !kategori.isEmpty()) {
                Barang barang = new Barang(kode, nama, kategori, jumlah, tahun, keterangan, lokasi);
                Barang.ubahBarang(id, barang);
                loadBarang();
                bersihkanField();
            } else {
                JOptionPane.showMessageDialog(null, "Inputan tidak boleh kosong!");
            }
        }
    }
}

private class hapusBarangListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel tableModel = (DefaultTableModel) tabelBarang.getModel();
        int barisAktif = tabelBarang.getSelectedRow();
        if (barisAktif >= 0) {
            int id = Integer.parseInt(tableModel.getValueAt(barisAktif, 0).toString());
            Barang.hapusBarang(id);
            loadBarang();
            bersihkanField();
        } else {
            JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus!");
        }
    }
}


    private class cariBarangListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel tableModel = (DefaultTableModel) tabelBarang.getModel();
        String query = txtCari.getText();
        tableModel.setRowCount(0); // Reset tabel
        try (ResultSet rs = Barang.cariBarang(query)) {
            while (rs != null && rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("kode"),
                        rs.getString("nama"),
                        rs.getString("kategori"),
                        rs.getString("jumlah"),
                        rs.getString("tahun"),
                        rs.getString("keterangan"),
                        rs.getString("lokasi")
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal mencari data barang!");
        }
    }
}
    
    private class batalBarangListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            bersihkanField();
        }
    }
    
    private class eksporBarangListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            File file = new File("barang.txt"); // Nama default file ekspor
        try {
            if (!file.exists()) { // Jika file tidak ada, buat file baru
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "File barang.txt berhasil dibuat.");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                DefaultTableModel tableModel = (DefaultTableModel) tabelBarang.getModel();
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    for (int j = 0; j < tableModel.getColumnCount(); j++) {
                        writer.write(tableModel.getValueAt(i, j).toString());
                        if (j < tableModel.getColumnCount() - 1) {
                            writer.write(","); // Pisahkan dengan koma
                        }
                    }
                    writer.newLine(); // Pindah ke baris berikutnya
                }
            }
            JOptionPane.showMessageDialog(null, "Data berhasil diekspor ke barang.txt!");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal mengekspor data!");
        }
    }
}

    private class imporBarangListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            File file = new File("barang.txt"); // Nama default file impor
        try {
            if (!file.exists()) { // Jika file tidak ada
                JOptionPane.showMessageDialog(null, "File barang.txt tidak ditemukan.");
                return;
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                DefaultTableModel tableModel = (DefaultTableModel) tabelBarang.getModel();
                tableModel.setRowCount(0); // Hapus data lama di tabel
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(","); // Pisahkan data berdasarkan koma
                    tableModel.addRow(data); // Tambahkan data ke tabel
                }
            }
            JOptionPane.showMessageDialog(null, "Data berhasil diimpor dari barang.txt!");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal mengimpor data!");
        }
    }
}

private void bersihkanField() {
    txtKode.setText("");
    txtNama.setText("");
    txtKategori.setText("");
    txtJumlah.setText("");
    txtTahun.setText("");
    txtKeterangan.setText("");
    txtLokasi.setText("");
    tabelBarang.clearSelection();
}
    
    private void start() {
    btnTambah.addActionListener(new addBarangListener());
    btnUbah.addActionListener(new ubahBarangListener());
    btnHapus.addActionListener(new hapusBarangListener());
    btnCari.addActionListener(new cariBarangListener());
    btnEkspor.addActionListener(new eksporBarangListener());
    btnImpor.addActionListener(new imporBarangListener());
    btnBatal.addActionListener(new batalBarangListener());
    
    tabelBarang.getSelectionModel().addListSelectionListener(e -> {
        DefaultTableModel tableModel = (DefaultTableModel) tabelBarang.getModel();
        int barisAktif = tabelBarang.getSelectedRow();
        if (barisAktif >= 0) {
            txtKode.setText(tableModel.getValueAt(barisAktif, 1).toString());
            txtNama.setText(tableModel.getValueAt(barisAktif, 2).toString());
            txtKategori.setText(tableModel.getValueAt(barisAktif, 3).toString());
            txtJumlah.setText(tableModel.getValueAt(barisAktif, 4).toString());
            txtTahun.setText(tableModel.getValueAt(barisAktif, 5).toString());
            txtKeterangan.setText(tableModel.getValueAt(barisAktif, 6).toString());
            txtLokasi.setText(tableModel.getValueAt(barisAktif, 7).toString());
        }
    });

    loadBarang();
}
    
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
            java.util.logging.Logger.getLogger(InventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarisBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEkspor;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImpor;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtLokasi;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
