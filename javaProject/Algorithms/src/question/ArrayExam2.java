package question;

// 다음은 배열 실버 문제입니다.
// 길이가 10인 배열에 1~100 사이의 난수를 발생시켜 저장한 후, 1~100은 사용자 입력 
// 사용자로부터 10개의 정수를 입력받아 배열에 저장합니다.
// 배열에 저장된 값 중 50 이상인 값들만 골라 더한 결과를 출력합니다.
// 배열에 저장된 숫자들 중에서 50 이상인 숫자들의 합을 구하는 코드를 작성해보세요.

public class ArrayExam2 {

	public static void main(String[] args) {
		
		// 길이가 10인 배열 생성
		int[] arr = new int[10];
		// 50 이상인 값들을 골라 더할 변수 생성
		int sum = 0;
		
		System.out.print("배열 :");
		// 배열에 1~100 사이의 난수 발생 (입력말고 난수로 설정)
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
			System.out.print(" " + arr[i]);
		}
		System.out.println("\n===================================");
		
		// 50이상인 값들만 골라 더함
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=50) {
				sum += arr[i];
			}
		}
		System.out.println("50 이상의 값을 더한 값 : " + sum);
		
	}

}
