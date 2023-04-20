package exam.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import exam.dao.DeptDao;
import exam.domain.Dept;
import exam.util.ConnectionProvider;

public class DeptListService {
	
	DeptDao dao;

	public DeptListService(DeptDao dao) {
		this.dao = dao;
	}
	
	public List<Dept> getDeptList(){
		Connection conn = null;
		List<Dept> list = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			list = dao.selectByAll(conn);
			
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.rollback();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
}
