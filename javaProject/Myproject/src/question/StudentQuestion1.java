package question;
//학생(Student) 클래스를 만드세요.
//인스턴스 변수로 학생의 이름(String name), 학번(int id), 전공(String major)을 가지도록 합니다.
//생성자를 만들어서 인스턴스 변수들을 초기화 합니다.
//게터/세터 메소드를 만들어서 인스턴스 변수들에 접근할 수 있도록 합니다.
//main() 메소드를 만들어서 학생 객체를 생성하고, 인스턴스 변수들에 접근하고 값을 변경해봅니다.
public class StudentQuestion1 {
//	인스턴스 변수 생성
	private String name;
	private int id;
	private String major;
	
//	생성자 생성
	public StudentQuestion1(String name, int id, String major) {
		this.name = name;
		this.id = id;
		this.major = major;
	}
	
//	게터/세터 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public static void main(String[] args) {
		StudentQuestion1 student = new StudentQuestion1("조상희", 2023, "전자");
		
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getMajor());
		
		student.setName("김예리");
		student.setId(2022);
		student.setMajor("인피니어");

		System.out.println();
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getMajor());
		
	}
	
}
