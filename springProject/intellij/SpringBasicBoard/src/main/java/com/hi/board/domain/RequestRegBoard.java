package com.hi.board.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class RequestRegBoard {

	// 변수
	private String title;           // 제목
	private String content;         // 내용
	// 회원제 게시판 작성자는 memidx로 변경 ,
	//private String writer;
	private int memidx;             // 작성자
	// 파일 업로드를 위해 변수 추가
	private MultipartFile file;     // 파일 - 사용자로부터 받는 파일 객체
	private String filename;        // 파일이름 - DB에 저장할 file 이름

}
