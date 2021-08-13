package com.project.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.dao.heatphseDao;
import com.project.model.animalModel;
import com.project.model.heatphaseModel;
import com.project.util.util;
import com.project.utilImpl.utilImpl;

public class heatphaseDaoimpl implements heatphseDao {
	private boolean b = false;
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	util u = new utilImpl();
	@Override
	public List<animalModel> animalList(int id, String animalType) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from animal where animalType = '"+animalType+"' and u_id = '"+id+"' and active = 0 and act=0");
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
	public Boolean insert(heatphaseModel am) {
	try {
			
			con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			int i = st.executeUpdate(
					"insert into heatphase(a_id,u_id,stratDay,sexualActivity,preg,active) values('"+am.getA_id()+"','"+am.getU_id()+"','"+am.getStratDay()+"','"+am.getSexualActivity()+"','"+am.getPreg()+"','"+am.getActive()+"')");
			if (i > 0) 
			{
			
				int p = st.executeUpdate("update animal set act ='"+am.getActive()+"' where a_id='"+am.getA_id()+"'");
				if(p>0) {
				b = true;
				}
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
	public List<animalModel> heatPhaselist(int id, String animalType) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from animal where animalType = '"+animalType+"' and u_id = '"+id+"' and active = 0 and act=1");
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
	public Boolean close(heatphaseModel am) {
		
			try {
					
					con = u.getConnection();

				if (con != null)
				{
					st = con.createStatement();
					int i = st.executeUpdate(
							"update heatphase set endDay ='"+am.getEndDay()+"', sexualActivity='"+am.getSexualActivity()+"',preg='"+am.getPreg()+"',active='"+am.getActive()+"' where a_id='"+am.getA_id()+"' and active='1' ");
					if (i > 0) 
					{
					
						int p = st.executeUpdate("update animal set act ='"+am.getPreg()+"' where a_id='"+am.getA_id()+"'");
						if(p>0) {
						b = true;
						}
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
	public List<animalModel> pregnanceyList(int id, String animalType) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from animal where animalType = '"+animalType+"' and u_id = '"+id+"' and active = 0 and act=2");
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
	public List<heatphaseModel> viewPregnancey(int id) {
		List<heatphaseModel> l = new ArrayList<heatphaseModel>(); 
		heatphaseModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM heatphase hh, animal aa WHERE hh.a_id = aa.a_id and hh.preg='2' and hh.a_id = '"+id+"'");
			if (rs != null) 
			{
				while (rs.next()) {
					
				nj = new heatphaseModel(rs.getInt("h_id"),rs.getInt("a_id"),rs.getDate("stratDay"),rs.getDate("endDay"),rs.getString("sexualActivity"),rs.getInt("preg"),rs.getString("animalType"),rs.getString("animalBread"),rs.getString("animalName"),rs.getString("animalTagid"));	
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
	public List<heatphaseModel> getMonth(int id) {
		List<heatphaseModel> l = new ArrayList<heatphaseModel>(); 
		heatphaseModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("SELECT  TIMESTAMPDIFF(MONTH,endDay,CURDATE()) AS age FROM heatphase WHERE a_id = '"+id+"' and preg = '2'");
			if (rs != null) 
			{
				while (rs.next()) {
					
				nj = new heatphaseModel(rs.getInt("age"));	
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

}
