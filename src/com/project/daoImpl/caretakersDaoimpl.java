package com.project.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.project.dao.caretakersDao;
import com.project.model.caretakersModel;
import com.project.util.util;
import com.project.utilImpl.utilImpl;

public  class  caretakersDaoimpl implements caretakersDao{

	
	private boolean b = false;
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	util u = new utilImpl();
	
	public boolean insert(caretakersModel cm) {
try {
			
			con = u.getConnection();

				if (con != null)
				{
					st = con.createStatement();
					int i = st.executeUpdate(
							"insert into caretakers(u_id,caretakersName,caretakersContact,caretakers_address) values('"+cm.getU_id()+"','" + cm.getCaretakersName() + "','" +cm.getCaretakersContact() + "','"+cm.getCaretakers_address()+"')");
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
	public List<caretakersModel> exisiting(int id) {
		List<caretakersModel> l = new ArrayList<caretakersModel>(); 
		caretakersModel nj = null;
		try {
	
	con = u.getConnection();

		if (con != null)
		{
	
			int i =0;
			st = con.createStatement();
			rs = st.executeQuery("select * from caretakers where u_id = '"+id+"' and active='"+i+"' ");
			if (rs != null) 
			{
				while (rs.next()) {
				nj = new caretakersModel( rs.getInt("c_id"),rs.getString("caretakersName"),rs.getLong("caretakersContact"),rs.getString("caretakers_address"));	
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
