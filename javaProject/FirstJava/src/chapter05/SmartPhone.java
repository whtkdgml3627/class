package chapter05;

public class SmartPhone { // 인스턴스화 -> 객체

//	변수 선언 : 멤버 변수, 인스턴스 변수!
	String color = "white";	// 속성 : 색상 -> 변수로 선언
	float size = 5.7f;		// 속성 : 사이즈 -> 변수로 선언
	int volume = 0;			// 속성 : 볼륨 -> 변수로 선언
	
//	생성자
	SmartPhone(){
		
	}
	
//	메소드 정의 : 인스턴스 메소드
//	전화 걸기 기능
	void call(String number) {
//		int number = 119;
		System.out.println(number + "전화를 겁니다.");
	}
	
//	볼륨을 키우는 기능
	void volumeUp() {
		volume++;
	}
	
//	볼륨을 낮추는 기능
	void volumeDown() {
		volume--;
	}
	
	public static void main(String[] args) {
		
//		클래스를 인스턴스로 만든다 -> 인스턴스화!
//		인스턴스화 -> 클래스에 정의된 변수와 메소드가 메모리로 로드된다.
//		참조변수 선언 = new 클래스이름();

//		참조변수 선언 -> 클래스이름 변수이름; -> 인스턴스 메모리의 주소값을 저장
//		참조변수와 new로 선언하는 클래스 이름은 무조건 같아야한다.
		SmartPhone sp = null; // 참조변수의 초기화는 null 값을 사용한다.
		
		sp = new SmartPhone(); // new 키워드를 사용하면 인스턴스가 생성
//		인스턴스의 생성 -> 클래스에 정의된 멤버들이 메모리로 로드된다.
//		인스턴스 메모리의 주소값을 반환한다.
		
//		인스턴스 변수의 참조 -> 참조변수.변수이름;
		
		System.out.println("스마트폰의 색상 : " + sp.color);
		System.out.println("스마트폰의 사이즈 : " + sp.size);
		System.out.println("스마트폰의 볼륨 크기 : " + sp.volume);
		System.out.println();
		
		sp.color = "Gold";	// 이런 방식은 사용하지 않음
		sp.size = 6.0f;		// 이런 방식은 사용하지 않음

		System.out.println("스마트폰의 색상 : " + sp.color);
		System.out.println("스마트폰의 사이즈 : " + sp.size);
		System.out.println();
		
//		인스턴스 메소드의 호출 -> 참조변수.메소드이름(); ()안에 매개변수가 있다면 넣어주면 됨.
		sp.call("119");
		

//		볼륨의 값을 변경하는 방법
//		변수에 직접 대입 (X) 사용하지 않음
//		메소드를 통해서 변경
		System.out.println("현재 볼륨 값 : " + sp.volume);
		sp.volumeUp();
		sp.volumeUp();
		sp.volumeUp();
		System.out.println("현재 볼륨 값 : " + sp.volume);
		sp.volumeDown();
		System.out.println("현재 볼륨 값 : " + sp.volume);
		System.out.println();
		
	}

}
