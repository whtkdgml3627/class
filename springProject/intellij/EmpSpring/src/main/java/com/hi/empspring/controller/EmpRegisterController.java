package com.hi.empspring.controller;

import com.hi.empspring.domain.EmpVO;
import com.hi.empspring.sevice.EmpRegisterService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/emp/register")
public class EmpRegisterController {

	private final EmpRegisterService registerService;

	public EmpRegisterController(EmpRegisterService registerService) {
		this.registerService = registerService;
	}

	// get
	@GetMapping
	public String getRegisterPage() {
		log.info("GET | /emp/register");
		return "emp/register";
	}

	// post
	@PostMapping
	public String Register(EmpVO empVO){
		log.info("POST | /emp/register");
		registerService.registerEmp(empVO);
		return "redirect:/emp/list";
	}

}
