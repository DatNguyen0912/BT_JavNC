/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 *
 * @author DELL
 */
import java.io.*;
import java.net.*;
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InetAddress i;
        try{
            i=InetAddress.getLocalHost();
            System.out.println("The Localhost is:"+i);
            i=InetAddress.getByName(null);
            System.out.println("The Null host is:"+i);
        i=InetAddress.getByName("thanhnien.vn");
            System.out.print("The Host address is:"+i);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
