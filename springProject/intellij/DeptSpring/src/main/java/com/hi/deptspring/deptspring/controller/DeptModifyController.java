package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.service.DeptReadService;
import com.hi.deptspring.deptspring.service.DeptModifyService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
@RequestMapping("/dept/modify")
public class DeptModifyController {

	@Autowired
	private DeptReadService readService;
	@Autowired
	private DeptModifyService modifyService;

	@GetMapping
	public String getModifyForm(
			@RequestParam("no") int deptno,
			Model model
	){
		log.info("GET | /dept/modify");

		model.addAttribute("dept", readService.getDept(deptno));

		return "dept/modifyForm";
	}

	@PostMapping
	public String modify(
			DeptDTO dto
	){
		log.info("POST | /dept/modify");
		log.info(dto);
		modifyService.updateDept(dto);

		return "redirect:/dept/list";
	}
}
