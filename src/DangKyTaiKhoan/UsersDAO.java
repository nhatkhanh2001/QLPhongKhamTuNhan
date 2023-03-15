/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangKyTaiKhoan;

import ConnectionModel.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Huỳnh Cường
 */

public class UsersDAO {
    SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    
    // Hàm thêm 1 người dùng mới
    public int add(ClassUsers users){
        try {
            String sSQL ="insert Table_Users (TaiKhoan,MatKhau,HoTen,NgaySinh,DiaChi,SoDienThoai,Email)"
                    + "values(?,?,?,?,?,?,?)";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, users.getTaiKhoan());
            sttm.setString(2, users.getMatKhau());
            sttm.setString(3, users.getHoTen());
            sttm.setString(4, date_format.format(users.getNgaySinh()));
            sttm.setString(5, users.getDiaChi());
            sttm.setString(6, users.getSoDienThoai());
            sttm.setString(7, users.getEmail());
         
            if (sttm.executeUpdate()>0){
                System.out.println("Insert thành công");
                return 1;
            }
            
        } catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
        return -1;
    }
    
}
