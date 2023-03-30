package chapter07;

public class ClassCasting1 {

	public static void main(String[] args) {

		AndroidPhone androidPhone = new AndroidPhone("010-1111-2222");
		
		Phone phone = new AndroidPhone("111");
		Phone p = new IPhone("222");
		
		Phone phone1 = (Phone)androidPhone;
		Phone phone2 = androidPhone; // 하위타입의 참조변수를 상위타입으로 변경은 생략 가능
		
		AndroidPhone phone3 = (AndroidPhone)phone;
//		AndroidPhone phone4 = (AndroidPhone)p; // new IPhone("222"); 이게 들어가는데 AndroidPhone으로 선언을 해줘서 오류남
		
		IPhone iPhone = null;
		AndroidPhone androidPhone2 = null;
		
		if(p instanceof IPhone) {
			iPhone = (IPhone)p;
			iPhone.call();
		}else if(p instanceof AndroidPhone) {
			androidPhone2 = (AndroidPhone)p;
			androidPhone2.call();
		}else {
			System.out.println("불가능");
		}
		
		
	}

}
