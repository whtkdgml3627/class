package chapter01;

public class Member {

	public static void main(String[] args) {
		
//		Member 클래스를 생성하고, main()메소드를 만들고 자기 자신의 이름을 출력하는 메소드를 만들어 출력해 봅시다. 
		
//		이름 입력
		myName("조상희");
	}
	
//	리턴값 없이 입력값을 받으려는 메소드 void로 실행
	static void myName (String name) {
		System.out.println("제 이름은 "+ name +" 입니다.");
	}

}
