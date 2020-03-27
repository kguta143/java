package temp;

public class Test {

	public static void main(String [] args) {
//		// 1 부터 3까지 출력
//		for(int i=1; i<4; i++) { //i<=3으로 써도 무방
//			System.out.println(i);
//		}
//		
		// 3행 2열 행렬을 가상하고 번호붙이기
		for(int i=0; i<=2; i++) { 		//줄반복(행)
			for(int j=0; j<2; j++) {	//열반복
				System.out.printf("<%d, %d>",i,j); //좌표값
			}
			System.out.println();
		}
		
	}
}