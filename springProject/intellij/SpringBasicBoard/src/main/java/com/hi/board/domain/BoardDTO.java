package com.hi.board.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class BoardDTO {
	// 변수
	private int bno;            // PK
	private String title;       // 제목
	private String content;     // 내용
	private String writer;      // 작성자
	// 업로드한 파일의 이름
	private String file;        // 파일이름
	private String regdate;     // 등록날짜
	private String updatedate;  // 수정날짜

}
