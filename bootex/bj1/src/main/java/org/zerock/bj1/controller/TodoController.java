package org.zerock.bj1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/todo/")
public class TodoController {
	
	// list get
	@GetMapping("list")
	public void list() {
		log.info("GET | LIST");
	}

	// add get
	@GetMapping("add")
	public void add() {
		log.info("GET | ADD");
	}

	// add post
	@PostMapping("add")
	public String addForm() {
		log.info("POST | ADD");
		return "redirect:/todo/list";
	}

	// read get
	@GetMapping("read/{tno}")
	public String read(@PathVariable("tno") Long tno) {
		log.info("GET | READ");
		return "todo/read";
	}

	// modify get
	@GetMapping("modify/{tno}")
	public String modify(@PathVariable("tno") Long tno) {
		log.info("GET | MODIFY");
		return "/todo/modify";
	}

	// modify post
	@PostMapping("modify/{tno}")
	public String modifyForm(@PathVariable("tno") Long tno) {
		log.info("POST | MODIFY");
		return "redirect:/todo/read/" + tno;
	}

	// delete post
	@PostMapping("remove")
	public String remove() {
		log.info("POST | DELETE");
		return "redirect:/todo/list";
	}

}
