package chapter11;

import java.util.ArrayList;
import java.util.List;

// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.

public class FootballPlayerMain {

	public static void main(String[] args) {
		ArrayList<FootballPlayer> list = new ArrayList<>();
		//fp.player("손흥민", 7 , "토트넘", 30);
		
		list.add(new FootballPlayer("손흥민", 7 , "토트넘", 30));
		list.add(new FootballPlayer("손흥민", 7 , "토트넘", 30));
		list.add(new FootballPlayer("손흥민", 7 , "토트넘", 30));
		list.add(new FootballPlayer("손흥민", 7 , "토트넘", 30));
		
		for(FootballPlayer f : list) {
			f.playerShow();
		}
	}

}
