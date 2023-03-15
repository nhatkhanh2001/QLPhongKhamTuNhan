/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhieuKhamBenh;

import BacSi.ClassBacSi;
import BenhNhan.ClassBenhNhan;
import PhongKham.ClassPhongKham;
import java.util.Date;

/**
 *
 * @author Huỳnh Cường
 */
// Class này tạo ra để thực hiện 2 nhiệm vụ là thêm dữ liệu vào Phiếu Khám Bệnh và xem toàn bộ dữ liệu con và cha show ra bảng TbDSPhieuKhamBenh

public class ClassPhieuKhamBenh03 {
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
    
  //private int MaPK;
    private int MaBN;             // add mã số bệnh nhân trực tiếp vào luôn thông qua txtBenhNhan trong FrmPhieuKhamBenh hàm getModel, nên dùng cách này add vào thông tin Phiếu Khám bệnh để tránh lỗi không add thông tin vào được.
    private int MaBS;             // add mã số bệnh nhân trực tiếp vào luôn thông qua txtBenhNhan trong FrmPhieuKhamBenh hàm getModel, nên dùng cách này add vào thông tin Phiếu Khám bệnh để tránh lỗi không add thông tin vào được.
    
    private ClassPhongKham pk;    // Khai báo khoá ngoại để khi lớp con gọi thông tin cha. Ví dụ Mã PK gọi ra Tên PK. Dùng để Show toàn bộ dữ liệu của các khoá ngoại từ SQL ra bảng TbDSPhieuKhamBenh để xem. Sử dụng combobox chuyển từ MaPK sang TenPk để xem trên cbb. Riêng Class này chỉ có MaPK và TenPK nên dễ dàng sử dụng combobox để điền thông tin thêm mới 1 phiếu mới. Ví dụ MãPK 01 sẽ hiện lên cbb là Phòng Khám 1.
   
    private ClassBenhNhan bn;     // Chủ yếu dùng để show toàn bộ dữ liệu ra TbDSPhieuKhamBenh. Không nên dùng combobox của class này để điền thông tin cho Phiếu Khám Bệnh,khi chuyển từ MaBN sang TenBN, ClassBenhNhan có rất nhiều thông tin, khác với ClassPhongKham rất khó để thêm mới 1 phiếu khám bệnh mới, xẩy xung đột không thể thêm mới 1 phiếu mới
    private ClassBacSi bs;        // Chủ yếu dùng để show toàn bộ dữ liệu ra TbDSPhieuKhamBenh. Không nên dùng combobox của class này để điền thông tin cho Phiếu Khám Bệnh

    public ClassPhieuKhamBenh03() {
    }

    public ClassPhieuKhamBenh03(int MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public ClassPhieuKhamBenh03(int MaPhieu, String TinhTrangBN, String DiUngThuoc, String KhamLamSang, String BenhKemTheo, String NhipTim, String NhipTho, String HuyetAp, String NhietDo, String CanNang, String ChieuCao, String ChanDoan, double TienKham, Date NgayKham, int MaBN, int MaBS, ClassPhongKham pk, ClassBenhNhan bn, ClassBacSi bs) {
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
        this.MaBN = MaBN;
        this.MaBS = MaBS;
        this.pk = pk;
        this.bn = bn;
        this.bs = bs;
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

    public ClassPhongKham getPk() {
        return pk;
    }

    public void setPk(ClassPhongKham pk) {
        this.pk = pk;
    }

    public ClassBenhNhan getBn() {
        return bn;
    }

    public void setBn(ClassBenhNhan bn) {
        this.bn = bn;
    }

    public ClassBacSi getBs() {
        return bs;
    }

    public void setBs(ClassBacSi bs) {
        this.bs = bs;
    }

 
}
