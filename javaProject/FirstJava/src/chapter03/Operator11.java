package chapter03;

public class Operator11 {

	public static void main(String[] args) {
		
		char c = 'A';
		int num = 10;
		
		System.out.println(c > 10); // char > int -> int > int로 바뀜
		System.out.println('1' > '0'); // char > char -> int > int로 바뀜
		System.out.println(num == 10f); // int == float -> float == float로 바뀜
		
	}

}
