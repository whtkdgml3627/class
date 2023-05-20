package com.hi.empspring.controller;

import com.hi.empspring.domain.EmpVO;
import com.hi.empspring.sevice.EmpModifyService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
@RequestMapping("/emp/modify")
public class EmpModifyController {

	private final EmpModifyService modifyService;

	public EmpModifyController(EmpModifyService modifyService) {
		this.modifyService = modifyService;
	}

	@GetMapping
	public void getModifyPage(@RequestParam("empno") int empno, Model model){
		log.info("GET | /emp/read");
		model.addAttribute("emp", modifyService.selectByEmpno(empno));
	}

	@PostMapping
	public String modifyEmp(EmpVO empVO){
		modifyService.updateEmp(empVO);
		return "redirect:/emp/list";
	}

}
