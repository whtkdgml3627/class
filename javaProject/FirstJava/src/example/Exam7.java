package example;

public class Exam7 {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		
		while(cnt <= 100) {
			System.out.print(cnt++ + " ");
		}
		
		System.out.println();
		System.out.println("-------------");
		
		do {
			System.out.print(--cnt + " ");
		}while(cnt>1);
		
	}
	
}
