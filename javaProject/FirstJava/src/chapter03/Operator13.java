package chapter03;

public class Operator13 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		boolean result = false;
		
		result = (num1 += 10) < 0 && (num2+=10) > 0; // num += 10 -> num1 = num1 + 10;
		System.out.println(result);
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		System.out.println();
		
		result = (num1 += 10) > 0 || (num2 += 10) > 0;
		System.out.println(result);
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
	}

}
