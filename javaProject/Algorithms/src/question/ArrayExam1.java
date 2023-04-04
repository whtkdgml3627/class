package question;
//다음은 배열 실버 레벨의 문제입니다.
//
//문제: 길이가 5인 정수형 배열에 사용자가 
//입력한 5개의 숫자 중에서 짝수의 개수를 출력하는 프로그램을 작성하세요.
//예시 입력1: 1 2 3 4 5
//
//예시 출력1: 2
//
//예시 입력2: 0 11 20 33 40
//
//예시 출력2: 3
//힌트: 배열과 반복문을 이용하여 사용자가 입력한 5개의 숫자 중에서 짝수의 개수를 구할 수 있습니다.
public class ArrayExam1 {
	
	public static void main(String[] args) {
		// 길이가 5인 정수형 배열 선언
		int[] arr = new int[5];
		// 짝수의 개수를 찾을 변수 선언
		int even = 0;
		
		System.out.print("배열 :");
		// 5개의 정수를 배열에 넣는 for문 작성
		for(int i=0; i<arr.length; i++) {
			// 1~100까지 난수 발생
			arr[i] = (int)(Math.random()*100+1);
			System.out.print(" " + arr[i]);
		}
		
		System.out.println("\n====================");
		// 배열에 있는 수를 비교하여 짝수의 개수 출력
		for(int i=0; i<arr.length; i++) {
			// 2로 나누어서 나머지가 0이면 even++
			if(arr[i] % 2 == 0) {
				even++;
			}
		}
		
		// 짝수의 개수 출력
		System.out.println("짝수의 개수 : " + even);
		
	}
	
}
