package chapter06;

public class ArrayTest6 {

	public static void main(String[] args) {

		// 2차원 배열 생성
		int[][] scores = {
				{100, 90, 80},
				{98, 76, 65},
				{88, 91, 50},
				{90, 50, 100}
		};
		
		// 행의 수 만큼 i 반복
		for(int i = 0; i < scores.length; i++) {
			// 열의 수 만큼 j 반복
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print("scores ["+i+"]["+j+"] -> "+scores[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
