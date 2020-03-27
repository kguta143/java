package d_array;

public class Ex05_Lotto {

	public static void main(String[] args) {
		//변수명은 lotto
		int [] lotto= new int[6];
		// 값대입 -> ## 동일숫자 배제 ##
		for(int j=0; j < 6; j++) {
//			lotto[j]=(int)(Math.random()*45)+1;	//(int)(Math.random()*10)+1 1~10까지 임의의 숫자를 던져줌
			int temp=(int)(Math.random()*45)+1;
			//비교대상찾기
			boolean check = false;
			for(int k=0; k<j; k++) {
				if(lotto[k] == lotto[j]) {
					check = true;
					break;
				}
			}
			if(check) {
				lotto[j]=temp;
			}
		}
	
		
		//정렬
		for(int i=lotto.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(lotto[j] > lotto[j+1]) {
					//swapping
					int temp=lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=temp;
				}
			}
		}
		
		//출력
		for(int j=0; j<6; j++) {
			System.out.print(lotto[j]+"/");
		}
		
	}

}
