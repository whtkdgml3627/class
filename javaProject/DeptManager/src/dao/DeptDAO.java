package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import domain.Dept;

public class DeptDAO {
	
	// Connection conn;
		
	// 1. dept list : List<Dept>
	public List<Dept> selectByAll(Connection conn) {
		
		// Connection
		// 1. 메소드 내부에서 Connection을 구하는 방법
		// - 트랜잭션으로 묶어줄 수 없어서 사용 불가 X
		// 2. DAO 클래스 내부의 인스턴스 변수로 Connection을 구하는 방법
		// - DAO 싱글톤(X), Connection을 구하기 위해서 인스턴스 계속 생성 사용 불가 X
		// 3. 매개변수로 Connection을 구하는 방법
		// - Serivce 클래스의 메소드에서 Connection 생성해서 전달
		// - Service 클래스에서 트랜젝션 처리를 해줄 수 있다.
		// 매개변수로 담아서 던져주면 된다.
		// Connection은 마지막에 close() 필수
		
		// Connection
		// PreparedStatement
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 반환하고자 하는 결과 데이터 List
		// Collection 클래스 중 List -> 입력 순서를 가지며, index값도 가진다. 반복문으로 출력 처리
		List<Dept> result = new ArrayList<>();
		// sql
		String sql = "select * from dept order by deptno";
		try {
			pstmt = conn.prepareStatement(sql);
			
			// executeQuery
			// ResultSet
			rs = pstmt.executeQuery();
			// while
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				Dept dept = new Dept(deptno, dname, loc);
				// List<Dept>에 Dept 객체를 추가
				result.add(dept);
			}
			
			// result : 4개의 객체를 가지고 있다.
			
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	// 2. 부서 번호로 검색 (Connection conn, int deptno) 매개변수로 받아줌
	public Dept selectByDeptno(Connection conn, int deptno) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept result = null;
		
		// sql
		String sql = "select* from dept where deptno=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = new Dept(rs.getInt(1), rs.getString(2), rs.getString(3));
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	// 3. 부서 정보 입력 : deptno, dname, loc
	public int insertDept(Connection conn, Dept dept) {
		PreparedStatement pstmt = null;
		int result=0;
		
		// Insert Sql
		String sql = "insert into dept values (?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	// 4. 부서 정보 수정 : deptno, dname, loc
	public int updateDeptByDeptno(Connection conn, Dept dept) {
		PreparedStatement pstmt = null;
		int result = 0;
		// Update Sql
		String sql = "update dept set dname=?, loc=? where deptno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	// 5. 부서 정보 삭제
	
	
	public static void main(String[] args) throws SQLException {
		
		DeptDAO dao = new DeptDAO();
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
		
//		List<Dept> list = dao.selectByAll(conn);
//		for(Dept dept : list) {
//			System.out.println(dept);
//		}
//		
		Dept dept = dao.selectByDeptno(conn, 50);
		System.out.println("결과 : " + dept);
		
//		int insertResult = dao.insertDept(conn, new Dept(50, "Test", "Seoul"));
//		System.out.println("저장 결과 : " + insertResult);
		
//		Dept d = new Dept (50, "TTT", "QQQ");
//		int updateResult = dao.updateDeptByDeptno(conn, d);
//		System.out.println("수정 결과 : " + updateResult);
		
	}
	
}
