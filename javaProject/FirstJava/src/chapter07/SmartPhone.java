package chapter07;

public class SmartPhone extends Phone {
	
	// 하위클래스 : 좁은의미, 기능의 확장, 공통적인 기능은 가져옴
	
	String model;
	
	// 매개변수가 없는 생성자가 있으면 생략이 가능하다.
//	public SmartPhone() {
//		super();
//	}
	
	void game() {
		System.out.println(model + " 게임을 합니다.");
	}

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		sp.phoneNumber = "010-1234-5678";
		sp.call();
		sp.model = "Black Desert";
		sp.game();
		
	}
	
}
