package chapter06;

public class Student {
	// 변수선언
	private String studentName;	// 학생이름
	private int studentKor;	// 국어점수 
	private int studentEng;	// 영어점수 
	private int studentMath;	// 수학점수

	// 생성자
	public Student(String studentName, int studentKor, int studentEng, int studentMath) {
		this.studentName = studentName;
		this.studentKor = studentKor;
		this.studentEng = studentEng;
		this.studentMath = studentMath;
	}
	
	
	// getter / setter 선언
	// 학생이름
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	// 국어점수
	public int getStudentKor() {
		return studentKor;
	}
	public void setStudentKor(int studentKor) {
		this.studentKor = studentKor;
	}
	
	// 영어점수
	public int getStudentEng() {
		return studentEng;
	}
	public void setStudentEng(int studentEng) {
		this.studentEng = studentEng;
	}
	
	// 수학점수
	public int getStudentMath() {
		return studentMath;
	}
	public void setStudentMath(int studentMath) {
		this.studentMath = studentMath;
	}
	
	// 총점과 평균을 구하는 메소드 정의
	public int getResult() {
		return studentKor+studentEng+studentMath;
	}
	
	public double getAvg() {
		return (double)getResult() / 3;
	}

	@Override
	public String toString() {
		return "이름=" + studentName + "\t국어점수=" + studentKor + "\t영어점수=" + studentEng + "\t수학점수=" + studentMath + "\t총점 : " + getResult() + "\t평균 : " + getAvg();
	}
}
