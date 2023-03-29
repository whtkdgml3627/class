package chapter06;

public class StudentMain {

	public static void main(String[] args) {

		Student st = new Student("조상희", 88 ,82 ,87);
		System.out.println("총점 : " + st.getResult());
		
		st.getAvg();
		
		System.out.println("평균 : " + st.getAvg());
		
		Student[] stArr = new Student[10];
		
		stArr[0] = new Student("조상희0", 90, 99, 80);
		stArr[1] = new Student("조상희1", 80, 98, 81);
		stArr[2] = new Student("조상희2", 70, 97, 82);
		stArr[3] = new Student("조상희3", 60, 96, 83);
		stArr[4] = new Student("조상희4", 50, 95, 84);
		stArr[5] = new Student("조상희5", 40, 94, 85);
		stArr[6] = new Student("조상희6", 50, 93, 86);
		stArr[7] = new Student("조상희7", 60, 92, 87);
		stArr[8] = new Student("조상희8", 70, 91, 88);
		stArr[9] = new Student("조상희9", 80, 90, 89);
		
		for(Student student : stArr) {
			System.out.println(student);
		}
		
	}

}
