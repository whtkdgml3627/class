package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.DeptVO;
import todo.util.ConnectionProvider;

public class DeptDAO {
	
	// 싱글톤
	private DeptDAO() {}
	private static DeptDAO dao = new DeptDAO();
	public static DeptDAO getInstance() {
		return dao;
	}
	// /싱글톤
	
	public List<DeptVO> selectByAll(Connection conn){
		
		// close를 위해 미리 선언해둔다.
		// 값을 불러오기 위한 PreparedStatement
		PreparedStatement pstmt = null;
		// 값을 출력하기 위한 ResultSet
		ResultSet rs = null;
		// 값을 담기 위한 List<DeptVO>
		List<DeptVO> list = null;
		list = new ArrayList<>();
		
		// sql문
		String sql = "SELECT * FROM dept01";

		// SQLException 예외처리
		try {
			// sql문 불러오기
			pstmt = conn.prepareStatement(sql);
			
			// 전체 출력
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				// 객체 생성
				DeptVO vo = new DeptVO(deptno, dname, loc); 
				list.add(vo);
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
		
		List<DeptVO> list = dao.selectByAll(conn);
		for(DeptVO dept : list) {
			System.out.println(dept);
		}
		conn.close();
	}
	
}
