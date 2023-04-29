package todo.exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * list controller
 */
@WebServlet("/todo/exam/list")
public class TodoListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 요청의 한글 처리
		request.setCharacterEncoding("UTF-8");
		// url mapping
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/todo/exam/list.jsp");

		// title 파라미터
		String titleParm = request.getParameter("title");
		// date 파라미터
		String dateParm = request.getParameter("date");
		
//		List<TodoVO> list = new ArrayList<>();
//		list.add(new TodoVO(titleParm, dateParm));
//		request.setAttribute("list", list);
		request.getAttribute("list");
		
		requestDispatcher.forward(request, response);
		
	}

}
