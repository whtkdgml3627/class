package chapter02;

public class VarRefferenceType {

	public static void main(String[] args) {
		
//		String str = null; // 참조변수 : 객체의 주소값, null -> 아직 주소값을 저장하고 있지 않다. (어떠한 객체도 가르키고 있지 않다)
		String str;
		
		str = "JAVA"; // "문자열" -> String 타입의 객체를 생성 / String은 불변
		
		System.out.println(str); // str.toString();
		
	}

}
