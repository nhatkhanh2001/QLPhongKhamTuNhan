/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhapTaiKhoan;

import java.util.Date;

/**
 *
 * @author Huỳnh Cường
 */

public class ClassUsers {
    private String TaiKhoan;
    private String MatKhau;
    private String HoTen;
    private Date NgaySinh;
    private String DiaChi;
    private String SoDienThoai;
    private String Email;

    public ClassUsers() {
    }

    public ClassUsers(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public ClassUsers(String TaiKhoan, String MatKhau, String HoTen, Date NgaySinh, String DiaChi, String SoDienThoai, String Email) {
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.Email = Email;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "ClassUsers{" + "TaiKhoan=" + TaiKhoan + ", MatKhau=" + MatKhau + ", HoTen=" + HoTen + ", NgaySinh=" + NgaySinh + ", DiaChi=" + DiaChi + ", SoDienThoai=" + SoDienThoai + ", Email=" + Email + '}';
    }

    
}
