package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.domain.RequestTodo;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoDAO {
	
	// 싱글톤
	// 1. 생성자 - private
	private TodoDAO() {}
	
	// 2. 클래스 내부에서 TodoDAO 객체 생성 - private static
	private static TodoDAO dao = new TodoDAO();
	
	// 3. 외부에서 TodoDAO의 참조값을 얻어갈 수 있는 메소드 생성 -> public static
	public static TodoDAO getInstance() {
		return dao;
	}
	// /싱글톤
	
	// TodoDTO 리스트를 반환하는 메소드
	public List<TodoDTO> selectByAll(Connection conn){
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<TodoDTO> list = null;
		
		// SQL
		String sql = "SELECT * FROM tbl_todo";
		
		try {
			// PreparedStatement
			pstmt = conn.prepareStatement(sql);
			
			// 결과 받기
			// ResultSet
			rs = pstmt.executeQuery();
			
			// List<TodoDTO> 에 저장 후 반환
			list = new ArrayList<TodoDTO>();
			while(rs.next()) {
				int tno = rs.getInt("tno");
				String todo = rs.getString("todo");
				String duedate = rs.getString("duedate");
				boolean finished = rs.getBoolean("finished");
				
				TodoDTO dto = new TodoDTO(tno, todo, duedate, finished);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// close
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	// tno 값을 받아서 Todo 정보(TodoDTO)를 반환하는 메소드
	public TodoDTO selectByTno(Connection conn, int tno) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		TodoDTO todo = null;
		
		// sql
		String sql = "SELECT * FROM tbl_todo where tno=?";
		try {
			pstmt = conn.prepareStatement(sql);
			// set
			pstmt.setInt(1, tno);
			
			// rs
			rs = pstmt.executeQuery();
			
			// if : 결과 행이 0 또는 1일 때
			if(rs.next()) {
				todo = new TodoDTO(rs.getInt("tno"), rs.getString("todo"), rs.getString("duedate"), rs.getBoolean("finished"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return todo;
	}
	
	// ReuqestTodo 데이터를 받아서 insert 처리
	public int insertTodo(Connection conn, RequestTodo todo) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		// insert sql
		String sql = "INSERT INTO tbl_todo (todo, duedate) VALUES (?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, todo.getTodo());
			pstmt.setString(2, todo.getDuedate());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	// TodoDTO 데이터를 받아서 update 처리
	public int updateByTno(Connection conn, TodoDTO todo) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "UPDATE tbl_todo SET todo=?, duedate=?, finished=? WHERE tno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			// set
			pstmt.setString(1, todo.getTodo());
			pstmt.setString(2, todo.getDuedate());
			pstmt.setBoolean(3, todo.isFinished());
			pstmt.setInt(4, todo.getTno());
			
			// result
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	// tno 전달받아 delete
	public int deleteByTno(Connection conn, int tno) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "DELETE from tbl_todo where tno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			// set
			pstmt.setInt(1, tno);

			// result
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws SQLException {
		
		// list DAO 출력 테스트
		TodoDAO dao = TodoDAO.getInstance();
		Connection conn = ConnectionProvider.getConnection();
		
		// selectAll test
//		List<TodoDTO> list = dao.selectByAll(conn);
//		for(TodoDTO todo : list) {
//			System.out.println(todo);
//		}
		
		// insert test
//		dao.insertTodo(conn, new RequestTodo("회의", "2023-05-03"));
//		System.out.println("입력 완료");
		
		// selectByTno test
//		TodoDTO todo = dao.selectByTno(conn, 2);
//		System.out.println(todo);
		
		// update test
//		dao.updateByTno(conn, new TodoDTO(2, "청소 후 휴식", "2023-05-03", true));
//		System.out.println("수정완료...");
		
		// delete test
		dao.deleteByTno(conn, 10);
		System.out.println("삭제완료");
		
		conn.close();
	}
	
}
