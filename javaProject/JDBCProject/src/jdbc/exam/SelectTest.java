package jdbc.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//mysql 연동
			String dbUrl = "jdbc:mysql://localhost:3306/project";
			conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");
			String sql = "select * from dept01";
			//String sql = "insert into dept01 values(?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, 50);
//			pstmt.setString(2, "Test");
//			pstmt.setString(3, "LocTest");
//			
//			
//			pstmt.executeUpdate();
//			System.out.println("데이터 생성 성공!");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
//			System.out.println("empno \t ename \t job \t mgr \t hiredate \t sal \t comm \t deptno");
			
//			while(rs.next()) {
//				int empno = rs.getInt("empno");
//				String enmae = rs.getString("ename");
//				String job = rs.getString("job");
//				String mgr = rs.getString("mgr");
//				String hiredate = rs.getString("hiredate");
//				int sal = rs.getInt("sal");
//				int comm = rs.getInt("comm");
//				int deptno = rs.getInt("deptno");
//				
//				System.out.println(empno + " \t " + enmae + " \t " + job + " \t " + mgr + " \t " + hiredate + " \t " + sal + " \t " + comm + " \t " + deptno);
//			}
			
			//rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
