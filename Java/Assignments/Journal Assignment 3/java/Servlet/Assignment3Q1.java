package com.Assignment3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Assignment3Q1 extends HttpServlet {
	 public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException, ServletException {

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
		 String hobbies[] = req.getParameterValues("hobbie");
		 
		 if(hobbies != null) {
			 out.println("Hobbies are : " );
			 
			 for(String hobb : hobbies) {
				 
				 if(hobb.equals("Playing")) {
					 out.println("<li>"+hobb+"</li>");
					 out.println("I like Playing");
				 }
				 if(hobb.equals("Listening")) {
					 out.println("<li>"+hobb+"</li>");
					 out.println("I like Listening Music");
				 }
				 if(hobb.equals("Singing")) {
					 out.println("<li>"+hobb+"</li>");
					 out.println("I like Singing ");
				 }
				 if(hobb.equals("Reading")) {
					 out.println("<li>"+hobb+"</li>");
					 out.println("I like reading Books");
				 }
			 }
		 }
		 else {
			 out.println("please select the hobby");
			 }
	        
	        out.close();
	    }
}
