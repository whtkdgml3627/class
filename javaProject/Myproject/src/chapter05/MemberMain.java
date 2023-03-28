package chapter05;
// ④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
public class MemberMain {

	public static void main(String[] args) {
		// 인스턴스 생성
		Member member1 = new Member("조상희", "010-1111-1111", "정보통신", "2학년", "test@gmail.com", "2023-03-28", "서울시 종로");
		Member member2 = new Member("상희", "010-2222-2222", "전자", "3학년", "test@naver.com");
		
		member1.printPerson();
		System.out.println();
		member2.printPerson();
	}

}
