package question;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// 배열 생성
		int[] arr = new int[5];
		
		// 배열에 임의의 수 생성
		System.out.print("배열 :");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
			System.out.print(" " + arr[i]);
		}
		
		System.out.println();
		
		// 작은수를 넣어줄 변수 생성
		int min = arr[0];
		// 큰수를 넣어줄 변수 생성
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
		
	}

}
