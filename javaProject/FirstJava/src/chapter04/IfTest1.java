package chapter04;

public class IfTest1 {

	public static void main(String[] args) {
		
//		시험 점수가 60점 이상일 때 -> 조건식
//		"PASS"를 출력하는 프로그램 만들기 -> 조건의 결과가 참일 때 처리
		
		int score;
		score = 51; // 시험점수 데이터
		
		if(score >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
	}

}
