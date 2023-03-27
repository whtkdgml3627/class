package chapter05;

public class ClassMethod {

	int iv = 10; // 인스턴스 변수
	
	static int cv = 30; // 클래스 변수
	
//	인스턴스 메소드
	void printNumber1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void printNumber2() {
		System.out.println("Class Method");
//		클래스 메소드에서는 인스턴스 변수를 가져와 쓸 수 없다.
//		인스턴스 변수를 가져와 쓰려면 클래스를 인스턴스화 시킨 후 불러와야함.
		ClassMethod cm = new ClassMethod();
		
		cm.printNumber1();
		System.out.println(cm.iv);
	}
	
	public static void main(String[] args) {
		
//		클래스 메소드의 호출 : 클래스이름.메소드이름();
		ClassMethod.printNumber2();
		
	}
	
}
