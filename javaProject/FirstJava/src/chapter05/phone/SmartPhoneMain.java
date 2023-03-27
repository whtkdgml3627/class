package chapter05.phone;

public class SmartPhoneMain {

	public static void main(String[] args) {

		SmartPhone sp1 = new SmartPhone("RED", 5.0f, 10);
		SmartPhone sp2 = new SmartPhone("GOLD", 4.0f);
		SmartPhone sp3 = new SmartPhone();
//		호출 순서
//		new SmartPhone
//		SmartPhone("RED", 5.0f, 10)
		
//		sp.color = "WHITE";
//		sp.size = 4.5f;
//		sp.volume = 5;

		System.out.print(sp1.color + "\t");
		System.out.print(sp1.size + "\t");
		System.out.print(sp1.volume);
		System.out.println();
		System.out.print(sp2.color + "\t");
		System.out.print(sp2.size + "\t");
		System.out.print(sp2.volume);
		System.out.println();
		System.out.print(sp3.color + "\t");
		System.out.print(sp3.size + "\t");
		System.out.print(sp3.volume);
		
	}

}
