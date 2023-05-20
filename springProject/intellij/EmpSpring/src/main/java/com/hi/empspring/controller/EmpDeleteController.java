package com.hi.empspring.controller;

import com.hi.empspring.sevice.EmpDeleteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class EmpDeleteController {

	private final EmpDeleteService deleteService;

	public EmpDeleteController(EmpDeleteService deleteService) {
		this.deleteService = deleteService;
	}

	@RequestMapping("/emp/delete")
	public String delete(@RequestParam("empno") int empno) {
		log.info("/emp/delete");
		deleteService.deleteEmp(empno);
		return "redirect:/emp/list";
	}

}
