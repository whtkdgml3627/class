package chapter05;

public class InstanceVariable {

	String name = "KING";
	int age = 12;
	
	void telName() {
		System.out.println("나의 이름은 " + name + " 입니다.");
		System.out.println("나의 이름은 " + ClassVariable.name + " 입니다.");
	}
	
	void telAge() {
		System.out.println("나의 나이는 " + age + " 입니다.");
	}
	
	public static void main(String[] args) {
		
//		인스턴스 변수는 인스턴스를 생성했을 때 생성 -> 인스턴스가 소멸될 때 소멸
		
		InstanceVariable iv = new InstanceVariable();
		
		System.out.println(iv.name);
		System.out.println(iv.age);
		
//		....
		System.out.println(iv.name);
		
//		iv = null;
		
		iv.telName();
		iv.telAge();
		
	}
	
}