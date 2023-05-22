package com.hi.board.controller;

import com.hi.board.domain.BoardListPage;
import com.hi.board.domain.BoardSearchOption;
import com.hi.board.service.BoardListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class BoardListController {

	// 리스트를 갖올 mapper한 service 생성
	private final BoardListService listService;

	public BoardListController(BoardListService listService) {
		this.listService = listService;
	}

	@RequestMapping("/board/list")
	public void boardLIst(
			@RequestParam(value = "p", defaultValue = "1") int pageNum,
			@RequestParam (value = "searchType", defaultValue = "") String searchType,
			@RequestParam (value = "keyword", defaultValue = "") String keyword,
			/*BoardSearchOption searchOption,*/
			Model model
	) {
		log.info("/board/list ...");
		// http://localhost:8080/board/list?p=1
		// http://localhost:8080/board/list

		BoardSearchOption searchOption = BoardSearchOption.builder().searchType(keyword.trim().length()<1 ? null : searchType).keyword(keyword.trim().length()<1 ? null : keyword).build();
		log.info(">>>>> searchOption : " + searchOption);

		BoardListPage page = listService.getPage(pageNum, searchOption);
		log.info(page);

		// model로 view에 전달
		//model.addAttribute("list", listService.getBoardList());
		model.addAttribute("page", page);
	}

}
