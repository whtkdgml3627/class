package todo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Service : DAO 메소드에 매개변수로 전달
 * */
public class ConnectionProvider {
//	static {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/project";	//DB URL
		String dbName = "himedia";								//DB id
		String dbPw = "tiger";									//DB pw
		return DriverManager.getConnection(dbUrl, dbName, dbPw);
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(ConnectionProvider.getConnection());
	}
}
