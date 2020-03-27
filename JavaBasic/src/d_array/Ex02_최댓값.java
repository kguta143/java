package d_array;

public class Ex02_최댓값 {

	public static void main(String[] args) {
//		int [] score = new int[]{88, 61, 92, 35, 56, 37, 96};
		int [] score = {88, 61, 92, 35, 56, 37, 96};	//new 생략이 가능하다 (배열 초기화시)
		//가장 큰 값을 구하고싶다?
			//max 변수 선언
			//반복문(for) - 배열의 갯수 만큼
				//score의 i번째값과 max 비교
				//if문- max값이 더 작다면 max에 저장
//			//1.최댓값 max 출력
//		int max = score[0];
//		for(int i=1; i<score.length; i++) { //score.length 문자 배열에 있는 변수의 갯수 (배열크기)
//			 if(max < score[i]) {
//				 max = score[i];
//			 }
//				 
//		}
//		System.out.println("최댓값:" + max);
		
		//2.최소값 구하기
		int min=score[0];
		for(int i=1; i<score.length; i++) {
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최소값:" + min);

	}
}
/*변수 max를 만든다.
 *1.이 변수에 배열의 첫번째 값을 입력한다.
 *2.이 값이 가장 크다고 가정하고 다음번 방에 있는 데이타와 비교를 한다.
 *3.이 변수에 저장된 값보다 큰 값이 들어오면 더 큰 값으로 바꿔치기를 한다.
 *4.이 과정(2-3단계)을 배열이 끝날때 까지 반복하면 된다.
 */