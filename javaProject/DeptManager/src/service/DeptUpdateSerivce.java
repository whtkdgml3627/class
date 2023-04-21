package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDAO;
import domain.Dept;
import util.ConnectionProvider;

public class DeptUpdateSerivce {
	
	DeptDAO dao;
	
	// 싱글톤 시작
	private DeptUpdateSerivce() {
		this.dao = DeptDAO.getInstance();
	}
	
	private static DeptUpdateSerivce service = new DeptUpdateSerivce();
	
	public static DeptUpdateSerivce getInstance () {
		return service;
	}
	// 싱글톤 끝
	
	public int updateDept(Dept newDept) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.updateDeptByDeptno(conn, newDept);
			
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
		
		return result;
	}
}
