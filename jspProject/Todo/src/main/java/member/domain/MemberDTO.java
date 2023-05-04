package member.domain;

public class MemberDTO {
	
	private int idx;		// 번호 pk
	private String uid;		// 아이디
	private String uname;	// 이름
	private String uphoto;	// 파일
	
	// 기본 생성자
	public MemberDTO() {}

	// 값 넣을 생성자
	public MemberDTO(int idx, String uid, String uname, String uphoto) {
		this.idx = idx;
		this.uid = uid;
		this.uname = uname;
		this.uphoto = uphoto;
	}
	
	// get/set
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUphoto() {
		return uphoto;
	}

	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}

	// 출력 확인 toString
	@Override
	public String toString() {
		return "MemberDTO [idx=" + idx + ", uid=" + uid + ", uname=" + uname + ", uphoto=" + uphoto + "]";
	}
	
}
