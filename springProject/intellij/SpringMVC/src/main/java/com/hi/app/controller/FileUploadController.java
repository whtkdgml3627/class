package com.hi.app.controller;

import com.hi.app.domain.Report;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@Log4j2
@RequestMapping("/report")
public class FileUploadController {

	// get
	@GetMapping // @RequestMapping(method = RequestMethod.GET)과 동일
	public String getReportForm(){
		log.info("GET.. /report");
		return "report/reportForm";
	}

	// post : 파일 처리 -> 파일 이름, 사이즈, 파일 저장 확인
	// 파일 저장 : 저장 폴더 생성 -> 해당 경로(웹 경로) -> 시스템 경로에 파일 저장
	// 이미지 업로드 -> 웹 페이지에서 확인
	@PostMapping("/submit1") // @RequestMapping(value = "/submit1", method = RequestMethod.POST)
	public String submit1(
			@RequestParam("snum") String snum,
			@RequestParam("sname") String sname,
			@RequestParam("report") MultipartFile report,
			Model model,
			HttpServletRequest request
			) throws IOException {

		log.info("POST.. /report/submit1");
		log.info("학번 : " + snum);
		log.info("이름 : " + sname);
		log.info("파일 이름 : " + report.getOriginalFilename());
		log.info("파일 타입 : " + report.getContentType());
		log.info("파일 사이즈 : " + report.getSize());
		model.addAttribute("snum", snum);
		model.addAttribute("sname", sname);
		model.addAttribute("fileName", report.getOriginalFilename());

		// 업로드 경로
		// 서버 경로 /uploadfile/report -> webapp 폴더에 uploadfile 폴더 생성

		// 1. 저장하고자 하는 웹 경로(URI : report 폴더)
		String uploadURI = "/uploadfile/report";
		// http://localhost:8080/uploadfile/report

		// 2. 웹 경로(URI : report 폴더) 기반으로 시스템 경로를 획득 : HttpServletRequest 필요
		String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);
		log.info(dirRealPath);

		// 3. 저장 (파일의 이름을 변경해서 저장 가능)
		File newFile = new File(dirRealPath, report.getOriginalFilename());

		report.transferTo(newFile);
		log.info("파일 저장 완료");

		// 4. view에 저장 이미지 이름을 공유

		return "report/submit1";
	}

	@PostMapping("/submit2")
	public String submit2(
			MultipartHttpServletRequest request,
			Model model
	) throws IOException {
		// 학번, 이름, 파일
		String sNum = request.getParameter("snum");
		String sName = request.getParameter("sname");
		MultipartFile report = request.getFile("report");

		log.info("POST.. /report/submit2");
		log.info("학번 : " + sNum);
		log.info("이름 : " + sName);
		log.info("파일 이름 : " + report.getOriginalFilename());

		// 웹 경로
		String uploadURI = "/uploadfile/report";
		// 실제 경로
		String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);

		// 새로운 파일의 경로
		File newFile = new File(dirRealPath, report.getOriginalFilename());

		// 저장
		report.transferTo(newFile);
		log.info("파일 저장 완료...!");

		// view로 전달
		model.addAttribute("snum", sNum);
		model.addAttribute("sname", sName);
		model.addAttribute("fileName", report.getOriginalFilename());

		return "report/submit2";
	}

	@PostMapping("/submit3")
	public String submit3(
			Report report,
			HttpServletRequest request
	) throws IOException {
		// 파라미터 확인 log
		log.info("학번 : " + report.getSnum());
		log.info("이름 : " + report.getSname());
		log.info("파일 이름 : " + report.getReport().getOriginalFilename());

		// 웹 경로
		String uploadURI = "/uploadfile/report";

		// 실제 경로
		String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);

		// 저장 파일 경로 : File 타입
		File newFile = new File(dirRealPath, report.getReport().getOriginalFilename());

		// 저장
		report.getReport().transferTo(newFile);
		log.info("파일 저장 완료...!");

		return "report/submit3";
	}

}
