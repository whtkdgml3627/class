package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.CompanyVO;
import todo.util.ConnectionProvider;

public class DeptDAO {
	
	// 싱글톤
	private DeptDAO() {}
	private static DeptDAO dao = new DeptDAO();
	public static DeptDAO getInstance() {
		return dao;
	}
	// /싱글톤
	
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
				String empno = rs.getString("empno");
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
	
	
	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionProvider.getConnection();
		DeptDAO dao = DeptDAO.getInstance();
		
		List<CompanyVO> list = dao.selectByAll(conn);
		for(CompanyVO dept : list) {
			System.out.println(dept);
		}
		conn.close();
	}
	
}
