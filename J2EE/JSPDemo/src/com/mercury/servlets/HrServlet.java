package com.mercury.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mercury.beans.User;
import com.mercury.services.TrainingService;

public class HrServlet extends HttpServlet {
	
	private TrainingService ts = new TrainingService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		User u = ts.train(name);
		
		response.getWriter().append("HrServlet: " + u.toString());
	}
}
