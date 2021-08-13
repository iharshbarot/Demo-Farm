package com.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.dao.caretakersDao;
import com.project.daoImpl.caretakersDaoimpl;
import com.project.model.caretakersModel;


public class caretakers extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private static final String foreview = "existingCaretaker.jsp";
	 private String forward = null;
    public caretakers() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean b = false;
		caretakersDao d = (caretakersDao) new caretakersDaoimpl();
		int a = Integer.parseInt(request.getParameter("a"));
		HttpSession ses = request.getSession();
		int id = (Integer)ses.getAttribute("u_id");
		switch(a)
		{
			case 0:
				
				List<caretakersModel> l= d.exisiting(id);
				request.setAttribute("list",l);
				forward = foreview;
				RequestDispatcher rd = request.getRequestDispatcher(forward);
				rd.forward(request, response);
				break;
			
			default:
				break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		caretakersDao d = (caretakersDao) new caretakersDaoimpl();
		boolean v = false;
		String action = request.getParameter("action");
		
		switch(action)
			{
				case "insert":
					int u_id = Integer.parseInt(request.getParameter("u_id"));
					String caretakersName = request.getParameter("caretakersName");
					long caretakersContact = Long.parseLong(request.getParameter("caretakersContact"));
					String caretakers_address = request.getParameter("caretakers_address");
					
					caretakersModel cm = new caretakersModel(u_id,caretakersName,caretakersContact,caretakers_address);
					v = d.insert(cm);
					if (v) {
						response.sendRedirect("caretakers?a=0");
					} else {
						response.sendRedirect("fail.jsp");
					}
					break;
					
				default:
					break;
				
			}
		
		
	}

}
