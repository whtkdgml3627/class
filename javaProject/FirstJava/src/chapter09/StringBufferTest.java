package chapter09;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		// append -> 마지막에 추가해줌
		//sb.append('~');
		//sb.append(" JAVA");
		sb.append("~").append(" JAVA");
		System.out.println(sb); // Hello~ JAVA
		
		// delete
		sb.delete(5, 7);
		System.out.println(sb); // HelloJAVA
		
		// insert
		sb.insert(5, "~");
		System.out.println(sb); // Hello~ JAVA
		sb.insert(6, "~! ");
		System.out.println(sb); // Hello~~! JAVA
		sb.insert(sb.length(), "!!");
		System.out.println(sb); // Hello~~! JAVA!!
		
		// reverse
		sb.reverse();
		System.out.println(sb);
		
		String result = new String(sb);
		System.out.println(result);
		
	}

}
