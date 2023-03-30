package chapter07;

//import java.util.ArrayList;

//3. main()메소드를 정의해봅시다.
//① Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.
//② 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.

public class PersonMain {

	public static void main(String[] args) {
		// 배열 선언
		Person[] persons = new Person[3];
		
		// 상위 클래스로 배열을 선언하여 하위 클래스의 클래스를 배열에 담는다
		persons[0] = new Person("조상희1", "911028-1111111");
		persons[1] = new Male("조상희2", "921028-1111111", "남자");
		persons[2] = new Female("조상희3", "901028-2111111", "여자");
		
		// 향상된 for문으로 배열의 전체를 출력
		for(Person people : persons) {
//			System.out.println(people);
			// 각 클래스의 hello메소드 출력 (하위 클래스에는 오버라이딩해줌)
			System.out.println(people.hello());
		}
		
//		ArrayList<Person> persons = new ArrayList<>();
//		
//		persons.add(new Person("조상희", "911028-1111111"));
//		persons.add(new Male("조상희1", "925421-1111111", "짧은머리 남자"));
//		persons.add(new Female("조상희2", "921111-2111111", "긴머리 여자"));
//		persons.add(new Female("조상희2", "921111-2111111", "긴머리 여자"));
//		persons.add(new Female("조상희2", "921111-2111111", "긴머리 여자"));
//		persons.add(new Female("조상희2", "921111-2111111", "긴머리 여자"));
//		persons.add(new Female("조상희2", "921111-2111111", "긴머리 여자"));
//		persons.add(new Female("조상희2", "921111-2111111", "긴머리 여자"));
//		for(Person people : persons) {
//			System.out.println(people);
//		}
	}

}
