package com.hi.deptspring.deptspring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data   // getter/setter
@ToString
public class DeptRegistRequest {
	// 변수
	private String dname;   // 부서 이름
	private String loc;     // 부서 위치
}
