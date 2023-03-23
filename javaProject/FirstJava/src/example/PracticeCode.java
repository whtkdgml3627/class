package example;

public class PracticeCode {

	public static void main(String[] args) {
//		문제 1 아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.
		System.out.print("문제1 : ");
		int num = 120;
		if(num>0 && (num%2)==0) {
    		System.out.println("양수이면서 짝수");
        }
		System.out.println();
        
//		문제 2 다음과 같이 출력이 이루어지도록 작성해보자.
//		num < 0 이라면 “0 미만” 출력
//		0 ≤ num <100 이라면 “0이상 100 미만“ 출력
//		100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
//		200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
//		300 ≤ num 이라면 “300이상 “ 출력
		System.out.print("문제2 : ");
		int num1 = 150;
		if(num1 < 0) {
			System.out.println("0 미만");
		}else if(num1 >= 0 && num1 < 100) {
			System.out.println("0이상 100미만");
		}else if(num1 >= 100 && num1 < 200) {
			System.out.println("100이상 200미만");
		}else if(num1 >= 200 && num1 < 300) {
			System.out.println("200이상 300미만");
		}else {
			System.out.println("300 이상");
		}
		System.out.println();
		
//		문제 3 조건연산자(3항 연산자)를 사용하지 않고, if~else를 사용하는 형태로 변경해 보자.
		System.out.println("문제3 : ");
		int num3 = 150;
		int num4 = 100;
		
		if(num3 > num4) {
			System.out.println("큰 수1 : " + num3);
			System.out.println("뺀 수1 : " + (num3 - num4));
		}else {
			System.out.println("큰 수2 : " + num4);
			System.out.println("뺀 수2 : " + (num4 - num3));
		}
		System.out.println();
		
//		문제 4 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.
		System.out.println("문제4 : ");
		int num5 = 3;
		
		if(num5 == 1) {
			System.out.println("Simple Java");
		}else if(num5 == 2) {
			System.out.println("Funny Java");
		}else if(num5 == 3) {
			System.out.println("Fantastic Java");
		}else {
			System.out.println("The best programming language");
		}
		System.out.println("Do you like coffee?");
		System.out.println();
		
//		문제 5 문제 2의 답안 코드를 switch 문으로 변경하여 보자.
//		num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 나머지 조건에 대해 변경하세요.
		System.out.print("문제5 : ");
		if(num1 < 0) {
			System.out.println("0 미만");
		}else {
//			100을 나눴을 때 나온 숫자로 판별
			switch(num1/100) {
			case 0 :
				System.out.println("0이상 100미만");
				break;
			case 1 :
				System.out.println("100이상 200미만");
				break;
			case 2 :
				System.out.println("200이상 300미만");
				break;
			default :
				System.out.println("300 이상");
			}
		}
		System.out.println();

//		문제 6 while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.
		System.out.print("문제6 : ");
		int num6 = 1;
		int sum = 0;
		
		while(num6 <= 99) {
			sum += num6;
			num6++;
		}
		System.out.println(sum);
		System.out.println();

//		문제 7 1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. while문과 do~while 문을 각각 한번씩 사용해서 작성
		System.out.println("문제7 : ");
		int num7 = 1;
		
		System.out.print("while : ");
//		while로 100까지 구함
		while(num7 <= 100) {
			System.out.print(num7 + " ");
			num7++;
		}
//		100이 되면 빠져나옴
		System.out.println();
		System.out.print("do while : ");
//		num7값이 101이니 먼저 --해줌
		do {
			num7--;
			System.out.print(num7 + " ");
		}while(num7 > 1);
//		한번은 실행되니 1까지만 실행되고 빠져나옴
		System.out.println();
		
//		문제 8 1000 이하의 자연수 중에서 2의 배수 이면서 7의 배수인 숫자를 출력하고, 그 출력된 숫자들의 합을 구하는 프로그램을 while 문을 이용해서 작성
		System.out.print("문제8 : ");
		int num8 = 1;
		int sum1 = 0;
		
		while(num8 <= 1000) {
//			2의 배수이면서 7의 배수 찾기
			if(num8 % 2 == 0 && num8 % 7 == 0) {
//				2의배수이면서 7의배수 더하기
				sum1 += num8;
			}
			num8++;
		}
		System.out.println(sum1);
		System.out.println();
		
//		문제 9 for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성
		System.out.print("문제9 : ");
		int sum2 = 1;
		
		for(int i = 1; i < 11; i++) {
			sum2 *= i;
		}
		System.out.println(sum2);
		System.out.println();
		
//		문제 10 for 문을 이용하여 구구단 중 5단을 출력하는 프로그램 작성
		System.out.print("문제10 : ");
		for(int i = 1; i < 10; i++) {
			System.out.print("5x" + i + "=" + i*5 + "\t");
		}
		System.out.println("\n");
		
//		문제 11 while 문을 for 문으로 변경하여 작성
		System.out.println("문제11 : ");
		int count = 0;
		int count1 = 0;
		
		for(int i = 1; i < 100; i++) {
//			5를 나눈 값이 0 이거나 7을 나눈값이 0 인 숫자만 추출
			if(i % 5 == 0 && i % 7 == 0) {
//				숫자가 해당될 때만 count++
				count++;
				System.out.println("해당하는 숫자 : " + i);
			}
		}
		System.out.println("count : " + count);
		
//		continue를 사용한 방식
		for(int i = 1; i < 100; i++) {
//			5를 나눈 값이 0 이거나 7을 나눈값이 0 인 숫자만 추출
			if(i % 5 != 0 || i % 7 != 0)
				continue;
//				숫자가 해당될 때만 count++
				count1++;
				System.out.println("해당하는 숫자 : " + i);
		}
		System.out.println("count : " + count1);
		System.out.println();
		
//		문제 12 자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다.
//		그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지,
//		그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성.
//		프로그램 내부에 while문을 무한 루프로 구성하여 작성.
		System.out.println("문제12 : ");
		
		int num12 = 0;
		int sum12 = 0;
		
		while(true) {
//			모든 홀수를 sum12에 더해준다
			if(num12 % 2 == 1) {
				sum12 += num12;
			}
//			3의 배수이면서 짝수를 sum12에 더해준다
			if(num12 / 3 == 0 && num12 % 2 == 0) {
				sum12 += num12;
			}
//			sum12의 합이 1000이 넘어가면 반복문을 빠져나가는 break를 걸어준다.
			if(sum12 > 1000) {
				System.out.println("더한값이 1000 이상이 되는 숫자 : " + num12);
				System.out.println("더한 값 : " + sum12);
				break;
			}
			num12++;
		}
		System.out.println();
		
//		문제 13 구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.
//		단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력
		System.out.println("문제13 : ");
		
//		8단까지만 출력
		for(int i = 1; i < 9; i++) {
//			8단의 8까지만 곱하면되니 8까지만 출력
			for(int j = 1; j < 9; j++) {
//				짝수단을 호출하지만 6은 제외
				if(i % 2 == 0 && i != 6) {
					System.out.print(i + "x" + j + "=" + i*j + "\t");
//					2x2, 4x4, 8x8 = i와 j가 같아지면 조건문 정지
					if(i == j) {
						System.out.println();
						break;
					}
				}
			}
		}
		System.out.println();
		
//		문제 14
//		다음 식을 만족하는 조합을 찾는 프로그램 작성. 
//		    A B
//		+   B A
//		  -------
//		    9 9
		System.out.println("문제14 : ");
		int A = 0;
		int B = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(i + j == 9) {
					System.out.print("A : " + i + " ");
					System.out.print("B : " + j);
					System.out.println();
					System.out.print("B : " + j + " ");
					System.out.print("A : " + i);
					System.out.println();
					System.out.println("------------");
					System.out.println("     " + (i+j) + "" + (i+j));
				}
			}
		}
		System.out.println();
		
