package classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
	
	String ProjectName = "Roulette-En";
	int Size1 = 752;
	int Size2 = 423;
	String or16 = "16:9";
	String Fonts = "serif";
	int FontEvent = Font.PLAIN;
	int FontSize = 150;
	Font FontBasic = new Font(Fonts, FontEvent, FontSize);
	Dimension comscreen =Toolkit.getDefaultToolkit().getScreenSize(); //http://sugame.tistory.com/618

	GUI(String title) {
		
		super(title);
		
		setLayout(new BorderLayout());
		
		System.out.println(ProjectName + "을 시작합니다.");
		System.out.println("모니터 해상도: " + comscreen.width + "x" + comscreen.height);
		System.out.println("화면 크기: " + Size1 + "x" + Size2 + "(화면 비율: " + or16 + ")");
		
		if (FontEvent == Font.PLAIN) {
			System.out.println("글꼴: " + Fonts + ", 크기: " + FontSize + ", 효과 없음");
			
		} else if (FontEvent == Font.BOLD) {
			System.out.println("글꼴: " + Fonts + ", 크기: " + FontSize + ", 글씨 굵게");
			
		} else if (FontEvent == Font.ITALIC) {
			System.out.println("글꼴: " + Fonts + ", 크기: " + FontSize + ", 글씨 기울어지게");
			
		}
		
		JLabel LabelMain = new JLabel("1");
		add(LabelMain, BorderLayout.CENTER);
		LabelMain.setFont(FontBasic);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Size1, Size2);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUI app = new GUI("Test");

	}

}