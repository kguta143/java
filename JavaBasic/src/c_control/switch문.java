package c_control;

public class switch문 {

	public static void main(String[] args) {
		//카페[복습]switch문제
		int i = 1, j = 0;
		switch(i) {
		case 2 : j += 6; break; //break;가 걸리면 그 해당값의 출력을 뽑아냄
		case 4: j += 1; break;
		default : j += 2;
		case 0 : j += 4; break;
		}
		System.out.println(j);
	}

}
