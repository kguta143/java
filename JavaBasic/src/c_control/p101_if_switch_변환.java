package c_control;

import java.util.Scanner;

public class p101_if_switch_변환 {

	public static void main(String[] args) {
		int rank;
		Scanner sc=new Scanner(System.in);
		System.out.println("1~3을 입력하세요.");
		rank = sc.nextInt();
		char medalColor;
//		
//		if(rank==1) {
//			medalColor = 'G';
//		}
//		else if(rank==2) {
//			medalColor='S';
//		}
//		else if(rank==3) {
//			medalColor='B';
//		}
//		else {
//			medalColor='A';
//		}
//		System.out.println(rank + "등급은" + medalColor + "입니다.");
		switch(rank) {
		case 1: medalColor = 'G'; break; // if-else문보다 switch-case문이 간결하고 가독성이 좋다.
		case 2: medalColor = 'S'; break;
		case 3: medalColor = 'B'; break;
		default : medalColor = 'A'; break;
		}
		System.out.println(rank+ "등급은" + medalColor + "입니다.");
	}

}
