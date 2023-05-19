package com.hi.board.controller;

import com.hi.board.domain.RequestModifyRequest;
import com.hi.board.service.BoardModifyService;
import com.hi.board.service.BoardReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/board/modify")
public class BoardModifyController {

	private final BoardReadService readService;
	private final BoardModifyService modifyService;

	public BoardModifyController(BoardReadService readService, BoardModifyService modifyService) {
		this.readService = readService;
		this.modifyService = modifyService;
	}

	@GetMapping
	public void modifyForm(
			@RequestParam("bno") int bno,
			Model model
	) {
		// bno 전달 받고 View로 BoardDTO 객체 전달
		model.addAttribute("board", readService.getBoardDTO(bno));

		log.info("GET | /board/modify");
	}

	@PostMapping
	public String modify(
			RequestModifyRequest modifyRequest,
			HttpServletRequest request
	) {
		// 사용자가 입력한 BoardDTO Service 전달 -> update
		log.info(modifyRequest);

		modifyService.modifyBoardDTO(modifyRequest, request);

		return "redirect:/board/list";
	}

}
