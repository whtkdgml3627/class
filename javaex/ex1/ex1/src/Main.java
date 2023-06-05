import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {

	// bad code
	public static void main(String[] args) throws Exception {

		URL url = new URL("https://img.megabox.co.kr/SharedImg/2023/05/07/XbkZesk2KFfQbbagfMtyp8rVUWi8568M_420.jpg");

		InputStream fin = url.openStream();

		// 1단계 -> 빨대 준비
		// FileInputStream fin = new FileInputStream("C:\\zzz\\test.jpg");

		FileOutputStream fos = new FileOutputStream("C:\\zzz\\copy.jpg");
		
		System.out.println(fin);

		// 2단계 -> 읽고 쓰기
		while(true){
			int data = fin.read();
			if(data == -1){
				break;
			}
			fos.write(data);
		}// end while

	}

}