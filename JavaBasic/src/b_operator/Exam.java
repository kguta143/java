package b_operator;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		//100점 만점의 학생 점수를 입력받아 80~90 사이라면 '평균'이라고 출력

		//(1) 학생점수 변수 선언
		int a = 0; // 정수형 변수 a에 0을 초기화
		//(2) Scanner 선언
		Scanner sc = new Scanner(System.in);
		//(3) 화면에 "점수 입력->" 문장 출력
		System.out.println("점수를 입력하세요");
		//(4) 입력값을 변수에 저장
		a = sc.nextInt();
		//(5) 입력값이 80보다 크고 90보다 작다면
		if(80 < a && a < 90){ // 80<a<90은 시스템이 입력받지 못하기 때문에 80<a 와 a<90으로 조건을 쪼개야 가능
		//(6) '평균' 출력  
			System.out.println("평균");
		}
		
	}

}
