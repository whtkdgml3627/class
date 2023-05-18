package com.hi.board.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class RequestRegBoard {

	// 변수
	private String title;   // 제목
	private String content; // 내용
	private String writer;  // 작성자

}
