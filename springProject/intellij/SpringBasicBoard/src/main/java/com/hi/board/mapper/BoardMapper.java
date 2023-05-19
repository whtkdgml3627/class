package com.hi.board.mapper;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.RequestModifyRequest;
import com.hi.board.domain.RequestRegBoard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

	// 게시판 페이징 - select
	// selectList(0, 5) #{param1} => 0, #{param2} => 5
	// param1 : 첫번 째 매개변수, param2 : 두번 째 매개변수
	List<BoardDTO> selectList(int startNum, int count);

	// 전체
	int selectTotalCount();

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
