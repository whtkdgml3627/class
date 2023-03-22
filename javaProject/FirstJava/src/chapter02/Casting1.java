package chapter02;

public class Casting1 {

	public static void main(String[] args) {
		
		double d = 100.0;
		System.out.println("d = " + d);
		
		int n = 100;
		System.out.println("n = " + n);
		
		int result = n + (int)d;
		int result2 = (int)(n + d);
		System.out.println("\nd = " + d);
		System.out.println("n = " + n);
		System.out.println("result = " + result);
		System.out.println("result2 = " + result2);
		
	}

}
