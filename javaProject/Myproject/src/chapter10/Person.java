package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용자 아이디를 입력해주세요.");
		String personId = sc.nextLine();
		
		try {
			for(int i=0; i<personId.length(); i++) {
				char c = personId.charAt(i);
				if(!(c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9')) {
					BadIdInputException e = new BadIdInputException("사용할 수 없는 아이디 방식입니다.");
					throw e;
				}
			}
		}catch(BadIdInputException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("태어난 년도를 입력해주세요.");
		int year = 0;
		
		try {
			year = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자가 아닌 값을 입력했습니다.");
		}
		
	}

}
