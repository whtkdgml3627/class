package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/login")
@Log4j2
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String loginForm(){
		log.info("get  |  /login");

		return "member/loginForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String login(HttpServletRequest request){
		log.info("post  |  /login");

		// 로그인 처리
		HttpSession session = request.getSession();
		session.setAttribute("loginInfo", "Login");
		log.info("로그인 처리");

		// post 처리 후 redirect
		return "redirect:/sample/sample1";
		// http://localhost:8080/sample/sample1
	}

}
