package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class W2AppListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
    	// 서버 종료될 때
    	System.out.println("contextDestroyed()...");
    }

    public void contextInitialized(ServletContextEvent sce)  {
    	// 서버 실행될 때
    	System.out.println("contextInitialized()...!!");
    	// 데이터베이스 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mysql 드라이버 로드");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패....");
			e.printStackTrace();
		}
    }
	
}
