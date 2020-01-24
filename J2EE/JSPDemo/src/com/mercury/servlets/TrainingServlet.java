package com.mercury.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mercury.beans.User;
import com.mercury.beans.UserInfo;
import com.mercury.services.TrainingService;

/**
 * Servlet implementation class TrainingServlet
 */
@WebServlet("/ts")
public class TrainingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private TrainingService ts = new TrainingService();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrainingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("<!DOCTYPE html>\r\n" + 
//				"<html>\r\n" + 
//				"<head>\r\n" + 
//				"<meta charset=\"ISO-8859-1\">\r\n" + 
//				"<title>2020 Jan Batch</title>\r\n" + 
//				"</head>\r\n" + 
//				"<body>\r\n" + 
//				"Welcome! service()!\r\n" + 
//				"</body>\r\n" + 
//				"</html>");
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		User u = ts.train(name);
		
		response.getWriter().append(u.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		ts.register(name, age);
		
		List<User> users = ts.train();
		UserInfo ui = new UserInfo(users);
		
		request.setAttribute("userInfo", ui);
		
		String url = "/result.jsp";		// "/" is root directory of web content
		
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
