package exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exam.domain.Dept;

public class DeptDao {
	
	// select 읽어오기 (read)
	public List<Dept> selectByAll(Connection conn){
		PreparedStatement pstmt = null; // pstmt 초기선언
		ResultSet rs = null; // rs 초기선언
		
		List<Dept> list = new ArrayList<>(); // list를 ArrayList타입으로 객체 선언
		
		String sql = "select * from dept01"; // 실행할 sql문
		try {
			pstmt = conn.prepareStatement(sql); // pstmt에 sql
			rs = pstmt.executeQuery(); // select는 executeQuery()
			
			while(rs.next()) { // select는 while에 rs.next()로 다음행을 찾으면서 실행
				// 변수에 rs로 값을 받아 넣어줌
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				// Dept 생성자에 값을 넣어붐
				Dept dept = new Dept(deptno, dname, loc);
				// ArrayList에 add로 넣어줌
				list.add(dept);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// close를 반드시 해줘야 해서 finally에 넣어주지만
			// null값이 아님을 체크해 줘야 하고 여기서도
			// Exception이 발생할 수 있으므로 try catch를 사용해 준다
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
	
	
}
