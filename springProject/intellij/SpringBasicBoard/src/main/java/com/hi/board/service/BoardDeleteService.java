package com.hi.board.service;

import com.hi.board.domain.BoardDTO;
import com.hi.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Service
public class BoardDeleteService {

	private final BoardMapper boardMapper;

	public BoardDeleteService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	public int deleteBoard(int bno, HttpServletRequest request) {

		// 삭제 대상의 파일 이름을 획득
		BoardDTO board = boardMapper.selectByBno(bno);
		String delFileName = board.getFile();

		// DB 삭제
		int result = boardMapper.deleteBoard(bno);
		
		// 파일 삭제
		if(delFileName != null){
			// 웹 경로
			String uri = "/uploadfile/board";
			// 실제 경로
			String realPath = request.getSession().getServletContext().getRealPath(uri);
			// 삭제 대상 파일의 -> File 객체
			File delFile = new File(realPath, delFileName);
			// 현재 File의 존재 여부 확인
			// 존재하면 삭제
		}
		
		return boardMapper.deleteBoard(bno);
	}
}
