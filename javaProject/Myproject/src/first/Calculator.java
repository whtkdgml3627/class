package first;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

//		console에서 입력할 키보드값 입력값 선언
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 둘레를 구할 반지름을 입력하세요.");
		long circleRadius = sc.nextLong();
		System.out.println(cal1(circleRadius));
		
		sc.close();
	}

//	원의 둘레
	static double cal1(double r) {
//		2 x π x r
		return 2 * Math.PI * r;
	}

//	원의 넓이
	static double cal2(double r) {
//		π x r x r
		return Math.PI * r * r;
	}
}
