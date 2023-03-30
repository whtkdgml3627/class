package chapter06;

public class ArrayExam1 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램을 작성해봅시다. 
		
		int[] kor = {90, 80, 70, 60, 50, 40, 50, 60, 70, 80};
		int[] eng = {99, 88, 77, 66, 55, 44, 53, 62, 71, 80};
		int[] math = {10, 20, 30, 40, 50, 60, 70, 80, 90, 80};
		
		System.out.println("국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println(kor[0] + "\t " + eng[0] + "\t " + math[0] + "\t " + (kor[0]+eng[0]+math[0]) + "\t " + (kor[0]+eng[0]+math[0])/3);
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(kor[i] + "\t " + eng[i] + "\t " + math[i] + "\t " + (kor[i]+eng[i]+math[i]) + "\t " + (float)(kor[i]+eng[i]+math[i])/3);
//		}
		
		int[][] arr = {
				{100, 99, 80},
				{90, 98, 81},
				{80, 97, 82},
				{70, 96, 83},
				{60, 95, 84},
				{50, 94, 85},
				{60, 93, 86},
				{70, 92, 87},
				{80, 91, 88},
				{90, 90, 89}
		};
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t ");
				sum += arr[i][j];
			}
			System.out.print(sum + "\t ");
			System.out.print((sum/(float)arr[i].length) + "\t ");
			System.out.println();
		}
	}

}
