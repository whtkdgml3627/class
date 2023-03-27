package chapter05;

public class SmartPhoneMain {

	public static void main(String[] args) {

//		SmartPhone 클래스의 인스턴스를 만들어서 프로그램을 완성
		SmartPhone sp1 = new SmartPhone();
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		
		SmartPhone sp2 = new SmartPhone();
		sp2.color = "Red";
		sp2.size = 4.0f;
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		System.out.println();
		
//		sp1, sp2 참조변수 -> 메모리 주소값을 가지는 변수
		
		sp1 = sp2;
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		System.out.println(sp2.color);
		System.out.println(sp2.size);
	}
	
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int add(int n1) {
		return n1;
	}

}
