package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\test\\test.txt");
			fout.write(65);
			fout.close(); // i/o 에서는 스트림 사용 후 반드시 닫아준다! close();
			System.out.println("파일에 데이터 쓰기 성공");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
	}
	
}
