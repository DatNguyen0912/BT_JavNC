/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;
import java.sql.Date;
/**
 *
 * @author Administrator
 */
public class dulieu {
    private int id;
    private String title;
    private int price;
      public dulieu() {
        
    }
        public dulieu( String title, int price){
        this.title = title;
        this.price = price;
      }
      public dulieu(int id, String title, int price){
        this.id = id;
        this.title = title;
        this.price = price;
      }
      
        public int getId(){
        return id;
    }
    
        public void setId(int id) {
        this.id = id;
    }
      public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
        public int getPrice(){
        return price;
    }
    
        public void setPrice(int price) {
        this.price = price;
    }
      
    
    
}

    
