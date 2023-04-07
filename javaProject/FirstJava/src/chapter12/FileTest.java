package chapter12;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) {
		
		File file1 = new File("D:\\test\\test1234.zip");
		File dir1 = new File("D:\\tests");
		
		System.out.println(dir1.exists());
		
		if(!dir1.exists()) {
			// 폴더가 존재하지 않으면 폴더를 생성
			dir1.mkdir();
			System.out.println("D 드라이브에 tests 폴더를 생성...");
		}
		
		if(file1.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		File dir2 = new File("D:\\test");
		File newFile = new File("D:\\test", "test-text2.text");
		File newFile2 = new File(dir2, "test-text2.txt");
		
		System.out.println("파일 여부 확인 : " + newFile.isFile());
		System.out.println("폴더 여부 확인 : " + dir2.isDirectory());
		
		File[] list = dir2.listFiles();
		
		System.out.println("test 폴더 ----------------");
		for(File file : list){
			if(file.isDirectory()) {
				System.out.print("[DIR] ");
			}else if(file.isFile()) {
				System.out.print("[File] ");
			}
			System.out.println(file.getName());
		}
		
		File newPathFile = new File("D:\\test\\src", "test-test2.txt");
		
		// 파일의 이동
		newFile.renameTo(newPathFile);
		System.out.println("파일 이동 완료");
		
	}
	
}
