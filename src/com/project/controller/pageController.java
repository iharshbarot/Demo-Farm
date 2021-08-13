package com.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dao.pageDao;
import com.project.daoImpl.pageDaoimpl;
import com.project.model.animalModel;



public class pageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String foreview = "animal_reg.jsp";
	private String forward = null;
	public pageController() {
        super();
      }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		boolean b = false;
		pageDao d = (pageDao) new pageDaoimpl();
		int a = Integer.parseInt(request.getParameter("a"));
		
		switch (a) {
		case 0:
			int id = Integer.parseInt(request.getParameter("id"));
			List<animalModel> l= d.farmRegister(id);
			request.setAttribute("list",l);
			forward = foreview;
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
			break;

		default:
			break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
	}

}
