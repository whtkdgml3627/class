package com.hi.empspring.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmpVO {
	// 변수
	private int empno;          // 사원번호
	private String ename;       // 사원이름
	private String job;         // 부서명
	private int mgr;            // 사수번호
	private String hiredate;    // 입사일
	private int sal;            // 급여
	private int comm;           // 상여금
	private int deptno;         // 부서번호

}
