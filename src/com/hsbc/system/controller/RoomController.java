package com.hsbc.system.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RoomController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rname=request.getParameter("rname");
		int seats=Integer.parseInt(request.getParameter("seats"));
		
		String[] ameneties=request.getParameterValues("amenities");
		
		
		
	}

}
