/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeDonThuoc;

import BacSi.ClassBacSi;
import BenhNhan.ClassBenhNhan;
import LoaiThuoc.ClassLoaiThuoc;
import PhieuKhamBenh.ClassPhieuKhamBenh;
import PhongKham.ClassPhongKham;
import java.util.Date;

/**
 *
 * @author Huỳnh Cường
 */

public class ClassKeDonThuoc {
    private int MaPhieu;
    private int MaThuoc;
    private int SoLuong;
    private String DonViTinh;
    private Date NgayKeDT;
    
    private ClassPhieuKhamBenh pkb;
    private ClassLoaiThuoc lt;
    
    private ClassBenhNhan bn;
    private ClassPhongKham pk;
    private ClassBacSi bs;

    public ClassKeDonThuoc() {
    }

    public ClassKeDonThuoc(int MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public ClassKeDonThuoc(int MaPhieu, int MaThuoc, int SoLuong, String DonViTinh, Date NgayKeDT, ClassPhieuKhamBenh pkb, ClassLoaiThuoc lt, ClassBenhNhan bn, ClassPhongKham pk, ClassBacSi bs) {
        this.MaPhieu = MaPhieu;
        this.MaThuoc = MaThuoc;
        this.SoLuong = SoLuong;
        this.DonViTinh = DonViTinh;
        this.NgayKeDT = NgayKeDT;
        this.pkb = pkb;
        this.lt = lt;
        this.bn = bn;
        this.pk = pk;
        this.bs = bs;
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

    public ClassPhieuKhamBenh getPkb() {
        return pkb;
    }

    public void setPkb(ClassPhieuKhamBenh pkb) {
        this.pkb = pkb;
    }

    public ClassLoaiThuoc getLt() {
        return lt;
    }

    public void setLt(ClassLoaiThuoc lt) {
        this.lt = lt;
    }

    public ClassBenhNhan getBn() {
        return bn;
    }

    public void setBn(ClassBenhNhan bn) {
        this.bn = bn;
    }

    public ClassPhongKham getPk() {
        return pk;
    }

    public void setPk(ClassPhongKham pk) {
        this.pk = pk;
    }

    public ClassBacSi getBs() {
        return bs;
    }

    public void setBs(ClassBacSi bs) {
        this.bs = bs;
    }
    
}
