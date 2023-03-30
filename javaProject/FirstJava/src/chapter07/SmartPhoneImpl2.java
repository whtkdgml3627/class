package chapter07;

public class SmartPhoneImpl2 extends Phone {

	String model;

	public SmartPhoneImpl2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	void call() {
		super.call(); // 일반적으로 많이 사용하지는 않는다.
		System.out.println(model + "이어팟을 이용해서 통화합니다.");
	}
	
	void playMusic() {
		System.out.println("음악을 듣습니다.");
	}
	
	public static void main(String[] args) {
		
		// 다형성 : 상위타입의 참조변수에 다양한 하위타입의 인스턴스를 참조할 수 있는것.
		Phone p = new SmartPhoneImpl2("010-0000-0000", "IOS");
		p.call(); // 하위타입 인스턴스에 정의되어 있는 오버라이딩된 call()이 호출된다!
		
		// p.playMusic(); // 인스턴스 생성을 하위타입으로 해 줘야 하위타입의 메소드를 사용할 수 있다.
		// SmartPhoneImpl2 p2 = new SmartPhoneImpl2("000", "test");
		
		SmartPhoneImpl2 p2 = (SmartPhoneImpl2)p;
		p2.playMusic();
		
	}
	
	
}
