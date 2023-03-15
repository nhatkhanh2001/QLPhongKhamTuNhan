/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham;

/**
 *
 * @author Huỳnh Cường
 */

public class ClassPhongKham {
    private int MaPK;
    private String TenPK;

    public ClassPhongKham() {
    }

    public ClassPhongKham(int MaPK) {
        this.MaPK = MaPK;
    }

    public ClassPhongKham(int MaPK, String TenPK) {
        this.MaPK = MaPK;
        this.TenPK = TenPK;
    }

    public int getMaPK() {
        return MaPK;
    }

    public void setMaPK(int MaPK) {
        this.MaPK = MaPK;
    }

    public String getTenPK() {
        return TenPK;
    }

    public void setTenPK(String TenPK) {
        this.TenPK = TenPK;
    }

    @Override
    public String toString() {
        return getTenPK(); // Trả về tên phòng khám, dùng để khai báo khoá ngoại lên cbb, xem Form Phiếu Khám Bệnh sẽ thấy cbbMaPK sẽ có tên các phòng khám bệnh thay vì hiện mã phòng khám
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
 
}
