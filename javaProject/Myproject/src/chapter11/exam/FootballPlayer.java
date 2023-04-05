package chapter11.exam;

// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.

public class FootballPlayer {
	
	// 값을 받을 인스턴스 변수 선언
	String name;
	String number;
	String team;
	String age;
	
	// 생성자 생성해서 초기화
	public FootballPlayer(String name, String number, String team, String age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	
	// 출력을 하려는 메소드 생성
	// 메소드를 생성하였으니 main에서 호출해서 출력한다.
	public void playerShow() {
		System.out.print("이름 : " + this.name + "\t번호 : " + this.number + "\t팀 : " + this.team + "\t나이 : " + this.age + "\n");
	}
	
}
