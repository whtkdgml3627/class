package question;
//문제: Student 클래스와 Main 클래스를 만들어, 학생의 이름, 학년, 국어/영어/수학 점수를 입력받아 계산한 평균과 총점을 출력하는 프로그램을 작성하세요.

//
//요구사항:Student 클래스에는 이름, 학년, 국어/영어/수학 점수를 저장하는 인스턴스 변수를 선언하세요.
//Student 클래스에는 Getter와 Setter 메소드를 구현하세요.
//Main 클래스에서는 사용자로부터 이름, 학년, 국어/영어/수학 점수를 입력받아 Student 객체를 생성하세요.
//생성된 Student 객체를 이용해 계산한 평균과 총점을 출력하세요!

// 처음에는 무조건 거의 인스턴스 변수 정의
// 생성자 정의
// 게터세터

// 메인메소드 안에서 출력문 객체도 생성 후 
public class Student {
	private String name;
	private String grade;
	private int kor;
	private int eng;
	private int math;

	public Student(String name, String grade, int kor, int eng, int math) {
		this.name = name;
		this.grade = grade;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// Getter Setter 정보은닉,캡슐화,보수용이
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}

//Main 클래스에서는 사용자로부터 이름, 학년, 국어/영어/수학 점수를 입력받아 Student 객체를 생성하세요.
//생성된 Student 객체를 이용해 계산한 평균과 총점을 출력하세요!
class Main {
	public static void main(String[] args) {
		Student student = new Student("권성준", "2학년", 80, 50, 40);

		System.out.println(student.getName());
		System.out.println(student.getGrade());
		System.out.println(student.getKor());
		System.out.println(student.getEng());
		System.out.println(student.getMath());

		student.setName("조상희");
		student.setGrade("3학년");
		student.setKor(100);
		student.setEng(80);
		student.setMath(40);

		int totalScore = student.getKor() + student.getEng() + student.getMath();
		int totalAvg = totalScore / 3;
		System.out.println(totalScore);
		System.out.println(totalAvg);
	}
}
