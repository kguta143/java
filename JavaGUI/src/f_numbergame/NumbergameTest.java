package f_numbergame;

import javax.swing.*;
import java.awt.*;

public class NumbergameTest {
	public static void main(String[] args) {
		NumberGame game = new NumberGame();	//객체생성
		game.showAnswer();
	}

}

class NumberGame extends JFrame {
	// 1. 멤버변수 선언
	JButton [][] b = new JButton[4][4];
	
	NumberGame(){	//생성자 함수
		// 2. 객체 생성
		// 3. 화면 구성
		setLayout(new GridLayout(4,4));
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				b[i][j] = new JButton(i + ":" + j);
				add(b[i][j]);
			}
		}
		
		//화면 출력
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	//일반 메서드 생성
	void showAnswer() {
		
		try {
			Thread.sleep(1000);	//1초가 멈추겠다
		} catch (InterruptedException e) {
		
		}	//try ~ catch문을 사용해서 예외처리
		
		for(int s=0; s<b.length; s++) {
			for(int k=0; k<b[s].length; k++) {
				b[s][k].setText(null);
			}
	
		}

	}

}
