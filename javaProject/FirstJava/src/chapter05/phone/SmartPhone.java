package chapter05.phone;

public class SmartPhone {

//	인스턴스 변수
	String color;
	float size;
	int volume;
	
//	생성자 : 초기화 메소드, 인스턴스 변수의 초기화 작업을 한다.
//	초기화 작업이 없는 경우 생략 가능하다.
//	아래와 같은 생성자를 -> 기본생성자
//	SmartPhone(){
//		System.out.println("인스턴스 생성!");
//	}
	
	// 초기화를 위한 생성자 정의
	SmartPhone(String color, float size, int volume){
		this.color = color;
		this.size = size;
		this.volume = volume;
	}
	
	SmartPhone(String color, float size){
		
		this(color, size, 0); // this(); -> 다른 생성자 호출하는것
//		     String, float, int 이므로 세개가 다 정의되어 있는 생성자를 찾아가서 값을 넣어준다.
//		아래 초기화 시켜준걸 축약시켜 적어줄 수 있다.
//		this.color = color;
//		this.size = size;
//		this.volume = 0;
	}
	
	SmartPhone(){
		this("WHITE", 4.5f, 5);
//		color = "WHITE";
//		size = 4.5f;
//		volume = 5;
	}
	
	
	void call() {
		System.out.println("전화 걸기!");
	}
	
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	
}
