package chapter09;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest {

	public static void main(String[] args) {
		
		// 현재 년, 월, 일 가져오기 -> 2023-04-03
		LocalDate now = LocalDate.now();
		System.out.println(now);
		// 날짜 구해오기
		System.out.println(now.getYear());			// 년도
		System.out.println(now.getMonth());			// 월 -> 영문으로
		System.out.println(now.getMonthValue());	// 월 -> 숫자로
		System.out.println(now.getDayOfWeek());		// 요일 -> 영문으로
		System.out.println(now.getDayOfMonth());	// 일
		System.out.println(now.getDayOfYear());		// 1월1일부터 몇일째인지
		System.out.println("====================================");
		
		// 날짜 + 해주기
		LocalDate nextDay1 = now.plusDays(1);
		System.out.println(nextDay1);
		LocalDate nextDay2 = now.plusMonths(1);
		System.out.println(nextDay2);
		LocalDate nextDay3 = now.plusYears(1);
		System.out.println(nextDay3);
		
		System.out.println("====================================");
		// 현재 년, 월, 일, 시, 분, 초 가져오기 -> 2023-04-03T17:59:37.757854400
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		// 시간 구해오기
		System.out.println(now2.getHour());		// 시
		System.out.println(now2.getMinute());	// 분
		System.out.println(now2.getSecond());	// 초
		System.out.println("====================================");
		
		// of메소드로 날짜 지정 가능
		LocalDate day2 = LocalDate.of(1991, 10, 28);
		System.out.println(day2);
		
		LocalDateTime day3 = LocalDateTime.of(2023, 06, 03, 17, 50, 30);
		System.out.println(day3);
		
		LocalDate day4 = LocalDate.parse("2024-12-25");
		System.out.println(day4);
		
	}

}
