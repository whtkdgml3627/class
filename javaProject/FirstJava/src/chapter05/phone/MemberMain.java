package chapter05.phone;

import java.util.Date;

public class MemberMain {

	public static void main(String[] args) {
		
		Date now = new Date();
//		서로 다른 패키지의 같은 클래스명을 불러올 때는 패키지명까지 같이 작성해 주어야 한다.
		java.sql.Date time = new java.sql.Date(0);
		
		System.out.println(now + " " + time);

		SmartPhone smartPhone = new SmartPhone();
		
		Member member1 = new Member("손흥민", "son@gmail.com", 20, "010-1111-9999", smartPhone);
		Member member2 = new Member("박지성", "park@gmail.com");
		
		member1.showData();
		System.out.println();
		member2.showData();
		
		dataPrint(member1); // 매개변수의 인자 -> Member 타입의 인스턴스를 가르키는 주소값을 전달
		dataPrint(member2); // 매개변수의 인자 -> Member 타입의 인스턴스를 가르키는 주소값을 전달
		
	}
	
	static void dataPrint(Member member) {
//		Member member = member1;
//		Member member : 매개변수, 참조변수
		System.out.println();
		member.showData();
	}

}
