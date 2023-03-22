package chapter03;

public class Operator14 {

	public static void main(String[] args) {
		
		short snum1 = 20;
		short snum2 = 30;
		
		snum1 += snum2; // snum1 = snum1 + snum2는 오류가 발생함 int + int로 더하기 때문에
		System.out.println(snum1);
		
		int num = 10;
		num += 5; // num = num + 5 -> num = 10 + 5;
		System.out.println(num);
		
		num -= 5; // num = num - 5 -> num = 15 - 5;
		System.out.println(num);
		
		num *= 2; // num = num * 2 -> num = 10 * 2;
		System.out.println(num);
		
		num /= 2; // num = num / 2 -> num = 20 / 2;
		System.out.println(num);
		
		num %= 3; // num = num % 3 -> num = 10 % 3;
		System.out.println(num);
		
	}

}
