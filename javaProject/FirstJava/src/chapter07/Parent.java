package chapter07;

public class Parent {

	int num = 10;
	
	public static void main(String[] args) {
		Child c = new Child();
		c.showData(1000);
	}
	
}

class Child extends Parent {
	int num = 100;

	void showData(int num) {
		System.out.println("상위 클래스의 num : " + super.num);	//상위클래스의 변수
		System.out.println("하위 클래스의 num : " + this.num);	//하위클래스의 변수
		System.out.println("지역변수 num : " + num);			//메소드의 매개변수
	}
	
}
