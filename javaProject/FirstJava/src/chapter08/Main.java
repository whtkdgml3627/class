package chapter08;

public class Main {

	public static void main(String[] args) {
		
		AbstractClass abstractClass; // 참조변수 선언, 항상 상위클래스 타입
//		abstractClass = new AbstractClass(); // 인스턴스 생성이 되지 않는다.
		
		NewClass class1 = new NewClass();
		class1.abstractMethod();
		class1.instanceMethod();
		class1.printData();
	}

}
