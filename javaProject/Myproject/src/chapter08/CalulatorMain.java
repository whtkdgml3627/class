package chapter08;

public class CalulatorMain {

	public static void main(String[] args) {
		
		// 상위 타입인 인터페이스 타입의 참조변수에 인터페이스를 구현한 클래스 타입의 인스턴스를 참조
		// 상위타입의 인터페이스 Calulator에 Calulator이 구현된 클래스 타입의 CalulatorImpl 참조
		Calulator calulator = new CalulatorImpl();
		
		// 출력
		System.out.println(calulator.add(12012L, 2139103L));
		System.out.println(calulator.substract(2323L, 1212L));
		System.out.println(calulator.multiply(8545L, 32L));
		System.out.println(calulator.divide(2323233, 23));
		
		// CalualtorImpl의 메소드를 사용하기 위해선 하위 클래스로의 형변환이 필요하다.
		System.out.println(((CalulatorImpl)calulator).nameTest("테스트"));
		
	}

}
