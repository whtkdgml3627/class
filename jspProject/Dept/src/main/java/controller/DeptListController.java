package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CompanyVO;
import service.DeptListService;

/**
 * Servlet implementation class TodoListController
 */
@WebServlet("/list")
public class DeptListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DeptListService service;
	
	public DeptListController() {
		this.service = DeptListService.getInstatnce();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<CompanyVO> companyList = service.list();
		request.setAttribute("companyList", companyList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/dept/list.jsp");
		dispatcher.forward(request, response);
	}

}
