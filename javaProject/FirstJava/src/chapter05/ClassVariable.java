package chapter05;

public class ClassVariable {

//	클래스 내부에서는 static 클래스 변수여도 그냥 변수명을 적어 사용할 수 있다.
	static String name = "KING";
	static int age = 10;

	void telName() {
//		클래스 내부에서는 static 클래스 변수여도 그냥 변수명을 적어 사용할 수 있다.
		System.out.println("나의 이름은 " + name + " 입니다.");
	}

	void telAge() {
		System.out.println("나의 나이는 " + age + "살 입니다.");
	}

}
