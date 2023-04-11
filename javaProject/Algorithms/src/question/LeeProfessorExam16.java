package question;
/*
 * 문제16>
 * 0 ~ 9사이의 난수를 100개 만들과, 발생된 난수에서 숫자가 몇개씩 있는지를 판별하여 그래프화 해보자.
 * 6654654546545646841231... // 난수 100개
 * 0의 갯수 : ##########10
 * 1의 갯수 : #######7
 * .....
 * 9의 갯수 : ############12
 * 
 */
public class LeeProfessorExam16 {
	public static void main(String[] args) {
		// 100개의 수를 담을 배열을 만든다.
		int[] arr = new int[100];
		
		// 배열에 0~9까지의 수를 for문으로 넣어준다.
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*10);
		}

		// 카운트 할 변수 생성
		int count = 0;
		// 각 숫자의 갯수를 찾아준다.
		// 겉의 for문은 0부터 9까지의 숫자를 찾는 for문
		for(int i=0; i<10; i++) {
			System.out.print(i + "의 갯수 : ");
			// arr배열에 대입된 숫자와 겉의 for문에서 입력받은 i값과 대조
			for(int j=0; j<arr.length; j++) {
				// 같은 수 찾기
				if(i == arr[j]) {
					// count 증가
					count++;
					System.out.print("#");
				}
			}
			System.out.print(" : " + count);
			// count 의 쵝화
			count = 0;
			System.out.println("\n-------------------------------------");
		}
	}
}