/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BenhNhan;

import ConnectionModel.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huỳnh Cường
 */

public class BenhNhanDAO {
    SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    
    // Hàm thêm 1 bệnh nhân mới
    public int add(ClassBenhNhan benhnhan){
        try {
            String sSQL ="insert Table_BenhNhan(MaBN,HoTenBN,NgaySinh,GioiTinh,DiaChi,SoDienThoai,GhiChu)"
                    + "values(?,?,?,?,?,?,?)";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, benhnhan.getMaBN());
            sttm.setString(2, benhnhan.getHoTenBN());
            sttm.setString(3, date_format.format(benhnhan.getNgaySinh()));
            sttm.setString(4, benhnhan.getGioiTinh());
            sttm.setString(5, benhnhan.getDiaChi());
            sttm.setString(6, benhnhan.getSoDienThoai());
            sttm.setString(7, benhnhan.getGhiChu());
         
            if (sttm.executeUpdate()>0){
                System.out.println("Insert thành công");
                return 1;
            }
            
        } catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
        return -1;
    }
    
    // Hàm update
     public int update(ClassBenhNhan benhnhan){
        try {
            String sSQL ="update Table_BenhNhan set HoTenBN=?,NgaySinh=?,GioiTinh=?,DiaChi=?,SoDienThoai=?,GhiChu=? where MaBN=?";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(7, benhnhan.getMaBN());
            sttm.setString(1, benhnhan.getHoTenBN());
            sttm.setString(2, date_format.format(benhnhan.getNgaySinh()));
            sttm.setString(3, benhnhan.getGioiTinh());
            sttm.setString(4, benhnhan.getDiaChi());
            sttm.setString(5, benhnhan.getSoDienThoai());
            sttm.setString(6, benhnhan.getGhiChu());
          
            if (sttm.executeUpdate()>0){
                System.out.println("Update thành công");
                return 1;
            }
            
        } catch (Exception ex){
            System.out.println("Error: " + ex.toString());
        }
        return -1;
    }
     
    // Hàm xoá
     public int delete(int idBN){
        try {
            String sSQL ="delete Table_BenhNhan where MaBN= "+ idBN;
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
                    
            if (sttm.executeUpdate()>0){
                System.out.println("Delete thành công");
                return 1;
            }           
        } catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
        return -1;
    }
     
    // Lấy ra danh sách bệnh nhân từ SQL
    public List<ClassBenhNhan> getAllBenhNhan(){
        List<ClassBenhNhan> lsBN = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_BenhNhan";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassBenhNhan benhnhan = new ClassBenhNhan();
                benhnhan.setMaBN(rs.getInt(1));
                benhnhan.setHoTenBN(rs.getString(2));
                benhnhan.setNgaySinh(rs.getDate(3));            
              //benhnhan.setNgaySinh(date_format.parse(rs.getString(3)));            
                benhnhan.setGioiTinh(rs.getString(4));
                benhnhan.setDiaChi(rs.getString(5));
                benhnhan.setSoDienThoai(rs.getString(6));
                benhnhan.setGhiChu(rs.getString(7));
              
                lsBN.add(benhnhan);       
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
        return lsBN;
    }
    
    // Hàm tìm kiếm theo Mã bệnh nhân
    public ClassBenhNhan findBenhNhanByID(int maBN){
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_BenhNhan where MaBN='"+maBN+"'";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassBenhNhan benhnhan = new ClassBenhNhan();
                benhnhan.setMaBN(rs.getInt(1));
                benhnhan.setHoTenBN(rs.getString(2));
                benhnhan.setNgaySinh(rs.getDate(3));
                benhnhan.setGioiTinh(rs.getString(4));
                benhnhan.setDiaChi(rs.getString(5));
                benhnhan.setSoDienThoai(rs.getString(6));
                benhnhan.setGhiChu(rs.getString(7));
                
               return benhnhan;             
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
