package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.CompanyDAO;
import domain.CompanyVO;
import todo.util.ConnectionProvider;

public class CompanyListService {
	
	CompanyDAO dao;
	
	// 싱글톤
	private CompanyListService() {
		this.dao = CompanyDAO.getInstance();
	}
	private static CompanyListService service = new CompanyListService();
	public static CompanyListService getInstatnce() {
		return service;
	}
	// 싱글톤
	
	// controller에서 불러올 serivce 메소드 생성
	public List<CompanyVO> list() {
		
		// close를 위한 초기화
		Connection conn = null;
		List<CompanyVO> list = null;
		
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
