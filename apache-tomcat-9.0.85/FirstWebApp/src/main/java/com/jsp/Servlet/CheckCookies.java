package com.jsp.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/checkcookie")
public class CheckCookies extends HttpServlet{
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
 {
	 Cookie[] cookies=req.getCookies();
	 if(cookies==null) {
		 RequestDispatcher rd =req.getRequestDispatcher("login.html");
		 rd.forward(req, resp); }
		 
		 else {
			 RequestDispatcher rd =req.getRequestDispatcher("Welcome.html");
			 rd.forward(req, resp);
		 }
	 }
  }
