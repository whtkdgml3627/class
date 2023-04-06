package chapter11.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.

public class FootballPlayerMain {

	public static void main(String[] args) {
		// List<E>인 ArrayList<E>를 인스턴스로 생성
		// <E> 제너릭 안에는 사용하고자 하는 클래스 명을 넣어준다.
		// new ArrayList 로 ArrayList를 생성한다.
		// list 타입의 참조변수를 먼저 null 값으로 생성해준다
		List<FootballPlayer> list = null;
		// list 타입의 인스턴스를 생성한다.
		list = new ArrayList<FootballPlayer>();
		
		// ArrayList로 선언한 list에 값을 넣어준다.
		// 값을 넣을때는 add를 사용한다.
		// add안에는 참조변수를 선언해서 넣어준다.
		// 참조변수로 사용하고자 하는 클래스의 생성자를 불러온다.
		list.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		list.add(new FootballPlayer("호날두", 8, "레알마드리드", 30));
		list.add(new FootballPlayer("메시", 7, "바르셀로나", 30));
		list.add(new FootballPlayer("음바페", 9, "파리생제르망", 30));
		
		// ArrayList를 향상된 for문으로 출력한다.
		// 출력할 때 FootballPlayer의 메소드를 사용할 것 이므로
		// 변수에 메소드를 선언해준다.
		for(FootballPlayer f : list) {
			f.playerShow();
		}
		
		System.out.println("============================Set============================");
		// 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고
		// 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		
		// Set<E>인 HashSet<E>를 인스턴스로 생성
		// set 값을 null로 먼저 초기화
		Set<FootballPlayer> set = null;
		set = new HashSet<FootballPlayer>();
		
		// set에 값을 add로 넣어 준다.
		set.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		set.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		set.add(new FootballPlayer("케인", 8, "토트넘", 28));
		set.add(new FootballPlayer("손흥민", 8, "토트넘", 25));
		set.add(new FootballPlayer("손흥민", 7, "토트넘", 28));
		set.add(new FootballPlayer("요리스", 1, "토트넘", 30));
		
		for(FootballPlayer s : set) {
			s.playerShow();
		}

		System.out.println("==========================TreeSet==========================");
		
		// 3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고,
		// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.
		Set<FootballPlayer> tSet = null;
		tSet = new TreeSet<>();

		// tSet에 값을 add로 넣어준다.
		tSet.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		tSet.add(new FootballPlayer("호날두", 8, "레알마드리드", 30));
		tSet.add(new FootballPlayer("메시", 7, "바르셀로나", 30));
		tSet.add(new FootballPlayer("음바페", 9, "파리생제르망", 30));
		tSet.add(new FootballPlayer("케인", 8, "토트넘", 28));
		tSet.add(new FootballPlayer("손흥민", 10, "토트넘", 30));
		tSet.add(new FootballPlayer("요리스", 1, "토트넘", 30));
		
		for(FootballPlayer t : tSet) {
			t.playerShow();
		}

		System.out.println("==========================HashMap==========================");
		
		// 4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다
		Map<Integer, FootballPlayer> map = new HashMap<>();
		// 인스턴스 생성하여 값 저장
		FootballPlayer fp1 = new FootballPlayer("손흥민", 7, "토트넘", 30);
		FootballPlayer fp2 = new FootballPlayer("호날두", 8, "레알마드리드", 30);
		FootballPlayer fp3 = new FootballPlayer("메시", 7, "바르셀로나", 30);
		FootballPlayer fp4 = new FootballPlayer("음바페", 9, "파리생제르망", 30);
		
		// mpa은 put으로 값을 넣어준다
		// key값 getNumber()를 넣어서 fp1~4 인스턴스를 map에 넣어준다
		map.put(fp1.getNumber(), fp1);
		map.put(fp2.getNumber(), fp2);
		map.put(fp3.getNumber(), fp3);
		map.put(fp4.getNumber(), fp4);

		// get으로 값을 가져온다
		// 손흥민, 메시 번호가 중복되므로 뒤에 있는 값인 메시가 노출된다.
		map.get(fp1.getNumber()).playerShow();
		map.get(fp2.getNumber()).playerShow();
		map.get(fp3.getNumber()).playerShow();
		map.get(fp4.getNumber()).playerShow();
		
		Set<Integer> keySet = map.keySet();
		for(Integer m : keySet) {
			System.out.println(m);
		}
	}

}
