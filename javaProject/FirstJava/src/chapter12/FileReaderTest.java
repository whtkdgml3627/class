package chapter12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		
		char[] cBuf = new char[10];
		int readCnt = 0;
		
		try {
			Reader in = new FileReader("D:\\test\\test-test.txt");
			
			while(true) {
				readCnt = in.read(cBuf);
				if(readCnt == -1) {
					break;
				}
				System.out.println(cBuf);
			}
			in.close();
			System.out.println("출력이 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
