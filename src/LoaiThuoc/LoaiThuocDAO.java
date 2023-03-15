/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoaiThuoc;

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

public class LoaiThuocDAO {
   SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    
    // Hàm thêm 1 loại thuốc mới
    public int add(ClassLoaiThuoc loaithuoc){
        try {
            String sSQL ="insert Table_LoaiThuoc(MaThuoc,TenThuoc)"
                    + "values(?,?)";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, loaithuoc.getMaThuoc());
            sttm.setString(2, loaithuoc.getTenThuoc());
                    
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
     public int update(ClassLoaiThuoc loaithuoc){
        try {
            String sSQL ="update Table_LoaiThuoc set TenThuoc=? where MaThuoc=?";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(2, loaithuoc.getMaThuoc());
            sttm.setString(1, loaithuoc.getTenThuoc());
         
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
     public int delete(int idThuoc){
        try {
            String sSQL ="delete Table_LoaiThuoc where MaThuoc= "+ idThuoc;
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
     
    // Lấy ra danh sách loại thuốc từ SQL
    public List<ClassLoaiThuoc> getAllLoaiThuoc(){
        List<ClassLoaiThuoc> lsLoaiThuoc = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_LoaiThuoc";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassLoaiThuoc loaithuoc = new ClassLoaiThuoc();
                loaithuoc.setMaThuoc(rs.getInt(1));
                loaithuoc.setTenThuoc(rs.getString(2));
           
                lsLoaiThuoc.add(loaithuoc);       
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
        return lsLoaiThuoc;
    }
    
    // Hàm tìm kiếm theo Mã thuốc
    public ClassLoaiThuoc findLoaiThuocByID(int maThuoc){
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_LoaiThuoc where MaThuoc='"+maThuoc+"'";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassLoaiThuoc loaithuoc = new ClassLoaiThuoc();
                loaithuoc.setMaThuoc(rs.getInt(1));
                loaithuoc.setTenThuoc(rs.getString(2));
                    
               return loaithuoc;             
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

    // Hàm tìm kiếm theo Tên thuốc và sử dụng để khai báo khoá ngoại lấy tên loại thuốc lên cbbMaThuoc, từ MaThuoc suy ra TenLoaiThuoc, xem trong FormKeDonThuoc sẽ thấy cbbMaThuoc, xem ClassLoaiThuoc dùng @Override trả về TenThuoc 
    public ClassLoaiThuoc findLoaiThuocByName(String tenThuoc){
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_LoaiThuoc where TenThuoc='N"+tenThuoc+"'";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassLoaiThuoc loaithuoc = new ClassLoaiThuoc();
                loaithuoc.setMaThuoc(rs.getInt(1));
                loaithuoc.setTenThuoc(rs.getString(2));
                    
               return loaithuoc;             
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
