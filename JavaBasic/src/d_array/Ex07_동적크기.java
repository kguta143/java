package d_array;

public class Ex07_동적크기 {

	public static void main(String[] args) {

		// 변수명 star 문자 하나 들어가는 공간 char 이차원 배열로 5x5

		//		char [][] star = new char[5][5];
				char [][] star = new char[5][];
				
				//입력 각각의 칸에 *을 지정하여 5행5열이 나오게 하기
				
				for(int i=0; i<star.length; i++) {			//행
					
					star[i]=new char[i+1];		//star[i]라는 배열에 새로운 객체 new char를 생성해서 대입한다.
												//star[0]~[5]에 각각 새로운 객체 new char[i+1] 메모리를 생성하여 대입한다. 
					for(int j=0; j<i+1; j++) {				//열
						star[i][j]='*';
					}
				}
				
				//출력
				for(int i=0; i<star.length; i++) {
					for(int j=0; j<star[i].length; j++) {
						System.out.print(star[i][j]+ " ");
					}
					System.out.println();
				}


	
		
	}

}
