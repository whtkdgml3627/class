package com.hi.app.controller;

import com.hi.app.domain.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@Log4j2
public class SearchController {

	@RequestMapping("/search/search1")
	public String search1(
			Model model,
			String keyword,
			@RequestParam(value = "tno", required = false) String tno,
			@RequestParam(value = "page", defaultValue = "1") int page,
			HttpServletRequest request,
			@ModelAttribute("req") UserRequest userRequest){

		log.info("/search/search1 ...");
		log.info("keyword : " + keyword);
		log.info("tno : " + tno);
		log.info("page : " + page);

		// 사용자가 전달하는 파라미터를 받는 방법
		// 1. 매개변수에 변수를 정의 : 변수의 이름은 파라미터의 이름으로 정의
		// 2. @RequestParam() : 필수항목, 기본값을 정의
		// 3. HttpServletRequest
		// 4. Beans 이용

		String keywordStr = request.getParameter("keyword");
		String tnoStr = request.getParameter("tno");
		String pageStr = request.getParameter("page");

		log.info("keywordStr : " + keywordStr);
		log.info("tnoStr : " + tnoStr);
		log.info("pageStr : " + pageStr);

		log.info(userRequest);

		model.addAttribute("result", keyword+tno);
		model.addAttribute("page", page);

		return "search/search1";
	}

	@RequestMapping("/search/main")
	public String main(){
		return "search/main";
	}

	@ModelAttribute("keywords")
	public String[] getQueryList(){
		return new String[] {"손흥민", "이강인", "김민재"};
	}

	@ModelAttribute("searchType")
	public List<String> getSearchType(){
		List<String> list = new ArrayList<>();
		list.add("id");
		list.add("title");
		list.add("keyword");

		return list;
	}

}
