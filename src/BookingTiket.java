
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laptop
 */
public class BookingTiket extends javax.swing.JFrame {

    /**
     * Creates new form BookingTiket
     */
    
    private static int xx, xy;
    private Connection connection;
    
    public BookingTiket() {
        initComponents();
        txtUangKembali.setEditable(false);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtUangKembali = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNamaPengunjung = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtJumlahTiket = new javax.swing.JSpinner();
        btnRegister1 = new javax.swing.JButton();
        btnRegister2 = new javax.swing.JButton();
        btnRegister3 = new javax.swing.JButton();
        txtTanggal = new javax.swing.JTextField();
        txtJam = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        txtUangBayar = new javax.swing.JTextField();
        btnBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(175, 238, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(70, 130, 180));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Close_20px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_minimize_window_20px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(70, 130, 180));
        jLabel1.setText("Nama Pengunjung");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 130, 180));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Booking Ticket");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, 410, -1));

        txtHari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        txtHari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtHariMouseExited(evt);
            }
        });
        txtHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHariActionPerformed(evt);
            }
        });
        jPanel1.add(txtHari, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 130, 180));
        jLabel5.setText("Hari");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 30));

        btnRegister.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister.setText("Hitung");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 70, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 130, 180));
        jLabel8.setText("Jam");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 30));

        txtUangKembali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        txtUangKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUangKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(txtUangKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 90, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(70, 130, 180));
        jLabel9.setText("Tanggal");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 130, 180));
        jLabel10.setText("Uang Kembali");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 30));

        txtNamaPengunjung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        txtNamaPengunjung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaPengunjungActionPerformed(evt);
            }
        });
        jPanel1.add(txtNamaPengunjung, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(70, 130, 180));
        jLabel11.setText("Jumlah Tiket");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(70, 130, 180));
        jLabel12.setText("Harga");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(70, 130, 180));
        jLabel13.setText("Total Harga");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(70, 130, 180));
        jLabel14.setText("Uang Bayar");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 90, 30));

        txtJumlahTiket.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtJumlahTiketStateChanged(evt);
            }
        });
        jPanel1.add(txtJumlahTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, 30));

        btnRegister1.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister1.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister1.setText("Back");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 60, -1));

        btnRegister2.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister2.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister2.setText("Reset");
        btnRegister2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 70, -1));

        btnRegister3.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister3.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister3.setText("Print");
        btnRegister3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 70, -1));

        txtTanggal.setText("DD-MM-YYYY");
        txtTanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });
        jPanel1.add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 170, 30));

        txtJam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        txtJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJamActionPerformed(evt);
            }
        });
        jPanel1.add(txtJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 170, 30));

        txtHarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        txtHarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtHargaMouseExited(evt);
            }
        });
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, 30));

        txtTotalHarga.setEditable(false);
        txtTotalHarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 170, 30));

        txtUangBayar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        txtUangBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUangBayarActionPerformed(evt);
            }
        });
        jPanel1.add(txtUangBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 170, 30));

        btnBook.setBackground(new java.awt.Color(70, 130, 180));
        btnBook.setForeground(new java.awt.Color(255, 245, 238));
        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(410, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void txtHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHariActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        if(txtTotalHarga.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap Isi Total Harga");
            return;
        }
        
        if(txtUangBayar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap Isi Uang Pembayaran");
            return;
        }
        
        double totalHarga = Double.parseDouble(txtTotalHarga.getText());
        double uangBayar = Double.parseDouble(txtUangBayar.getText());
        
        if(uangBayar < totalHarga) {
            JOptionPane.showMessageDialog(null, "Gagal melakukan perhitungan, uang yang anda bayarkan kurang!");
            return;
        }
        
        double uangKembali = uangBayar - totalHarga;
        txtUangKembali.setText(String.valueOf(uangKembali));
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtUangKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUangKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUangKembaliActionPerformed

    private void txtNamaPengunjungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPengunjungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaPengunjungActionPerformed

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:
        new Booking().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void btnRegister2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister2ActionPerformed
        // TODO add your handling code here:
        txtNamaPengunjung.setText("");
        txtHari.setText("");
        txtTanggal.setText("");
        txtJam.setText("");
        txtJumlahTiket.setValue((int) 0);
        txtHarga.setText("");
        txtTotalHarga.setText("");
        txtUangBayar.setText("");
        txtUangKembali.setText("");
    }//GEN-LAST:event_btnRegister2ActionPerformed

    private void btnRegister3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister3ActionPerformed
        // TODO add your handling code here:
        try{
            String nama = txtNamaPengunjung.getText();
            String tanggal = txtTanggal.getText();
            int jumlah_tiket = (int) txtJumlahTiket.getValue();
            double harga = Double.parseDouble(txtHarga.getText());
            double total_harga = Double.parseDouble(txtTotalHarga.getText());

            if(nama.equals("")) {
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong");
                return;
            } else if(!tanggal.matches("\\d{2}-\\d{2}-\\d{4}")) {
                JOptionPane.showMessageDialog(null, "Tanggal salah format, harusnya DD-MM-YYYY");
                return;
            } else if(jumlah_tiket <= 0) {
                JOptionPane.showMessageDialog(null, "Jumlah tiket harus lebih besar dari 0");
                return;
            } else if(harga <= 0) {
                JOptionPane.showMessageDialog(null, "Harga harus lebih besar dari 0");
                return;
            }

            //masukkan data ke database
            connection = Koneksi.getKoneksi();
            String query = "INSERT INTO ticket"
                    + "(nama, tanggal, jumlah_tiket, harga, total_harga)"
                    + "VALUES (?,?,?,?,?)";
            try {
                PreparedStatement statement= (PreparedStatement) connection.prepareStatement(query);

                statement.setString(1, nama);
                statement.setString(2, tanggal);
                statement.setInt(3, jumlah_tiket);
                statement.setDouble(4, harga);
                statement.setDouble(5, total_harga);

                statement.executeUpdate();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(this, "Kesalahan input data");
            } finally {
                new Print().setVisible(true);
                dispose();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Kesalahan input data");
        }
    }//GEN-LAST:event_btnRegister3ActionPerformed

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void txtJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJamActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void txtUangBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUangBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUangBayarActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        if(txtUangKembali.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap Hitung uang kembalian!");
            return;
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void txtHariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHariMouseExited
        // TODO add your handling code here:
        setHarga();
    }//GEN-LAST:event_txtHariMouseExited

    private void txtJumlahTiketStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtJumlahTiketStateChanged
        // TODO add your handling code here:
        setTotalHarga();
    }//GEN-LAST:event_txtJumlahTiketStateChanged

    private void txtHargaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHargaMouseExited
        // TODO add your handling code here:
        setTotalHarga();
    }//GEN-LAST:event_txtHargaMouseExited


    private void setTotalHarga() {
        int jumlah_tiket = (int) txtJumlahTiket.getValue();
        String hargaText = txtHarga.getText();

        if (hargaText.equals("")) {
            txtTotalHarga.setText("");
            return;
        }

        try{
            double harga = Double.parseDouble(hargaText);
            double totalHarga = jumlah_tiket * harga;

            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String formattedTotalHarga = decimalFormat.format(totalHarga);

            if (totalHarga == Math.floor(totalHarga)) {
                formattedTotalHarga = decimalFormat.format(totalHarga);
            }

            txtTotalHarga.setText(formattedTotalHarga);
        }catch (Exception e){
            txtTotalHarga.setText("");
        }
    }




    private void setHarga() {
        String hari = txtHari.getText().toLowerCase();

        switch (hari) {
            case "senin":
            case "selasa":
            case "rabu":
            case "kamis":
            case "jumat":
                txtHarga.setText("40000");
                break;
            case "sabtu":
            case "minggu":
                txtHarga.setText("50000");
                break;
            case "":
                txtHarga.setText("");
                break;
            default:
                txtHarga.setText("Hari tidak valid");
                break;
        }
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
            java.util.logging.Logger.getLogger(BookingTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JButton btnRegister2;
    private javax.swing.JButton btnRegister3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtHari;
    private javax.swing.JTextField txtJam;
    private javax.swing.JSpinner txtJumlahTiket;
    private javax.swing.JTextField txtNamaPengunjung;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTotalHarga;
    private javax.swing.JTextField txtUangBayar;
    private javax.swing.JTextField txtUangKembali;
    // End of variables declaration//GEN-END:variables
}
