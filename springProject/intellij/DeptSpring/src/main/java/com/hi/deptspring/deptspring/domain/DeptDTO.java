package com.hi.deptspring.deptspring.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data // getter/setter
@ToString
@Builder
public class DeptDTO {
	// 변수
	private int deptno;     // 부서번호
	private String dname;   // 부서명
	private String loc;     // 지역명
}
