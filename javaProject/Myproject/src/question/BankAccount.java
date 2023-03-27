package question;

import java.util.Scanner;

//문제: BankAccount 클래스를 만들어서 은행 계좌 정보를 저장하고, 입금과 출금 메소드를 구현하세요. 그리고 
//Main 클래스에서는 사용자로부터 은행 계좌 정보를 입력받아 BankAccount 객체를 생성하고, 
//입금과 출금을 수행한 후 최종 잔액을 출력하세요!

public class BankAccount {
//	인스턴스 변수 생성
	private String bnkAccnt;
	private String bnkName;
	private int money;
		
//	생성자 생성
	public BankAccount(String bnkAccnt, String bnkName, int money) {
		this.bnkAccnt = bnkAccnt;
		this.bnkName = bnkName;
		this.money = money;
	}
	
//	계좌 정보 메소드
	public String getBnkAccnt() {
		return bnkAccnt;
	}
	public void setBnkAccnt(String bnkAccnt) {
		this.bnkAccnt = bnkAccnt;
	}
	
//	총액 메소드
	public String getBnkName() {
		return bnkName;
	}
	public void setBnkName(String bnkName) {
		this.bnkName = bnkName;
	}
	
//	금액 메소드
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
//	입금 메소드
	public int deposit(int deposit) {
		return money += deposit;
	}
//	출금 메소드
	public int wthdrwl(int deposit) {
		return money -= deposit;
	}

	//Main 클래스에서는 사용자로부터 은행 계좌 정보를 입력받아 BankAccount 객체를 생성하고, 
	//입금과 출금을 수행한 후 최종 잔액을 출력하세요!
	
	public static void main(String[] args) {
//		BankAccount bankaccount = new BankAccount("우리은행", 10000, 0);
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호");
		String bnkAccnt = sc.nextLine();
		System.out.println("예금주명");
		String bnkName = sc.nextLine();
		System.out.println("잔액");
		int money = sc.nextInt();
		
		BankAccount bankaccount = new BankAccount(bnkAccnt, bnkName, money);
		
		System.out.println("입금액");
		int deposit = sc.nextInt();
		System.out.println(bankaccount.deposit(deposit));
		
		
	}
	
	

}
