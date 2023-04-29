package todo.exam;

// DTO
public class TodoVO {
	//변수
	private String title;	// title
	private String date;	// date
	
	//생성자
	public TodoVO(String title, String date) {
		this.title = title;
		this.date = date;
	}
	//기본생성자
	public TodoVO() {
		
	}
	//get/set
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
