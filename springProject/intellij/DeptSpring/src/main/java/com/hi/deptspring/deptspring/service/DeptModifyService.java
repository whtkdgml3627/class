package com.hi.deptspring.deptspring.service;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.mapper.DeptMapper;
import org.springframework.stereotype.Service;

@Service
public class DeptModifyService {

	private final DeptMapper mapper;

	public DeptModifyService(DeptMapper mapper) {
		this.mapper = mapper;
	}

	public int updateDept(DeptDTO dto){
		return mapper.updateDept(dto);
	}
}
