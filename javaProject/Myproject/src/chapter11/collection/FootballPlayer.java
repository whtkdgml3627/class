package chapter11.collection;


// 축구선수의 정보를 저장하는 클래스 : 축구선수 데이터 저장 -> 인스턴스 생성 -> 배열 -> List
public class FootballPlayer implements Comparable<FootballPlayer>{
	
	private String name;
	private int number;
	private String team;
	private int age;
	
	// 생성자
	public FootballPlayer(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	
	// 기본 생성자
	public FootballPlayer() {
		
	}
	
	// get/set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(FootballPlayer o) {
		int compare = this.team.compareTo(o.getTeam());
		if(compare == 0) {
			compare = this.name.compareTo(o.getName());
			if(compare == 0) {
				compare = this.number - o.getNumber();
			}
		}
		return compare;
	}

	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer player = (FootballPlayer)obj;
			result = this.team.equals(player.getTeam()) && this.name.equals(player.getName()) && this.age == player.getAge();
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}
	
	// 출력메소드
	public void showInfo() {
		System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
	}
	
}
