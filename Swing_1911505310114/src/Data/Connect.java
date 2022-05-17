 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



import java.sql.ResultSet;


import java.sql.Statement;

import java.util.logging.Level;

import java.util.logging.Logger;
/**
 *
 * @author Gaara
 */
public class Connect {
    private  static Connection con;
    
    public static Connection getConnect(){
         String url = "net.sourceforge.jtds.jdbc.Driver";
        try {
           Class.forName(url);
            String dbUrl = "jdbc:jtds:sqlserver://ADMIN:1433/Bank2017;instance=SQLEXPRESS;user=sa;password=abc123!@#";
            con = DriverManager.getConnection(dbUrl);
        } catch (Exception e) {
            System.out.println("Kết nối không thành công");
        }
        return con;
    }
    public static String testConnect() {
        try{
            con = Connect.getConnect();
            return "Kết nối thành công";
        }
        catch(Exception e) {
            return "Kết nối thất bại";
        }
    } 
}
