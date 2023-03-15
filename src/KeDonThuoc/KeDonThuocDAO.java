/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeDonThuoc;

import BacSi.ClassBacSi;
import BenhNhan.ClassBenhNhan;
import ConnectionModel.DatabaseHelper;
import LoaiThuoc.ClassLoaiThuoc;
import PhongKham.ClassPhongKham;
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

public class KeDonThuocDAO {
    SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    
    // Hàm thêm 1 loại thuốc mới
    public int add(ClassKeDonThuoc kedonthuoc){
        try {
            String sSQL ="insert Table_KeDonThuoc (MaPhieu,MaThuoc,SoLuong,DonViTinh,NgayKeDT) values (?,?,?,?,?)";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);  
            sttm.setInt(1, kedonthuoc.getMaPhieu());
            sttm.setInt(2, kedonthuoc.getLt().getMaThuoc());          
            sttm.setInt(3, kedonthuoc.getSoLuong()); 
            sttm.setString(4, kedonthuoc.getDonViTinh()); 
            sttm.setString(5, date_format.format(kedonthuoc.getNgayKeDT()));
            
            if (sttm.executeUpdate()>0){
                System.out.println("Insert thành công");
                return 1;
            }
            
        } catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
        return -1;
    }
       
    // Hàm xoá
     public int delete(int idPhieu){
        try {
            String sSQL ="delete Table_KeDonThuoc where Table_KeDonThuoc.MaPhieu= "+ idPhieu;
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
     
    // Lấy ra danh sách kê đơn thuốc từ SQL
    public List<ClassKeDonThuoc> getAllKeDonThuoc(){
        List<ClassKeDonThuoc> lsKeDonThuoc = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try{
          // Tạo file SQLQuery trong SQL để viết các hàm code test các chức năng khai báo dữ liệu các Table trong SQL, nếu thành công thì mới copy đường dẫn để khai báo trong Java
          //String sSQL = "select * from Table_KeDonThuoc";
          //String sSQL = "select Table_KeDonThuoc.MaPhieu,Table_KeDonThuoc.MaThuoc,TenThuoc,SoLuong,DonViTinh,NgayKeDT from Table_KeDonThuoc inner join Table_LoaiThuoc on Table_LoaiThuoc.MaThuoc = Table_KeDonThuoc.MaThuoc";   
            String sSQL = "select Table_KeDonThuoc.MaPhieu,Table_PhieuKhamBenh.MaBN,HoTenBN,Table_BenhNhan.NgaySinh,Table_BenhNhan.GioiTinh,Table_BenhNhan.DiaChi,Table_BenhNhan.SoDienThoai,GhiChu,Table_KeDonThuoc.MaThuoc,TenThuoc,SoLuong,DonViTinh,NgayKeDT,Table_PhieuKhamBenh.MaPK,TenPK,Table_PhieuKhamBenh.MaBS,HoTenBS,Table_BacSi.NgaySinh,Table_BacSi.GioiTinh,Table_BacSi.DiaChi,Table_BacSi.SoDienThoai  from Table_KeDonThuoc \n" +
                          "inner join Table_PhieuKhamBenh on Table_PhieuKhamBenh.MaPhieu = Table_KeDonThuoc.MaPhieu\n" +
                          "inner join Table_LoaiThuoc on Table_LoaiThuoc.MaThuoc = Table_KeDonThuoc.MaThuoc\n" +
                          "inner join Table_BenhNhan on Table_BenhNhan.MaBN = Table_PhieuKhamBenh.MaBN\n" +
                          "inner join Table_PhongKham on Table_PhongKham.MaPK = Table_PhieuKhamBenh.MaPK \n" +
                          "inner join Table_BacSi on Table_BacSi.MaBS = Table_PhieuKhamBenh.MaBS";        
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassKeDonThuoc kedonthuoc = new ClassKeDonThuoc();
               
             /* kedonthuoc.setMaPhieu(rs.getInt(1));
                kedonthuoc.setLt(new ClassLoaiThuoc(rs.getInt(2), rs.getString(3)));
                kedonthuoc.setSoLuong(rs.getInt(4));
                kedonthuoc.setDonViTinh(rs.getString(5));
                kedonthuoc.setNgayKeDT(rs.getDate(6)); */
        
            // Khai báo các khoá ngoại, khi lớp con chứa thông tin của lớp cha
                kedonthuoc.setMaPhieu(rs.getInt(1));
                kedonthuoc.setBn(new ClassBenhNhan(rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8))); //Khoá ngoại ClassBenhNhan
                kedonthuoc.setLt(new ClassLoaiThuoc(rs.getInt(9), rs.getString(10))); //Khoá ngoại ClassLoaiThuoc
                kedonthuoc.setSoLuong(rs.getInt(11));
                kedonthuoc.setDonViTinh(rs.getString(12));
                kedonthuoc.setNgayKeDT(rs.getDate(13)); 
                kedonthuoc.setPk(new ClassPhongKham(rs.getInt(14), rs.getString(15))); //Khoá ngoại ClassPhongKham
                kedonthuoc.setBs(new ClassBacSi(rs.getInt(16), rs.getString(17), rs.getDate(18), rs.getString(19), rs.getString(20), rs.getString(21))); //Khoá ngoại ClassBacSi
                
                lsKeDonThuoc.add(kedonthuoc);       
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
        return lsKeDonThuoc;
    }
    
    // Hàm tìm kiếm theo Mã phiếu
    public ClassKeDonThuoc findKeDonThuocByID(int maPhieu){
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from Table_KeDonThuoc where MaPhieu='"+maPhieu+"'";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassKeDonThuoc kedonthuoc = new ClassKeDonThuoc();
                kedonthuoc.setMaPhieu(rs.getInt(1));
                kedonthuoc.setMaThuoc(rs.getInt(2));
           //   kedonthuoc.setLt(new ClassLoaiThuoc(rs.getInt(2), rs.getString(3)));
                kedonthuoc.setSoLuong(rs.getInt(3));
                kedonthuoc.setDonViTinh(rs.getString(4));
                kedonthuoc.setNgayKeDT(rs.getDate(5));
                    
               return kedonthuoc;             
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
