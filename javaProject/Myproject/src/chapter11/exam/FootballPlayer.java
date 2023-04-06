package chapter11.exam;

// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.

public class FootballPlayer implements Comparable<FootballPlayer> {
	
	// 값을 받을 인스턴스 변수 선언
	private String name;
	private int number;
	private String team;
	private int age;

	// 생성자 생성해서 초기화
	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	
	// 생성자 생성해서 초기화
	public FootballPlayer() {
		// 기본 생성자
	}
	
	// get/set
	// 이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 번호
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	// 팀
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	// 나이
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// Set<E>를 사용하면 hashCode를 찾는다?
	// hashCode를 사용해서 중복되는 값 찾기
	// 나이가 같은값을 찾아서 equals로 보내기
	@Override
	public int hashCode() {
		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 초기값 false 지정
		boolean result = false;
		
		// obj가 널이 아니면서 형변환이 가능할 때
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer fp = (FootballPlayer)obj;
			
			// 나이가 같으면서 이름과 팀이 같으면 true값을 넘겨줘서 중복제거 처리
			if(name.equals(fp.getName()) && team.equals(fp.getTeam())) {
				result = true;
			}
		}
		return result;
	}
	
	// 정렬을 해주기 위해서는 Comparable인터페이스를 implements 구현 시켜줘야 함
	// 구현 시켜주고 나면 compareTo 메소드를 오버라이딩 시켜줘야 오류가 안남
	// 값이 크면 양수, 작으면 음수, 같으면 0
	@Override
	public int compareTo(FootballPlayer o) {
		int result = 0;
		if(team.compareTo(o.getTeam()) != 0) {
			result = team.compareTo(o.getTeam());
		}else if(team.compareTo(o.getTeam()) == 0 && name.compareTo(o.getName()) != 0) {
			result = name.compareTo(o.getName());
		}else {
			result = Integer.compare(number, o.getNumber());
		}
		return result;
	}
	
	// 출력을 하려는 메소드 생성
	// 메소드를 생성하였으니 main에서 호출해서 출력한다.
	public void playerShow() {
		System.out.print("이름 : " + this.name + "\t번호 : " + this.number + "\t\t팀 : " + this.team + "\t나이 : " + this.age + "\n");
	}


	
}
