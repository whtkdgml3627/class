package domain;

// DTO : Java Beans
// 모든 변수가 private, getter/setter, 기본생성자가 반드시 존재
public class Dept {
	
	// 컬럼 이름과 동일하게
	private int deptno;		// 부서번호
	private String dname;	// 부서명 
	private String loc;		// 지역명
	
	// 기본 생성자
	public Dept() {
		
	}

	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	// get / set
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

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
}
