package chapter09.api;

public class Person {

	// 변수선언
	private String name;
	private String personNumber;
	
	// 생성자
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	// 1.위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다.
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		// 주민등록번호가 같으면 인스턴스로 판별
		// 매개변수로 전달받은 obj를 Person 타입으로 형변환(null이 아닌 상태에서 형변환 여부 체크)
		// -> personNumber 비교 -> 결과값을 result에 대입
		if(obj != null && obj instanceof Person) {
			Person p = (Person)obj;
			result = this.personNumber.equals(p.personNumber);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("son", "951214-1000000");
		Person p2 = new Person("park", "951214-1000000");
		System.out.println(p1.equals(p2));
	}
	
	
}
