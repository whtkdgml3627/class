package chapter02;

public class Casting2 {

	public static void main(String[] args) {
		
		byte b = 10;
		int n = b;
		System.out.println("n = " + n);
		System.out.println("b = " + b);
		
		int n2 = 300;
		byte b2 = (byte)n2;
		System.out.println("n2 = " + n2);
		System.out.println("b2 = " + b2);
		
	}
	
}
