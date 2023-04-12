package question;


/*
 * 문제5>
 * 2중 for문을 사용하여 아래의 결과를 출력하시오
 * 1 2 3 4 5 6 7 8 9 10
 * 2 3 4 5 6 7 8 9 10 1
 * 3 4 5 6 7 8 9 10 1 2
 * ....................
 * 10 1 2 3 4 5 6 7 8 9
 * 
 * for문과 if문
 * 
 */

public class LeeProfessorExam05 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
		    for(int j = 0; j < i+5; j++) {
		        if(i + j > 3) {
		        System.out.printf("* ");
		        }
		        else {
		            System.out.printf("  ");
		        }
		    }
		    System.out.println();
		}
		
		for(int i=5; i>0; i--) {
			for(int j=i; j<10; j++) {
				if(i*2-1 > j) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		
	}

}
