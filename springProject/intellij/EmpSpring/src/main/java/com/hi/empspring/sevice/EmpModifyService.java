package com.hi.empspring.sevice;

import com.hi.empspring.domain.EmpVO;
import com.hi.empspring.mapper.EmpMapper;
import org.springframework.stereotype.Service;

@Service
public class EmpModifyService {

	private final EmpMapper mapper;

	public EmpModifyService(EmpMapper mapper) {
		this.mapper = mapper;
	}

	public EmpVO selectByEmpno(int empno){
		return mapper.selectByEmpno(empno);
	}

	public int updateEmp(EmpVO empVO){
		return mapper.updateEmp(empVO);
	}
}
