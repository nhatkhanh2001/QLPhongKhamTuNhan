/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeDonThuoc;

import java.util.Date;

/**
 *
 * @author Huỳnh Cường
 */

// Class này dùng để xuất ra excel
public class ClassKeDonThuoc02 {
    private int MaPhieu;
    private int MaThuoc;
    private int SoLuong;
    private String DonViTinh;
    private Date NgayKeDT;

    public ClassKeDonThuoc02() {
    }

    public ClassKeDonThuoc02(int MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public ClassKeDonThuoc02(int MaPhieu, int MaThuoc, int SoLuong, String DonViTinh, Date NgayKeDT) {
        this.MaPhieu = MaPhieu;
        this.MaThuoc = MaThuoc;
        this.SoLuong = SoLuong;
        this.DonViTinh = DonViTinh;
        this.NgayKeDT = NgayKeDT;
    }

    public int getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(int MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public int getMaThuoc() {
        return MaThuoc;
    }

    public void setMaThuoc(int MaThuoc) {
        this.MaThuoc = MaThuoc;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public Date getNgayKeDT() {
        return NgayKeDT;
    }

    public void setNgayKeDT(Date NgayKeDT) {
        this.NgayKeDT = NgayKeDT;
    }

    @Override
    public String toString() {
        return "ClassKeDonThuoc02{" + "MaPhieu=" + MaPhieu + ", MaThuoc=" + MaThuoc + ", SoLuong=" + SoLuong + ", DonViTinh=" + DonViTinh + ", NgayKeDT=" + NgayKeDT + '}';
    }

    
}
