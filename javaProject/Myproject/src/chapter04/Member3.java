package chapter04;

import java.util.Scanner;
//import java.time.LocalDate;

public class Member3 {

	public static void main(String[] args) {
//		1.독감예방 접종 가능여부 main 메소드에 선언
		fluVac();
		

		
		
		
		
	}
	
//	1. 독감예방 접종이 가능한지 여부를 확인하는 메소드를 정의합니다.	
	static void fluVac() {
//		console에서 입력할 키보드값 입력값 선언
		Scanner sc = new Scanner(System.in);
		// 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
//      LocalDate now = LocalDate.now();
		System.out.println("태어난 해(년도)를 입력해 주세요.");
//		태어난 해 입력 받는 영역
		int year = sc.nextInt();
//		입력된 년도 - 현재 년도
//		int nowYear = now.getYear();
		int nowYear = 2023;
		year = nowYear - (year-1);
		System.out.println("나이 : " + year);
//		3항연산자로 가/부 여부 확인
//		String status = year < 15 && year > 65 ? "무료예방접종이 가능합니다." : "무료접종 대상이 아닙니다.";
//		if문으로 확인
		if(year < 15 && year > 65) {
			System.out.println("무료예방접종이 가능합니다.");
		}else {
			System.out.println("무료접종 대상이 아닙니다.");
		}
		sc.close();
		
//		가능여부 출력
//		System.out.println(status);
	}
	
//	2. 건강검진 대상 여부를 판별하고 어떤 검진이 가능한지 확인하는 메소드를 정의합니다.
}
