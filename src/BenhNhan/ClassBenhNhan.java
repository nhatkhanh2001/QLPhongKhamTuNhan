/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BenhNhan;

import java.util.Date;

/**
 *
 * @author Huỳnh Cường
 */

public class ClassBenhNhan {
    private int MaBN;
    private String HoTenBN;
    private Date NgaySinh;
    private String GioiTinh;
    private String DiaChi;
    private String SoDienThoai; 
    private String GhiChu;

    public ClassBenhNhan() {
    }

    public ClassBenhNhan(int MaBN) {
        this.MaBN = MaBN;
    }

    public ClassBenhNhan(int MaBN, String HoTenBN, Date NgaySinh, String GioiTinh, String DiaChi, String SoDienThoai, String GhiChu) {
        this.MaBN = MaBN;
        this.HoTenBN = HoTenBN;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.GhiChu = GhiChu;
    }

    public int getMaBN() {
        return MaBN;
    }

    public void setMaBN(int MaBN) {
        this.MaBN = MaBN;
    }

    public String getHoTenBN() {
        return HoTenBN;
    }

    public void setHoTenBN(String HoTenBN) {
        this.HoTenBN = HoTenBN;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
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

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    @Override
    public String toString() {
        return HoTenBN;
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
        
}
