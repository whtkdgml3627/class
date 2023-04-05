package chapter11;

import chapter08.SmartPhone;
import chapter08.Phone;

public class GenericMethodByType3 {
	
	public void introduce(MyClass<? super SmartPhone> t) {
		System.out.println("안녕하세요. " + t.toString() + " 입니다.");
	}
	
	public static void main(String[] args) {
		
		GenericMethodByType3 byType = new GenericMethodByType3();
		MyClass<Phone> class1 = new MyClass<>();
		class1.setVal(new SmartPhone("010-1111-2222", "IOS"));
		
		byType.introduce(class1);
		
	}
	
}
