/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhieuKhamBenh;

import BacSi.ClassBacSi;
import BenhNhan.ClassBenhNhan;
import ConnectionModel.DatabaseHelper;
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
public class PhieuKhamBenhDAO {
    SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    
    // Hàm thêm 1 phiếu khám bệnh mới
    public int add(ClassPhieuKhamBenh03 phieukhambenh){
        try {
            String sSQL ="insert Table_PhieuKhamBenh(MaPhieu,TinhTrangBN,DiUngThuoc,KhamLamSang,BenhKemTheo,NhipTim,NhipTho,HuyetAp,NhietDo,CanNang,ChieuCao,ChanDoan,TienKham,NgayKham,MaPK,MaBN,MaBS) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, phieukhambenh.getMaPhieu());
            sttm.setString(2, phieukhambenh.getTinhTrangBN());
            sttm.setString(3, phieukhambenh.getDiUngThuoc());
            sttm.setString(4, phieukhambenh.getKhamLamSang());
            sttm.setString(5, phieukhambenh.getBenhKemTheo());
            sttm.setString(6, phieukhambenh.getNhipTim());
            sttm.setString(7, phieukhambenh.getNhipTho());
            sttm.setString(8, phieukhambenh.getHuyetAp());
            sttm.setString(9, phieukhambenh.getNhietDo());
            sttm.setString(10, phieukhambenh.getCanNang());
            sttm.setString(11, phieukhambenh.getChieuCao());
            sttm.setString(12, phieukhambenh.getChanDoan());
            sttm.setDouble(13, phieukhambenh.getTienKham()); 
            sttm.setString(14, date_format.format(phieukhambenh.getNgayKham()));
          
            sttm.setInt(15, phieukhambenh.getPk().getMaPK()); // Lấy dữ liệu từ ClassPhongKham
        
            sttm.setInt(16, phieukhambenh.getMaBN());
            sttm.setInt(17, phieukhambenh.getMaBS());
            
          //  sttm.setInt(16, phieukhambenh.getBn().getMaBN());
          //  sttm.setInt(17, phieukhambenh.getBs().getMaBS());
             
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
     public int update(ClassPhieuKhamBenh03 phieukhambenh){
        try {
            String sSQL ="update Table_PhieuKhamBenh set TinhTrangBN=?,DiUngThuoc=?,KhamLamSang=?,BenhKemTheo=?,NhipTim=?,NhipTho=?,HuyetAp=?,NhietDo=?,CanNang=?,ChieuCao=?,ChanDoan=?,TienKham=?,NgayKham=?,MaPK=?,MaBN=?,MaBS=? where MaPhieu=?";
            conn = DatabaseHelper.getDBConnect();           
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(17, phieukhambenh.getMaPhieu());
            sttm.setString(1, phieukhambenh.getTinhTrangBN());
            sttm.setString(2, phieukhambenh.getDiUngThuoc());
            sttm.setString(3, phieukhambenh.getKhamLamSang());
            sttm.setString(4, phieukhambenh.getBenhKemTheo());
            sttm.setString(5, phieukhambenh.getNhipTim());
            sttm.setString(6, phieukhambenh.getNhipTho());
            sttm.setString(7, phieukhambenh.getHuyetAp());
            sttm.setString(8, phieukhambenh.getNhietDo());
            sttm.setString(9, phieukhambenh.getCanNang());
            sttm.setString(10, phieukhambenh.getChieuCao());
            sttm.setString(11, phieukhambenh.getChanDoan());
            sttm.setDouble(12, phieukhambenh.getTienKham()); 
            sttm.setString(13, date_format.format(phieukhambenh.getNgayKham()));
            sttm.setInt(14, phieukhambenh.getPk().getMaPK()); // Lấy dữ liệu từ ClassPhongKham
          
            sttm.setInt(15, phieukhambenh.getMaBN());
            sttm.setInt(16, phieukhambenh.getMaBS());
            
         // sttm.setInt(15, phieukhambenh.getBn().getMaBN()); 
         // sttm.setInt(16, phieukhambenh.getBs().getMaBS());
          
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
     public int delete(int idPhieuKB){
        try {
            String sSQL ="delete Table_PhieuKhamBenh where MaPhieu= "+ idPhieuKB;
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
                    
            if (sttm.executeUpdate()>0){
                System.out.println("Delete thành công");
                return 1;
            }           
        } catch (Exception ex){
            System.out.println("Error: " + ex.toString());
        }
        return -1;
    }
     
    // Lấy ra danh sách phiếu khám bệnh từ SQL
    public List<ClassPhieuKhamBenh03> getAllPhieuKhamBenh(){
        List<ClassPhieuKhamBenh03> lsPhieuKB = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try{
            //String sSQL ="select MaPhieu,TinhTrangBN,DiUngThuoc,KhamLamSang,BenhKemTheo,NhipTim,NhipTho,HuyetAp,NhietDo,CanNang,ChieuCao,ChanDoan,TienKham,NgayKham,Table_PhieuKhamBenh.MaPK,TenPK,MaBN,MaBS from Table_PhieuKhamBenh inner join Table_PhongKham on Table_PhongKham.MaPK = Table_PhieuKhamBenh.MaPK";
            String sSQL ="select MaPhieu,TinhTrangBN,DiUngThuoc,KhamLamSang,BenhKemTheo,NhipTim,NhipTho,HuyetAp,NhietDo,CanNang,ChieuCao,ChanDoan,TienKham,NgayKham,Table_PhieuKhamBenh.MaPK,TenPK,Table_PhieuKhamBenh.MaBN,HoTenBN,Table_BenhNhan.NgaySinh,Table_BenhNhan.GioiTinh,Table_BenhNhan.DiaChi,Table_BenhNhan.SoDienThoai,GhiChu, Table_PhieuKhamBenh.MaBS,HoTenBS,Table_BacSi.NgaySinh,Table_BacSi.GioiTinh,Table_BacSi.DiaChi,Table_BacSi.SoDienThoai from Table_PhieuKhamBenh inner join Table_PhongKham on Table_PhongKham.MaPK = Table_PhieuKhamBenh.MaPK inner join Table_BenhNhan on Table_BenhNhan.MaBN = Table_PhieuKhamBenh.MaBN inner join Table_BacSi on Table_BacSi.MaBS = Table_PhieuKhamBenh.MaBS";
  
            //  String sSQL = "select * from Table_PhieuKhamBenh";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassPhieuKhamBenh03 phieukhambenh = new ClassPhieuKhamBenh03();
                phieukhambenh.setMaPhieu(rs.getInt(1));
                phieukhambenh.setTinhTrangBN(rs.getString(2));
                phieukhambenh.setDiUngThuoc(rs.getString(3));
                phieukhambenh.setKhamLamSang(rs.getString(4));
                phieukhambenh.setBenhKemTheo(rs.getString(5));
                phieukhambenh.setNhipTim(rs.getString(6));
                phieukhambenh.setNhipTho(rs.getString(7));
                phieukhambenh.setHuyetAp(rs.getString(8));
                phieukhambenh.setNhietDo(rs.getString(9));
                phieukhambenh.setCanNang(rs.getString(10));
                phieukhambenh.setChieuCao(rs.getString(11));
                phieukhambenh.setChanDoan(rs.getString(12));
                phieukhambenh.setTienKham(rs.getDouble(13));
          //    phieukhambenh.setNgayKham(rs.getDate(14)); // Cách 1 
                phieukhambenh.setNgayKham(date_format.parse(rs.getString(14)));  // Cách 2 phải khai báo SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd"); Lên phía trên
                    
                phieukhambenh.setPk(new ClassPhongKham(rs.getInt(15), rs.getString(16)));
               
         //     phieukhambenh.setMaBN(rs.getInt(17));
         //     phieukhambenh.setMaBS(rs.getInt(18));
                
                phieukhambenh.setBn(new ClassBenhNhan(rs.getInt(17), rs.getString(18), rs.getDate(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23)));

                phieukhambenh.setBs(new ClassBacSi(rs.getInt(24), rs.getString(25), rs.getDate(26), rs.getString(27), rs.getString(28), rs.getString(29)));
                
                lsPhieuKB.add(phieukhambenh);       
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
        return lsPhieuKB;
    }
    
    // Hàm tìm kiếm theo Mã phiếu và dùng để sử dụng cho sự kiện event MouseClick khi clicl vào TbDSPhieuKhamBenh thì dữ liệu sẽ đổ lên các Form 
    public ClassPhieuKhamBenh03 findPhieuKhamBenhByID(int maPhieu){

        ResultSet rs = null;
        Statement sttm = null;
        try{
            //String sSQL ="select MaPhieu,TinhTrangBN,DiUngThuoc,KhamLamSang,BenhKemTheo,NhipTim,NhipTho,HuyetAp,NhietDo,CanNang,ChieuCao,ChanDoan,TienKham,NgayKham,Table_PhieuKhamBenh.MaPK,TenPK,MaBN,MaBS from Table_PhieuKhamBenh inner join Table_PhongKham on Table_PhongKham.MaPK = Table_PhieuKhamBenh.MaPK";
            String sSQL ="select MaPhieu,TinhTrangBN,DiUngThuoc,KhamLamSang,BenhKemTheo,NhipTim,NhipTho,HuyetAp,NhietDo,CanNang,ChieuCao,ChanDoan,TienKham,NgayKham,Table_PhieuKhamBenh.MaPK,TenPK,Table_PhieuKhamBenh.MaBN,Table_PhieuKhamBenh.MaBS from Table_PhieuKhamBenh inner join Table_PhongKham on Table_PhongKham.MaPK = Table_PhieuKhamBenh.MaPK inner join Table_BenhNhan on Table_BenhNhan.MaBN = Table_PhieuKhamBenh.MaBN inner join Table_BacSi on Table_BacSi.MaBS = Table_PhieuKhamBenh.MaBS where MaPhieu='"+maPhieu+"'";
  
            //  String sSQL = "select * from Table_PhieuKhamBenh";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                ClassPhieuKhamBenh03 phieukhambenh = new ClassPhieuKhamBenh03();
                phieukhambenh.setMaPhieu(rs.getInt(1));
                phieukhambenh.setTinhTrangBN(rs.getString(2));
                phieukhambenh.setDiUngThuoc(rs.getString(3));
                phieukhambenh.setKhamLamSang(rs.getString(4));
                phieukhambenh.setBenhKemTheo(rs.getString(5));
                phieukhambenh.setNhipTim(rs.getString(6));
                phieukhambenh.setNhipTho(rs.getString(7));
                phieukhambenh.setHuyetAp(rs.getString(8));
                phieukhambenh.setNhietDo(rs.getString(9));
                phieukhambenh.setCanNang(rs.getString(10));
                phieukhambenh.setChieuCao(rs.getString(11));
                phieukhambenh.setChanDoan(rs.getString(12));
                phieukhambenh.setTienKham(rs.getDouble(13));
          //    phieukhambenh.setNgayKham(rs.getDate(14)); // Cách 1 
                phieukhambenh.setNgayKham(date_format.parse(rs.getString(14)));  // Cách 2 phải khai báo SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd"); Lên phía trên
                    
                phieukhambenh.setPk(new ClassPhongKham(rs.getInt(15), rs.getString(16)));
               
                phieukhambenh.setMaBN(rs.getInt(17));
                phieukhambenh.setMaBS(rs.getInt(18));
                
        //      phieukhambenh.setBn(new ClassBenhNhan(rs.getInt(17), rs.getString(18), rs.getDate(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23)));

        //      phieukhambenh.setBs(new ClassBacSi(rs.getInt(24), rs.getString(25), rs.getDate(26), rs.getString(27), rs.getString(28), rs.getString(29)));
                
                return phieukhambenh;      
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
