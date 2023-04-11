package question;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 문제19>
 * //키보드에서 정수를 입력받도록 하고, 정수 이외의 값이 입력되었다면
 * //'정수만 입력가능'이라는 메시지를 출력하자
 * 
 * //정수 : 10
 * //입력받은 수 : 10
 * 
 * //정수 : aa
 * //정수만 입력가능
 * 
 * try catch로 예외처리를 해 주어야 한다고 한다.
 * 
 */

public class LeeProfessorExam19 {
	public static void main(String[] args) {
		// 정수를 입력받는 스캐너 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("====정수를 입력하세요.====");
		
		try {
			// 입력받은 정수를 저장하는 값
			int num = sc.nextInt();
			System.out.println("입력받은 수 : " + num);
		}catch(InputMismatchException e) {
			// 정수가 아닌 값을 입력 받았을 때 나오는 Exception오류로 넣어줌
			System.out.println("정수만 입력 가능합니다.");
		}finally { // 오류가 나든 안나든 무조건 실행시켜 준다.
			sc.close();
		}
		
	}
}
