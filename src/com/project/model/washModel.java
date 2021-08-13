package com.project.model;

import java.sql.Date;

public class washModel {
	private int w_id;
	private int a_id;
	private int u_id;
	private Date washDate;

	public washModel() {
		super();
		
	}
	
	public int getW_id() {
		return w_id;
	}
	public int getA_id() {
		return a_id;
	}
	public int getU_id() {
		return u_id;
	}
	public Date getWashDate() {
		return washDate;
	}
}
