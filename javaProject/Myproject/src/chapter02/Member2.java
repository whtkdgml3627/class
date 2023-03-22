package chapter02;

public class Member2 {

	public static void main(String[] args) {
		
//		String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
		String name = "조상희";
		
//		int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
		int age = 33;
		
//		double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다
		double height = 170.0;
		
//		boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
		boolean hasBook = true;
		
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n키 : " + height + "\nJAVA책 보유 여부 : " + hasBook);
	}

}
