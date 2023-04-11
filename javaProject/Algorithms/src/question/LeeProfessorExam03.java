package question;

import java.util.Scanner;

/*
 * 문제3>
 * 변수 n1과 n2에 값을 넣고 n1과 n2사이의 합을 계산하여 그 결과를 출력하는 프로그램을 작성.
 * 예를들어 2와 5를 입력받으면, 2 + 3 + 4 + 5의 연산결과인 14를 출력해야 한다.
 * //단, 5와 2 처럼 큰 수를 먼저 입력받아도 같은 결과가 나와야 함 
 * 
 */

public class LeeProfessorExam03 {

	public static void main(String[] args) {
		
		// 변수 n1과 n2에 값을 넣어줄 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 변수 1
		System.out.println(":::: 첫번째 변수를 넣어주세요 ::::");
		int num1 = sc.nextInt();
		
		// 변수 2
		System.out.println(":::: 두번째 변수를 넣어주세요 ::::");
		int num2 = sc.nextInt();
		
		// 값을 더해줄 변수를 생성
		int sum = 0;
		
		
		
		// 첫번 째 수가 큰 값이 입력되었을 때 값을 변경해준다
		if(num1 > num2) {
			System.out.println("첫번째 숫자가 더 큽니다. 첫번째 숫자 : " + num1 + ", 두번째 숫자 : " + num2);
			// 첫번 째 값이 더 클 경우 넣어줄 변수 생성
			int max = num1;
			// 작은값을 앞에 num1에 넣어줌
			num1 = num2;
			// 큰 값을 뒤에 num2에 넣어줌
			num2 = max;
		}
		
		System.out.println("::::: 더해줄 숫자 :::::");
		System.out.println("작은 숫자 : " + num1 + ", 큰 숫자 : " + num2);
		// for문을 돌려서 값을 더해준다
		for(int i=num1; i<num2+1; i++) {
			sum += i;
		}
		System.out.println("두 수 사이의 합 : " + sum);
		sc.close();
	}

}
