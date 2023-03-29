package chapter06;

public class ArrayTest4 {

	public static void main(String[] args) {

		// 2차원 배열의 선언
		int[][] arr;// = new int[2][2];
		
		// 2차원 배열의 생성
		arr = new int[3][2];
		
		//배열의 사이즈
		System.out.println("2차원 배열의 사이즈 : " + arr.length);
		
		System.out.println("첫번째 1차원 배열의 사이즈 : " + arr[0].length);
		System.out.println("두번째 1차원 배열의 사이즈 : " + arr[1].length);
		System.out.println("세번째 1차원 배열의 사이즈 : " + arr[2].length);
		
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[1][0] = 21;
		arr[1][1] = 22;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
	}

}
