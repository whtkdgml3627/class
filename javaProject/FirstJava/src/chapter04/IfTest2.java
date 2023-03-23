package chapter04;

public class IfTest2 {
	
	public static void main(String[] args) {
		
//		점수가 60점 이상인 경우에는
//		"PASS"를 출력 하고,
//		60점 미만인 경우
//		"FAIL"을 출력하는 프로그램 만들기
		
		int score;
		score = 70;
		
		if(score >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		/*
		 * if(score < 60) { System.out.println("FAIL"); }
		 */
		
//		짝수/홀수 판단하는 프로그램
		int num = 5;
		
		if(num % 2 == 0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
		
	}
	
}
