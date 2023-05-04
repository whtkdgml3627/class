package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.CompanyVO;
import todo.util.ConnectionProvider;

public class CompanyDAO {
	
	// 싱글톤
	private CompanyDAO() {}
	private static CompanyDAO dao = new CompanyDAO();
	public static CompanyDAO getInstance() {
		return dao;
	}
	// /싱글톤
	
	// list
	public List<CompanyVO> selectByAll(Connection conn){
		
		// close를 위한 초기화
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<CompanyVO> list = null;
		
		// 테이블 list 불러올 쿼리
		String sql = "select * from company order by deptno";
		
		list = new ArrayList<>();
		
		try {
			// sql넣기
			pstmt = conn.prepareStatement(sql);
			
			// 값 불러오기
			rs = pstmt.executeQuery();
			
			// list에 넣기
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String hiredate = rs.getString("hiredate");
				
				list.add(new CompanyVO(deptno, empno, ename, job, hiredate));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	// register
	public int makeCompany(Connection conn, CompanyVO company) {
		
		// close를 위한 선언
		PreparedStatement pstmt = null;
		int result = 0;
		
		// sql
		String sql = "insert into company values (?, ?, ?, ?, ?)";
		
		try {
			// pstmt에 sql 선언
			pstmt = conn.prepareStatement(sql);
			
			// 값 넣기
			pstmt.setInt(1, company.getDeptno());
			pstmt.setInt(2, company.getEmpno());
			pstmt.setString(3, company.getEname());
			pstmt.setString(4, company.getJob());
			pstmt.setString(5, company.getHiredate());
			
			// 값 넣어주고 업데이트
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return result;
	}
	
	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionProvider.getConnection();
		CompanyDAO dao = CompanyDAO.getInstance();
		
		List<CompanyVO> list = dao.selectByAll(conn);
		for(CompanyVO dept : list) {
			System.out.println(dept);
		}
		conn.close();
	}
	
}
