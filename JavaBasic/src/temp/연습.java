package temp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 연습 {

	public static void main(String[] args) {
		//구구단 단순 출력
		//		int a,b;
		//		for(a=2; a<10; a++) {
		//			for(b=1; b<10; b++) {
		//				System.out.print(a+"*"+b+"="+a*b+" ");
		//			}
		//			System.out.println();
		//		}


		//1~100까지의 숫자 중 3의 배수만 출력
		//		int i=0;
		//		for(i=1;i<=100; i++) {
		//			if(i%3 == 0) 
		//				continue;
		//		}
		//		System.out.println("result:"+ i);

		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("숫자를 입력하세요.");
		//		int a = sc.nextInt();
		//		int b = sc.nextInt();
		//		int c = sc.nextInt();
		//
		//		for(int j=1; j<10; j++) {
		//			System.out.print(a+"*"+j+"="+a*j+" ");
		//		}
		//		System.out.println();
		//		for(int s=1; s<10; s++) {
		//			System.out.print(b+"*"+s+"="+b*s+" ");
		//		}
		//		System.out.println();
		//		for(int m=1; m<10; m++) {
		//			System.out.print(c+"*"+m+"="+c*m+" ");
		//		}

		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("개수를 입력하세요");
		//		int a = sc.nextInt();
		//		
		//		int [] su = new int[a];
		//		System.out.println("숫자를 입력하세요");
		//		for(int i=0; i<a; i++) {
		//			//su[i]라는 배열에  숫자를 입력받아 저장한다	
		//			su[i]=sc.nextInt();
		////			System.out.print(su[i]);
		//			System.out.println();
		//			
		//			for(int j=1; j<20; j++) {
		//				System.out.print(su[i]+"*"+j+"="+su[i]*j+" ");
		//			}
		//		}
		//		System.out.println();

		/*1. 한 변의길이 n에 정수값 입력받기
		 * 
		 */

		//			Scanner sc = new Scanner(System.in);
		//			System.out.println("n의 값을 입력하세요.");
		//			int a = sc.nextInt();
		//			
		//			for(int i=1; i<=a; i++) {				
		//				for(int j=0; j<a; j++) {			
		//					System.out.print(i+j*a+" ");
		//				}
		//				System.out.println();
		//			}

		//		  Scanner sc = new Scanner(System.in);	//입력받을 가상의 통로를 만든다.
		//		  System.out.println("높이n과 너비m의 값을 공백으로 구분하여 입력하세요.");	
		//		  int n = sc.nextInt();	//n의 입력값
		//		  int m = sc.nextInt(); //m의 입력값
		//		  
		//		  for(int i=0; i<n; i++) {	//줄의 출력
		//			  if(i%2 == 0) {	//짝수일때
		//				  for(int j =1; j<=m; j++) {	//j가 1부터 m보다 작거나 같을 때 j를 증가시킨다.
		//					  System.out.print(j+i*m + " ");	//짝수값의 출력
		//				  }
		//			  }
		//			  else {
		//				  for(int s=(i+1)*m; s>(i+1)*m-5; s--) {
		//					  System.out.print(s+ " ");
		//				  }
		//			  }
		//				  
		//			  System.out.println();
		//			   
		//		  }

		/*입력할 학생수를 입력하세요. 4

		4명의 국어, 영어, 수학 점수를 받아 결과 출력하기

		1째 학생의 성적을 입력 -> 88/77/66
		2째 학생의 성적을 입력 -> 50/40/70
		3째 학생의 성적을 입력 -> 44/33/22
		4째 학생의 성적을 입력 -> 55/50/70

		우선은 각각의 점수만 출력하세요

		------------------------------------------

		[결과]
		1째 학생의 총점 xxx 이고 평균은 ooo 입니다
		2째 학생의 총점 xxx 이고 평균은 ooo 입니다
		3째 학생의 총점 xxx 이고 평균은 ooo 입니다
		4째 학생의 총점 xxx 이고 평균은 ooo 입니다
		 */

		//입력받을 곳 지정
		Scanner sc = new Scanner(System.in);	//sc라는 가상의 통로를 만든다.
		System.out.println("학생수를 입력하세요.");	//sc에 학생수를 입력한다.
		int a = sc.nextInt();		//정수형 변수 a에 학생수를 입력받아 저장한다.
		//점수를 저장할 변수 선언
		int[][] score = new int[a][3];	// 1.[]은 행을 나타내고 2.[] 열을 나타낸다.
		sc.nextLine();
		//입력
		for(int i=0; i<a; i++) {
			System.out.println((i+1)+"번째 학생의 성적을 입력하세요.");
				String temp = sc.nextLine();
				StringTokenizer st = new StringTokenizer(temp,"/");
				for(int j=0; st.hasMoreTokens(); j++) {
					score[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		//출력(총점 , 평균)
		int total[]=new int[a];	//총점
		int avg[]=new int[a];	//평균
		for(int i=0; i<a; i++) {
			for(int j=0; j<3; j++) {
				total[i] += score[i][j];
				avg[i] = total[i]/3;
			}
			System.out.println();
			System.out.print((i+1)+"번째 학생의 총점은 "+ total[i]+ " 평균은 "+ avg[i] + "입니다.");
			
		}
		
	}
	

}
