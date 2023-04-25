package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDAO;
import util.ConnectionProvider;

public class DeptDeleteService {
	
	DeptDAO dao;
	
	// 싱글톤 시작
	private DeptDeleteService() {
		this.dao = DeptDAO.getInstance();
	}
	
	private static DeptDeleteService service = new DeptDeleteService();

	public static DeptDeleteService getInstance() {
		return service;
	}
	// 싱글톤 끝
	
	public int deleteDept(int deptno) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.deleteDeptByDeptno(conn, deptno);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		return result;
	}
	
	
}