package c_control;

import java.util.Scanner;

public class Ex00_연습문제 {

	public static void main(String[] args) {
		//세 정수 A,B,C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
		//입력 첫째 줄에 세 정수 A,B,C가 공백으로 구분되어 주어진다.
		//출력 두 번째로 큰 정수를 출력한다.
		//a,b,c중  a가 중간값이 되면 b,c는 최소 최대가 되고 b가 중간값이면 a,c는 최소 최대가 된다.
		//입력값과 출력값이 나와있으므로  a,b,c중 두 값이 중간값이 나오면 나머지@가 나옴
		int A=0, B=0, C=0, result=0; //정수형 변수 A,B,C,result를 선언하여 0을 초기화
		
		Scanner input = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("세 정수값을 공백으로 구분하여 입력하세요.");
		 A= input.nextInt(); //nextInt 메소드로 입력받은 후 A 변수에 대입
		 B= input.nextInt(); //nextInt 메소드로 입력받은 후 B 변수에 대입
		 C= input.nextInt(); //nextInt 메소드로 입력받은 후 C 변수에 대입
		
//		if (B<=A && A<=C || C<=A && A<=B) { // a가 두번째로 크다고 가정
//			result = A;
//			} else if (A<=B && B<=C || C<=B && B<=A) { // b가 두번째로 크다고 가정
//			result = B;
//			} else result = C;
//		System.out.println("두 번째로 큰 정수는 " + result + "입니다.");
		
		 if(A>=B && A<=C || A>=C && A<=B) { //A를 중간값으로 가정
			result=A;   // c>a>b || b>a>c 
		}else if(B>=A && B<=C || B>=C && B<=A) {//B를 중간값으로 가정
			result=B;   // c>b>a || a>b>c
		}else result=C; // 나머지는 C
		System.out.println("두 번째로 큰 정수는" + result + "입니다.");
		//출력값은 각 입력결과에 따라 두 번째로 큰 정수가 된다.			  
	}	
}
		//1.입력 20 30 10 출력 20
		//2.입력 30 30 10 출력 30
		//3.입력 40 40 40 출력 40
		//4.입력 20 10 10 출력 10	
		
	


