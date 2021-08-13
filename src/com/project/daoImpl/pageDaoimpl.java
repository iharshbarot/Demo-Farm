package com.project.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.dao.pageDao;
import com.project.model.animalModel;
import com.project.util.util;
import com.project.utilImpl.utilImpl;

public class pageDaoimpl implements pageDao{

	private boolean b = false;
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	util u = new utilImpl();

	public List<animalModel> farmRegister(int id) {

		List<animalModel> l = new ArrayList<animalModel>(); 
		animalModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
			st = con.createStatement();
			rs = st.executeQuery("select animalTagid from animal where u_id = '"+id+"' and active=0");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new animalModel(rs.getString("animalTagid"));	
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