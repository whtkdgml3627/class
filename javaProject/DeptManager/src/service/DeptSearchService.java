package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDAO;
import domain.Dept;
import util.ConnectionProvider;

public class DeptSearchService {

	DeptDAO dao;

	private DeptSearchService() {
		this.dao = DeptDAO.getInstance();
	}
	
	private static DeptSearchService service = new DeptSearchService();
	
	public static DeptSearchService getInstance () {
		return service;
	}
	
	// 검색 번호를 받고 Dept 정보를 저장하고 있는 객체를 반환
	public Dept searchDept(int deptno) {
		Connection conn = null;
		Dept dept = null;
		try {
			
			conn = ConnectionProvider.getConnection();
			dept = dao.selectByDeptno(conn, deptno);
			
		} catch (SQLException e) {
			// 데이터베이스 연결 실패한 상황
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
		
		return dept;
	}
	
	
}
