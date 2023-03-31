package chapter08.exam;

/*
 * 아래 코드는 계산기 클래스를 정의할 때 가이드 역할을 하도록 정의해놓은 인터페이스입니다.
 */

public interface Calulator {
	// 추상 메소드 선언
	long add(long n1, long n2);
	long substract(long n1, long n2 );
	long multiply(long n1, long n2 );
	double divide(double n1, double n2 );
}
