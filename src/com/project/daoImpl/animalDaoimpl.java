package com.project.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

import com.project.dao.animalDao;
import com.project.model.animalModel;
import com.project.model.bornanimalModel;
import com.project.model.bornviewModel;
import com.project.model.purAnimalModel;
import com.project.model.purviewModel;
import com.project.model.vaccination;
import com.project.util.util;
import com.project.utilImpl.utilImpl;

public class animalDaoimpl implements animalDao{

	private boolean b = false;
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	util u = new utilImpl();
	
	public Boolean insert(animalModel am) {
		try {
			
			con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			int i = st.executeUpdate(
					"insert into animal(u_id,animalType,animalBread,animalName,animalTagid,animalEntry) values('"+am.getU_id()+"','" + am.getAnimalType() + "','" +am.getAnimalBread() + "','"+am.getAnimalName()+"','"+am.getAnimalTagid()+"','"+am.getAnimalEntry()+"')");
			if (i > 0) 
			{
				b = true;
			} 
			else 
			{
				b = false;
			}
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return b;

	}

	@Override
	public List<animalModel> newPurches(int id, String tagID) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from animal where (u_id = '"+id+"' AND animalTagid ='"+tagID+"') ");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new animalModel( rs.getInt("a_id"),rs.getString("animalType"),rs.getString("animalBread"),rs.getString("animalName"),rs.getString("animalTagid"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;

	}

	@Override
	public Boolean purAnimal(purAnimalModel am) {
		try {
			
			con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			int i = st.executeUpdate(
					"insert into purchaseanimal(a_id,u_id,owner_name,Owner_contact_number,owner_add,dob,pur_dob,avgMilk,idealMilk,beforePregnancy,Medical_issues) values('"+am.getA_id()+"','" + am.getU_id() + "','" +am.getOwner_name() + "','"+am.getOwner_contact_number()+"','"+am.getOwner_add()+"','"+am.getDob()+"','"+am.getPur_dob()+"','"+am.getAvgMilk()+"','"+am.getIdealMilk()+"','"+am.getBeforePregnancy()+"','"+am.getMedical_issues()+"')");
			if (i > 0) 
			{
				b = true;
			} 
			else 
			{
				b = false;
			}
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return b;
	}

	@Override
	public List<animalModel> perent(int id,String animalType) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from animal where (u_id = '"+id+"' and animalType= '"+animalType+"') and active = 0 ");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new animalModel( rs.getInt("a_id"),rs.getString("animalTagid"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;
	}

