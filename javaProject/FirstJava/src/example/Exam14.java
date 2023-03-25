package example;

public class Exam14 {

	public static void main(String[] args) {
		
//		10A+B + 10B+A = 99 -> 11A + 11B = 99 -> A + B = 9 -> B = 9 - A
		
		for(int i = 0; i < 10; i++) {
			int a = i;
			int b = 9-a;
			
			System.out.println("A: "+ a +", B: "+ b);
		}
		
		for(int i = 0; i < 10; i++) {
//			a가 i인 이유 : 0 부터 9까지 증가하기 때문
			int a = i;
//			b는 a에서 9를 뺀 값을 구하면 되기 때문
//			ex) a가 1일때 9-1=8 이면 b가 8이 되면 a+b=9이기 때문
			int b = 9 - a;
			
			System.out.println(a + " " + b + " = " + (a + b) + "" + (b + a));
		}
	}

}
