package classes;

import javax.swing.JFrame;

public class GUI extends JFrame {

	GUI(String title) {
		
		super(title);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUI app = new GUI("Test");

	}

}