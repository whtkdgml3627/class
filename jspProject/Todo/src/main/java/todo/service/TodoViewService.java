package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoViewService {
	
	TodoDAO dao;
	
	private static TodoViewService service = new TodoViewService();
	
	private TodoViewService() {
		this.dao = TodoDAO.getInstance();
	}
	
	public static TodoViewService getInstance() {
		return service;
	}
	
	// tno 값을 전달 받아서
	// dao selectByTno에 요청 -> TodoDTO -> 반환해주는 메소드
	public TodoDTO getTodo(int tno) {
		
		Connection conn = null;
		TodoDTO todo = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			todo = dao.selectByTno(conn, tno);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return todo;
	}
	
}
