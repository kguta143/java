package c_control;

public class Ex05_while연습 {

	public static void main(String[] args) {
		// 369게임
		
//		for(int i=1; i<=50; i++) {
//			int su = i;
//			boolean su369 = false;	//해당되지않으면 false 실행        boolean(참,거짓) 판별
//			
//			while( su != 0) {
//				int na = su % 10;
//				if(na==3 || na==6 || na==9) { 	/* 숫자가 3이거나 6이거나 9라면*/
//					System.out.print("짝");
//					su369 = true; 				//369안에 해당되야 true
//				}
//				su /= 10; 		//su = su / 10;
//			}
//			
//			if(su369) System.out.println();
//			else System.out.println(i);
//			// su369값?
//		}
		
		/* 도전문제] 구글입사문제	
		 * 문제가 어려운 것이 아니라 구글입사시험이라는 편견이 있었다.
		 *
		 * 문제  : 8의 숫자 세기(구글입사문제)
		 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
		 * 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다. 
		 * (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다) 
		 * 결과 : 4000 
		 */
		
		//for문
//		int cnt = 0;
//		for(int i=1; i<=10000; i++) {
//			if(i%10 == 8)  			cnt++;		
//			if((i/10)%10 == 8)		cnt++;
//			if((i/100)%10 == 8)		cnt++;
//			if((i/1000)%10 == 8)	cnt++;
//			}	
//			System.out.println("result: "+ cnt);
		
		//While문
		int cnt=0;
		
		for(int i=1; i<=10000; i++) {
			int su =i;
			boolean temp = true;
			
			while(temp) {
				if(su%10 ==8) cnt++;
				if(su<10) 
				temp = false;
				su/=10;
			}
		}
		System.out.println("result: "+cnt);
		
	}
}
