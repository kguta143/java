package d_array;

public class Ex01_성적 {

	public static void main(String[] args) {
//		int [] kor;
//		kor = new int[5];
//		int[]kor = new int[5];	//배열메모리 확보 및 변수 선언
//		kor[0]=90;
//		kor[1]=88;
//		kor[2]=89;
//		kor[3]=70;
//		kor[4]=77;
//		kor[5]=99;
		
		//배열 초기화
//		int []kor= new int[] {90, 88, 89, 70, 77}; //배열초기화의 기본형
		int []kor= {90, 88, 89, 70, 77}; // new int[]를 생략해도 초기화 할 수 있다.
		
		int total = 0;
		for(int i=0; i< kor.length; i++) {
			//총점구하기
			//total = kor[0]+kor[1]+kor[2]+ ~~~~
//			System.out.println(kor[i]);
			total += kor[i];
			
		}
		System.out.println("총점:"+ total);
	}

}
