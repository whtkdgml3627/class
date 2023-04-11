package question;


/*
 * 문제5>
 * 2중 for문을 사용하여 아래의 결과를 출력하시오
 * 1 2 3 4 5 6 7 8 9 10
 * 2 3 4 5 6 7 8 9 10 1
 * 3 4 5 6 7 8 9 10 1 2
 * ....................
 * 10 1 2 3 4 5 6 7 8 9
 * 
 * for문과 if문
 * 
 */

public class LeeProfessorExam05 {

	public static void main(String[] args) {
		
		// 2중 for문 사용
		// 1부터 10까지 반복되는 첫번째 for문
		for(int i=0; i<10; i++) {
			// 1부터 10까지 반복되는 두번째 for문
			for(int j=1; j<11; j++) {
				// i는 0부터 들어오고 j는 1부터 증가하므로 i+j를 넣어줄 변수를 선언
				int sum = i+j;
				// sum이 10이 넘으면 10을 빼주는 if문
				if(sum > 10) {
					sum-=10;
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		
	}

}
