package com.hi.empspring;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ConnectionTest {

	@Autowired
	private DataSource dataSource;

	@Test
	public void connectionTest() throws SQLException {
		Connection conn = dataSource.getConnection();
		log.info("conn >>> " + conn);
		Assertions.assertNotNull(conn); // 전달되는 conn 객체가 null이 아니라면 테스트 성공, null이면 테스트 실패
		conn.close();
	}

}
