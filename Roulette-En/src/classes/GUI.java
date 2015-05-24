package classes;

import javax.swing.JFrame;

public class GUI extends JFrame {
	
	String ProjectName = "Roulette-En";
	int Size1 = 752;
	int Size2 = 423;
	String or16 = "16:9";

	GUI(String title) {
		
		super(title);
		
		System.out.println(ProjectName + "을 시작합니다.");
		System.out.println("화면 크기: " + Size1 + "x" + Size2 + "(화면 비율: " + or16 + ")");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Size1, Size2);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUI app = new GUI("Test");

	}

}