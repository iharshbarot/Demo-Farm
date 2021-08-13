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
import com.project.dao.dao;
import com.project.daoImpl.animalDaoimpl;
import com.project.daoImpl.daoImpl;
import com.project.model.animalModel;
import com.project.model.registrationModel;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;




public class insertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	 private static final String foreview = "listRegistration.jsp";
	 private static final String panding = "listPanding.jsp";
	 private static final String deactive = "listDeactive.jsp";
	 private static final String trash = "trashFarm.jsp";
	 private static final String view = "viewFarm.jsp";
	 private static final String printFarm = "printFarm.jsp";
	 private static final String updateProfile = "updateProfile.jsp";
	 private static final String dashboard = "dashboard.jsp";
	 
	 private String forward = null;
     public insertData() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession();
		boolean b = false;
		dao d = (dao) new daoImpl();
		int a = Integer.parseInt(request.getParameter("a"));
		animalDao dd =(animalDaoimpl) new animalDaoimpl();
		switch(a)
		{
		//for use existing farm list
		case 0:
			List<registrationModel> l= d.display();
			request.setAttribute("list",l);
			forward = foreview;
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
			break;
			//temp delete in activeList
		case 1:
			int u_id = Integer.parseInt(request.getParameter("id"));
		    int active = 1;
			b = d.tempdel(u_id,active);
			 	if(b)
			 		{
			 			l= d.display();
			 			request.setAttribute("list",l);
			 			forward = foreview;
			 			rd = request.getRequestDispatcher(forward);
			 			rd.forward(request, response);
			 		}
			 	else
			 		{
			 			response.sendRedirect("Error.jsp");
			 		}
			break;
			//log out
		case 2:
			ses.removeAttribute("farmName");
			ses.removeAttribute("role");
			ses.invalidate();
			response.sendRedirect("login.jsp");
			break;
			//farmlist - Deactive record
		case 3:
			u_id = Integer.parseInt(request.getParameter("id"));
			int role = 3;
			b =	d.update(u_id,role);
				if(b)
					{
						l= d.display();
						request.setAttribute("list",l);
						forward = foreview;
						rd = request.getRequestDispatcher(forward);
						rd.forward(request, response);
					}
				else
					{
						response.sendRedirect("Error.jsp");
					}
				break;
				//panding farm request
		case 4:
			 l= d.displayPanding();
			 request.setAttribute("list",l);
			 forward = panding;
			 rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			 break;
			 //active record from panding
		case 5:
			 u_id = Integer.parseInt(request.getParameter("id"));
			 role = 1;
			 b =	d.update(u_id,role);
			 	if(b)
			 		{
			 		l= d.displayPanding();
			 			request.setAttribute("list",l);
			 			forward = panding;
			 			rd = request.getRequestDispatcher(forward);
			 			rd.forward(request, response);
			 		}
			 	else
			 		{
			 			response.sendRedirect("Error.jsp");
			 		}
		break;
				//Dispalay Deactive 
		case 6:
			 l= d.displayDeactive();
			 request.setAttribute("list",l);
			 forward = deactive;
			 rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
		break;
			// Delete in panding
		case 7:
			u_id = Integer.parseInt(request.getParameter("id"));
			b =	d.delete(u_id);
			if(b)
			{
				 l= d.displayPanding();
	 			request.setAttribute("list",l);
	 			forward = panding;
	 			rd = request.getRequestDispatcher(forward);
	 			rd.forward(request, response);
			}
			else
			{
				response.sendRedirect("Error.jsp");
			}
			break;
			//trash
		case 8:
			 l= d.trashFarm();
			request.setAttribute("list",l);
			forward = trash;
			 rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
			
		break;
		case 9:
			 u_id = Integer.parseInt(request.getParameter("id"));
		     active = 1;
		     b = d.tempdel(u_id,active);
			 	if(b)
			 		{
			 		l= d.displayDeactive();
					 request.setAttribute("list",l);
					 forward = deactive;
					 rd = request.getRequestDispatcher(forward);
					 rd.forward(request, response);
			 		}
			 	else
			 		{
			 			response.sendRedirect("Error.jsp");
			 		}
			break;
			//Restore account
		
		case 10:
			u_id = Integer.parseInt(request.getParameter("id"));
		     active = 0;
		     b = d.restore(u_id,active);
			 	if(b)
			 		{
			 		 l= d.trashFarm();
						request.setAttribute("list",l);
						forward = trash;
						 rd = request.getRequestDispatcher(forward);
						rd.forward(request, response);
			 		}
			 	else
			 		{
			 			response.sendRedirect("Error.jsp");
			 		}
			break;
			
			//perment delete 
		case 11:
			u_id = Integer.parseInt(request.getParameter("id"));
			
			b =	d.delete(u_id);
			if(b)
			{ l= d.trashFarm();
			request.setAttribute("list",l);
			forward = trash;
			 rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
			}
			else
			{
				response.sendRedirect("Error.jsp");
			}
			break;
			//view Data
		case 12:
			u_id = Integer.parseInt(request.getParameter("id"));
			 l= d.view(u_id);
			 request.setAttribute("list",l);
			 forward = view;
			 rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			break;
		//print farm
		case 13:
			 u_id = Integer.parseInt(request.getParameter("id"));
			 l= d.view(u_id);
			 request.setAttribute("list",l);
			 forward = printFarm;
			 rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			break;
			//update profile
		case 14:
			 u_id = Integer.parseInt(request.getParameter("id"));
			 l= d.view(u_id);
			 request.setAttribute("list",l);
			 forward = updateProfile;
			 rd = request.getRequestDispatcher(forward);
			 rd.forward(request, response);
			break;
			//change password
		case 15:
			u_id = Integer.parseInt(request.getParameter("id"));
			
			registrationModel mw = new registrationModel(u_id);
			registrationModel q = d.cp(mw);
			if (q != null)
			{
				request.setAttribute("password", q.getPassword());
				request.getRequestDispatcher("changePassword.jsp").forward(request, response);
			} 
			break;
		case 16:
			u_id = (Integer)ses.getAttribute("u_id");
			List<animalModel> c= dd.viewexistingCow(u_id);
			List<animalModel> cc = dd.existingHeatphase(u_id);
			List<animalModel> ccc = dd.prag(u_id);
			List<animalModel> cccc = dd.sell(u_id);
			List<animalModel> ccccc = dd.dead(u_id);
			List<registrationModel> p= d.existFarm();
			request.setAttribute("pist",p);
			List<registrationModel> p1= d.paddingFarm();
			request.setAttribute("pist1",p1);
			List<registrationModel> p2= d.deaciveFarm();
			request.setAttribute("pist2",p2);
			List<registrationModel> p3= d.trashFarmlist();
			request.setAttribute("pist3",p3);
			request.setAttribute("list",c);
			request.setAttribute("list1",cc);
			request.setAttribute("list2",ccc);
			request.setAttribute("list3",cccc);
			request.setAttribute("list4",ccccc);
			if (c != null)
			{
			forward = dashboard;
			 rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
			}
			
			else
			{
			System.out.println("Dhoka");
			}
			break;
		default:		
		break;
			}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession();
		dao d = (dao) new daoImpl();
		boolean v = false;
		String action = request.getParameter("action");
		switch(action)
		{
		case "login":
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			registrationModel mw = new registrationModel(username,password);
			registrationModel q = d.check(mw);
			if (q != null)
			{
				ses.setAttribute("farmName",q.getFarm_name());
				ses.setAttribute("role",q.getRole());
				ses.setAttribute("u_id", q.getU_id());
				response.sendRedirect("insertData?a=16");
				
			} 
			else 
			{	
		        response.sendRedirect("login.jsp");
		        
			}
			break;
			
		case "registartion":
			String farm_name = request.getParameter("farm_name");
			String farm_address = request.getParameter("farm_address");
			String district = request.getParameter("district");
			String state = request.getParameter("state");
			String owner_name = request.getParameter("owner_name");
			String farm_email = request.getParameter("farm_email");
			long farm_contact_no =Long.parseLong(request.getParameter("farm_contact_no")); 	
			long owner_contact_no=Long.parseLong(request.getParameter("owner_contact_no"));;
			username = request.getParameter("username");
			password = request.getParameter("password");
			String farm_reg_no = request.getParameter("farm_reg_no");
			registrationModel mr = new registrationModel(farm_name,farm_address,district,state,owner_name,farm_email,farm_contact_no,owner_contact_no,username,password,farm_reg_no);
			v = d.insert(mr);
			if (v) 
			{
				response.sendRedirect("login.jsp");
			}
			else
			{
				response.sendRedirect("registartion.jsp");
			}
			
			break;
			
		case "update":
			 int u_id = Integer.parseInt(request.getParameter("u_id"));
			 farm_name = request.getParameter("farm_name");
			 farm_address = request.getParameter("farm_address");
			 district = request.getParameter("district");
			 state = request.getParameter("state");
			 owner_name = request.getParameter("owner_name");
			 farm_email = request.getParameter("farm_email");
			 farm_contact_no =Long.parseLong(request.getParameter("farm_contact_no")); 	
			 owner_contact_no=Long.parseLong(request.getParameter("owner_contact_no"));;
			 farm_reg_no = request.getParameter("farm_reg_no");
			registrationModel up = new registrationModel(u_id,farm_name,farm_address,district,state,owner_name,farm_email,farm_contact_no,owner_contact_no,farm_reg_no);
			v = d.updateProfile(up);
			if (v) 
			{
				response.sendRedirect("insertData?a=16");
			}
			else
			{
				response.sendRedirect("failer.jsp");
			}
			
			break;
		case "updatePassword":
			u_id = Integer.parseInt(request.getParameter("u_id"));
			 password = request.getParameter("Password");
			 System.out.println(password);
			 registrationModel pass = new registrationModel(u_id,password);
				v = d.updatePassword(pass);
				if (v) 
				{
					response.sendRedirect("insertData?a=16");
				}
				else
				{
					response.sendRedirect("failer.jsp");
				}
				 
		break;
			
			default:
			break;
		}

	}

}
