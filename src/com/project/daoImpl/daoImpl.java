package com.project.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.dao.dao;

import com.project.model.registrationModel;
import com.project.util.util;
import com.project.utilImpl.utilImpl;

public class daoImpl implements dao{

	private boolean b = false;
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	
	util u = new utilImpl();
	@Override
	public registrationModel check(registrationModel m) {
		
		registrationModel nj = null;
			try {
		
		con = u.getConnection();

			if (con != null)
			{
				
				st = con.createStatement();
				rs = st.executeQuery("select *  from registration where username = '"+m.getUsername()+"' and password = '"+m.getPassword()+"' and active=0");
				
				if (rs != null) 
				{
					
					if (rs.next()) {
						
						nj = new registrationModel(rs.getInt("u_id"),rs.getString("username"),rs.getString("farm_name"),rs.getInt("role"));	
						
						}
					
				} 
				else 
				{
					System.out.println("Result set null 6e..");
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
		 
		return nj;

	}
	@Override
	public boolean insert(registrationModel mr) {
		try {
			
			con = u.getConnection();

				if (con != null)
				{
					st = con.createStatement();
					int i = st.executeUpdate(
							"insert into registration(farm_name,farm_address,district,state,owner_name,farm_email,farm_contact_no,owner_contact_no,username,password,farm_reg_no) values('" + mr.getFarm_name() + "','" + mr.getFarm_address() + "','"+mr.getDistrit()+"','"+mr.getState()+"','"+mr.getOwner_name()+"','"+mr.getFarm_email()+"','"+mr.getFarm_contact_no()+"','"+mr.getOwner_contact_no()+"','"+mr.getUsername()+"','"+mr.getPassword()+"','"+mr.getFarm_reg_no()+"')");
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
	public List<registrationModel> display()
	{
		List<registrationModel> l = new ArrayList<registrationModel>(); 
		registrationModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("select * from registration where role = 1 and active=0");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new registrationModel( rs.getInt("u_id"),rs.getString("farm_name"), rs.getString("farm_address"),rs.getString("owner_name"),rs.getLong("farm_contact_no"));	
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
	public boolean update(int u_id, int role) {
		try {
			
			con = u.getConnection();

				if (con != null)
				{
					st = con.createStatement();
					
				
					int i = st.executeUpdate("update registration set role ='"+role+"' where u_id='"+u_id+"'");
					
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
	public List<registrationModel> displayPanding() {
		List<registrationModel> l1 = new ArrayList<registrationModel>(); 
		registrationModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("select * from registration where role = 2 and active=0");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new registrationModel( rs.getInt("u_id"),rs.getString("farm_name"), rs.getString("farm_address"),rs.getString("owner_name"),rs.getLong("farm_contact_no"));	
				l1.add(nj);
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
	 
	return l1;	}
	@Override
	public List<registrationModel> displayDeactive() {
		List<registrationModel> l1 = new ArrayList<registrationModel>(); 
		registrationModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("select * from registration where role = 3 and active=0");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new registrationModel( rs.getInt("u_id"),rs.getString("farm_name"), rs.getString("farm_address"),rs.getString("owner_name"),rs.getLong("farm_contact_no"));	
				l1.add(nj);
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
	 
	return l1;	

	}
	@Override
	public boolean delete(int u_id) {
		
try {
			
			con = u.getConnection();

				if (con != null)
				{
					st = con.createStatement();
					
				
					int i = st.executeUpdate("delete from registration where u_id='"+u_id+"'");
					
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
	public boolean tempdel(int u_id,int active) {
			try {
				
			con = u.getConnection();

				if (con != null)
				{
					st = con.createStatement();
					
				
					int i = st.executeUpdate("update registration set active ='"+active+"' where u_id='"+u_id+"'");
					
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
	public List<registrationModel> trashFarm() {
		List<registrationModel> l1 = new ArrayList<registrationModel>(); 
		registrationModel tF = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("select * from registration where active=1");
			if (rs != null) 
			{
				while (rs.next()) {
				tF = new registrationModel(rs.getInt("u_id"),rs.getString("farm_name"), rs.getString("farm_address"),rs.getString("owner_name"),rs.getLong("farm_contact_no"),rs.getInt("role"));	
				l1.add(tF);
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
	 
	return l1;
	}
	@Override
	public boolean restore(int u_id, int active) {
		try {
			
			con = u.getConnection();

				if (con != null)
				{
					st = con.createStatement();
					
				
					int i = st.executeUpdate("update registration set active ='"+active+"' where u_id='"+u_id+"'");
					
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
	public List<registrationModel> view(int u_id) {
		List<registrationModel> l1 = new ArrayList<registrationModel>(); 
		registrationModel view = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("select * from registration where u_id = '"+u_id+"'and  active=0");
			if (rs != null) 
			{
				while (rs.next()) {
				view = new registrationModel(rs.getInt("u_id"),rs.getString("farm_name"), rs.getString("farm_address"),rs.getString("district"),rs.getString("state"),rs.getString("owner_name"),rs.getString("farm_email"),rs.getLong("farm_contact_no"),rs.getLong("owner_contact_no"),rs.getString("farm_reg_no"),rs.getInt("role"));
				l1.add(view);
				
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
	 
	return l1;
	}
	@Override
	public boolean updateProfile(registrationModel up) {
		try {
			
			con = u.getConnection();

				if (con != null)
				{
					st = con.createStatement();
					
				
					int i = st.executeUpdate("update registration set farm_name='"+up.getFarm_name()+"',farm_address ='"+up.getFarm_address()+"',district='"+up.getDistrit()+"',state='"+up.getState()+"',owner_name='"+up.getOwner_name()+"',farm_email='"+up.getFarm_email()+"',farm_contact_no='"+up.getFarm_contact_no()+"',owner_contact_no='"+up.getOwner_contact_no()+"',farm_reg_no='"+up.getFarm_reg_no()+"'  where u_id='"+up.getU_id()+"'");
					
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
	public registrationModel cp(registrationModel m) {
		registrationModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			
			st = con.createStatement();
			rs = st.executeQuery("select password  from registration where u_id = '"+m.getU_id()+"'");
			
			if (rs != null) 
			{
				
				if (rs.next()) {
					
					nj = new registrationModel(rs.getString("password"));	
					
					}
				
			} 
			else 
			{
				System.out.println("Result set null 6e..");
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
	 
	return nj;


	}
	@Override
	public boolean updatePassword(registrationModel m) {
try {
			
			con = u.getConnection();

				if (con != null)
				{
					st = con.createStatement();
					
				
					int i = st.executeUpdate("update registration set password='"+m.getPassword()+"' where u_id='"+m.getU_id()+"'");
					
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
	
	public List<registrationModel> existFarm() {
		List<registrationModel> l1 = new ArrayList<registrationModel>(); 
		registrationModel view = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT u_id,COUNT(u_id) as cc  FROM registration WHERE role='1' and active = '0'");
			if (rs != null) 
			{
				while (rs.next()) {
				view = new registrationModel(rs.getInt("cc"),rs.getInt("u_id"));
				l1.add(view);
				
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
	 
	return l1;
	}
	@Override
	public List<registrationModel> paddingFarm() {
		List<registrationModel> l1 = new ArrayList<registrationModel>(); 
		registrationModel view = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT u_id,COUNT(u_id) as cc  FROM registration WHERE role='2' and active = '0'");
			if (rs != null) 
			{
				while (rs.next()) {
				view = new registrationModel(rs.getInt("cc"),rs.getInt("u_id"));
				l1.add(view);
				
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
	 
	return l1;
	}

	
	
	public List<registrationModel> deaciveFarm() {
		List<registrationModel> l1 = new ArrayList<registrationModel>(); 
		registrationModel view = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT u_id,COUNT(u_id) as cc  FROM registration WHERE role='3' and active = '0'");
			if (rs != null) 
			{
				while (rs.next()) {
				view = new registrationModel(rs.getInt("cc"),rs.getInt("u_id"));
				l1.add(view);
				
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
	 
	return l1;

	}
	@Override
	public List<registrationModel> trashFarmlist() {
		List<registrationModel> l1 = new ArrayList<registrationModel>(); 
		registrationModel view = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("SELECT u_id,COUNT(u_id) as cc  FROM registration WHERE  active = '1'");
			if (rs != null) 
			{
				while (rs.next()) {
				view = new registrationModel(rs.getInt("cc"),rs.getInt("u_id"));
				l1.add(view);
				
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
	 
	return l1;

	}

}
