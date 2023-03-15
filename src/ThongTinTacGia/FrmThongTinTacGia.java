/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThongTinTacGia;

import javax.swing.JOptionPane;

/**
 *
 * @author Huỳnh Cường
 */

public class FrmThongTinTacGia extends javax.swing.JFrame {

    /**
     * Creates new form FrmThongTinTacGia
     */
    public FrmThongTinTacGia() {
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

        lbThongTinTacGia = new javax.swing.JLabel();
        lbTenNhom = new javax.swing.JLabel();
        lbThanhVienNhom = new javax.swing.JLabel();
        lbHuynhDoMinhCuong = new javax.swing.JLabel();
        lbMSSV1911066003 = new javax.swing.JLabel();
        lbLop1 = new javax.swing.JLabel();
        lbSDT0342962649 = new javax.swing.JLabel();
        lbVuPhiTruong = new javax.swing.JLabel();
        lbMSSV1911065068 = new javax.swing.JLabel();
        lbLop2 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        lbHinhDSThongTinTacGia = new javax.swing.JLabel();
        lbHoChiCong = new javax.swing.JLabel();
        lbMSSV1911065165 = new javax.swing.JLabel();
        lbLop3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THÔNG TIN TÁC GIẢ");
        setResizable(false);

        lbThongTinTacGia.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbThongTinTacGia.setForeground(new java.awt.Color(255, 0, 0));
        lbThongTinTacGia.setText("THÔNG TIN TÁC GIẢ");

        lbTenNhom.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbTenNhom.setForeground(new java.awt.Color(0, 0, 255));
        lbTenNhom.setText("Tên nhóm: Nhóm 10");

        lbThanhVienNhom.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbThanhVienNhom.setForeground(new java.awt.Color(0, 0, 255));
        lbThanhVienNhom.setText("Thành viên nhóm:");

        lbHuynhDoMinhCuong.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbHuynhDoMinhCuong.setForeground(new java.awt.Color(0, 0, 255));
        lbHuynhDoMinhCuong.setText("1/ Huỳnh Đỗ Minh Cường");

        lbMSSV1911066003.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbMSSV1911066003.setForeground(new java.awt.Color(0, 0, 255));
        lbMSSV1911066003.setText("MSSV: 1911066003");

        lbLop1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbLop1.setForeground(new java.awt.Color(0, 0, 255));
        lbLop1.setText("Lớp: 19DTHE1");

        lbSDT0342962649.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbSDT0342962649.setForeground(new java.awt.Color(0, 0, 255));
        lbSDT0342962649.setText("SĐT: 0342962649");

        lbVuPhiTruong.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbVuPhiTruong.setForeground(new java.awt.Color(0, 0, 255));
        lbVuPhiTruong.setText("2/ Vũ Phi Trường");

        lbMSSV1911065068.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbMSSV1911065068.setForeground(new java.awt.Color(0, 0, 255));
        lbMSSV1911065068.setText("MSSV: 1911065068");

        lbLop2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbLop2.setForeground(new java.awt.Color(0, 0, 255));
        lbLop2.setText("Lớp: 19DTHE1");

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lbHoChiCong.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbHoChiCong.setForeground(new java.awt.Color(0, 0, 255));
        lbHoChiCong.setText("3/ Hồ Chí Công");

        lbMSSV1911065165.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbMSSV1911065165.setForeground(new java.awt.Color(0, 0, 255));
        lbMSSV1911065165.setText("MSSV: 1911065165");

        lbLop3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbLop3.setForeground(new java.awt.Color(0, 0, 255));
        lbLop3.setText("Lớp: 19DTHE1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbThanhVienNhom)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnThoat)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lbHuynhDoMinhCuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbVuPhiTruong, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbMSSV1911066003)
                                                    .addComponent(lbMSSV1911065068)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbHoChiCong, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(lbMSSV1911065165)))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbLop1)
                                                    .addComponent(lbLop2))
                                                .addGap(50, 50, 50)
                                                .addComponent(lbSDT0342962649))
                                            .addComponent(lbLop3))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTenNhom)
                        .addGap(151, 151, 151)
                        .addComponent(lbHinhDSThongTinTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                        .addGap(53, 53, 53))))
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(lbThongTinTacGia)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbThongTinTacGia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbHinhDSThongTinTacGia)
                    .addComponent(lbTenNhom))
                .addGap(18, 18, 18)
                .addComponent(lbThanhVienNhom)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbHuynhDoMinhCuong)
                        .addGap(18, 18, 18)
                        .addComponent(lbVuPhiTruong))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMSSV1911066003)
                            .addComponent(lbLop1)
                            .addComponent(lbSDT0342962649))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLop2)
                            .addComponent(lbMSSV1911065068))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbHoChiCong)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbLop3)
                        .addComponent(lbMSSV1911065165)))
                .addGap(4, 4, 4)
                .addComponent(btnThoat)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmThongTinTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmThongTinTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmThongTinTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmThongTinTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmThongTinTacGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel lbHinhDSThongTinTacGia;
    private javax.swing.JLabel lbHoChiCong;
    private javax.swing.JLabel lbHuynhDoMinhCuong;
    private javax.swing.JLabel lbLop1;
    private javax.swing.JLabel lbLop2;
    private javax.swing.JLabel lbLop3;
    private javax.swing.JLabel lbMSSV1911065068;
    private javax.swing.JLabel lbMSSV1911065165;
    private javax.swing.JLabel lbMSSV1911066003;
    private javax.swing.JLabel lbSDT0342962649;
    private javax.swing.JLabel lbTenNhom;
    private javax.swing.JLabel lbThanhVienNhom;
    private javax.swing.JLabel lbThongTinTacGia;
    private javax.swing.JLabel lbVuPhiTruong;
    // End of variables declaration//GEN-END:variables
}
