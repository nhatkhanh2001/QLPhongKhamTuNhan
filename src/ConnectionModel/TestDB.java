/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionModel;

import BenhNhan.BenhNhanDAO;
import ConnectionModel.DatabaseHelper;
import BenhNhan.ClassBenhNhan;
import java.sql.Connection;

/**
 *
 * @author Huỳnh Cường
 */
public class TestDB {
    public static void main(String[] args) {
        Connection conn = DatabaseHelper.getDBConnect();
        BenhNhanDAO daoBN = new BenhNhanDAO();
        if (conn !=null) {
            System.out.println("Kết nối thành công");
           //
           
           //
          
           for (ClassBenhNhan bn : daoBN.getAllBenhNhan()){
               System.out.println(bn.toString());
           }
           //
           ClassBenhNhan find = daoBN.findBenhNhanByID(1000000001);  // Thể loại int, còn String thì (" ")
           
           if (find != null){
               System.out.println("Đã tìm thấy");
               System.out.println(find.toString());
           }
           else
           {
               System.out.println("Không tìm thấy");
               
           }
           
        }else{
             System.out.println("Kết nối thất bại");
        }
      
        
    }
}
