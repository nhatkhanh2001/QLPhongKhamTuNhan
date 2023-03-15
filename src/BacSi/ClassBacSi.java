/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BacSi;

import java.util.Date;

/**
 *
 * @author Huỳnh Cường
 */

public class ClassBacSi {
    private int MaBS;
    private String HoTenBS;
    private Date NgaySinh;
    private String GioiTinh;
    private String DiaChi;
    private String SoDienThoai;

    public ClassBacSi() {
    }

    public ClassBacSi(int MaBS) {
        this.MaBS = MaBS;
    }

    public ClassBacSi(int MaBS, String HoTenBS, Date NgaySinh, String GioiTinh, String DiaChi, String SoDienThoai) {
        this.MaBS = MaBS;
        this.HoTenBS = HoTenBS;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
    }

    public int getMaBS() {
        return MaBS;
    }

    public void setMaBS(int MaBS) {
        this.MaBS = MaBS;
    }

    public String getHoTenBS() {
        return HoTenBS;
    }

    public void setHoTenBS(String HoTenBS) {
        this.HoTenBS = HoTenBS;
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

    @Override
    public String toString() {
        return getHoTenBS();
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


}
