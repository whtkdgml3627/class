import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx1 {

	// bad code
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("192.168.0.53", 8080);
		System.out.println(socket);

		// 보내려면 OutputSteam이 필요
		OutputStream out = socket.getOutputStream();

		FileInputStream fin = new FileInputStream("C:\\zzz\\test.jpg");

		// 계속 읽어서 계속 보내기
		while(true) {
			// 1바이트 내용을
			int data = fin.read();

			// -1 파일을 다 읽었다면 break
			if(data == -1){
				break;
			}
			// 내용을 전송
			out.write(data);
		}// end while

		// 사용했던 자원들 정리
		fin.close();
		out.close();
		socket.close();

//		out.write(65);
//		out.write(66);
//		out.write(67);

	}
}
