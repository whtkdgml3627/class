package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import com.hi.deptspring.deptspring.service.DeptRegistService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/dept/regist")
public class DeptRegistController {

	private final DeptRegistService deptRegistService;

	public DeptRegistController(DeptRegistService deptRegistService) {
		this.deptRegistService = deptRegistService;
	}

	// get
	@GetMapping
	public String registForm() {

		log.info("GET | /dept/regist");
		return "dept/registForm";
	}

	// post
	@PostMapping
	public String regist(DeptRegistRequest registRequest) {
		log.info("POST | /dept/regist");

		log.info(registRequest);

		deptRegistService.registDept(registRequest);
		return "redirect:/dept/list";
	}

}
