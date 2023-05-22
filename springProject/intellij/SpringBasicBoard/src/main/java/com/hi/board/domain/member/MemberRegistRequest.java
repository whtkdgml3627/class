package com.hi.board.domain.member;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberRegistRequest {

	private String uid;             // 회원
	private String uname;           // 이름
	private String pw;              // 비밀번호
	private MultipartFile uphoto;   // 프로필사진 -> 사용자한테 받음
	private String fileName;        // 파일명 -> DB에 전달해줄 파일이름

}
