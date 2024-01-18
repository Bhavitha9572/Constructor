package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	//it will accept only get request if u keep dopost then it will acpt only post request 
	//post anedhi neeku url lo values variables display avvav whereas get lo display avuthay
	
    //service method ni comment chesam kadha khani httpservlet cls lo internal service method is there
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
  //public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		
		int k= i+j;
		//k=k*k;
		
		req.setAttribute("k", k);
//		PrintWriter out =res.getWriter();
//		out.println("result is  " +k);
		
		RequestDispatcher rd =req.getRequestDispatcher("sq");
		rd.forward(req, res);
		 
	}
	
	
	

}
