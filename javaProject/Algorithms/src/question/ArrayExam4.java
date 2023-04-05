package question;

//배열 실버 문제 입니다.
//문제 내용:
//
//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지이다. 
//예를 들어, 7, 14, 27, 38에서 7로 나눈 나머지는 0, 0, 6, 3이다.
//
//수 10개를 입력받은 후, 이를 42로 나눈 나머지 중 서로 다른 값의 
//개수를 출력하는 프로그램을 작성하시오.
//
//입력
//
//첫째 줄부터 열번째 줄까지 자연수가 주어진다. 
//이 자연수는 1,000보다 작거나 같고, 음이 아닌 정수이다.
//출력
//
//첫째 줄에 42로 나누었을 때, 서로 다른 나머지의 개수를 출력한다.

public class ArrayExam4 {

	public static void main(String[] args) {
		// 10개의 배열 생성
		int[] arr = new int[10];
		// 42로 나누었을 때, 서로 다른 나머지의 개수 출력하는 변수
		int count = 0; 
		
		System.out.print("배열 :");
		// 10개의 난수 배열값 대입 - 1~1000
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*1000+1);
			System.out.print(" " + arr[i]);
		}
		System.out.println("\n===================================");
		
		for(int i=0;i<arr.length;i++) {
			// 첫번째 배열을 42로 나누고 나눈 나머지를 구하는 변수 생성
			int div = arr[0]%42;
			// 첫번째 나머지와 다른값이 있을 때 count 증가
			if(arr[i]%42 != div) {
				count++;
			}
		}
		
		System.out.println("나머지가 다른 값 : " + count);
	}

}
