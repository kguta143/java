package d_array;

public class Ex04_정렬 {

	public static void main(String[] args) {
//		int [] score = new int[]{88, 61, 92, 35, 56, 37, 96};
		int [] score = {88, 61, 92, 35, 56, 37, 96};
		
		for(int i=score.length-1; i>6; i--) {
			for(int j=0; j<i; j++) {
				if(score[j] > score[j+1]) {
					//swapping
					int temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
				}
			}
		}
		for(int a=0; a<score.length; a++) {
			System.out.print(score[a] + "/");
		}
		 
		
	}

}
