/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhapTaiKhoan;

import DangKyTaiKhoan.FrmDangKyTaiKhoan;
import FormMenuChinh.FrmMenuChinh;
import javax.swing.JOptionPane;

/**
 *
 * @author Huỳnh Cường
 */

public class FrmDangNhap extends javax.swing.JFrame {

    DangNhapDAO dnDAO = new DangNhapDAO(); // Lấy dữ liệu từ class DangNhapDAO.java
    
    public FrmDangNhap() {
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

        lbDangNhapTaiKhoan = new javax.swing.JLabel();
        lbTaiKhoanDangNhap = new javax.swing.JLabel();
        lbMatKhauDangNhap = new javax.swing.JLabel();
        lbHinhDangNhapTaiKhoan = new javax.swing.JLabel();
        txtTaiKhoanDangNhap = new javax.swing.JTextField();
        txtMatKhauDangNhap = new javax.swing.JPasswordField();
        btnDangNhapTaiKhoan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnDangKyTaiKhoan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG NHẬP TÀI KHOẢN");
        setResizable(false);

        lbDangNhapTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbDangNhapTaiKhoan.setForeground(new java.awt.Color(255, 0, 0));
        lbDangNhapTaiKhoan.setText("ĐĂNG NHẬP TÀI KHOẢN");

        lbTaiKhoanDangNhap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbTaiKhoanDangNhap.setText("Tài khoản: ");

        lbMatKhauDangNhap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbMatKhauDangNhap.setText("Mật khẩu:");

        lbHinhDangNhapTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/iconUsers.png"))); // NOI18N

        txtTaiKhoanDangNhap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtMatKhauDangNhap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMatKhauDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauDangNhapActionPerformed(evt);
            }
        });

        btnDangNhapTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDangNhapTaiKhoan.setText("Đăng nhập");
        btnDangNhapTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapTaiKhoanActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnDangKyTaiKhoan.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnDangKyTaiKhoan.setText("Đăng ký tài khoản mới");
        btnDangKyTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyTaiKhoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbHinhDangNhapTaiKhoan)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDangNhapTaiKhoan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTaiKhoanDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(lbMatKhauDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTaiKhoanDangNhap)
                                            .addComponent(txtMatKhauDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnDangKyTaiKhoan))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbDangNhapTaiKhoan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDangNhapTaiKhoan)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbHinhDangNhapTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTaiKhoanDangNhap)
                            .addComponent(txtTaiKhoanDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMatKhauDangNhap)
                            .addComponent(txtMatKhauDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDangNhapTaiKhoan)
                            .addComponent(btnThoat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDangKyTaiKhoan)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Hàm thoát
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát ?", "Thông báo",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    // Chuyển form đăng ký tài khoản
    private void btnDangKyTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyTaiKhoanActionPerformed
        new FrmDangKyTaiKhoan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDangKyTaiKhoanActionPerformed

    // Hàm bool kiểm tra đúng, sai. Nhập đầy đủ thông tin mới cho thêm tài khoản mới
    public boolean checkDangNhap(){
        if (txtTaiKhoanDangNhap.getText().isEmpty()||
            txtMatKhauDangNhap.getText().isEmpty())            
        {
           // JOptionPane.showMessageDialog(this, "Bạn chưa nhập tài khoản và mật khẩu đăng nhập!");
            return false;
        }
        else  
        {
             return true;      
        }     
    }
    
    // Hàm đăng nhập
    // Hàm này dựa vào hàm tìm kiếm theo mã, có chỉnh sửa lại để thành hàm đăng nhập tài khoản, xem hàm chính bên file DangNhapDAO.java
    private void btnDangNhapTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapTaiKhoanActionPerformed
        if (!checkDangNhap())
       {
           JOptionPane.showMessageDialog(this, "Bạn chưa nhập tài khoản và mật khẩu đăng nhập!");
       }
    else {
        try{
            ClassUsers dangnhap = dnDAO.DangNhap(txtTaiKhoanDangNhap.getText(), txtMatKhauDangNhap.getText()); 
          
            // Nếu đăng nhập khác null thì tiến hàng đăng nhập thành công
            if (dangnhap != null){
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công! " + txtTaiKhoanDangNhap.getText(),"Thông báo",1);
            
                new FrmMenuChinh().setVisible(true); // Tìm thấy tên tài khoản và mật khẩu sẽ chuyển sang form Menu chính
                this.setVisible(false);
            }
            else {
                 JOptionPane.showMessageDialog(this, "Đăng nhập thất bại! " + txtTaiKhoanDangNhap.getText(),"Thông báo",1);
            }
        } catch (Exception ex){
             System.out.println (ex.toString());
        }     
    }                 
    }//GEN-LAST:event_btnDangNhapTaiKhoanActionPerformed

    private void txtMatKhauDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauDangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKyTaiKhoan;
    private javax.swing.JButton btnDangNhapTaiKhoan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel lbDangNhapTaiKhoan;
    private javax.swing.JLabel lbHinhDangNhapTaiKhoan;
    private javax.swing.JLabel lbMatKhauDangNhap;
    private javax.swing.JLabel lbTaiKhoanDangNhap;
    private javax.swing.JPasswordField txtMatKhauDangNhap;
    private javax.swing.JTextField txtTaiKhoanDangNhap;
    // End of variables declaration//GEN-END:variables
}
