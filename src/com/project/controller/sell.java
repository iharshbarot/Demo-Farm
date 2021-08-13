package com.project.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.dao.animalDao;
import com.project.dao.sellDao;
import com.project.daoImpl.animalDaoimpl;
import com.project.daoImpl.sellDaoimpl;
import com.project.model.animalModel;
import com.project.model.deathAnimalModel;
import com.project.model.sellModel;


/**
 * Servlet implementation class sell
 */
public class sell extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String forward = null;
	private static final String sellList = "listSell.jsp";
	private static final String dethList = "listDeth.jsp";
	private static final String viewSell = "viewSell.jsp";
	private static final String printSell = "printSell.jsp";
	private static final String viewDead = "viewDead.jsp";
	private static final String printDead = "printDead.jsp";
 
    public sell() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean b = false;
		animalDao d = (animalDaoimpl) new animalDaoimpl();
		sellDao sd = (sellDaoimpl) new sellDaoimpl();
		int a = Integer.parseInt(request.getParameter("a"));
		HttpSession ses = request.getSession();
		switch (a) {
		case 2:
			int id = (Integer)ses.getAttribute("u_id");
			String animalType = request.getParameter("b");
		 
			if(animalType!=null) 
				{	
			
					List<animalModel> l1= d.sellList(id, animalType);
				if(l1!=null)
					{
					
						request.setAttribute("list",l1);
						request.setAttribute("type",animalType);
						forward = sellList;
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
			
					List<animalModel> l1= d.dethList(id, animalType);
				if(l1!=null)
					{
					
						request.setAttribute("list",l1);
						request.setAttribute("type",animalType);
						forward = dethList;
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
			 int a_id = Integer.parseInt(request.getParameter("id"));
			 List<sellModel> sl = sd.viewSell(a_id);
			 List<animalModel> am = sd.viewAnimal(a_id);
			 if(sl!=null)
			 {
			 request.setAttribute("list",sl);
			 request.setAttribute("list1",am);
			 forward = viewSell;
			 RequestDispatcher rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			 }
			 else
			 {
				 System.out.println("null 6e");
			 }
			
		break;
		
		case 5:
			 id = (Integer)ses.getAttribute("u_id");
			 a_id = Integer.parseInt(request.getParameter("id"));
			 sl = sd.viewSell(a_id);
			 am = sd.viewAnimal(a_id);
			 if(sl!=null)
			 {
			 request.setAttribute("list",sl);
			 request.setAttribute("list1",am);
			 forward = printSell;
			 RequestDispatcher rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			 }
			 else
			 {
				 System.out.println("null 6e");
			 }
			
		break;
		
		case 6:
			a_id = Integer.parseInt(request.getParameter("id"));
			 List<deathAnimalModel> dl = sd.viewDead(a_id);
			am = sd.viewAnimal(a_id);
			 if(dl!=null)
			 {
			 request.setAttribute("list",dl);
			 request.setAttribute("list1",am);
			 forward = viewDead;
			 RequestDispatcher rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			 }
			 else
			 {
				 System.out.println("null 6e");
			 }
			 break;
		case 7:
			a_id = Integer.parseInt(request.getParameter("id"));
			  dl = sd.viewDead(a_id);
			am = sd.viewAnimal(a_id);
			 if(dl!=null)
			 {
			 request.setAttribute("list",dl);
			 request.setAttribute("list1",am);
			 forward = printDead;
			 RequestDispatcher rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			 }
			 else
			 {
				 System.out.println("null 6e");
			 }
			
		break;
		
	
	default:
	break;
	}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		sellDao d = (sellDaoimpl) new sellDaoimpl();
		boolean v = false;
		String action = request.getParameter("action");
		HttpSession ses = request.getSession();
		switch (action) {
		case "sell":
			 int u_id = (Integer)ses.getAttribute("u_id");
			 int a_id = Integer.parseInt(request.getParameter("a_id"));
			 String sell_owner_name = request.getParameter("sell_owner_name");
			 long sell_owner_contact_number = Long.parseLong(request.getParameter("sell_owner_contact_number"));
			 String sell_owner_address = request.getParameter("sell_owner_address");
			 int sell_avg_milk = Integer.parseInt(request.getParameter("sell_avg_milk"));
			 double sellingPrice = Double.parseDouble(request.getParameter("sellingPrice"));
			 Date sellDate = Date.valueOf(request.getParameter("sellDate"));
			 String sellMedicalIssues = request.getParameter("sellMedicalIssues");
			 int active = 1;
			 sellModel sm = new sellModel(a_id,u_id,sell_owner_name,sell_owner_contact_number,sell_owner_address,sell_avg_milk,sellingPrice,sellDate,sellMedicalIssues);
			 boolean c = false;
			 v = d.insert(sm);
			 if(v)
			 {
				 c = d.updateRecord(active, a_id);
				 if (c) {
					 response.sendRedirect("insertData?a=16");
				}
				 else
				 {
					 System.out.println("not update actived");
				 }
			 }
			 else
			 {
				 response.sendRedirect("fail");
			 }
			break;
		case "deth":
		
			 u_id = (Integer)ses.getAttribute("u_id");
			 a_id = Integer.parseInt(request.getParameter("a_id"));
			 Date Death_date = Date.valueOf(request.getParameter("Death_date"));
			 String death_Reason = request.getParameter("death_Reason");
			 String dormanBy = request.getParameter("dormanBy");
			 active = 2;
			 
			 deathAnimalModel dm = new deathAnimalModel(u_id,a_id,Death_date,death_Reason,dormanBy);
			 v= d.insertDeth(dm);
			 if (v) {
				 c = d.updateRecord(active, a_id);
				 if (c) {
					 response.sendRedirect("insertData?a=16");
				}
				 else
				 {
					 System.out.println("not update actived");
				 }
			 }
			 else
			 {
				 response.sendRedirect("fail");
			 }
			 break;
		default:
			break;
		}
		
	}

}
