package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.DeptDAO;
import domain.DeptVO;
import todo.util.ConnectionProvider;

public class DeptListService {
	
	DeptDAO dao;
	
	// 싱글톤
	private DeptListService() {
		this.dao = DeptDAO.getInstance();
	}
	private static DeptListService service = new DeptListService();
	public static DeptListService getInstatnce() {
		return service;
	}
	// 싱글톤
	
	// controller에서 불러올 serivce 메소드 생성
	public List<DeptVO> list() {
		
		// close를 위한 초기화
		Connection conn = null;
		List<DeptVO> list = null;
		
		try {
			// db connection
			conn = ConnectionProvider.getConnection();
			// list dao 불러오기
			list = dao.selectByAll(conn);
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
		
		return list;
	}
	
}
