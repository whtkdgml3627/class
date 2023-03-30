package chapter06;

public class StudentExam {

	// 변수 선언
	private String sName;	// 이름
	private int kor;		// 국어점수
	private int eng;		// 영어점수
	private int math;		// 수학점수
	
	// 생성자
	public StudentExam(String sName, int kor, int eng, int math) {
		super();
		this.sName = sName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public StudentExam() {
		super();
	}

	// getter/setter
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
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
	
	// 총점 계산해서 반환하는 메소드
	private int sum() {
		return kor + eng + math;
	}
	
	// 평균 계산하는 메소드
	private float avg() {
		return sum()/3f;
	}
	
	public String result() {
		return sName+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum()+"\t"+avg();
	}
	
	@Override
	public String toString() {
//		return "StudentExam [sName=" + sName + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
		return result();
	}
	
	
	
	
}
