package chapter07;

//2. Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.
//① 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//② 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
//④ Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다

public class Male extends Person {
	
	// 변수 선언
	private String gender;	// 남자
	
	public Male(String name, String number, String gender) {
		super(name, number);
		this.gender = gender;
	}
	
	// getter / setter
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
//	public String toString() {
//		return super.toString() + gender + "입니다.";
//	}
	public String hello() {
		return super.hello() + getGender() + "입니다.";
	}

}
