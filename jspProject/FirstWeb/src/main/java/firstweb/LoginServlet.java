package firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//////////////////////////////////////
		// 사용자 요청 처리
		String userid = request.getParameter("userid");
		System.out.println("사용자 입력 id : " + userid);
		
		String userpw = request.getParameter("userpw");
		System.out.println("사용자 입력 pw : " + userpw);
		//////////////////////////////////////
		
		//////////////////////////////////////
		// 응답
		PrintWriter out = response.getWriter();
		out.println("id : " + userid);
		out.println("pw : " + userpw);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//////////////////////////////////////
		// 사용자 요청 처리
		String userid = request.getParameter("userid");
		System.out.println("사용자 입력 id : " + userid);
		
		String userpw = request.getParameter("userpw");
		System.out.println("사용자 입력 pw : " + userpw);
		//////////////////////////////////////
		
		//////////////////////////////////////
		// 응답
		PrintWriter out = response.getWriter();
		out.println("id : " + userid);
		out.println("pw : " + userpw);
		out.close();
		
	}

}
