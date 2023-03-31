package chapter08.exam;

/*
 * 인터페이스 Calulator implements로 구현
 * */

public class CalulatorImpl implements Calulator {

//	private long n1;
//	private long n2;
//	
//	public CalulatorImpl(long n1, long n2) {
//		this.n1 = n1;
//		this.n2 = n2;
//	}
	
	@Override
	public long add(long n1, long n2) {
		return n1 + n2;
	}

	@Override
	public long substract(long n1, long n2) {
		return n1 - n2;
	}

	@Override
	public long multiply(long n1, long n2) {
		return n1 * n2;
	}

	@Override
	public double divide(double n1, double n2) {
		return n1 / n2;
	}
	
	public void setResult(long n1, long n2) {
		System.out.println("두 수의 더한 값은 : " + add(n1, n2));
		System.out.println("두 수의 뺀 값은 : " + substract(n1, n2));
		System.out.println("두 수의 곱한 값은 : " + multiply(n1, n2));
		System.out.println("두 수의 나눈 값은 : " + divide((double)n1, (double)n2));
	}
}
