package com.hi.board.service;

import com.hi.board.domain.RequestRegBoard;
import com.hi.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

@Service
public class BoardWriteService {

	private final BoardMapper boardMapper;

	public BoardWriteService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	// mapper에서 받아와서 controller로 넘겨주기 위한 메소드
	public int writeBoard(RequestRegBoard board){
		return boardMapper.insertBoard(board);
	}
}
