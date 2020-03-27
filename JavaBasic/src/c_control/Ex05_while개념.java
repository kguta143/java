package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_while개념 {

	public static void main(String[] args) {

		// 1~10까지의 합을 출력
		//		int hap=0;
		//		int i=1; //초깃값 for문 전으로 뺌
		//		//for( ; i<11; ) {
		//		while(i<11) { //조건문으로만 반복하고 싶으면 while문
		//			hap += i; //hap = hap + i;
		//			i++; //증가치는 반복문 안으로 빼도 무방
		//			}
		//			System.out.println("1~10까지의 합:" + hap);

		// 숫자 하나 입력받기 => 구구단 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int A = sc.nextInt();
//		//for(int i=1; i<=9; i++) { //while문 변경
//		int i=1;
//		while(i<=9) {
//			System.out.printf("%d * %d = %d \n", A, i, A*i);
//			i++;
//		}
		
		// 문장을 입력받아 단어로 나눠서 출력
		// "빨리 코로나가 끝났으면 좋겠습니다"
		//	ex. 90 80 70 60
		
//		Scanner sc = new Scanner(System.in);
////		System.out.println("문자열을 입력해주세요.");
//		System.out.println("점수를 입력해주세요(ex. 90/80/70/60)");
//		String line = sc.nextLine();
//		StringTokenizer st = new StringTokenizer(line,"/");
//		while(st.hasMoreTokens()) { //토큰이 남아있으면 True 다음 토큰이 없으면 False가 되므르 반복문을 벗어난다.
//			 String temp = st.nextToken();
//			 int su = Integer.parseInt(temp); //String -> int 형 변환
//			 System.out.println(++su);
//		}
		
		/*문제 2)
 		정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
 		입력
 		10 20 30 55 66 77 88 99 100 15
 		11출력
 		짝수 : 6개
 		홀수 : 4개
		*/
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		String line = sc.nextLine(); //입력받은 문자를 저장
//		StringTokenizer st = new StringTokenizer(line); //st란 통로에 line이란 변수를 저장하여 단어열을 떼어내서 st에 저장한다.
//		int odd=0, even=0; //정수형 변수 odd와 even에 초기값0을 선언
//		while(st.hasMoreTokens()) { //뒤에 토큰이 있으면 True / 없으면 False
//			String temp = st.nextToken(); //토큰을 반복될 때마다 temp에 저장한다.
//			int su = Integer.parseInt(temp); // String형 -> 정수형으로 형변환
//	
//			if(su%2==1) {	//저장된 값 su를 2로 나누었을 때 1이 남으면 홀수
//				odd++; //홀수 값을 1증가한다
//				
//			}else {			//그렇지 않으면 짝수값으로 인식하여 짝수값에  1만큼 증가한다.
//				even++;
//				
//			}
//	
//		}
//		System.out.println("홀수" + odd);
//		System.out.println("짝수" + even);
		
		/*문제 4) 369게임
 		1부터 50까지 숫자 중에서 3.6.9 게임처럼
 		3, 6, 9 숫자를 포함하면  그 갯수만큼 "짝" 글자를 출력하고
 		그렇지 않으면 그 숫자를 출력한다.
		*/
//		for(int i=1; i<=50; i++) {
//		int su = i;
//		boolean su369 = false;	//해당되지않으면 false 실행        boolean(참,거짓) 판별
//		
//		while( su != 0) {
//			int na = su % 10;
//			if(na==3 || na==6 || na==9) { 	/* 숫자가 3이거나 6이거나 9라면*/
//				System.out.print("짝");
//				su369 = true; 				//369안에 해당되야 true
//			}
//			su /= 10; 		//su = su / 10;
//		}
//		
//		if(su369) System.out.println();
//		else System.out.println(i);
//		// su369값?
//	 }
	}
}
