package example;

public class Exam13 {

	public static void main(String[] args) {

		for(int i = 2; i < 9; i*=2) {
//			System.out.println(i);
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "x" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
		
	}

}
