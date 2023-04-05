package chapter11;

import java.util.Date;

public class MyClass<T> {
	
	// 타입이 들어가는 부분
	// 변수, 메소드의 반환타입, 매개변수의 타입
	T val;
	
	// 생성자
	public MyClass(T val) {
		super();
		this.val = val;
	}
	public MyClass() {
		super();
	}

	// 겟/셋
	T getVal() {
		return val;
	}
	void setVal(T val) {
		this.val = val;
	}
	
	public static void main(String[] args) {
		MyClass<String> myClass = new MyClass<String>();
		// myClass.setVal(new Date()); // 잘못된 타입이 저장되지 않도록 처리가 된다.
		// 인스턴스 생성시 String타입으로 지정하였으므로 String타입의 데이터만 전달 가능.
		System.out.println(myClass.getVal()); // String타입의 데이터만 반환.
	}
	
}
