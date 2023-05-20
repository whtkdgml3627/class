package com.hi.empspring.sevice;

import com.hi.empspring.mapper.EmpMapper;
import org.springframework.stereotype.Service;

@Service
public class EmpDeleteService {

	private final EmpMapper mapper;

	public EmpDeleteService(EmpMapper mapper) {
		this.mapper = mapper;
	}

	public int deleteEmp(int empno){
		return mapper.deleteEmp(empno);
	}
}
