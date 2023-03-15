/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BacSi;

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

public class BacSiDAO {
    SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    
    // Hàm thêm 1 bác sĩ mới
    public int add(ClassBacSi bacsi){
        try {
            String sSQL ="insert Table_BacSi(MaBS,HoTenBS,NgaySinh,GioiTinh,DiaChi,SoDienThoai)"
                    + "values(?,?,?,?,?,?)";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, bacsi.getMaBS());
            sttm.setString(2, bacsi.getHoTenBS());
            sttm.setString(3, date_format.format(bacsi.getNgaySinh()));
            sttm.setString(4, bacsi.getGioiTinh());
            sttm.setString(5, bacsi.getDiaChi());
            sttm.setString(6, bacsi.getSoDienThoai());
         
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
     public int update(ClassBacSi bacsi){
        try {
            String sSQL ="update Table_BacSi set HoTenBS=?,NgaySinh=?,GioiTinh=?,DiaChi=?,SoDienThoai=? where MaBS=?";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(6, bacsi.getMaBS());
            sttm.setString(1, bacsi.getHoTenBS());
            sttm.setString(2, date_format.format(bacsi.getNgaySinh()));
            sttm.setString(3, bacsi.getGioiTinh());
            sttm.setString(4, bacsi.getDiaChi());
            sttm.setString(5, bacsi.getSoDienThoai());
          
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
     public int delete(int idBS){
        try {
            String sSQL ="delete Table_BacSi where MaBS= "+ idBS;
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
     
    // Lấy ra danh sách bác sĩ từ SQL
    public List<ClassBacSi> getAllBacSi(){
        List<ClassBacSi> lsBS = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_BacSi";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassBacSi bacsi = new ClassBacSi();
                bacsi.setMaBS(rs.getInt(1));
                bacsi.setHoTenBS(rs.getString(2));
                bacsi.setNgaySinh(rs.getDate(3));            
              //bacsi.setNgaySinh(date_format.parse(rs.getString(3)));            
                bacsi.setGioiTinh(rs.getString(4));
                bacsi.setDiaChi(rs.getString(5));
                bacsi.setSoDienThoai(rs.getString(6));
              
                lsBS.add(bacsi);       
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
        return lsBS;
    }
    
    // Hàm tìm kiếm theo Mã bác sĩ
    public ClassBacSi findBacSiByID(int maBS){
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_BacSi where MaBS='"+maBS+"'";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassBacSi bacsi = new ClassBacSi();
                bacsi.setMaBS(rs.getInt(1));
                bacsi.setHoTenBS(rs.getString(2));
                bacsi.setNgaySinh(rs.getDate(3));
                bacsi.setGioiTinh(rs.getString(4));
                bacsi.setDiaChi(rs.getString(5));
                bacsi.setSoDienThoai(rs.getString(6));
           
               return bacsi;             
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
