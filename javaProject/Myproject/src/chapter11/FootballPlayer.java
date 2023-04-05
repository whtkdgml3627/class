package chapter11;

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;

// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.

public class FootballPlayer {
	// 축구선수를 저장할 변수 생성
	String name;
	int number;
	String team;
	int age;
	
	// List에 담을 생성자 생성
	public FootballPlayer(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	public FootballPlayer() {
		super();
	}
	
	// List에 담아 출력할 메소드 생성
	public void playerShow() {
		System.out.print("이름 : " + this.name + " / 번호 : " + this.number + " / 팀 : " + this.team + " / 나이 : " + this.age + "\n");
	}
	
//	public String toString() {
//        return "이름 : " + name + " / 번호 : " + number + " / 팀 : " + team + " / 나이 : " + age;
//    }
	
//	public static void main(String[] args) {
//		ArrayList<FootballPlayer> list = new ArrayList<>();
//		
//		list.add(new FootballPlayer("손흥민", 7 , "토트넘", 30));
//		list.add(new FootballPlayer("손흥민", 7 , "토트넘", 30));
//		list.add(new FootballPlayer("손흥민", 7 , "토트넘", 30));
//		list.add(new FootballPlayer("손흥민", 7 , "토트넘", 30));
//		
//		for(FootballPlayer f : list) {
//			f.playerShow();
//		}
//		System.out.println("====================================");
//		Set<FootballPlayer> h = new HashSet<>();
//		
//		h.add(new FootballPlayer("손흥민", 7 , "토트넘", 30));
//		h.add(new FootballPlayer("호날두", 6 , "레알", 31));
//		h.add(new FootballPlayer("메시", 8 , "바르셀로나", 32));
//		h.add(new FootballPlayer("손흥민", 7 , "토트넘", 30));
//		
//		for(FootballPlayer t : h) {
//			System.out.println(t);
//		}
//		
//	}
	
}
