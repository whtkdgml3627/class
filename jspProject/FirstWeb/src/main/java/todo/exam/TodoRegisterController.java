package todo.exam;

import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * register controller
 */
@WebServlet("/todo/exam/register")
public class TodoRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// url mapping
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/todo/exam/register.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// title 파라미터
		String titleParm = request.getParameter("title");
		// date 파라미터
		String dateParm = request.getParameter("date");
		
		// 기존 리스트 객체 가져오기
	    List<TodoVO> list = (List<TodoVO>) request.getServletContext().getAttribute("todoList");
	    if (list == null) {
	        list = new ArrayList<TodoVO>();
	        request.getServletContext().setAttribute("todoList", list);
	    }
		// 새로운 TodoVO 객체 추가
	    list.add(new TodoVO(titleParm, dateParm));
		request.setAttribute("list", list);

		// url mapping
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/todo/exam/list.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
