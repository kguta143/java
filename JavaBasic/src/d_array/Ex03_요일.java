package d_array;

import java.util.Calendar;

public class Ex03_요일 {

	public static void main(String[] args) {
		//날짜 구하기
		Calendar cal = Calendar.getInstance();	//~얻어올때 get을 씀
		int y = cal.get(Calendar.YEAR);	
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DATE);
		System.out.println(y + "년" + (m+1) + "월" + d +"일");
		
		//시,분,초 출력
		int h = cal.get(Calendar.HOUR);	
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println(h + "시" + mi + "분" + s +"초");
	
		//요일 : 일요일(1)~토요일(7)
		String[] yoil = {"일","월","화","수","목","금","토"};
		System.out.println(yoil[cal.get((int)Calendar.DAY_OF_WEEK)-1] +"요일");	//문자를 정수형으로 형변환하여 -1을 해준다
		
	}

}
