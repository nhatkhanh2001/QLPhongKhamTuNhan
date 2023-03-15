/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhapTaiKhoan;

import ConnectionModel.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Huỳnh Cường
 */

public class DangNhapDAO {
    SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    
    // Hàm đăng nhập tài khoản. 
    // Hàm này dựa vào Hàm tìm kiếm 1 đối tượng nào đó theo Mã rồi chỉnh sửa lại cho nó tìm kiếm theo TaiKhoan và MatKhau, nếu tìm thấy có trong SQL thì đăng nhập thành công
    public ClassUsers DangNhap (String taikhoanUsers, String matkhauUsers){
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_Users where TaiKhoan='"+taikhoanUsers+"'and MatKhau='"+matkhauUsers+"'";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassUsers users = new ClassUsers();
                users.setTaiKhoan(rs.getString(1));
                users.setMatKhau(rs.getString(2));

               return users;             
            }
        } catch (Exception ex){
            System.out.println ("Error:"+ex.toString());
            
        }
        finally{
            try{
                rs.close(); sttm.close(); conn.close();
            } catch (Exception ex){
                System.out.println ("Error:"+ex.toString());
            }
        }       
        return null;
    }    
}
