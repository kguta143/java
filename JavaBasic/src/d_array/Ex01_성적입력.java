package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 	학생 점수를 입력받아 평균과 총점을 출력하시오.
 * 
 * 	입력형식 : 80/88/77
 * 	출력형식 : 
 * 			총점:xxxxx
 * 			평균:xxxxx
 */
public class Ex01_성적입력 {
	
	public static void main(String[] args) {
		//1.입력받아 score 변수에 저장
		//2.총점구하기
		//3.총점과 평균 출력
		int []score = new int[3]; 	// 변수를 선언하고 3개의 개체를 생성한다.
		Scanner sc = new Scanner(System.in);	//sc라는 가상의 통로를 만들어서
		System.out.println("성적을 입력하세요.(80/88/77)");	//(80/88/77)이라는 형태로 문자열로 입력받겠다.
		String temp = sc.nextLine();	//가상통로에서  입력 받은 문자열을 temp라는 문자열에 저장한다.
		StringTokenizer st = new StringTokenizer(temp,"/"); // 토큰값을 저장한 st라는 통로에 "/"를 기준으로 temp라는 문자열을 나누겠다.
		for(int i=0; st.hasMoreTokens(); i++) { //st.hasMoreTokens : st라는 통로에 다음 토큰이 있는지 확인
			String token = st.nextToken();		//토큰값을 빼서 문자열 token에 저장한다.
			score[i]=Integer.parseInt(token);	//Integer : 문자열을 정수로 형변환해서 배열 score[i]라는 값에 저장한다
		}

//		int total=0;
//		for(int i=0; i<3; i++) {
//			total += score[i];
//		}
//		System.out.println("총점:" + total);
//		
//		int avg=0;
//		for(int j=0; j<3; j++) {
//			avg = total/3;
//		}
//		System.out.println("평균:" + avg);

		int total=0, avg=0;
		for(int i=0; i<3; i++) {
			total += score[i];
			avg = total/3;
		}
		System.out.println("총점은:" + total);
		System.out.println("평균은:" + avg);
	}
	
}
