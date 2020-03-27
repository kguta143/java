package c_control;

import java.util.Scanner;

public class Ex02_if_학번 {

	public static void main(String[] args) {
		//학번 10자리
		Scanner x = new Scanner(System.in); //객체 생성, Scanner 를 사용할 때  그 기능을 사용하기 위해 java.util 패키지에 있는 Scanner 클래스를 불러와야함
		System.out.println("입력하시오"); 
		String id = x.nextLine(); //nextLine(); 메소드에 입력받은 후 id에 대입
		//입학년도
		String year = id.substring(0, 4); // 학번은 10자리 이며  substring을 사용하여 입력받는 자리를 지정 start부터 end 앞까지
		System.out.print("입학년도:" + year); // 2017111001 (0, 4)는  20171까지이며 substring을 사용하면 2017까지 출력함
		//학과번호(1 :공대, 2: 사회학)
		char cn = id.charAt(4); // 4번자리의 번호는 학과를 표시함
		String major = id.substring(5,7);
		String major2 = "";
		if(cn == '1') {
			System.out.print("\n단과대학 : 공대 ");
			if(major.equals("11")) {
				System.out.print("컴퓨터학과");
			}else if(major.equals("12")) {
				System.out.print("소프트웨어학과");
			}else if(major.equals("13")) {
				System.out.print("모바일학과");
			}else if(major.equals("22")) {
				System.out.print("자바학과 ");
			}else if(major.equals("33")) {
				System.out.print("서버학과 ");
			}		
		}else if(cn == '2') {
			System.out.print("\n단과대학 : 사회대 ");
			if(major.equals("11")) {
				System.out.print("사회학과 ");
			}else if(major.equals("12")) {
				System.out.print("경양학과 ");
			}else if(major.equals("13")) {
				System.out.print("경제학과 ");
			}
			System.out.println(id + "번 학생은" + year +"년에 입학 했습니다.");
		}
//		String hakbun = "2017111123";
//		
//		String year = hakbun.substring(0, 4); //0부터 4전의 것까지 -2017
//		char daehak = hakbun.charAt(4);
//		String colleage = " ";
//		
//		//학과구하기
//		String 학과번호 = hakbun.substring(5, 7); // 문자열"11"
//		String 학과명 = "";
//		
////		if( daehak == '1') {
//			colleage = "공대";
//			switch(학과번호) {
//			
//			case "11" : 학과명 = "컴퓨터학과"; break;
//			case "12" : 학과명 = "소프트웨어학과"; break;	
//			case "13" : 학과명 = "모바일학과"; break;
//			case "22" : 학과명 = "자바학과"; break;
//			case "33" : 학과명 = "서버학과"; break;	
//			
//			}		
////			if(학과번호.equals("11")) {
////				학과명 = "컴퓨터학과";
////			}
////		}else if ( daehak == '2') {
//			colleage = "사회대";
//			switch(학과번호) {
//			
//			case "11" : 학과명 = "사회학과"; break;
//			case "12" : 학과명 = "경영학과"; break;	
//			case "13" : 학과명 = "경제학과"; break;
//			}		
////			if(학과번호.equals("11")) {
////				학과명 = "사회학과";
////			}
//			System.out.println(hakbun + "번 학생은 " + year +"년에 입학 " + colleage);
//		
	
		}		
	}	
