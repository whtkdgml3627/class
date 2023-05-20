package com.hi.empspring.mapper;

import com.hi.empspring.domain.EmpVO;

import java.util.List;

public interface EmpMapper {

	// emp 리스트 -> select
	List<EmpVO> selectByAll();

	// emp 등록 -> insert
	int insertEmp(EmpVO empVO);

	// emp 수정 -> update
	int updateEmp(EmpVO empVO);

	// emp 수정 페이지 리드 -> select
	EmpVO selectByEmpno(int empno);

	// emp 삭제 -> delete

}
