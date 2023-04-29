package todo.exam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * list controller
 */
@WebServlet("/todo/exam/read")
public class TodoReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 사용자 요청의 한글 처리
		request.setCharacterEncoding("UTF-8");
		
		// count 파라미터
		String countParm = request.getParameter("count");
		// title 파라미터
		String titleParm = request.getParameter("title");
		// date 파라미터
		String dateParm = request.getParameter("date");
		request.setAttribute("count", countParm);
		request.setAttribute("title", titleParm);
		request.setAttribute("date", dateParm);
		
		// url mapping
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/todo/exam/read.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
