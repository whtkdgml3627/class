package com.hi.deptspring.deptspring.mapper;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

	// 전체 부서 리스트 -> select
	List<DeptDTO> selectAll();

	// deptno 컬럼으로 검색 => DeptDTO -> select
	DeptDTO selectByDeptno(int deptno);
	
	// DeptRegistRequest 전달 받아서 insert 해주는 메소드 -> insert
	int insertDept(DeptRegistRequest request);

	// DeptDTO 전달 받아서 update 해주는 메소드 -> update
	int updateDept(DeptDTO deptDTO);

	int deleteDept(int deptno);

}
