package com.hi.board.service;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.BoardListPage;
import com.hi.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardListService {

	// 리스트를 가져올 mapper 생성
	private final BoardMapper boardMapper;
	private final int countPerPage = 5;

	public BoardListService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	public List<BoardDTO> getBoardList() {
		return boardMapper.selectAll();
	}

	public BoardListPage getPage(int pageNum) {
		// 현재 요청 페이지
		int requestPageNum = pageNum;

		// 요청 페이지의 리스트 항목 : List<BoardDTO>
		List<BoardDTO> list = boardMapper.selectList((requestPageNum-1)*countPerPage, countPerPage);
		int totalCount = boardMapper.selectTotalCount();
		BoardListPage page = new BoardListPage(countPerPage, requestPageNum, list, totalCount);

		return page;
	}
}
