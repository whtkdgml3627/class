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
 * list controller
 */
@WebServlet("/todo/exam/list")
public class TodoListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 요청의 한글 처리
		request.setCharacterEncoding("UTF-8");
		// url mapping
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/todo/exam/list.jsp");
		
		// title 파라미터
		String titleParm = request.getParameter("title");
		// date 파라미터
		String dateParm = request.getParameter("date");
		// TodoVO 객체생성
		TodoVO todo = new TodoVO(titleParm, dateParm);
		
		// todoList 속성 가져오기
		List<TodoVO> list = (List<TodoVO>) getServletContext().getAttribute("todoList");
		if (list == null) { // todoList 속성이 없는 경우
		    list = new ArrayList<>();
		    getServletContext().setAttribute("todoList", list);
		}
		
		// 새로운 TodoVO 추가
		list.add(todo);
		
		// JSP에 todoList 전달
		request.setAttribute("list", list);
		requestDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
