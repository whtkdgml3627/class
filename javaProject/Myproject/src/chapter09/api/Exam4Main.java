package chapter09.api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exam4Main {

	public static void main(String[] args) {
		// 4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다.
		
		// 내 생일 기준
		LocalDate birthday = LocalDate.of(1991, 10, 28);
		LocalDate now = LocalDate.now();
		System.out.println("오늘 : " + now);
		System.out.println("생일 : " + birthday);
		
		// 날짜 체크
		long days = ChronoUnit.DAYS.between(birthday, now);
		System.out.println("산날 : " + days);
		
		LocalDate cDay = LocalDate.parse("2023-12-25");
		System.out.println("크리스마스 : " + cDay);
		
		long days2 = ChronoUnit.DAYS.between(now, cDay);
		System.out.println("크리스마스까지 남은날 : " + days2);
		
	}

}
