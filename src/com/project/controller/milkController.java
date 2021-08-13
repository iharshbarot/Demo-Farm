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
import com.project.dao.milkDao;
import com.project.daoImpl.animalDaoimpl;
import com.project.daoImpl.milkDaoimpl;
import com.project.model.animalModel;
import com.project.model.bornanimalModel;
import com.project.model.milkAnimal;
import com.project.model.milkanimalDetail;
import com.project.model.purAnimalModel;

public class milkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String forward = null;
	private static final String milkUpdate = "milkUpdate.jsp";
	private static final String singleDay = "singlDay.jsp";
	private static final String toDay = "toDay.jsp";
	private static final String singdayReport = "singdayReport.jsp";
	private static final String todayReport = "todayReport.jsp";
	private static final String yestreday = "yestreday.jsp";
	private static final String yestredayReport = "yestredayReport.jsp";
	private static final String dayWise = "dayWise.jsp";
	private static final String daywiseReport = "daywiseReport.jsp";
	private static final String chartToday = "chartToday.jsp";

    public milkController() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean b = false;
		animalDao d = (animalDaoimpl) new animalDaoimpl();
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
							forward = milkUpdate;
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
				
				List<animalModel> l1= d.animalList(id, animalType);
				
					if(l1!=null)
					{
						
							request.setAttribute("list",l1);
							request.setAttribute("type",animalType);
							forward = singleDay;
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
				
				List<animalModel> l1= d.animalList(id, animalType);
				
					if(l1!=null)
					{
						
							request.setAttribute("list",l1);
							request.setAttribute("type",animalType);
							forward = toDay;
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
			
			 id = (Integer)ses.getAttribute("u_id");
			 animalType = request.getParameter("b");
			 
			if(animalType!=null) 
				{	
				
				List<animalModel> l1= d.animalList(id, animalType);
				
					if(l1!=null)
					{
						
							request.setAttribute("list",l1);
							request.setAttribute("type",animalType);
							forward = yestreday;
							RequestDispatcher rd = request.getRequestDispatcher(forward);
							rd.forward(request, response);
					}
					}
					else
					{
						System.out.println("value of is not a exist");
					}
		break;
		case 4:
			
			 id = (Integer)ses.getAttribute("u_id");
			 animalType = request.getParameter("b");
			 
			if(animalType!=null) 
				{	
				
				List<animalModel> l1= d.animalList(id, animalType);
				
					if(l1!=null)
					{
						
							request.setAttribute("list",l1);
							request.setAttribute("type",animalType);
							forward = dayWise;
							RequestDispatcher rd = request.getRequestDispatcher(forward);
							rd.forward(request, response);
					}
					}
					else
					{
						System.out.println("value of is not a exist");
					}
		break;
		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		milkDao d = (milkDaoimpl) new milkDaoimpl();
		boolean v = false;
		String action = request.getParameter("action");
		HttpSession ses = request.getSession();
		switch (action) {
		case "insert":
			int  id = (Integer)ses.getAttribute("u_id");
			String[] a_id = request.getParameterValues("a_id");
			String[] milk = request.getParameterValues("milk");
			int Shift = Integer.parseInt(request.getParameter("Shift"));
			Date date = Date.valueOf(request.getParameter("date"));
			
			for (int i = 0; i < a_id.length; i++) {
				milkAnimal m = new milkAnimal(a_id[i],id,milk[i],date,Shift);
				v = d.insert(m);	
			}
			response.sendRedirect("insertData?a=16");
			
			break;
			
		case "singleDay":
			 
			 int aa_id = Integer.parseInt(request.getParameter("a_id"));
			
			 date = Date.valueOf(request.getParameter("date"));
			 System.out.println(date);
			 id = (Integer)ses.getAttribute("u_id");
			 List<milkAnimal> l = d.singleDay(aa_id, date, id);
			 List<animalModel> l1 = d.animalList(aa_id, id);
			 request.setAttribute("list",l);
			 request.setAttribute("date",date);
			 request.setAttribute("list1",l1);
			 List<bornanimalModel> l2 = d.checkBorn(aa_id);
			 
			 System.out.println(l2);
			 if(l2.isEmpty())
			 {
				 List<purAnimalModel> l3 = d.checkPur(aa_id);
				 request.setAttribute("list3",l3);
				 
				 forward = singdayReport;
			 }
			 else
			 {
				 request.setAttribute("list2",l2);
				 forward = singdayReport;
			 }
			
			 RequestDispatcher rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			break;
		
		case "today":
			 
			 aa_id = Integer.parseInt(request.getParameter("a_id"));
			
			 date = Date.valueOf(request.getParameter("date"));
			 System.out.println(date);
			 id = (Integer)ses.getAttribute("u_id");
			  l = d.singleDay(aa_id, date, id);
			  l1 = d.animalList(aa_id, id);
			 request.setAttribute("list",l);
			 request.setAttribute("date",date);
			 request.setAttribute("list1",l1);
			  l2 = d.checkBorn(aa_id);
			 
			 System.out.println(l2);
			 if(l2.isEmpty())
			 {
				 List<purAnimalModel> l3 = d.checkPur(aa_id);
				 request.setAttribute("list3",l3);
				 
				 forward = todayReport;
			 }
			 else
			 {
				 request.setAttribute("list2",l2);
				 forward = todayReport;
			 }
			
			 rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			 
			break;

		case "yesterday":
			 
			 aa_id = Integer.parseInt(request.getParameter("a_id"));
			
			 date = Date.valueOf(request.getParameter("date"));
			 System.out.println(date);
			 id = (Integer)ses.getAttribute("u_id");
			  l = d.singleDay(aa_id, date, id);
			  l1 = d.animalList(aa_id, id);
			 request.setAttribute("list",l);
			 request.setAttribute("date",date);
			 request.setAttribute("list1",l1);
			  l2 = d.checkBorn(aa_id);
			 
			 System.out.println(l2);
			 if(l2.isEmpty())
			 {
				 List<purAnimalModel> l3 = d.checkPur(aa_id);
				 request.setAttribute("list3",l3);
				 
				 forward = yestredayReport;
			 }
			 else
			 {
				 request.setAttribute("list2",l2);
				 forward = yestredayReport;
			 }
			
			 rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			 
			break;
			
		case "dayWise":
			 
			 aa_id = Integer.parseInt(request.getParameter("a_id"));
			
			 Date date1 = Date.valueOf(request.getParameter("date1"));
			 Date date2 = Date.valueOf(request.getParameter("date2"));
			 
			 id = (Integer)ses.getAttribute("u_id");
			  l = d.dayWise(aa_id, date1, date2, id);
			  l1 = d.animalList(aa_id, id);
			 request.setAttribute("list",l);
			 request.setAttribute("date1",date1);
			 request.setAttribute("date2",date2);
			 request.setAttribute("list1",l1);
			  l2 = d.checkBorn(aa_id);
			 
			 System.out.println(l2);
			 if(l2.isEmpty())
			 {
				 List<purAnimalModel> l3 = d.checkPur(aa_id);
				 request.setAttribute("list3",l3);
				 
				 forward = daywiseReport;
			 }
			 else
			 {
				 request.setAttribute("list2",l2);
				 forward = daywiseReport;
			 }
			
			 rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			 
			break;
			
		case "chartToday":
			 
			 aa_id = Integer.parseInt(request.getParameter("a_id"));
			
			 date = Date.valueOf(request.getParameter("date"));
			 System.out.println(date);
			 id = (Integer)ses.getAttribute("u_id");
			  l = d.singleDay(aa_id, date, id);
			  l1 = d.animalList(aa_id, id);
			 request.setAttribute("list",l);
			 request.setAttribute("date",date);
			 request.setAttribute("list1",l1);
			  l2 = d.checkBorn(aa_id);
			 
			 System.out.println(l2);
			 if(l2.isEmpty())
			 {
				 List<purAnimalModel> l3 = d.checkPur(aa_id);
				 request.setAttribute("list3",l3);
				 
				 forward = chartToday;
			 }
			 else
			 {
				 request.setAttribute("list2",l2);
				 forward = chartToday;
			 }
			
			 rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			 
			break;
		default:
			break;
		}
	}

}
