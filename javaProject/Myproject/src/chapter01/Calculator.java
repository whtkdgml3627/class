package chapter01;

public class Calculator {

	public static void main(String[] args) {
		
//		더하기 출력
		System.out.println("더하기 : " + sum(10,5));
//		빼기 출력
		System.out.println("빼기 : " + minus(10,5));
//		곱하기 출력
		System.out.println("곱하기 : " + multiple(10,5));
//		나누기 출력
		System.out.println("나누기 : " + divide(10,5));
		
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
	
}
