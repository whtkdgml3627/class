package chapter06;

public class ArrayTest9 {

	public static void main(String[] args) {

		// Member 타입의 배열 생성 : 요소는 5개 저장
		// Member mem = new Member(1, "cool", "시원한");
		Member[] members = new Member[5];
		
		members[0] = new Member(1, "cool", "시원한");
		members[1] = new Member(2, "hot", "뜨거운");
		members[2] = new Member(3, "son", "손흥민");
		members[3] = new Member(4, "park", "박지성");
		members[4] = new Member(5, "lee", "이강인");
		
		// members[0] -> Member 타입의 참조변수
		// System.out.println(members[0].memberNo);
		System.out.println(members[0].toString());
		System.out.println("-----------------------------------------------------");
		
//		for(int i=0; i < members.length; i++) {
//			System.out.println(members[i]);
//		}
//		System.out.println("-----------------------------------------------------");
		
		for(Member mem : members) {
			// mem = members[0]
			System.out.println(mem);
		}
	}

}
