package b_cal;

import java.awt.*;
import javax.swing.*;

public class CalculatorTest extends JFrame{
	// 1. 멤버변수 선언
	JTextField tf;
	JButton b [] = new JButton[15];
	
	
	// 2. 객체 생성
	public CalculatorTest() {
		tf = new JTextField();
		
		for(int i=0; i<9; i++) {
			b[i] = new JButton(String.valueOf(i+1));
		}
		b[9] =new JButton("+");
		b[9].setToolTipText("더하기");
		b[10] = new JButton("0");
		b[11] =new JButton("=");
		b[11].setToolTipText("계산하기");
		b[12] =new JButton("-");
		b[12].setToolTipText("빼기");
		b[13] =new JButton("*");
		b[13].setToolTipText("곱하기");
		b[14] =new JButton("/");
		b[14].setToolTipText("나누기");
	}
	
	// 3. 화면 구성 및 출력하기
	public void display() {
	
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5, 3));
		for(int i=0; i<15; i++) {
			p.add(b[i]);
		}
		
		add(p, BorderLayout.CENTER);
		add(tf, BorderLayout.NORTH);
		
		setTitle("유치원계산기");
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {

		CalculatorTest t = new CalculatorTest();
		t.display();

	}

}
