/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormMenuChinh;

import BacSi.FrmBacSi;
import BenhNhan.FrmBenhNhan;
import HuongDanSuDung.FrmHuongDanSuDung;
import KeDonThuoc.FrmKeDonThuoc;
import LoaiThuoc.FrmLoaiThuoc;
import PhieuKhamBenh.FrmPhieuKhamBenh;
import PhongKham.FrmPhongKham;
import ThongTinTacGia.FrmThongTinTacGia;
import javax.swing.JOptionPane;

/**
 *
 * @author Huỳnh Cường
 */

public class FrmMenuChinh extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuChinh
     */
    public FrmMenuChinh() {
        initComponents();
        setLocationRelativeTo(null); // Đưa form ra giữa màn hình khi run 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbQLPhongKham = new javax.swing.JLabel();
        lbHinhDSBenhNhan = new javax.swing.JLabel();
        lbHinhDSBacSi = new javax.swing.JLabel();
        lbHinhDSPhongKham = new javax.swing.JLabel();
        lbHinhDSLoaiThuoc = new javax.swing.JLabel();
        lbHinhDSPhieuKham = new javax.swing.JLabel();
        lbHinhDSKeDonThuoc = new javax.swing.JLabel();
        lbHinhDSHuongDanSuDung = new javax.swing.JLabel();
        lbHinhDSThongTinTacGia = new javax.swing.JLabel();
        btnFormDSBenhNhan = new javax.swing.JButton();
        btnFormDSBacSi = new javax.swing.JButton();
        btnFormDSPhongKham = new javax.swing.JButton();
        btnFormDSLoaiThuoc = new javax.swing.JButton();
        btnFormDSKeDonThuoc = new javax.swing.JButton();
        btnFormDSPhieuKhamBenh = new javax.swing.JButton();
        btnHuongDanSuDung = new javax.swing.JButton();
        btnThongTinTacGia = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ PHÒNG KHÁM");
        setResizable(false);

        lbQLPhongKham.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbQLPhongKham.setForeground(new java.awt.Color(255, 0, 0));
        lbQLPhongKham.setText("QUẢN LÝ PHÒNG KHÁM");

        lbHinhDSBenhNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/iconDSBenhNhan.png"))); // NOI18N

        lbHinhDSBacSi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/iconDSBacSi.png"))); // NOI18N

        lbHinhDSPhongKham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/iconDSPhongKham.png"))); // NOI18N

        lbHinhDSLoaiThuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/iconDSLoaiThuoc.png"))); // NOI18N

        lbHinhDSPhieuKham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/iconDSPhieuKhamBenh.png"))); // NOI18N

        lbHinhDSKeDonThuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/iconDSKeDonThuoc.png"))); // NOI18N

        lbHinhDSHuongDanSuDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/iconHuongDanSuDung.png"))); // NOI18N

        lbHinhDSThongTinTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/iconThongTinTacGia.png"))); // NOI18N

        btnFormDSBenhNhan.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnFormDSBenhNhan.setText(" DS BỆNH NHÂN");
        btnFormDSBenhNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormDSBenhNhanActionPerformed(evt);
            }
        });

        btnFormDSBacSi.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnFormDSBacSi.setText("DS BÁC SĨ");
        btnFormDSBacSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormDSBacSiActionPerformed(evt);
            }
        });

        btnFormDSPhongKham.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnFormDSPhongKham.setText(" DS PHÒNG KHÁM");
        btnFormDSPhongKham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormDSPhongKhamActionPerformed(evt);
            }
        });

        btnFormDSLoaiThuoc.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnFormDSLoaiThuoc.setText("DS LOẠI THUỐC");
        btnFormDSLoaiThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormDSLoaiThuocActionPerformed(evt);
            }
        });

        btnFormDSKeDonThuoc.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnFormDSKeDonThuoc.setText("DS KÊ ĐƠN THUỐC");
        btnFormDSKeDonThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormDSKeDonThuocActionPerformed(evt);
            }
        });

        btnFormDSPhieuKhamBenh.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnFormDSPhieuKhamBenh.setText("DS PHIẾU KHÁM");
        btnFormDSPhieuKhamBenh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormDSPhieuKhamBenhActionPerformed(evt);
            }
        });

        btnHuongDanSuDung.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnHuongDanSuDung.setForeground(new java.awt.Color(0, 51, 204));
        btnHuongDanSuDung.setText("HDSD");
        btnHuongDanSuDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanSuDungActionPerformed(evt);
            }
        });

        btnThongTinTacGia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnThongTinTacGia.setForeground(new java.awt.Color(0, 51, 204));
        btnThongTinTacGia.setText("THÔNG TIN TÁC GIẢ");
        btnThongTinTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinTacGiaActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 51, 51));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnFormDSBenhNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHinhDSBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFormDSPhieuKhamBenh, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHinhDSPhieuKham))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFormDSKeDonThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHinhDSKeDonThuoc))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHinhDSHuongDanSuDung)
                            .addComponent(btnHuongDanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFormDSBacSi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbHinhDSBacSi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHinhDSPhongKham, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFormDSPhongKham, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbHinhDSLoaiThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThongTinTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(btnFormDSLoaiThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(lbHinhDSThongTinTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(lbQLPhongKham)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbHinhDSBenhNhan)
                            .addComponent(lbHinhDSBacSi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFormDSBacSi)
                            .addComponent(btnFormDSBenhNhan)
                            .addComponent(btnFormDSPhongKham)
                            .addComponent(btnFormDSLoaiThuoc)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbHinhDSLoaiThuoc)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbQLPhongKham)
                                .addGap(59, 59, 59)
                                .addComponent(lbHinhDSPhongKham)))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHinhDSHuongDanSuDung)
                    .addComponent(lbHinhDSThongTinTacGia)
                    .addComponent(lbHinhDSPhieuKham)
                    .addComponent(lbHinhDSKeDonThuoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHuongDanSuDung)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThongTinTacGia)
                        .addComponent(btnFormDSKeDonThuoc))
                    .addComponent(btnFormDSPhieuKhamBenh))
                .addGap(29, 29, 29)
                .addComponent(btnThoat)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Chuyển sang Form Danh Sách Bệnh Nhân
    private void btnFormDSBenhNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormDSBenhNhanActionPerformed
        new FrmBenhNhan().setVisible(true);
        // this.setVisible(false);
    }//GEN-LAST:event_btnFormDSBenhNhanActionPerformed

    // Chuyển sang Form Danh Sách Bác Sĩ
    private void btnFormDSBacSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormDSBacSiActionPerformed
        new FrmBacSi().setVisible(true);
        // this.setVisible(false);
    }//GEN-LAST:event_btnFormDSBacSiActionPerformed

    // Chuyển sang Form Danh Sách Phòng Khám
    private void btnFormDSPhongKhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormDSPhongKhamActionPerformed
        new FrmPhongKham().setVisible(true);
        // this.setVisible(false);
    }//GEN-LAST:event_btnFormDSPhongKhamActionPerformed

    // Chuyển sang Form Danh Sách Loại Thuốc
    private void btnFormDSLoaiThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormDSLoaiThuocActionPerformed
        new FrmLoaiThuoc().setVisible(true);
        // this.setVisible(false);
    }//GEN-LAST:event_btnFormDSLoaiThuocActionPerformed

    // Chuyển sang Form Danh Sách Phiếu Khám Bệnh
    private void btnFormDSPhieuKhamBenhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormDSPhieuKhamBenhActionPerformed
        new FrmPhieuKhamBenh().setVisible(true);
        // this.setVisible(false);
    }//GEN-LAST:event_btnFormDSPhieuKhamBenhActionPerformed

    // Chuyển sang Form Danh Sách Kê Đơn Thuốc
    private void btnFormDSKeDonThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormDSKeDonThuocActionPerformed
        new FrmKeDonThuoc().setVisible(true);
        // this.setVisible(false);
    }//GEN-LAST:event_btnFormDSKeDonThuocActionPerformed

    // Chuyển sang Form Hướng Dẫn Sử Dụng
    private void btnHuongDanSuDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanSuDungActionPerformed
        new FrmHuongDanSuDung().setVisible(true);
        // this.setVisible(false);
    }//GEN-LAST:event_btnHuongDanSuDungActionPerformed

    // Chuyển sang Form Thông Tin Tác Giả
    private void btnThongTinTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinTacGiaActionPerformed
        new FrmThongTinTacGia().setVisible(true);
        // this.setVisible(false);
    }//GEN-LAST:event_btnThongTinTacGiaActionPerformed

     // Hàm thoát
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát ?", "Thông báo",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormDSBacSi;
    private javax.swing.JButton btnFormDSBenhNhan;
    private javax.swing.JButton btnFormDSKeDonThuoc;
    private javax.swing.JButton btnFormDSLoaiThuoc;
    private javax.swing.JButton btnFormDSPhieuKhamBenh;
    private javax.swing.JButton btnFormDSPhongKham;
    private javax.swing.JButton btnHuongDanSuDung;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongTinTacGia;
    private javax.swing.JLabel lbHinhDSBacSi;
    private javax.swing.JLabel lbHinhDSBenhNhan;
    private javax.swing.JLabel lbHinhDSHuongDanSuDung;
    private javax.swing.JLabel lbHinhDSKeDonThuoc;
    private javax.swing.JLabel lbHinhDSLoaiThuoc;
    private javax.swing.JLabel lbHinhDSPhieuKham;
    private javax.swing.JLabel lbHinhDSPhongKham;
    private javax.swing.JLabel lbHinhDSThongTinTacGia;
    private javax.swing.JLabel lbQLPhongKham;
    // End of variables declaration//GEN-END:variables
}
