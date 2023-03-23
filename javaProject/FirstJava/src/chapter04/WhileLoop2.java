package chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		int num = 1;
		
		while(num < 10) {
//			System.out.println("2 x " + num++ + " = " + 2*num);
//			num++;
			int num2 = 2;
			while(num2 < 10) {
				System.out.print(num2 + " x " + num + " = " + num*num2 + "\t");
				num2++;
			}
			num++;
			System.out.println();
		}
		
	}

}
