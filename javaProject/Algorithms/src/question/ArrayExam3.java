package question;

// 배열 실버 문제 입니다
// 여기 한번 풀어보세요!
// 정수형 배열에 10개의 수를 저장한 후, 배열에서 짝수인 수들의 합을 출력하는 코드를 작성해보세요.
// 배열 { 3, 5, 8, 10, 12, 15, 18, 20, 21, 25 }

public class ArrayExam3 {

	public static void main(String[] args) {
		
		// 10개의 배열 생성
		int[] arr = new int[10];
		// 짝수들의 수를 합하는 변수 생성
		int sum = 0;
		
		System.out.print("배열 :");
		// 10개의 난수 배열값 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
			System.out.print(" " + arr[i]);
		}
		System.out.println("\n===================================");
		
		// 배열에서 짝수를 찾아서더해주는 for문
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 1) {
				sum += arr[i];
			}
		}
		// System.out.println("짝수들의 합 : " + sum);
		System.out.println("홀수들의 합 : " + sum);
		
	}

}
