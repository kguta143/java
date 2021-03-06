package b_encapsulation;

/******* 캡슐화  
 
B.	private / public 	-> private 멤버 변수 만든 후 main 에서 에러 확인
							-> public 멤버 메소드를 만들지 않아도 에러는 발생하진 않지만 명확하게 public 지정
 private :  다른 클래스에서의 접근 차단
 public : 모든 클래스에서의 접근 허용							
C.	setter / getter
D.	 this 
		

 */
public class Student {
	// 1. 멤버변수는 private / 멤버 메소드는 public
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	//멤버 함수 (member method/member fuction)
	public int calTotal()		{  
		total = kor + eng + math;  
		return total;
	}
	public double calAverage() 	{  
		avg = (double)total / 3;   
		return avg;
	}
	// 2. 필요한 것만 SETTER / GETTER 만든다
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;// 인자의  변수 이름이 멤버 변수 이름과 같을 때 this.name 을 하면 멤버변수 name을 부름
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	
	
	
	
}
