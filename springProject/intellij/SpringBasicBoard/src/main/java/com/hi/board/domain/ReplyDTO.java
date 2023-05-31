package com.hi.board.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ReplyDTO {
	
	private int rno;            // 댓글번호
	private int bno;            // 게시글번호
	private int memidx;         // 회원번호
	private String reply;       // 댓글
	private String replyDate;   // 댓글 등록 날짜
	private String updateDate;  // 대글 수정 날짜
	
}
