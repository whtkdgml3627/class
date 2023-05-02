package domain;

/*
 *  JAVA Beans 형식으로 정의
 *  데이터베이스 테이블의 컬럼 이름과 변수명을 동일하게 사용
 * */
public class DeptVO {
	private int deptno;		// 부서번호 PK
	private String dname;	// 부서명
	private String loc;		// 지역명
	
	// 기본 생성자
	public DeptVO() {
		
	}

	// 생성자
	public DeptVO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	// get/set
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	// 값 확인 toString
	@Override
	public String toString() {
		return "DeptVO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
}
