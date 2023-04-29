package todo.exam;

import java.io.IOException;
import java.util.ArrayList;
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

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// title 파라미터
		String titleParm = request.getParameter("title");
		// date 파라미터
		String dateParm = request.getParameter("date");
		// TodoVO 객체생성
		TodoVO todo = new TodoVO(titleParm, dateParm);
		
		// todoList 속성 가져오기
		List<TodoVO> todoList = (List<TodoVO>) getServletContext().getAttribute("todoList");
	    if (todoList == null) { // todoList 속성이 없는 경우
	        todoList = new ArrayList<>();
	        getServletContext().setAttribute("todoList", todoList);
	    }
	    
		// 새로운 TodoVO 객체 추가
	    todoList.add(todo);
		request.setAttribute("list", todoList);

		// list 페이지에 forward
		// url mapping
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/todo/exam/list.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
