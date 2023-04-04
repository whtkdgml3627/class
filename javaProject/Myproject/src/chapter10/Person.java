package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		
		// 1. 콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다. 
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

		// 2. Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다.
		// 이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다. 
		System.out.println("태어난 년도를 입력해주세요.");
		int year = 0;
		
		try {
			year = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자가 아닌 값을 입력했습니다.");
		}catch(Exception e){
			System.out.println("예기치 못한 오류 발생!");
		} finally {
			sc.close();
		}
		
	}

}
