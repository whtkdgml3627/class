package chapter07.exam;

public class PersonMain {

	public static void main(String[] args) {

		Male m1 = new Male("손흥민", "991111-1000000", "축구선수입니다.");
		m1.printGreeting();
		
		Person p1 = m1;
		p1.printGreeting();
		
		Person p2 = new Female("영희", "021111-4000000");
		p2.printGreeting();
		
	}

}
