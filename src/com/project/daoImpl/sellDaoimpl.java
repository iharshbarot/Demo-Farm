package com.project.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.dao.sellDao;
import com.project.model.animalModel;
import com.project.model.deathAnimalModel;
import com.project.model.sellModel;
import com.project.util.util;
import com.project.utilImpl.utilImpl;

public class sellDaoimpl implements sellDao {

	private boolean b = false;
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	util u = new utilImpl();
	
	public Boolean insert(sellModel sm) {
		
		try {
			
			con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			int i = st.executeUpdate(
					"insert into sellanimal(u_id,a_id,sell_owner_name,sell_owner_contact_number,sell_owner_address,sell_avg_milk,sellingPrice,sellDate,sellMedicalIssues)"
					+ " values('"+sm.getU_id()+"','"+sm.getA_id()+"','"+sm.getSell_owner_name()+"','"+sm.getSell_owner_contact_number()+"','"+sm.getSell_owner_address()+"','"+sm.getSell_avg_milk()+"','"+sm.getSellingPrice()+"','"+sm.getSellDate()+"','"+sm.getSellMedicalIssues()+"')");
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
	public Boolean updateRecord(int active,int a_id) {
	try {
			
			con = u.getConnection();

				if (con != null)
				{
					st = con.createStatement();
					
				
					int i = st.executeUpdate("update animal set active ='"+active+"' where a_id='"+a_id+"'");
					
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
	public Boolean insertDeth(deathAnimalModel dm) {
		try {
			
			con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			int i = st.executeUpdate(
					"insert into deathamimal(a_id,u_id,Death_date,death_Reason,dormanBy)"
					+ " values('"+dm.getA_id()+"','"+dm.getU_id()+"','"+dm.getDeath_date()+"','"+dm.getDeath_Reason()+"','"+dm.getDormanBy()+"')");
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
	public List<sellModel> viewSell(int id) {
		List<sellModel> l = new ArrayList<sellModel>(); 
		sellModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from sellanimal where a_id='"+id+"' ");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new sellModel( rs.getInt("a_id"),rs.getString("sell_owner_name"),rs.getLong("sell_owner_contact_number"),rs.getString("sell_owner_address"),rs.getInt("sell_avg_milk"),rs.getDouble("sellingPrice"),rs.getDate("sellDate"),rs.getString("sellMedicalIssues"));	
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
	public List<animalModel> viewAnimal(int id) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from animal where a_id='"+id+"' ");
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
	public List<deathAnimalModel> viewDead(int id) {
		List<deathAnimalModel> l = new ArrayList<deathAnimalModel>(); 
		deathAnimalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM deathamimal where a_id = '"+id+"' ");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new deathAnimalModel( rs.getInt("a_id"),rs.getDate("Death_date"),rs.getString("death_Reason"),rs.getString("dormanBy"));	
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
