package example;

public class Exam14 {

	public static void main(String[] args) {
		
//		10A+B + 10B+A = 99 -> 11A + 11B = 99 -> A + B = 9 -> B = 9 - A
		
		for(int i = 0; i < 10; i++) {
			int a = i;
			int b = 9-a;
			
			System.out.println("A: "+ a +", B: "+ b);
		}
	}

}
