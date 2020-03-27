package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_성적2 {

	public static void main(String[] args) {
		//입력할 학생수를 입력하세요. 4

		//4명의 국어, 영어, 수학 점수를 받아 결과 출력하기
		//1째 학생의 성적을 입력 -> 88/77/66
		//2째 학생의 성적을 입력 -> 50/40/70
		//3째 학생의 성적을 입력 -> 44/33/22
		//4째 학생의 성적을 입력 -> 55/50/70
		//우선은 각각의 점수만 출력하세요

		// 학생수를 입력받기

		Scanner sc= new Scanner(System.in);
		System.out.println("학생수를 입력하세요.");
		int a = sc.nextInt();
		sc.nextLine();
		// 점수를 저장할 변수(score)를 학생수만큼 선언
		int [][] score = new int[a][3];		//[a]:학생당 / [3]:과목3개씩

		//입력1 (0~a번째 학생까지의 성적을 입력받는다.)

//		for(int i=0; i<a; i++) {
//			System.out.println((i+1)+"번째 학생의 성적을 입력하세요.");
//			String temp = sc.nextLine();
//			StringTokenizer st = new StringTokenizer(temp,"/");
//			for(int j=0; st.hasMoreTokens(); j++) {
//				score[i][j]=Integer.parseInt(st.nextToken());
//			}
//		}
		
		//입력2 (각 과목의 성적을 입력받는다.)
		//1번째 과목 : 국어 / 2번째 과목 : 영어 / 3번째 과목 : 수학
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+"과목의 성적을입력하세요.");
			String temp = sc.nextLine();
			StringTokenizer st = new StringTokenizer(temp,"/");
			
			for(int j=0; st.hasMoreTokens(); j++) {
				score[j][i]=Integer.parseInt(st.nextToken());
			}
		}
		
		//총점,평균 출력1
		
//		int total[]= new int[a]; 
//		int avg[] = new int[a];
//		for(int i=0; i<a; i++) {
//			for(int j=0; j<3; j++) {
//				total[i] += score[i][j];
//				 avg[i] = total[i]/3;
//				
//			}
//		}
		
		//총점,평균 출력2
		int []total_a= new int[3];
		int []avg_a=new int[3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<a; j++) {
				total_a[i] += score[j][i];
				avg_a[i] = total_a[i]/4;
			}
		}
		
		
		//출력1
//		for(int i=0; i<a; i++) {	//score.length = a : 입력받은 학생의 수와 같다.
//			for(int j=0; j<3; j++) {//score[i].length
//				System.out.print(score[i][j]+" ");
//					
//			}
//			System.out.println();
//			System.out.print((i+1)+"번째 학생의 총점은 "+ total[i] + " 평균은 " + avg[i] + "입니다." );
//			System.out.println();	
//		}
		
		//출력2
		
		for(int j=0; j<3; j++) {
			for(int i=0; i<a; i++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
			System.out.print((j+1)+"번째 과목의 총점은 "+ total_a[j] + " 평균은 " + avg_a[j] + "입니다.");
			System.out.println();
		}




	}

}
