package com.hi.empspring.mapper;

import com.hi.empspring.domain.EmpVO;

import java.util.List;

public interface EmpMapper {

	// emp 리스트 -> select
	List<EmpVO> selectByAll();

	// emp 등록 -> insert
	int insertEmp(EmpVO empVO);

}
