package chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열의 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열의 생성
		scores = new int[10]; // int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		System.out.println("-------------------------------");
		
		// 배열 요소의 참조
		// 배열이름[index]
		// index -> 0 ~ 개수-1
		// 요소의 개수 -> 배열변수.length
		
		scores[0] = 62;
		scores[1] = 85;
		scores[2] = 91;
		scores[3] = 89;
		scores[4] = 100;
		scores[5] = 88;
		scores[6] = 77;
		scores[7] = 94;
		scores[8] = 88;
		scores[9] = 79;
		
		// 총합
		int sum = 0;
		//평균
		float avg = 0.0f;
		
//		System.out.println(scores[1]);
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = sum/(float)scores.length;
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
