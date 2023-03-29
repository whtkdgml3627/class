package chapter06;

public class Member {

	int memberNo;
	String memberId;
	String memberName;
	
	public Member(int memberNo, String memberId, String memberName) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() { // Object 클래스가 가지고 있는 toString 메소드
		return "회원 [회원번호=" + memberNo + "\t아이디=" + memberId + "\t회원이름=" + memberName + "]";
	}
	
}
