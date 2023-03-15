/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham;

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

public class PhongKhamDAO {
   SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    
    // Hàm thêm 1 phòng khám mới
    public int add(ClassPhongKham phongkham){
        try {
            String sSQL ="insert Table_PhongKham(MaPK,TenPK)"
                    + "values(?,?)";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, phongkham.getMaPK());
            sttm.setString(2, phongkham.getTenPK());
                    
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
     public int update(ClassPhongKham phongkham){
        try {
            String sSQL ="update Table_PhongKham set TenPK=? where MaPK=?";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(2, phongkham.getMaPK());
            sttm.setString(1, phongkham.getTenPK());
  
          
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
     public int delete(int idPK){
        try {
            String sSQL ="delete Table_PhongKham where MaPK= "+ idPK;
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
     
    // Lấy ra danh sách phòng khám từ SQL
    public List<ClassPhongKham> getAllPhongKham(){
        List<ClassPhongKham> lsPK = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_PhongKham";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassPhongKham phongkham = new ClassPhongKham();
                phongkham.setMaPK(rs.getInt(1));
                phongkham.setTenPK(rs.getString(2));
           
                lsPK.add(phongkham);       
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
        return lsPK;
    }
    
    // Hàm tìm kiếm theo Mã phòng khám
    public ClassPhongKham findPhongKhamByID(int maPK){
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_PhongKham where MaPK='"+maPK+"'";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassPhongKham phongkham = new ClassPhongKham();
                phongkham.setMaPK(rs.getInt(1));
                phongkham.setTenPK(rs.getString(2));
                    
               return phongkham;             
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

 // Hàm tìm kiếm theo Tên phòng khám và và sử dụng để khai báo khoá ngoại lấy tên loại thuốc lên cbbMaPK, từ MaPK suy ra TennPK, xem trong FormPhieuKhamBenh sẽ thấy cbbMaPK, xem ClassPhongKham dùng @Override trả về TenPK
    public ClassPhongKham findPhongKhamByName(String tenPK){
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_PhongKham where TenPK='"+tenPK+"'";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassPhongKham phongkham = new ClassPhongKham();
                phongkham.setMaPK(rs.getInt(1));
                phongkham.setTenPK(rs.getString(2));
                    
               return phongkham;             
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
