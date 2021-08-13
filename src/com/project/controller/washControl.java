package com.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.dao.animalDao;
import com.project.daoImpl.animalDaoimpl;
import com.project.model.animalModel;

/**
 * Servlet implementation class washControl
 */
public class washControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String forward = null;
	private static final String animalList = "listWash.jsp";
       
    public washControl() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean b = false;
		animalDao d = (animalDaoimpl) new animalDaoimpl();
		int a = Integer.parseInt(request.getParameter("a"));
		HttpSession ses = request.getSession();
		switch(a) {
		
			// listAnimal
			case 0:
				 int id = (Integer)ses.getAttribute("u_id");
				 String animalType = request.getParameter("b");
				 
				if(animalType!=null) 
					{	
					
					List<animalModel> l1= d.animalList(id, animalType);
					
						if(l1!=null)
						{
							
								request.setAttribute("list",l1);
								request.setAttribute("type",animalType);
								forward = animalList;
								RequestDispatcher rd = request.getRequestDispatcher(forward);
								rd.forward(request, response);
						}
						
						}
						else
						{
							System.out.println("value of is not a exist");
						}
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
