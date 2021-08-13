package com.project.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.dao.animalDao;
import com.project.dao.heatphseDao;
import com.project.daoImpl.animalDaoimpl;
import com.project.daoImpl.heatphaseDaoimpl;
import com.project.model.animalModel;
import com.project.model.heatphaseModel;

public class heatphase extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String forward = null;
	private static final String heatphase = "heatphase.jsp";
	private static final String liastHeatphase = "listHeatphase.jsp";
	private static final String listPragancey = "listPragancey.jsp";
	private static final String viewPragancey = "viewPragancey.jsp";
	private static final String printPragancey = "printPragancey.jsp";
    public heatphase() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean b = false;
		heatphseDao d = (heatphaseDaoimpl) new heatphaseDaoimpl();
		animalDao e = (animalDaoimpl) new animalDaoimpl();
		int a = Integer.parseInt(request.getParameter("a"));
		HttpSession ses = request.getSession();
		
		switch (a) {
		case 0:
			int  id = (Integer)ses.getAttribute("u_id");
			 String animalType = request.getParameter("b");
			 
			if(animalType!=null) 
				{	
				
				List<animalModel> l1= d.animalList(id, animalType);
				
					if(l1!=null)
					{
						
							request.setAttribute("list",l1);
							request.setAttribute("type",animalType);
							forward = heatphase;
							RequestDispatcher rd = request.getRequestDispatcher(forward);
							rd.forward(request, response);
					}
					
					}
					else
					{
						System.out.println("value of is not a exist");
					}
		break;
		case 1:
			 id = (Integer)ses.getAttribute("u_id");
			 animalType = request.getParameter("b");
			 
			if(animalType!=null) 
				{	
				
				List<animalModel> l1= d.heatPhaselist(id, animalType);
				
					if(l1!=null)
					{
						
							request.setAttribute("list",l1);
							request.setAttribute("type",animalType);
							forward = liastHeatphase;
							RequestDispatcher rd = request.getRequestDispatcher(forward);
							rd.forward(request, response);
					}
					
					}
					else
					{
						System.out.println("value of is not a exist");
					}
		break;
		case 2:
			 id = (Integer)ses.getAttribute("u_id");
			 animalType = request.getParameter("b");
			 
			if(animalType!=null) 
				{	
				
				List<animalModel> l1= d.pregnanceyList(id, animalType);
				
					if(l1!=null)
					{
						
							request.setAttribute("list",l1);
							request.setAttribute("type",animalType);
							forward = listPragancey;
							RequestDispatcher rd = request.getRequestDispatcher(forward);
							rd.forward(request, response);
					}
					
					}
					else
					{
						System.out.println("value of is not a exist");
					}
		break;
		case 3:
			int a_id = Integer.parseInt(request.getParameter("id"));
			List<heatphaseModel> hh = d.viewPregnancey(a_id);
			List<heatphaseModel> h = d.getMonth(a_id);
			request.setAttribute("list",hh);
			request.setAttribute("lis",h);
			forward = viewPragancey;
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
			
			 
			
		break;
		case 4:
			a_id = Integer.parseInt(request.getParameter("id"));
			hh = d.viewPregnancey(a_id);
			h = d.getMonth(a_id);
			request.setAttribute("list",hh);
			request.setAttribute("lis",h);
			forward = printPragancey;
			rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
			
			 
			
		break;
		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		heatphseDao d = (heatphaseDaoimpl) new heatphaseDaoimpl();
		boolean v = false;
		String action = request.getParameter("action");
		HttpSession ses = request.getSession();
		switch (action) {
		case "generate":
			int  id = (Integer)ses.getAttribute("u_id");
			int a_id = Integer.parseInt(request.getParameter("a_id"));
			Date date = Date.valueOf(request.getParameter("date"));
			int active = 1;
			heatphaseModel hm = new heatphaseModel(a_id,id,date,active);
			v = d.insert(hm);
			if (v) {
				response.sendRedirect("insertData?a=16");
			} else {
				response.sendRedirect("animal_reg.jsp");
			}
			break;
			
		case "close":
			
			  id = (Integer)ses.getAttribute("u_id");
			 a_id = Integer.parseInt(request.getParameter("a_id"));
			 date = Date.valueOf(request.getParameter("date"));
			 String sexualActivity = request.getParameter("sexualActivity");
			 int preg = Integer.parseInt(request.getParameter("preg"));
			 active = 2;
			 hm = new heatphaseModel(a_id,id,date,sexualActivity,preg,active);
			v = d.close(hm);
			if (v) {
				response.sendRedirect("insertData?a=16");
			} else {
				response.sendRedirect("animal_reg.jsp");
			}
			break;
			
			

		default:
			break;
		}
	}

}
