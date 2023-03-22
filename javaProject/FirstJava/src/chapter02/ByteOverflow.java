package chapter02;

public class ByteOverflow {

	public static void main(String[] args) {
		
//		다루어야 하는 데이터의 범위에따라 타입 설정이 달라져야 한다.
//		0 ~ 270
		byte b = 0;
		int n = 0;
		
//		0에서 1씩 더해서 270까지 증가
//		for(초기식; 비교식; 증감식) { 반복해야하는 코드들 }
		for(int i=0; i<=270; i++) {
			//System.out.println(i);
			System.out.println(b + "\t" + n);
			b++;
			n++;
		}
		
	}

}
