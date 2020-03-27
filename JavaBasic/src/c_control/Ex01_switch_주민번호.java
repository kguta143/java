package c_control;

public class Ex01_switch_주민번호 {

	public static void main(String[] args) {
		
		String id = "200316-4034567"; //23을가지고 출신지 결정
		char chul = id.charAt(8); // chul에는 문자'2'가 들어감
		String home = "";
		
		switch(chul) {
		default : home = "한국인"; break; //default 위치가 밑에만 있지않기 때문에 break;를 써야됨
		case '0' : home = "서울"; break; //break;로 끝을 맺어야 선택된 숫자에 대한 결과값이 출력됨. 
		case '1' : home = "인천/부산"; break;
		case '2' : home = "경기도"; break;
		}
		System.out.println("출신지-" + home);
	}

}
