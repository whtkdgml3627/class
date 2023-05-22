package com.hi.board.controller.member;

import com.hi.board.domain.member.MemberRegistRequest;
import com.hi.board.service.member.MemberRegistService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/member/regist")
public class MemberRegistController {

	private final MemberRegistService registService;

	public MemberRegistController(MemberRegistService registService) {
		this.registService = registService;
	}

	@GetMapping
	public void getRegistForm() {
		log.info("GET | regist");
	}

	@PostMapping
	public String regist(MemberRegistRequest registRequest, HttpServletRequest request) {
		log.info(">>>>> Controller : registRequest -> " + registRequest);

		registService.registMember(registRequest, request);
		return "redirect:/login";
	}

}
