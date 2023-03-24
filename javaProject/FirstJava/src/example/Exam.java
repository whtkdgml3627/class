package example;

public class Exam {

	public static void main(String[] args) {

//		0 ~ 9 사이의 난수를 100개 만들고,
//		발생된 난수에서 숫자가 몇개씩 있는지를 판별하여 그래프화 해보자
		
//		난수 0 ~ 9사이 100개 발생
		for(int i = 0; i < 10; i++) {
//			System.out.println(i + "의 개수 : ");
			int ranNum = (int)(Math.random()*10);
			System.out.print(ranNum);
		}

	}

}
