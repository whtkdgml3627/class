package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CompanyVO;
import service.CompanyRegistService;

@WebServlet("/regist")
public class CompanyRegisterController extends HttpServlet {
	
	CompanyRegistService service;
	
	public CompanyRegisterController() {
		this.service = new CompanyRegistService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// url 호출
		request.getRequestDispatcher("/WEB-INF/views/dept/registerForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 변수생성
		int result = 0;
		
		// 파라미터 가져오기
		String deptno = request.getParameter("deptno");
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String hiredate = request.getParameter("hiredate");
		
		CompanyVO companyVO = new CompanyVO(Integer.parseInt(deptno), Integer.parseInt(empno), ename, job, hiredate);
		
		result = service.regist(companyVO);

		if(result>0) {
			System.out.println("입력 성공...");
		}else {
			System.out.println("입력 실패!!!");
		}
		
		response.sendRedirect("/web/list");
	}

}
