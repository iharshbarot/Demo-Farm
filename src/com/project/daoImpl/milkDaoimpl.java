package com.project.daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.dao.milkDao;
import com.project.model.animalModel;
import com.project.model.bornanimalModel;
import com.project.model.milkAnimal;
import com.project.model.milkanimalDetail;
import com.project.model.purAnimalModel;
import com.project.model.registrationModel;
import com.project.util.util;
import com.project.utilImpl.utilImpl;

public class milkDaoimpl implements milkDao {

	private boolean b = false;
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	util u = new utilImpl();
	
	public Boolean insert(milkAnimal sm) {
try {
			
			con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			int i = st.executeUpdate(
					"insert into milk(a_id,u_id,Milk,date,shift)"
					+ " values('"+sm.getA_id()+"','"+sm.getU_id()+"','"+sm.getMilk()+"','"+sm.getDate()+"','"+sm.getShift()+"')");
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
	public List<milkAnimal> singleDay(int a_id, Date date, int u_id) {

		List<milkAnimal> l = new ArrayList<milkAnimal>(); 
		milkAnimal nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("select * from  milk  where date='"+date+"' and u_id='"+u_id+"' and a_id='"+a_id+"'");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new milkAnimal(rs.getString("Milk"),rs.getDate("date"),rs.getInt("shift"),rs.getInt("activitiy"));	
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

	
	public List<animalModel> animalList(int a_id, int u_id) {
		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from animal where a_id = '"+a_id+"' and u_id = '"+u_id+"' and active = 0");
			if (rs != null) 
			{
				while (rs.next()) {
					
				nj = new animalModel( rs.getInt("a_id"),rs.getString("animalType"),rs.getString("animalBread"),rs.getString("animalName"),rs.getString("animalTagid"),rs.getInt("animalEntry"));	
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
	public List<bornanimalModel> checkBorn(int a_id) {
		List<bornanimalModel> l = new ArrayList<bornanimalModel>(); 
		bornanimalModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from bornanimal where a_id = '"+a_id+"'");
			if (rs != null) 
			{
				while (rs.next()) {
					
				nj = new bornanimalModel(rs.getInt("avg_milk"));	
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
	public List<purAnimalModel> checkPur(int a_id) {
		List<purAnimalModel> l = new ArrayList<purAnimalModel>(); 
		purAnimalModel nj = null;
		try {
	
		con = u.getConnection();

		if (con != null)
		{

			st = con.createStatement();
			rs = st.executeQuery("select * from purchaseanimal where a_id = '"+a_id+"'");
			if (rs != null) 
			{
				while (rs.next()) {
					
				nj = new purAnimalModel(rs.getInt("avgMilk"));	
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
	public List<milkAnimal> dayWise(int a_id, Date date1, Date date2, int u_id) {

		List<milkAnimal> l = new ArrayList<milkAnimal>(); 
		milkAnimal nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM milk WHERE date between '"+date1+"' and '"+date2+"' and a_id='"+a_id+"' and u_id='"+u_id+"'");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new milkAnimal(rs.getString("Milk"),rs.getDate("date"),rs.getInt("shift"),rs.getInt("activitiy"));	
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
