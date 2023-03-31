package chapter07.exam;

public class Person {

	private String name;
	private String personNum;
	
	public Person(String name, String personNum) {
		this.name = name;
		this.personNum = personNum;
	}
	
	public void printGreeting() {
		System.out.println("안녕하세요. 저는 " + name + "입니다. " + getAge() + "살 입니다.");
	}
	
	// 주민번호를 통해서 나이를 계산해서 반환하는 메소드
	int getAge() {
		int age = 0;
		// 911028-1000000
		String year = personNum.substring(0, 2);
		char gender = personNum.charAt(7);
		
		if(gender < '3') {
			// 1900 + year
			age = 2023 - (1900 + Integer.parseInt(year)) + 1;
		}else {
			// 2000 + year
			age = 2023 - (2000 + Integer.parseInt(year)) + 1;
		}
		
//		System.out.println(year + " : " + gender);
		
		return age;
	}
	
//	public static void main(String[] args) {
//		Person p = new Person("손흥민", "881028-2000000");
//		System.out.println(p.getAge());
//	}
	
}
