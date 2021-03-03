package day0222;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Swing의 Component와 AWT의 Component는 호환된다.
 * 
 * @author user
 */
//1.윈도우 컴포넌트 상속.
@SuppressWarnings("serial")
public class HelloSwing2 extends JFrame {
	
	//2.생성자를 작성하고, 컴포넌트를 생성.
	public HelloSwing2() {
		super("컴포넌트의 호환.");
		JButton jbtn = new JButton("Swing Button");
		Button btn = new Button("AWT Button");
		
		//3.컴포넌트를 배치
		setLayout(new GridLayout(1,2));
		
		add(jbtn);//Swing Button -> JFrame 배치
		add(btn);// AWT Button -> JFrame 배치(호환)
		
		//4.크기 설정.
		setSize(400,200);
		
		//5.가시화
		setVisible(true);
		
		//6.종료 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new HelloSwing2();
	}

}
