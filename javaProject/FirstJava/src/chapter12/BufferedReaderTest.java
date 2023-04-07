package chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		BufferedReader in = null;
		String str = null;
		
		// Reader 객체 생성
		try {
			in = new BufferedReader(new FileReader("D:\\test\\test-test2.txt"));
			
			while(true) {
				// 읽기 시작
				str = in.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
