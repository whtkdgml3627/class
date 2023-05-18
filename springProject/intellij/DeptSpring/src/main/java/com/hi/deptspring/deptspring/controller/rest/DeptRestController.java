package com.hi.deptspring.deptspring.controller.rest;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import com.hi.deptspring.deptspring.service.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequestMapping("/api/v1/depts")
public class DeptRestController {
	
	// get : 전체 리스트
	// get /{no} : 부서 하나의 정보를 반환
	// post : JSON 형식의 데이터를 받아서 데이터베이스에 저장
	// put /{no} : 하나의 부서 정보를 수정, 전체 데이터를 수정
	// delete /{no} : 부서 정보 하나를 삭제

	private final DeptListService listService;
	private final DeptReadService readService;
	private final DeptRegistService registService;
	private final DeptModifyService modifyService;
	private final DeptDeleteService deleteService;

	public DeptRestController(DeptListService listService, DeptReadService readService, DeptRegistService registService, DeptModifyService modifyService, DeptDeleteService deleteService) {
		this.listService = listService;
		this.readService = readService;
		this.registService = registService;
		this.modifyService = modifyService;
		this.deleteService = deleteService;
	}

	// List
	@GetMapping // /api/v1/depts
	//public List<DeptDTO> getDeptList() {
	public ResponseEntity<List<DeptDTO>> getDeptList() {

		// RespnoseEntity<T> => 응답 해야되는 데이터를 제네릭으로 정의
		// body(응답 데이터), httpHeader, statusCode
		// new ResponseEntity<>(응답데이터, httpHeader, statusCode);
		// new ResponseEntity<>(응답데이터, statusCode);
		// Header 정의 => HttpHeaders (Map 형식으로 데이터 저장)
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("some-header", "some-value");

		ResponseEntity<List<DeptDTO>> entity = new ResponseEntity<>(listService.getList(), httpHeaders, HttpStatus.OK);

		// return listService.getList();
		return entity;
	}

	// Read
	@GetMapping("/{no}")
	public DeptDTO getDept(@PathVariable("no") int deptno) {
		return readService.getDept(deptno);
	}

	@PostMapping // /api/v1/depts
	//public String regDept(@RequestBody DeptRegistRequest registRequest) {
	public ResponseEntity<String> regDept(@RequestBody DeptRegistRequest registRequest) {
		// JSON 데이터를 JAVA 객체로 받는다.
		log.info("JSON -> DeptRegistRequest : " + registRequest);

		// registService.registDept(registRequest);
		int result = registService.registDept(registRequest);

		//return "insert OK!";
		return new ResponseEntity<>("insert " + (result == 1 ? "OK" : "FAIL"), HttpStatus.OK);
		// insert OK / insert FAIL
	}

	@PutMapping("/{no}")
	//public String edit(@PathVariable("no") int deptno, @RequestBody DeptDTO dept) {
	public ResponseEntity<String> edit(@PathVariable("no") int deptno, @RequestBody DeptDTO dept) {
		log.info("JSON -> DeptDTO : " + dept);

		// modifyService.updateDept(dept);
		int result = modifyService.updateDept(dept);
		String msg = "update " + (result == 1 ? "OK" : "FAIL");

		//return "update OK!";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@DeleteMapping("/{no}")
	//public String delete(@PathVariable("no") int deptno) {
	public ResponseEntity<String> delete(@PathVariable("no") int deptno) {
		log.info("delete... " + deptno);

		//deleteService.deleteDept(deptno);
		int result = deleteService.deleteDept(deptno);
		String msg = "delete " + (result == 1 ? "OK" : "FAIL");
		//return "delete OK!";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
}
