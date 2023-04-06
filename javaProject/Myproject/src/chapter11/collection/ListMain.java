package chapter11.collection;

import java.util.ArrayList;

// 시작 시점을 만드는 클래스
public class ListMain {

	public static void main(String[] args) {
		
		// 나의 팀을 구성하고 싶다 > 선수들을 저장할 수 있는 공간을 생성하고 선수들을 저장
		// 참조변수에 타입을 지정하였으므로 뒤의 제너릭엔 타입 생략 가능
		ArrayList<FootballPlayer> myTeam = new ArrayList<FootballPlayer>();
		myTeam.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		myTeam.add(new FootballPlayer("이강인", 18, "마요르카", 20));
		myTeam.add(new FootballPlayer("박지성", 7, "맨유", 40));
		
		System.out.println("나의 팀 선수 정보");
		for(FootballPlayer player : myTeam) {
			player.showInfo();
		}
		
		System.out.println("=================================");
		// 람다식						매개변수		   처리데이터가 하나면 {}중괄호 생략
		myTeam.stream().forEach((FootballPlayer p) -> p.showInfo());
		
		System.out.println("=================================");
		// toString으로 선언되어있을 때 사용 가능
		myTeam.stream().forEach(System.out::println);
		
		
	}

}
