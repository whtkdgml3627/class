package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CompanyDAO;
import domain.CompanyVO;
import todo.util.ConnectionProvider;

public class CompanyRegistService {
	
	CompanyDAO dao;
	
	public CompanyRegistService() {
		this.dao = CompanyDAO.getInstance();
	}
	
	public int regist(CompanyVO company) {
		
		// close를 위한 선언
		Connection conn = null;
		int result = 0;
		
		try {
			// db connection
			conn = ConnectionProvider.getConnection();
			
			// dao에서 값 받아오기
			result = dao.makeCompany(conn, company);
			
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
