package chapter03;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		
//		사용자 키보드값 입력
		Scanner sc = new Scanner(System.in);
		
//		더하기 출력
		System.out.println("더하기 : " + sum(10,5));
//		빼기 출력
		System.out.println("빼기 : " + minus(10,5));
//		곱하기 출력
		System.out.println("곱하기 : " + multiple(10,5));
//		나누기 출력
		System.out.println("나누기 : " + divide(10,5));
//		원의 둘레 출력
		System.out.println("원의 둘레 : " + circle(4.534));
//		원의 넓이 출력
		System.out.println("원의 넓이 : " + circle2(4.534));
		
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
