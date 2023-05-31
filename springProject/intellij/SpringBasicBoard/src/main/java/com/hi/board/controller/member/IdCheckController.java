package com.hi.board.controller.member;

import com.hi.board.service.member.MemberIdCheckService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class IdCheckController {

	private MemberIdCheckService checkService;

	public IdCheckController(MemberIdCheckService checkService) {
		this.checkService = checkService;
	}

	@RequestMapping("/member/idcheck")
	@ResponseBody
	public String idCheck(@RequestParam("uid") String uid){
		return checkService.idCheck(uid);
	}

}
