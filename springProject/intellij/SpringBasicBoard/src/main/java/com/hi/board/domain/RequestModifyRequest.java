package com.hi.board.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class RequestModifyRequest {
	// 변수
	private int bno;
	private String title;
	private String content;
	private String writer;
	private String oldfile;
	private MultipartFile file;
	private String filename;
}
