/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectSQLtest02;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Huỳnh Cường
 */
public class Connect {
    public static Connection getConnection(){
        Connection conn = null;
        
        try{
             // Tạo chuỗi kết nối
            String chuoiketnoi = "jdbc:sqlserver://localhost:1433; databasename=DoAnJavaQLPhongKhamTuNhan;user=root;password=";
            // Đăng ký JDBS
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Thực hiện kết nối
            conn = DriverManager.getConnection(chuoiketnoi);
            //conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DoAnJavaQLPhongKhamTuNhan;","sa","123456");
            if(conn !=null){
                System.out.print("Kết nối thành công");
            }
     
        }catch(Exception ex){
            System.out.println(ex.toString());
        }   
        return conn;
    }  
     
       public static void main(String[] args) {
        System.out.println(Connect.getConnection().toString());
    }
       
       
}
