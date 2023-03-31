package chapter08;

public class SmartPhone extends Phone {
	
	private String model;

	public SmartPhone(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	void trunOn() {
		System.out.println(model + "모델에 맞게 전원을 켰습니다.");
	}
	
	public static void main(String[] args) {
//		Phone phone = new Phone();
		
		Phone smartPhone = new SmartPhone("010-1111-1111", "IOS");
		smartPhone.trunOn();
	}

}
