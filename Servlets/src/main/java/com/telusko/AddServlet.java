package com.telusko;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	//it will accept only get request if u keep dopost then it will acpt only post request 
	//post anedhi neeku url lo values variables display avvav whereas get lo display avuthay
	
    //service method ni comment chesam kadha khani httpservlet cls lo internal service method is there
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
  //public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		
		int k= i+j;
		
//		HttpSession session  = req.getSession();
//		session.setAttribute("k", k);
		
		Cookie cookie =new Cookie("k",k+ "");  //
		res.addCookie(cookie);  //
		res.sendRedirect("sq?k="+k);  //URL re-writing 
		

		
		
	}
	
	
	

}
