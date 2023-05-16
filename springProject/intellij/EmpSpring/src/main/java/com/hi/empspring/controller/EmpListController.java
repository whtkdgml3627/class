package com.hi.empspring.controller;

import com.hi.empspring.sevice.EmpListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/emp/list")
public class EmpListController {

	// service를 가져와서 model로 view에 출력
	private final EmpListService listService;

	// final로 선언해주면 생성자가 무적권 있어야한다!
	public EmpListController(EmpListService listService) {
		this.listService = listService;
	}

	// get방식 으로 url만 호출
	@GetMapping
	public void getListPage(Model model) {
		log.info("GET | /emp/list");
		// model로 view에 뿌려줄거 생성
		model.addAttribute("list", listService.select());
	}

}
