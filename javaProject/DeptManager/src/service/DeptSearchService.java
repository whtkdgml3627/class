package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDAO;
import domain.Dept;
import util.ConnectionProvider;

public class DeptSearchService {

	DeptDAO dao;

	public DeptSearchService() {
		this.dao = new DeptDAO();
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
		}
		
		return dept;
	}
	
	
}
