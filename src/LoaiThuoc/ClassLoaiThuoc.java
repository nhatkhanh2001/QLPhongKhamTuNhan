/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoaiThuoc;

/**
 *
 * @author Huỳnh Cường
 */

public class ClassLoaiThuoc {
    private int MaThuoc;
    private String TenThuoc;

    public ClassLoaiThuoc() {
    }

    public ClassLoaiThuoc(int MaThuoc) {
        this.MaThuoc = MaThuoc;
    }

    public ClassLoaiThuoc(int MaThuoc, String TenThuoc) {
        this.MaThuoc = MaThuoc;
        this.TenThuoc = TenThuoc;
    }

    public int getMaThuoc() {
        return MaThuoc;
    }

    public void setMaThuoc(int MaThuoc) {
        this.MaThuoc = MaThuoc;
    }

    public String getTenThuoc() {
        return TenThuoc;
    }

    public void setTenThuoc(String TenThuoc) {
        this.TenThuoc = TenThuoc;
    }

    
    /*@Override
    public String toString() {
        return "ClassLoaiThuoc{" + "MaThuoc=" + MaThuoc + ", TenThuoc=" + TenThuoc + '}';
    }*/

    @Override
    public String toString() {
        return TenThuoc;  // Trả về tên thuốc, dùng để khai báo khoá ngoại lên cbb, xem Form Kê đơn thuốc sẽ thấy cbbMaThuoc sẽ có tên các loại thuốc thay vì hiện mã số
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
