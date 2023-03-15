/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Huỳnh Cường
 */
public class ConnectionModel {  
    
    public static void main(String[] args) {
        //
        String connectionUrl ="jdbc:sqlserver://localhost;databasename=DoAnJavaQLPhongKhamTuNhan;user=root;password=";
        try (Connection con = DriverManager.getConnection(connectionUrl); 
            Statement stmt = con.createStatement();){
 
            String SQL = "SELECT TOP 10 * FROM Table_BenhNhan";
          //String SQL = "SELECT TOP 10 * FROM Table_BacSi";
            ResultSet rs = stmt.executeQuery(SQL);
            
            //
            while (rs.next()){
                System.out.println(rs.getString("MaBN") + " " + rs.getString("HoTenBN") + " " + rs.getString("NgaySinh")+ " " + rs.getString("GioiTinh")+ " " + rs.getString("DiaChi")+ " " + rs.getString("SoDienThoai")+ " " + rs.getString("GhiChu"));
             
            }
        }
        //
        catch (SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
