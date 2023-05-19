package com.hi.board.mapper;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.RequestModifyRequest;
import com.hi.board.domain.RequestRegBoard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

	// 게시판 리스트 출력 - select
	List<BoardDTO> selectAll();

	// 상세 페이지 - select
	BoardDTO selectByBno(int bno);

	// 게시판 등록 - insert
	int insertBoard(RequestRegBoard regBoard);

	// 게시판 수정 - update
	int updateBoard(RequestModifyRequest modifyRequest);

	// 게시판 삭제 - delete
	int deleteBoard(int bno);

}
