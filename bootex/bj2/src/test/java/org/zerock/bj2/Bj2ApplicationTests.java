package org.zerock.bj2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.bj2.mappers.TimeMapper;

import java.sql.Connection;

import javax.sql.DataSource;
import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class Bj2ApplicationTests {

	@Autowired
	DataSource dataSource; 

	@Autowired
	TimeMapper timeMapper;

	@Test
	public void testTime() {
		log.info("---------------------");
		log.info(timeMapper.getTime());
		log.info("---------------------");
		log.info("---------------------");
	}

	@Test
	void contextLoads() {

		log.info("Context Load.....");
	} 

	@Test
	public void testConnection(){

		try( Connection con = dataSource.getConnection() ){
			
			log.info("------------------------");
			log.info("------------------------");
			log.info("------------------------");

			log.info(con);

			log.info("------------------------");

		}catch(Exception e){

			e.printStackTrace();

		}
	}

}
