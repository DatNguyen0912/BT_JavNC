/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author DELL
 */
public class HelloFrame extends JFrame {
	public HelloFrame() {
		JLabel jlbHello = new JLabel("Hello MMA");
		add(jlbHello);
		this.setSize(150, 100);
		//pack();//Dong goi
		setVisible(true);//True: Cho phep cua so hien ra
	}
	
	public static void main(String args[]) {
		new HelloFrame();
	}
}

