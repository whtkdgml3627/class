package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {

		// 배열의 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열의 생성
		scores = new int[15]; // int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
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
		scores[10] = 99;
		scores[11] = 49;
		scores[12] = 88;
		scores[13] = 78;
		scores[14] = 100;
		
		resultPrint(scores);
		
	}
	
	// 점수를 저장하고 있는 배열을 전달받아 총점과 평균값을 출력하는 메소드
	public static void resultPrint(int[] arr) { // int[] arr = scores;
		
		// 전달 받은 배열은 : int 타입의 배열이다(타입의 제약만 있다) size 제약은 없다.
		
		// 총점과 평균을 구하는 변수 선언
		// 지역변수라 초기화
		int sum = 0;
		float avg = 0.0f;
		
		// 총점을 구하는 for문 작성
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		//평균 대입
		avg = sum/(float)arr.length;
		
		// 출력
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
