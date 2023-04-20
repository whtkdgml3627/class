package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import dao.DeptDAO;
import domain.Dept;

public class DeptListService {

	DeptDAO dao;
	
	public DeptListService(DeptDAO dao) {
		this.dao = dao;
	}
	
	public List<Dept> getDeptList(){
		
		// Connecition 객체 구하기
		Connection conn = null;
		List<Dept> list = null;
				
		try {
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
			
			// 트랜젝션 시작
			conn.setAutoCommit(false);
			
			// DAO에 있는 메소드
			// insert(conn)
			// update(conn)
			// select(conn)
			// update(conn)
			// insert(conn)
			
			list = dao.selectByAll(conn);
			
			// commit : 완료!
			conn.commit();
		} catch (SQLException e) {
			// 예외 발생 -> rollback;
			try {
				if(conn != null) {
					conn.rollback();
				}
			} catch(SQLException e1) {
				e.printStackTrace();
			}
			
			e.printStackTrace();
		}
		// 트랜젝션 시작
		
		return list;
	}
	
	public static void main(String[] args) {
		
		DeptListService listService = new DeptListService(new DeptDAO());
		
		List<Dept> list = listService.getDeptList();
		
		for(Dept d : list) {
			System.out.println(d);
		}
		
	}
	
	
}
