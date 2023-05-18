package com.hi.board.controller;

import com.hi.board.service.BoardListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class BoardListController {

	// 리스트를 갖올 mapper한 service 생성
	private final BoardListService listService;

	public BoardListController(BoardListService listService) {
		this.listService = listService;
	}

	@RequestMapping("/board/list")
	public void boardLIst(Model model) {
		log.info("/board/list ...");
		// model로 view에 전달
		model.addAttribute("list", listService.getBoardList());
	}

}
