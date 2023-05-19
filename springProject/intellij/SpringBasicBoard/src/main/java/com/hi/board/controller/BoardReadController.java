package com.hi.board.controller;

import com.hi.board.service.BoardReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class BoardReadController {

	private final BoardReadService readService;

	public BoardReadController(BoardReadService readService) {
		this.readService = readService;
	}

	@RequestMapping("/board/read")
	public void read(@RequestParam("bno") int bno, Model model) {
		log.info("/board/read");
		model.addAttribute("article", readService.getBoardDTO(bno));
	}

}
