package todo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.domain.TodoDTO;
import todo.service.TodoListService;

@SuppressWarnings("serial")
@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {
	
	TodoListService listService;
	
	public TodoListController () {
		this.listService = TodoListService.getInstance();
	}
	
	//화면에 리스트 출력 : get 방식의 요청
	//브라우저의 url창에 입력해서 요청 => doGet
	//doGet() 메소드를 @Override
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoListController... doGet()...");
		
		// 회원의 로그인 여부를 확인 후 비로그인 상태 -> 로그인 페이지로 이동
//		HttpSession session = request.getSession();
//		// 1. session이 새로 만들어진 세션이 아니고 세션에 로그인 정보를 가지고 있다면 -> 로그인 상태
//		// 리디렉션 -> 로그인 페이지
//		// 2. 새로 만들어진 세션이거나 세션에 로그인 정보가 없다면
//		if(session.isNew() || session.getAttribute("loginInfo") == null) {
//			System.out.println("로그인 상태가 아니다!!!");
//			// 로그인 페이지로 리디렉션
//			response.sendRedirect("/app/login");
//			return;
//		}
		
		//1. 사용자 요청의 분석
		//2. Service에 요청 -> 응답데이터 반환
		List<TodoDTO> list = listService.getList();
		request.setAttribute("todoList", list);
		
		//3. 응답 데이터를 request의 속성에 저장 : view로 데이터 전달
		
		
		//4. view 지정 -> forward
		String viewPath = "/WEB-INF/views/todo/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
	}
	
	
	
}
