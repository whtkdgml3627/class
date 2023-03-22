package chapter03;
/* console에서 입력 할 수 있는 자바 라이브러리 */
import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		
//		console에서 입력할 키보드값 입력값 선언
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		더하기 출력
		System.out.println("더하기 : " + sum(num1,num2));
//		빼기 출력
		System.out.println("빼기 : " + minus(num1,num2));
//		곱하기 출력
		System.out.println("곱하기 : " + multiple(num1,num2));
//		나누기 출력
		System.out.println("나누기 : " + divide(num1,num2));
//		원의 둘레 출력
		System.out.println("원의 둘레를 구할 반지름을 입력하세요.");
		double circleRadius = sc.nextDouble();
		System.out.println("원의 둘레 : " + circle(circleRadius));
//		원의 넓이 출력
		System.out.println("원의 넓이를 구할 반지름을 입력하세요.");
		double circle2Radius = sc.nextDouble();
		System.out.println("원의 넓이 : " + circle2(circle2Radius));
		
	}
	
//	숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
//	더한 값을 리턴 받아야 하는 메소드 (매개변수 두개 선언)
	static int sum(int num1, int num2) {
//		더한 값을 result변수에 대입
		int result = num1 + num2;
//		더한 값을 return
		return result;
	}
	
//	숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
//	뺀 값을 리턴 받아야 하는 메소드 (매개변수 두개 선언)
	static int minus(int num1, int num2) {
//		뺀 값을 result변수에 대입
		int result = num1 - num2;
//		뺀 값을 return
		return result;
	}
	
//	숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
//	곱한 값을 리턴 받아야 하는 메소드 (매개변수 두개 선언)
	static int multiple(int num1, int num2) {
//		곱한 값을 result변수에 대입
		int result = num1 * num2;
//		곱한 값을 return
		return result;
	}
	
//	숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
//	나눈 값을 리턴 받아야 하는 메소드 (매개변수 두개 선언)
	static int divide(int num1, int num2) {
//		나눈 값을 result변수에 대입
		int result = num1 / num2;
//		나눈 값을 return
		return result;
	}
	
//	실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
//	원의 둘레를 구한 값을 리턴 받아야 하는 메소드 (매개변수 한개 선언)
	static double circle(double r) {
//		원주율 변수 선언
		double pi = 3.141592;
//		원의 둘레를 구하는 공식 result변수에 대입
		double result = 2 * pi * r;
//		구한 값을 return
		return result;
	}
	
//	실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
//	원의 넓이를 구한 값을 리턴 받아야 하는 메소드 (매개변수 한개 선언)
	static double circle2(double r) {
//		원주율 변수 선언
		double pi = 3.141592;
//		원의 넓이를 구하는 공식 result변수에 대입
		double result = pi * r * r;
//		구한 값을 return
		return result;
	}
	
}