	@Override
	public Boolean bornAnimal(bornanimalModel bm) {
		try {
			
			con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			int i = st.executeUpdate(
					"insert into bornanimal(a_id,u_id,perentId,bornDate,avg_milk,bornidelMilk) values('"+bm.getA_id()+"','"+bm.getU_id()+"','"+bm.getPerentId()+"','"+bm.getBornDOB()+"','"+bm.getBornavrageMilk()+"','"+bm.getIdealMilk()+"')");
			if (i > 0) 
			{
				b = true;
			} 
			else 
			{
				b = false;
			}
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return b;
	}

	@Override
	public List<animalModel> animalList(int id, String animalType) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from animal where animalType = '"+animalType+"' and u_id = '"+id+"' and active = 0");
			if (rs != null) 
			{
				while (rs.next()) {
					
				nj = new animalModel( rs.getInt("a_id"),rs.getString("animalBread"),rs.getString("animalName"),rs.getString("animalTagid"),rs.getInt("animalEntry"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;
	}

	@Override
	public List<bornviewModel> vewBorn(int id) {
		List<bornviewModel> l = new ArrayList<bornviewModel>(); 
		bornviewModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM animal am,bornanimal pm WHERE am.a_id = pm.a_id and (am.a_id = '"+id+"' and pm.active =0)");
			if (rs != null) 
			{
				while (rs.next()) 
				{
		                      		
				nj = new bornviewModel(rs.getInt("a_id"),rs.getString("animalType"),rs.getString("animalBread"),rs.getString("animalName"),rs.getString("animalTagid"),rs.getInt("animalEntry"),rs.getInt("b_id"),rs.getInt("perentId"),rs.getDate("bornDate"),rs.getInt("avg_milk"),rs.getInt("bornidelMilk"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;
	}

	@Override
	public List<purviewModel> vewPur(int id) {
		List<purviewModel> l = new ArrayList<purviewModel>(); 
		purviewModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM animal am,purchaseanimal pm WHERE am.a_id = pm.a_id and (am.a_id = '"+id+"' and pm.active =0)");
			if (rs != null) 
			{
				while (rs.next()) 
				{		
				 nj = new purviewModel(rs.getInt("a_id"),rs.getInt("u_id"),rs.getString("animalType"),rs.getString("animalBread"),rs.getString("animalName"),rs.getString("animalTagid"),rs.getInt("animalEntry"),rs.getInt("p_id"),rs.getString("owner_name"),rs.getLong("Owner_contact_number"),rs.getString("owner_add"),rs.getDate("dob"),rs.getDate("pur_dob"),rs.getInt("avgMilk"),rs.getInt("idealMilk"),rs.getInt("beforePregnancy"),rs.getString("Medical_issues"));	
				 l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;

	}

	@Override
	public List<animalModel> sellList(int id, String animalType) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from animal where animalType = '"+animalType+"' and u_id = '"+id+"' and active = 1");
			if (rs != null) 
			{
				while (rs.next()) {
					
				nj = new animalModel( rs.getInt("a_id"),rs.getString("animalBread"),rs.getString("animalName"),rs.getString("animalTagid"),rs.getInt("animalEntry"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;

	}

	@Override
	public List<animalModel> dethList(int id, String animalType) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from animal where animalType = '"+animalType+"' and u_id = '"+id+"' and active = 2");
			if (rs != null) 
			{
				while (rs.next()) {
					
				nj = new animalModel( rs.getInt("a_id"),rs.getString("animalBread"),rs.getString("animalName"),rs.getString("animalTagid"),rs.getInt("animalEntry"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;


	}

	@Override
	public List<animalModel> animalAge(int id, String animalType) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("SELECT am.dob,aa.a_id,aa.animalType,aa.animalBread, aa.animalTagid, TIMESTAMPDIFF(YEAR, am.dob, CURDATE()) AS age FROM purchaseanimal am, animal aa WHERE am.a_id = aa.a_id and am.active = '0' and aa.u_id='"+id+"' and aa.animalType = '"+animalType+"'");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new animalModel(rs.getDate("dob"),rs.getString("animalType"),rs.getInt("a_id"),rs.getString("animalBread"),rs.getString("animalTagid"),rs.getInt("age"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;
	}

	@Override
	public List<animalModel> bornAge(int id, String animalType) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("SELECT am.bornDate,aa.animalType,aa.a_id,aa.animalBread, aa.animalTagid, TIMESTAMPDIFF(YEAR, am.bornDate, CURDATE()) AS age FROM bornanimal am, animal aa WHERE am.a_id = aa.a_id and am.active = '0' and aa.u_id='"+id+"' and aa.animalType = '"+animalType+"'");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new animalModel(rs.getDate("bornDate"),rs.getString("animalType"),rs.getInt("a_id"),rs.getString("animalBread"),rs.getString("animalTagid"),rs.getInt("age"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;
	}

	@Override
	public List<animalModel> bornData(int id) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("SELECT am.bornDate,aa.a_id,aa.animalType,aa.animalBread, aa.animalTagid, TIMESTAMPDIFF(YEAR, am.bornDate, CURDATE()) AS age,MONTH(am.bornDate) AS Month FROM bornanimal am, animal aa WHERE am.a_id = aa.a_id and am.a_id='"+id+"'");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new animalModel(rs.getDate("bornDate"),rs.getInt("a_id"),rs.getString("animalType"),rs.getString("animalBread"),rs.getString("animalTagid"),rs.getInt("age"),rs.getInt("Month"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;
	}

	@Override
	public List<vaccination> vac(String animalType) {
		List<vaccination> l = new ArrayList<vaccination>(); 
		vaccination nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from vaccination where animalType = '"+animalType+"' ");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new vaccination(rs.getInt("v_id"), rs.getInt("age"),rs.getString("vac"),rs.getString("animalType"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;
	}

	@Override
	public Boolean insertvac(vaccination am) {
try {
			
			con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			int i = st.executeUpdate(
					"insert into vaccinationreleation(a_id,v_id,u_id) values('"+am.getA_id()+"','" + am.getVa_id() + "','" +am.getU_id() + "')");
			if (i > 0) 
			{
				b = true;
			} 
			else 
			{
				b = false;
			}
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return b;
	}

	@Override
	public List<animalModel> purData(int id) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("SELECT am.dob,aa.a_id,aa.animalType,aa.animalBread,aa.animalTagid,  TIMESTAMPDIFF(YEAR, am.dob, CURDATE()) AS age,MONTH(am.dob) AS Month FROM purchaseanimal am, animal aa WHERE am.a_id = aa.a_id and am.a_id='"+id+"'");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new animalModel(rs.getDate("dob"),rs.getInt("a_id"),rs.getString("animalType"),rs.getString("animalBread"),rs.getString("animalTagid"),rs.getInt("age"),rs.getInt("Month"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	 
	return l;
	}

	@Override
	public List<vaccination> viewVac(int id) {
		List<vaccination> l = new ArrayList<vaccination>(); 
		vaccination nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM vaccinationreleation vm, vaccination vr where vm.v_id = vr.v_id and vm.a_id = '"+id+"'");
			if (rs != null) 
			{
				while (rs.next()) {
					nj = new vaccination(rs.getInt("v_id"), rs.getInt("age"),rs.getString("vac"),rs.getString("animalType"));	
				l.add(nj);
				}
			} 
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return l;
	}

	@Override
	public List<animalModel> viewexistingCow(int id) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT COUNT(IF(animalType='Cow',1, NULL)) 'cow',COUNT(IF(animalType='Buffalo',1, NULL)) 'buffalo' FROM animal WHERE active = '0' and u_id = '"+id+"'");
			if (rs != null) 
			{
				
				while (rs.next()) {
					nj = new animalModel(rs.getInt("cow"),rs.getInt("buffalo"));	
				l.add(nj);
				
				}
			} 
			else
			{
				System.out.println("bar");
			}
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return l;
	}

	@Override
	public List<animalModel> existingHeatphase(int id) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT COUNT(IF(animalType='Cow',1, NULL)) 'cow',COUNT(IF(animalType='Buffalo',1, NULL)) 'buffalo'FROM animal WHERE active = '0' and act = '1' and u_id ='"+id+"'");
			if (rs != null) 
			{
				
				while (rs.next()) {
					nj = new animalModel(rs.getInt("cow"),rs.getInt("buffalo"));	
				l.add(nj);
				
				}
			} 
			else
			{
				System.out.println("bar");
			}
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return l;
	}

	@Override
	public List<animalModel> prag(int id) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT COUNT(IF(animalType='Cow',1, NULL)) 'cow',COUNT(IF(animalType='Buffalo',1, NULL)) 'buffalo'FROM animal WHERE active = '0' and act = '2' and u_id ='"+id+"'");
			if (rs != null) 
			{
				
				while (rs.next()) {
					nj = new animalModel(rs.getInt("cow"),rs.getInt("buffalo"));	
				l.add(nj);
				
				}
			} 
			else
			{
				System.out.println("bar");
			}
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return l;
	}

	@Override
	public List<animalModel> sell(int id) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT COUNT(IF(animalType='Cow',1, NULL)) 'cow',COUNT(IF(animalType='Buffalo',1, NULL)) 'buffalo'FROM animal WHERE active = '1' and u_id ='"+id+"'");
			if (rs != null) 
			{
				
				while (rs.next()) {
					nj = new animalModel(rs.getInt("cow"),rs.getInt("buffalo"));	
				l.add(nj);
				
				}
			} 
			else
			{
				System.out.println("bar");
			}
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return l;

	}

	@Override
	public List<animalModel> dead(int id) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT COUNT(IF(animalType='Cow',1, NULL)) 'cow',COUNT(IF(animalType='Buffalo',1, NULL)) 'buffalo'FROM animal WHERE active = '2' and u_id ='"+id+"'");
			if (rs != null) 
			{
				
				while (rs.next()) {
					nj = new animalModel(rs.getInt("cow"),rs.getInt("buffalo"));	
				l.add(nj);
				
				}
			} 
			else
			{
				System.out.println("bar");
			}
		}
		else 
		{
			System.out.println("connection null 6..");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return l;
	}	


	}
