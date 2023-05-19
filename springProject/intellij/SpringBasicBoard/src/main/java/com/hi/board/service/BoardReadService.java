package com.hi.board.service;

import com.hi.board.domain.BoardDTO;
import com.hi.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

@Service
public class BoardReadService {

	private final BoardMapper boardMapper;

	public BoardReadService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	public BoardDTO getBoardDTO(int bno) {
		return boardMapper.selectByBno(bno);
	}

}
