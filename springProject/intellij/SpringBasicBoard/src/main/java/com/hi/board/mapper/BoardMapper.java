package com.hi.board.mapper;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.RequestRegBoard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

	// 게시판 리스트 출력 - select
	List<BoardDTO> selectAll();

	// 게시판 등록 - insert
	int insertBoard(RequestRegBoard regBoard);


}
