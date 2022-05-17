/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Object.dulieu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaara
 */
public class Data {
    public static PreparedStatement ps;
    public static ResultSet rs;
    

    
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
        public static void InsertData(dulieu s) {
        String sql = "insert into dulieu(Title,Price) values(?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, s.getTitle());
            ps.setInt(2, s.getPrice());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, " không  hêm thành công" , "Thông báo", 1);
        }
    }
            public boolean UpdateData(dulieu s) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE dulieu SET  Title = ?, Price = ?");
    
            ps.setString(1, s.getTitle());
            ps.setInt(2, s.getPrice());
  
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
         public boolean DeleteData(String ms) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM dulieu WHERE Id = ?");
            ps.setString(1, ms);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
    

}
