package com.hi.empspring.sevice;

import com.hi.empspring.domain.EmpVO;
import com.hi.empspring.mapper.EmpMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpListService {
	// DAO 가져오는것 처럼 Mapper 가져와서 쓰기
	private final EmpMapper mapper;

	// final로 선언해주면 생성자가 무적권 있어야한다!
	public EmpListService(EmpMapper mapper) {
		this.mapper = mapper;
	}
	
	// Controller로 던져줄 메소드 생성
	public List<EmpVO> select(){
		return mapper.selectByAll();
	}
}
