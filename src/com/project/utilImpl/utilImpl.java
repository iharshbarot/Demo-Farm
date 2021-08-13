package com.project.utilImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.project.util.util;

public class utilImpl implements util {

	private Connection con = null;

	@Override
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost/hachfarm","root", "");

		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		return con;
	}

	

}
