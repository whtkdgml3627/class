package com.hi.board.service;

import com.hi.board.domain.BoardDTO;
import com.hi.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardListService {

	// 리스트를 가져올 mapper 생성
	private final BoardMapper boardMapper;

	public BoardListService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	public List<BoardDTO> getBoardList(){
		return boardMapper.selectAll();
	}
}
