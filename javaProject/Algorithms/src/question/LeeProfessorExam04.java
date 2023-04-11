package question;


/*
 * 문제4>
 * 1부터 100까지 반복하는 문장에서 3의 배수만 출력하시오
 * 
 */

public class LeeProfessorExam04 {

	public static void main(String[] args) {
		// 3의 배수 출력
		for(int i=1; i<101; i++) {
			// 3으로 나눈 나머지가 0이면 출력
			if(i%3 == 0) {
				System.out.println(i);
			}
		}
	}

}
