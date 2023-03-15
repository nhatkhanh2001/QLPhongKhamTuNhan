/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhieuKhamBenh;

import java.util.Date;

/**
 *
 * @author Huỳnh Cường
 */

// Class này dùng để xuất ra excel

public class ClassPhieuKhamBenh02 {
    private int MaPhieu;
    private String TinhTrangBN;
    private String DiUngThuoc;
    private String KhamLamSang;
    private String BenhKemTheo;
    private String NhipTim;
    private String NhipTho;
    private String HuyetAp;
    private String NhietDo;
    private String CanNang;
    private String ChieuCao;
    private String ChanDoan;
    private double TienKham;
    private Date NgayKham;
    
    private int MaPK;
    private int MaBN;
    private int MaBS;

    public ClassPhieuKhamBenh02() {
    }

    public ClassPhieuKhamBenh02(int MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public ClassPhieuKhamBenh02(int MaPhieu, String TinhTrangBN, String DiUngThuoc, String KhamLamSang, String BenhKemTheo, String NhipTim, String NhipTho, String HuyetAp, String NhietDo, String CanNang, String ChieuCao, String ChanDoan, double TienKham, Date NgayKham, int MaPK, int MaBN, int MaBS) {
        this.MaPhieu = MaPhieu;
        this.TinhTrangBN = TinhTrangBN;
        this.DiUngThuoc = DiUngThuoc;
        this.KhamLamSang = KhamLamSang;
        this.BenhKemTheo = BenhKemTheo;
        this.NhipTim = NhipTim;
        this.NhipTho = NhipTho;
        this.HuyetAp = HuyetAp;
        this.NhietDo = NhietDo;
        this.CanNang = CanNang;
        this.ChieuCao = ChieuCao;
        this.ChanDoan = ChanDoan;
        this.TienKham = TienKham;
        this.NgayKham = NgayKham;
        this.MaPK = MaPK;
        this.MaBN = MaBN;
        this.MaBS = MaBS;
    }

    public int getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(int MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public String getTinhTrangBN() {
        return TinhTrangBN;
    }

    public void setTinhTrangBN(String TinhTrangBN) {
        this.TinhTrangBN = TinhTrangBN;
    }

    public String getDiUngThuoc() {
        return DiUngThuoc;
    }

    public void setDiUngThuoc(String DiUngThuoc) {
        this.DiUngThuoc = DiUngThuoc;
    }

    public String getKhamLamSang() {
        return KhamLamSang;
    }

    public void setKhamLamSang(String KhamLamSang) {
        this.KhamLamSang = KhamLamSang;
    }

    public String getBenhKemTheo() {
        return BenhKemTheo;
    }

    public void setBenhKemTheo(String BenhKemTheo) {
        this.BenhKemTheo = BenhKemTheo;
    }

    public String getNhipTim() {
        return NhipTim;
    }

    public void setNhipTim(String NhipTim) {
        this.NhipTim = NhipTim;
    }

    public String getNhipTho() {
        return NhipTho;
    }

    public void setNhipTho(String NhipTho) {
        this.NhipTho = NhipTho;
    }

    public String getHuyetAp() {
        return HuyetAp;
    }

    public void setHuyetAp(String HuyetAp) {
        this.HuyetAp = HuyetAp;
    }

    public String getNhietDo() {
        return NhietDo;
    }

    public void setNhietDo(String NhietDo) {
        this.NhietDo = NhietDo;
    }

    public String getCanNang() {
        return CanNang;
    }

    public void setCanNang(String CanNang) {
        this.CanNang = CanNang;
    }

    public String getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(String ChieuCao) {
        this.ChieuCao = ChieuCao;
    }

    public String getChanDoan() {
        return ChanDoan;
    }

    public void setChanDoan(String ChanDoan) {
        this.ChanDoan = ChanDoan;
    }

    public double getTienKham() {
        return TienKham;
    }

    public void setTienKham(double TienKham) {
        this.TienKham = TienKham;
    }

    public Date getNgayKham() {
        return NgayKham;
    }

    public void setNgayKham(Date NgayKham) {
        this.NgayKham = NgayKham;
    }

    public int getMaPK() {
        return MaPK;
    }

    public void setMaPK(int MaPK) {
        this.MaPK = MaPK;
    }

    public int getMaBN() {
        return MaBN;
    }

    public void setMaBN(int MaBN) {
        this.MaBN = MaBN;
    }

    public int getMaBS() {
        return MaBS;
    }

    public void setMaBS(int MaBS) {
        this.MaBS = MaBS;
    }

   
}
