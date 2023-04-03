package chapter09;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");
		
		// 참조변수 == 은 주소값을 비교한다.
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		// .equals()는 ""안의 문자열을 비교한다.
		System.out.println(str1.equals(str3));
		
		// 특정 타입의 데이터를 -> String 타입으로 변경 (문자열로 변경)
		String str4 = ""+1;
		String str5 = String.valueOf(1); // String 타입으로 변환
		String str6 = new String("");
		System.out.println(str5.toString());
		
		String str = "Hello~";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.length()); // 문자열의 길이 : 문자의 개수
		// index : 0 ~ str.length()-1 의 개수
		
		// 반복문
		// 문자열 출력
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
		
		// 역순으로 출력
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("\n=========================");
		
		// compareTo - String 클래스에서의 오버라이딩
		System.out.println(str.compareTo("Hello~"));
		System.out.println(str.compareTo("Hello~~"));
		System.out.println(str.compareTo("Hello"));
		System.out.println("=========================");
		
		// 문자열을 붙인다! -> "" + "" -> concat(String s)을 사용하여 처리
		System.out.println(str.concat(" JAVA!!!"));
		System.out.println("=========================");
		
		// 문자열에 특정 문자열을 포함여부를 확인하는 메소드 -> boolean값이 나옴 (true or false)
		System.out.println(str.contains("l"));
		System.out.println(str.contains("bye"));
		
		String file1 = "phone.jpg";
		String file2 = "java.pdf";
		
		// endsWith 메서드를 사용하여 어떤 문자열에서 특정 문자열로 끝나는지를 확인할 수 있으며, 그 결과를 true 혹은 false로 반환한다.
		if(file2.endsWith(".jpg") || file2.endsWith(".pdf")) {
			System.out.println("업로드가 가능합니다.");
		}else {
			System.out.println("확장자가 .jpg인 파일만 업로드가 가능합니다.");
		}
		
		// equals -> 저장하고 있는 문자열을 비교, 그 결과를 true 혹은 false로 반환한다.
		System.out.println(str.equals("Hello"));
		System.out.println(str.equals("Hello~"));
		
		// 문자열의 사이즈 체크 : isEmpty() -> str.length() == 0과 같은 메소드, 결과를 true 혹은 false로 반환한다.
		System.out.println(str.isEmpty());
		System.out.println("".isEmpty());
		
		// 문자열의 개수
		System.out.println(str.length());
		
		// 문자열 변경 .replace
		System.out.println(str);
		System.out.println(str.replace('~', '!'));
		System.out.println(str.replace("Hello", "JAVA"));
		
		// 시작하는 문자열 체크 : http://localhost:80/ startsWith 어떤 문자열이 특정 문자로 시작하는지 확인하여 결과를 true 혹은 false로 반환합니다.
		String url = "http://localhost:80/member/login.jsp";
		System.out.println(url.startsWith("http://"));
		String domain = "http://localhost:80/";
		System.out.println(url.substring(domain.length()));
		
		// trim() : 공백 제거
		String str7 = "      Hello       Java       ";
		System.out.println(str7);
		System.out.println(str7.trim());

		
	}

}
