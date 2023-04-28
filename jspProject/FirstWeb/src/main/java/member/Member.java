package member;

// Java Beans : 모든 변수는 private, getter/setter, 기본생성자
public class Member {
	
	private String id;		//아이디
	private String pw;		//비밀번호
	private String name;	//이름
	
	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public Member() {
		
	}

	// get/set
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getInfo() {
		return this.id + " ( " + this.name + " )"; 
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
}
