package com.project.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import com.project.model.bornanimalModel;
import com.project.model.bornviewModel;
import com.project.model.milkAnimal;
import com.project.model.purAnimalModel;
import com.project.model.purviewModel;
import com.project.model.vaccination;

public class animal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String foreview = "pur_animal.jsp";
	private static final String bornAnimal = "bornAnimal.jsp";
	private static final String animalList = "listAnimal.jsp";
	private static final String viewBornp = "viewBorn.jsp";
	private static final String vewPur = "vewPur.jsp";
	private static final String viewBornpprint = "viewBornprint.jsp";
	private static final String vewPurprint = "vewPurprint.jsp";
	private static final String vac = "vac.jsp";
	private static final String vacc = "vacc.jsp";
	private String forward = null;
	public animal() {
        super();   
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {	
		boolean b = false;
		animalDao d = (animalDaoimpl) new animalDaoimpl();
		int a = Integer.parseInt(request.getParameter("a"));
		HttpSession ses = request.getSession();
		switch(a) {
		//viwe in purches form
			case 0:
				String tagID = request.getParameter("tagId");
				
				int id = (Integer)ses.getAttribute("u_id");
				if(tagID!=null) 
					{	
						List<animalModel> l= d.newPurches(id,tagID);
						request.setAttribute("list",l);
						forward = foreview;
						RequestDispatcher rd = request.getRequestDispatcher(forward);
						rd.forward(request, response);
					}
				else
					{
						System.out.println("value of is not a exist");
					}
			break;	
			//view in born form
			case 1:
				 tagID = request.getParameter("tagId");
				 id = (Integer)ses.getAttribute("u_id");
				 String animalType = request.getParameter("b");
				 
				if(tagID!=null) 
					{	
					List<animalModel> l1= d.newPurches(id,tagID);
						if(l1!=null)
						{
							
							List<animalModel> l= d.perent(id,animalType);
							if(l!=null)
							{
								request.setAttribute("list",l1);
								request.setAttribute("pist",l);
								forward = bornAnimal;
								RequestDispatcher rd = request.getRequestDispatcher(forward);
								rd.forward(request, response);
							}
							else
							{
								System.out.println("value of is not a exist");
							}
						}
						else
						{
							System.out.println("value of is not a exist");
						}
					}
				else
					{
						System.out.println("value of is not a exist");
					}
			break;
			// listAnimal
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
			case 3:
				int entryAnimal =Integer.parseInt(request.getParameter("b"));
				int a_id = Integer.parseInt(request.getParameter("id"));
					if(entryAnimal == 0)
					{
						List<purviewModel> viewPur= d.vewPur(a_id);
						if(viewPur!=null)
						{ 
							request.setAttribute("list",viewPur);
							forward = vewPur;
							RequestDispatcher rd = request.getRequestDispatcher(forward);
							rd.forward(request, response);
						}
					}
					else if(entryAnimal == 1)
					{
						List<bornviewModel> viewBorn= d.vewBorn(a_id);
						if(viewBorn!=null)
						{ 
							request.setAttribute("list",viewBorn);
							forward = viewBornp;
							RequestDispatcher rd = request.getRequestDispatcher(forward);
							rd.forward(request, response);
						}
					}	
					else
					{
						System.out.println("nathi malatu");
					}	
				break;
			case 4:
				 entryAnimal =Integer.parseInt(request.getParameter("b"));
				 a_id = Integer.parseInt(request.getParameter("id"));
					if(entryAnimal == 0)
					{
						List<purviewModel> viewPur= d.vewPur(a_id);
						if(viewPur!=null)
						{ 
							request.setAttribute("list",viewPur);
							forward = vewPurprint;
							RequestDispatcher rd = request.getRequestDispatcher(forward);
							rd.forward(request, response);
						}
					}
					else if(entryAnimal == 1)
					{
						List<bornviewModel> viewBorn= d.vewBorn(a_id);
						if(viewBorn!=null)
						{ 
							request.setAttribute("list",viewBorn);
							forward = viewBornpprint;
							RequestDispatcher rd = request.getRequestDispatcher(forward);
							rd.forward(request, response);
						}
					}	
					else
					{
						System.out.println("nathi malatu");
					}	
				break;
			case 5:
				 id = (Integer)ses.getAttribute("u_id");
				 animalType = request.getParameter("b");
				 
				if(animalType!=null) 
					{	
					
					
					List<animalModel> l2= d.animalAge(id, animalType);
					List<animalModel> l3= d.bornAge(id, animalType);
						if(l2!=null)
						{
							
								request.setAttribute("list",l2);
								request.setAttribute("list1",l3);
								request.setAttribute("type",animalType);
								forward = vac;
								RequestDispatcher rd = request.getRequestDispatcher(forward);
								rd.forward(request, response);
						}
						
						}
						else
						{
							System.out.println("value of is not a exist");
						}
			break;
			case 6:
				
				 a_id = Integer.parseInt(request.getParameter("id"));
				 int q = Integer.parseInt(request.getParameter("b"));
				 if(q==1)
				 {
					 animalType = "Buffalo";
				 }
				 else
				 {
					 animalType = "Cow";
				 }
				 List<vaccination> cc= d.viewVac(a_id);
				 List<vaccination> l4= d.vac(animalType);
				 List<animalModel> l3= d.bornData(a_id);
				 request.setAttribute("list",l3);
				 request.setAttribute("list1",l4);
				 request.setAttribute("list2",cc);
				 forward = vacc;
				 RequestDispatcher rd = request.getRequestDispatcher(forward);
				 rd.forward(request, response);
				break;
				
			case 7:
				 a_id = Integer.parseInt(request.getParameter("id"));
				 q = Integer.parseInt(request.getParameter("b"));
				 if(q==1)
				 {
					 animalType = "Buffalo";
				 }
				 else
				 {
					 animalType = "Cow";
				 }
				  cc= d.viewVac(a_id);
				  l4= d.vac(animalType);
				 List<animalModel> l5= d.purData(a_id);
				 request.setAttribute("list",l5);
				 request.setAttribute("list1",l4);
				 request.setAttribute("list2",cc);
				 forward = vacc;
				 rd = request.getRequestDispatcher(forward);
				 rd.forward(request, response);
				break;
				
			default:
			break;
		
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		animalDao d = (animalDaoimpl) new animalDaoimpl();
		boolean v = false;
		HttpSession ses = request.getSession();
		String action = request.getParameter("action");
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-mm-dd");
		switch(action){
		case "purches":
			int u_id = Integer.parseInt(request.getParameter("u_id"));
			String animalType = request.getParameter("animalType");
			String animalBread = request.getParameter("animalBread");
			String animalName = request.getParameter("animalName");
			String animalTagid = request.getParameter("animalTagid");
		
			int i = 0;
			animalModel am = new animalModel(u_id,animalType,animalBread,animalName,animalTagid,i); 
			v = d.insert(am);
			if (v) {
				response.sendRedirect("animal?a=0&tagId="+animalTagid+"");
			} else {
				response.sendRedirect("animal_reg.jsp");
			}
		break;
		
		case "born":
			 u_id = Integer.parseInt(request.getParameter("u_id"));
			 animalType = request.getParameter("animalType");
			 animalBread = request.getParameter("animalBread");
			 animalName = request.getParameter("animalName");
			 animalTagid = request.getParameter("animalTagid");
			 i = 1;
			 am = new animalModel(u_id,animalType,animalBread,animalName,animalTagid,i); 
			 
			 v = d.insert(am);
			 if (v) {
				  
					response.sendRedirect("animal?a=1&b="+animalType+"&tagId="+animalTagid+"");
			 } else {
				response.sendRedirect("animal_reg.jsp");
			 }
		break;
			
		case "purchesed":
			 int a_id = Integer.parseInt(request.getParameter("a_id"));
			 u_id = Integer.parseInt(request.getParameter("u_id"));
			 String owner_name = request.getParameter("owner_name");
			 long Owner_contact_number = Long.parseLong(request.getParameter("Owner_contact_number"));
			 String owner_add = request.getParameter("owner_add");
			 Date dob = Date.valueOf(request.getParameter("dob"));
			 Date pur_dob = Date.valueOf(request.getParameter("pur_dob"));
			 int avgMilk = Integer.parseInt(request.getParameter("avgMilk"));
			 int idealMilk = Integer.parseInt(request.getParameter("idealMilk"));
			 int beforePregnancy = Integer.parseInt(request.getParameter("beforePregnancy"));
			 String Medical_issues = request.getParameter("Medical_issues");
			 purAnimalModel pm = new purAnimalModel(a_id,u_id,owner_name,Owner_contact_number,owner_add,dob,pur_dob,avgMilk,idealMilk,beforePregnancy,Medical_issues);
			 v = d.purAnimal(pm);
			 if (v) {
				 response.sendRedirect("dashboard.jsp");
			 } else {
				response.sendRedirect("fail");
			 }
		break;
		
		case "borned":
			 a_id = Integer.parseInt(request.getParameter("a_id"));
			 u_id = Integer.parseInt(request.getParameter("u_id"));
			 int perentId = Integer.parseInt(request.getParameter("p_id"));
			 Date bornDate = Date.valueOf(request.getParameter("bornDate"));
			 int avg_milk = Integer.parseInt(request.getParameter("avg_milk"));
			 int bornidelMilk = Integer.parseInt(request.getParameter("bornidelMilk"));
			 bornanimalModel bm = new bornanimalModel(a_id,u_id,perentId,bornDate,avg_milk,bornidelMilk);
			 v=d.bornAnimal(bm);
			 if(v)
			 {
				 response.sendRedirect("dashboard.jsp");
			 }
			 else
			 {
				 response.sendRedirect("fail");
			 }
			break;
		case "Vaccination":
			int  id = (Integer)ses.getAttribute("u_id");
			 a_id = Integer.parseInt(request.getParameter("a_id"));
			String[] v_id = request.getParameterValues("v_id");
			System.out.println(v_id);
			for (int h = 0; h < v_id.length; h++) {
				vaccination vm = new vaccination(a_id,id,v_id[h]);
				v = d.insertvac(vm);	
			}
			response.sendRedirect("insertData?a=16");
		break;
		default:
		break;
		}
		
	}

}