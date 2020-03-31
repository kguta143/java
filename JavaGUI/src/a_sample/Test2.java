package a_sample;

import java.awt.*;

// is-a 방식

public class Test2 extends Frame {
	// 멤버변수 선언	부모-자식간 상속을 하면 변수선언,객체선언 할 필요가 없다.
	Button b;
	
	public Test2() {
		super("나의 창2"); //super함수를 쓰면 부모의 기본생성자를 불러옴 대신 첫라인에 써야 된다.
		
		// 객체 생성
		b = new Button("OK2");
		
		// 붙이기
		add(b);
		
		// 화면 출력
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();
	}

}
