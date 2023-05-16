package com.hi.empspring.sevice;

import com.hi.empspring.domain.EmpVO;
import com.hi.empspring.mapper.EmpMapper;
import org.springframework.stereotype.Service;

@Service
public class EmpRegisterService {
	private final EmpMapper mapper;

	public EmpRegisterService(EmpMapper mapper) {
		this.mapper = mapper;
	}

	public int registerEmp(EmpVO empVO) {
		return mapper.insertEmp(empVO);
	}

}
