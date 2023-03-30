package chapter06;

public class StudentExamMain {

	public static void main(String[] args) {

		// Student 타입의 배열 생성 : 데이터 10개 저장
		StudentExam[] students = new StudentExam[10];
		students[0] = new StudentExam("son01", 100, 10, 90);
		students[1] = new StudentExam("son02", 90, 20, 80);
		students[2] = new StudentExam("son03", 80, 30, 70);
		students[3] = new StudentExam("son04", 70, 40, 60);
		students[4] = new StudentExam("son05", 60, 50, 70);
		students[5] = new StudentExam("son06", 50, 60, 80);
		students[6] = new StudentExam("son07", 40, 70, 90);
		students[7] = new StudentExam("son08", 30, 80, 80);
		students[8] = new StudentExam("son09", 20, 90, 70);
		students[9] = new StudentExam("son10", 10, 100, 60);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=================================================");
		
		for(StudentExam student : students) {
			System.out.println(student.result());
		}
		
	}

}
