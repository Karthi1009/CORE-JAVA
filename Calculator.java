package com.serlvet.cal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int op = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		   String n1 = request.getParameter("txt1");
		   String n2 = request.getParameter("txt2");
		   String op = request.getParameter("op");
		   switch(op) {
		   case "Addition":
			   out.println("Answer = "+(Integer.parseInt(n1)+ Integer.parseInt(n2)));
			   break;
			   
		   case "Subtraction":
			   out.println("Answer = "+(Integer.parseInt(n1)- Integer.parseInt(n2)));
			   break;
			   
		   case "Multiplication":
			   out.println("Answer = "+(Integer.parseInt(n1)* Integer.parseInt(n2)));
			   break;
			   default:
				   out.println("Answer = "+(Integer.parseInt(n1)/ Integer.parseInt(n2)));
				   break;
		   }
	
	}
}
