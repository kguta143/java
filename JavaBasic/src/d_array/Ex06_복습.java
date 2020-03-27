package d_array;

public class Ex06_복습 {

	public static void main(String[] args) {
		
		//1.3x4의 char형 배열 ch선언하기
		
			char [][] ch = new char[3][4];
			//첫번째 [] = 행을 나타냄	/ 두번째 [] = 열을 나타냄
			
		//2.값 입력	
//			for(int i=0; i<ch.length; i++) {	//~.length = ~의 길이
//				for(int j=0; j<ch[i].length; j++){
//					ch[i][j] = 'Z';
//				}	
//			}
			char al='A';	//문자형 al을 선언하고 'A'를 초기값으로 지정
			for(int i=0; i<ch.length; i++) { //첫배열값은 행이 몇번  반복하는지 나타냄
				for(int j=0; j<ch[i].length; j++){	//두번째 배열은 열이 나오는 수를 반복
					ch[i][j] = al;	//char형 이중배열에 al을 대입한다
					al++;	//한번 반복할때마다 al을 1만큼 증가시킨다.
				}	
			}
		
			//3.출력
			for(int i=0; i<ch.length; i++) {
				for(int j=0; j<ch[i].length; j++) {
					System.out.print(ch[i][j]+" ");
				}
				System.out.println();
			}
			
	}

}
