package com.hi.board.domain;

import java.util.List;

public class BoardListPage {
	
	private int countPerPage;       // 페이지 당 출력 할 게시물의 개수
	private int pageNum;            // 현재 페이지 번호
	private List<BoardDTO> list;    // 게시물의 리스트 List<BoardDTO>
	private int totalCount;         // 전체 게시물의 개수
	private int startNum;           // 페이징 시작 번호
	private int endNum;             // 페이징 끝 번호
	private boolean prev;           // 이번 버튼 출력 유무
	private boolean next;           // 다음 버튼 출력 유무

	public BoardListPage(int countPerPage, int pageNum, List<BoardDTO> list, int totalCount) {
		this.countPerPage = countPerPage;
		this.pageNum = pageNum;
		this.list = list;
		this.totalCount = totalCount;
		calPageInfo();
	}

	private void calPageInfo() {
		// 끝 번호
		//Math.ceil : 소수점 이하의 값을 무조건 올림
		this.endNum = (int)(Math.ceil(this.pageNum*1.0/10))*10;
		// 시작 번호
		this.startNum = this.endNum - 9;
		// 실제 끝 번호 : 전체 페이지의 끝 번호
		int realEndNum = (int)(Math.ceil(this.totalCount * 1.0 / countPerPage));
		// endNum
		this.endNum = realEndNum < this.endNum ? realEndNum : this.endNum;

		// 이전 유무
		this.prev = this.startNum > 1;
		// 다음 유무 : 현재 구간의 마지막 번호 < realEndNum
		this.next = this.endNum < realEndNum;
	}
}
