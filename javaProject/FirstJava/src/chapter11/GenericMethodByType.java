package chapter11;

public class GenericMethodByType {
	
	public <T> void introduce(T t) {
		System.out.println("안녕하세요. " + t.toString() + " 입니다.");
	}
	
	public static void main(String[] args) {
		
		GenericMethodByType byType = new GenericMethodByType();
		byType.<String>introduce("손흥민");
		byType.<Integer>introduce(100);
		// 생략이 가능하며 생략을 하면
		// 값이 들어간거에 맞게 타입을 지정해준다.
		byType.introduce("1");
		byType.introduce(true);
	}
	
}
