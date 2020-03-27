package d_array;

public class Ex05_Lotto2 {

	public static void main(String[] args) {
		//변수명은 lotto (배열)
		int [][] lotto= new int[5][6];	//숫자 6개 들어있는 것이 5개의 공간을 만들어진다
		//첫째 배열 줄 / 둘째 배열 칸 -> 이차원배열
		// 값대입 -> ## 동일숫자 배제 ##
		for(int i=0; i<lotto.length;i++) {
			//		for(int i=0; i<5; i++) {		//줄
			for(int j=0; j<lotto[i].length; j++) {	
				//			for(int j=0; j < 6; j++) {	//칸
				lotto[i][j]=(int)(Math.random()*45)+1;	//(int)(Math.random()*10)+1 1~10까지 임의의 숫자를 던져줌
			}
		}


		//정렬
		for(int k=0; k<lotto.length; k++) {
			for(int i=lotto[k].length-1; i>0; i--) {
				for(int j=0; j<i; j++) {
					if(lotto[k][j] > lotto[k][j+1]) {
						//swapping
						int temp=lotto[k][j];
						lotto[k][j]=lotto[k][j+1];
						lotto[k][j+1]=temp;
					}
				}
			}
		}
	

		//출력
		for(int i=0; i<5; i++) {
			for(int j=0; j<6; j++) {
				System.out.print(lotto[i][j]+"/");
			}	
			System.out.println();
		}
	}

}
