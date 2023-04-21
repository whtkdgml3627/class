package service;

import java.sql.SQLException;

import dao.DeptDAO;
import domain.Dept;
import util.ConnectionProvider;

public class DeptInsertService {
	
	DeptDAO dao;

	public DeptInsertService() {
		this.dao = new DeptDAO();
	}
	
	public int insertDept(Dept dept) throws SQLException {
		// RequestDept -> dname, loc
		// 데이터 가공
		// Transaction
		return dao.insertDept(ConnectionProvider.getConnection(), dept);
	}
}