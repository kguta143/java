package c_control;

import java.util.Scanner;

public class Ex04_for연습 {

	public static void main(String[] args) {
	//문제1] 1~N까지의 숫자를 다음처럼 출력하라
	
//	for(int i=1; i<=15; i++) {	
//		if(i%5==0) {
//			
//		System.out.println(i);
//	}else {
//		System.out.print(i+" ");
//	}
//	
//		Scanner sc = new Scanner(System.in);//입력받는 가상통로
//		System.out.println("받고 싶은 숫자를 입력하세요.");
//		int a = sc.nextInt(); //숫자 입력받아서 a에 저장
//		
//		for(int i=1; i<=a; i++) {//입력받은 a값만큼 반복
//			if(i%5==0) { //5의배수만큼
//				System.out.println(i); //(i+"\t"); 한탭식 띄어쓰기
//			}else {
//				System.out.print(i+" ");
//			}
//		}
     
		//문제2] 문자열처리하기
		//문자N(a~z,A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 N이 대문자면
		//문자 N부터 Z까지 출력하라
		//그밖의 문자가 입력되면 Error를 출력하라
		//입력  출력
		//f       abcdef
		//X       XYZ
		//6       Error
		

//    	-문자하나 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자를 입력하세요");
//		char N = sc.nextLine().charAt(0); //"A" nextLine 문자열 charAt(0)
//
////		-입력한 문자가 대문자라면
//		if('A'<= N && N<='Z') {
//			for(char ch=N; ch<='Z'; ch++) {
//				System.out.print(ch);
//			}
//		}
////		-그렇지 않고 입력한 문자가 소문자라면
//		else if('a'<= N && N<='z') {
//			for(char ch='a'; ch<=N; ch++) {
//				System.out.print(ch);
//			}
//		}
////		-그외라면 Error		
//		else {
//			System.out.println("Error");
//		}
//		
		//문제3]입력받은 문자열을 뒤집어서 출력하세요
		//예]  입력     출력
		//		  
		//	  안녕 친구   구친 녕안
		// CarpeDiem   meiDepraC
		//	     
		//[힌트] 문자열의 길이 구할 때   length() 이용
//		Scanner input =new Scanner(System.in);
//		System.out.println("문자열을 입력해 주세요");
//		//입력받은 문자열 저장 변수
//		String line=input.nextLine();//입력받는 문자열을 저장 
//		
//		int l_line= line.length();//문자열의 길이 입력 변수( length->문자갯수 )
//		System.out.println(l_line);
//		for(int i=l_line; i>0; i--) {
//		System.out.print(line.charAt(i-1));
//	   }
		
		//도전문제]
		//자연수n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오
		//10미만의 홀수만 출력하시오. 주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//		int n=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자를 입력하세요.");
//		n = sc.nextInt();
//		
//		if(n%2 == 1) {
//			for(int i = 1; i<10; i+=2) {
//				System.out.print(i + " ");
//			}
//		}

	 }
   }
 



