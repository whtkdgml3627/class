package domain;

/*
 *  JAVA Beans 형식으로 정의
 *  데이터베이스 테이블의 컬럼 이름과 변수명을 동일하게 사용
 * */
public class CompanyVO {
	private int deptno;			// 부서번호 PK
	private String empno;		// 사원번호
	private String ename;		// 사원명
	private String job;			// 직업
	private String hiredate;	// 입사일
	
	// 기본 생성자
	public CompanyVO() {
		super();
	}

	// 값 넣을 생성자
	public CompanyVO(int deptno, String empno, String ename, String job, String hiredate) {
		super();
		this.deptno = deptno;
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
	}

	// get/set
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	// 값 확인용 toString
	@Override
	public String toString() {
		return "CompanyVO [deptno=" + deptno + ", empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate="
				+ hiredate + "]";
	}
	
}
