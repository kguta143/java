package c_control;

public class Ex04_for개념 {

	public static void main(String[] args) {
		/*
		 	for( 초기치; 조건식; 증가치 ) {
	  			반복구문
			}
		 */
		
		// 0. 인사말 5번 출력하기
		/*
		 * for( int i=0; i<5; i++) {
			System.out.println("안녕하세요");
		}
		 */
		
		//1. 1~100까지의 합을 구하기
//		int hap = 0; // 정수형변수 hap을 선언하여 0값으로 초기화
//		for(int i =1; i<=100; i++) { // int i=1; 첫번째 수행/ i<=10; 두번째수행 / i++ 네번째 수행
//			hap += i; //hap = hap + i;
//		}
//		System.out.println("1~10까지의 합 =" + hap); //세번째 실행
//		
		//2. 1~100까지 홀수의 합과 짝수의 합 구하기
//		int even=0, odd=0;
//		for(int i=1; i<=100; i++) {
//			if(i%2==1) {
//				odd += i; // odd = odd + i;
//			}
//			else {
//				even += i; // even = even + i;
//			}
//			//숫자 i가 홀수라면 odd의 합 구하기
//			//그렇지 않다면 even의 합 구하기
//		}
//		System.out.println("짝수의 합=" + even);
//		System.out.println("홀수의 합=" + odd);
		
		//3. A~Z까지 출력
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
		System.out.println(); //줄바뀜 대행
		
		//4. A~Z까지 출력(2개씩 건너뛰기
		for(char ch='A'; ch<='Z'; ch+=2) {
			System.out.print(ch);
		}
		System.out.println();
		
		//5. Z~A까지 출력
		for(char ch='Z'; ch>='A'; ch-=1) {
			System.out.print(ch);
		}
		
		
		
	}

}
