package todo.domain;

public class RequestTodo {
	
	// 변수
	private String todo;	// 할일
	private String duedate;	// 날짜
	
	// 기본생성자
	public RequestTodo() {}
	
	// 생성자
	public RequestTodo(String todo, String duedate) {
		this.todo = todo;
		this.duedate = duedate;
	}

	// get/set
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

	@Override
	public String toString() {
		return "RequestTodo [todo=" + todo + ", duedate=" + duedate + "]";
	}
	
}
