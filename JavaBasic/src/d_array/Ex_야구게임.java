package d_array;

import java.util.Scanner;

public class Ex_야구게임 {

	public static void main(String[] args) {
		int[]baseball=new int[3];	//배열 baseball에 임의 숫자 3개를 저장한다.
		int[]answer = new int[3];	//배열answer에 임의 숫자 3개를 저장한다.
		
		int strike=0, ball=0;		//정수형 변수 strike와 ball에 0으로 초기화시킨다.
		
		//1.임의의 수를 3개를 baseball배열에 저장
		//	중복수 배제(###)
		for(int i=0;i<baseball.length;i++) {		//i=0일때 i가 0~ baseball의 배열 길이만큼 반복해라.(기존에 주어진 길이 3개)	 
													//컴퓨터에 3개의 숫자를 입력해야함(3번 반복) = 배열 baseball의 길이(3)만큼 반복
	         baseball[i]=(int)(Math.random()*10);	//baseball[0]~[2] 배열에 0~9까지 정수형으로 랜덤 숫자를 저장한다.
	         if(i != 0) {				//baseball[i]와 그 이전 숫자를 비교하는데 i=0일때 baseball[0]의 이전 숫자가 없으니 0이 아닐때 비교 해야한다.
	        	 						//baseball[i]와 이전 숫자를 비교해서 중복 되면 다시 숫자를 랜덤으로 저장하고 중복되지 않으면 통과~
	        	 boolean compare=true;	//while은 true일 때 반복되니, 반복을 위해 먼저 true로 잡아주고, 나오고 싶을 때 false를 저장해 준다.
	            while(compare) {		
	               if(baseball[i]==baseball[i-1]) {
	                  baseball[i]=(int)(Math.random()*10);	//다시 랜덤으로 설정
	               }else {
	                  compare=false; //중복되지 않으면 while 반복문을 탈출한다.
	               }
	            }
	         }
	         System.out.print(baseball[i]+ " ") ; //컴퓨터 입력 숫자를 알기 위해 출력해본다.
	      }
	       System.out.println(); //컴퓨터 결과 값 보고 뛰어쓰기 한번 하기 위해 (줄바꿈)
	      
	       for(int k=0; k<5; k++) {		//k가 0부터 시작해서 5보다 작을때 1만큼 증가시킨다. (5번 반복해라)
	    	  strike = 0; ball=0;		//5번 반복하는 중에 strike와 ball값이 계속해서 증가하기 때문에 한번 실행할 때 마다 strike와 ball을 0으로 초기화시킨다.	
	    		  
		//2.사용자 입력값 받아서 answer에 각각의 숫자를 저장
		Scanner sc = new Scanner(System.in);	//sc라는 가상의 통로를 만들어서
		System.out.print("숫자를 입력하세요");		//정수형 숫자를 입력한다.
		for(int i=0; i<3; i++) {				//3번 반복해라.
			answer[i]=sc.nextInt();				//answer에 0~2 3개를 숫자로 입력받고싶어서
			
		}
				
		//3. 값비교	
		for(int i=0; i<3; i++) {		//각 배열baseball 값에 answer의 값 3개를  비교한다.
			for(int j=0; j<3; j++) {	
				if(baseball[i] == answer[j]) {	//같은 값을 찾음
					if( i == j) { //baseball[i]와 answer[j]이 같다면
						strike++; //strike를 1만큼 증가시킨다.
					}else {		//그렇지않으면
						ball++; 	//ball을 1만큼 증가시킨다.
					}
				}
				
			}//end for-j
			
		}//end for-i
		
		//4. Strike와 ball 출력
		
		System.out.println("Strike : " + strike + " / ball : " + ball);	//strike와 ball의 결과값을 출력한다.
		if(strike == 3) break; //strike가 3번이라면 가장 가까운 반복문을 벗어나라
	     
	       }   
	       System.out.println("정답입니다~");	//결과 도출
	}
}
	


