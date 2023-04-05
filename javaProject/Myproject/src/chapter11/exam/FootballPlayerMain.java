package chapter11.exam;

import java.util.ArrayList;
import java.util.List;

// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.

public class FootballPlayerMain {

	public static void main(String[] args) {
		// List<E>인 ArrayList<E>를 인스턴스로 생성
		// <E> 제너릭 안에는 사용하고자 하는 클래스 명을 넣어준다.
		// new ArrayList 로 ArrayList를 생성한다.
		List<FootballPlayer> list = new ArrayList<FootballPlayer>();
		
		// ArrayList로 선언한 list에 값을 넣어준다.
		// 값을 넣을때는 add를 사용한다.
		// add안에는 참조변수를 선언해서 넣어준다.
		// 참조변수로 사용하고자 하는 클래스의 생성자를 불러온다.
		list.add(new FootballPlayer("손흥민", "7번", "토트넘", "30살"));
		list.add(new FootballPlayer("호날두", "8번", "레알마드리드", "30살"));
		list.add(new FootballPlayer("메시", "7번", "바르셀로나", "30살"));
		list.add(new FootballPlayer("음바페", "9번", "파리생제르망", "30살"));
		
		// ArrayList를 향상된 for문으로 출력한다.
		// 출력할 때 FootballPlayer의 메소드를 사용할 것 이므로
		// 변수에 메소드를 선언해준다.
		for(FootballPlayer f : list) {
			f.playerShow();
		}
		
		
		
	}

}
