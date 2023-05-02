package todo.domain;

/*
 *  JAVA Beans 형식으로 정의
 *  데이터베이스 테이블의 컬럼 이름과 변수명을 동일하게 사용
 * */
public class TodoDTO {
	//변수
	private int tno;			//번호 PK
	private String todo;		//할일
	private String duedate;		//날짜
	private boolean finished;	//0 or 1
	
	// 디폴트 생성자
	public TodoDTO() {
		
	}

	// 데이터 생성자
	public TodoDTO(int tno, String todo, String duedate, boolean finished) {
		this.tno = tno;
		this.todo = todo;
		this.duedate = duedate;
		this.finished = finished;
	}
	
	// get/set
	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	// toString 데이터 확인용
	@Override
	public String toString() {
		return "TodoDTO [tno=" + tno + ", todo=" + todo + ", duedate=" + duedate + ", finished=" + finished + "]";
	}
	
}