//		문제 15
//		n=1 일 때  “현재 인원은 1명 입니다.”
//		n=2 일 때  “현재 인원은 2명 입니다.”
//		n=3 일 때  “현재 인원은 3명 입니다.”
//		n>3 일 때  “현재 많은 사람들이 있습니다.”
//		위의 내용이 출력 되는 프로그램을 작성. 각각 If 문과 switch 문 사용
		System.out.println("문제15 : ");
		int num15 = 1;
		
//		if문으로 작성
		if(num15 == 1) {
			System.out.println("현재 인원은 1명 입니다.");
		}else if(num15 == 2) {
			System.out.println("현재 인원은 2명 입니다.");
		}else if(num15 == 3) {
			System.out.println("현재 인원은 3명 입니다.");
		}else {
			System.out.println("현재 많은 사람들이 있습니다.");
		}
//		switch문으로 작성
		switch(num15) {
		case 1 :
			System.out.println("현재 인원은 1명 입니다.");
			break;
		case 2 :
			System.out.println("현재 인원은 2명 입니다.");
			break;
		case 3 :
			System.out.println("현재 인원은 3명 입니다.");
			break;
		default :
			System.out.println("현재 많은 사람들이 있습니다.");
		}
		System.out.println();
		
//		문제 16 1 부터 99까지의 합을 구하는 프로그램 작성
//		while문, for문, do while 문을 각각 사용
		System.out.println("문제16 : ");
		
//		while문
		int numWhile = 1;
		int sumWhile = 0;
		while(numWhile < 100) {
			sumWhile += numWhile;
			numWhile++;
		}
		System.out.println(sumWhile);
		
//		for문
		int sumFor = 0;
		for(int i = 1; i < 100; i++) {
			sumFor += i;
		}
		System.out.println(sumFor);
		
//		do while문
		int numDoWhile = 1;
		int sumDoWhile = 0;
		
		do {
			sumDoWhile += numDoWhile;
			numDoWhile++;
		}while(numDoWhile < 100);
		System.out.println(sumDoWhile);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
