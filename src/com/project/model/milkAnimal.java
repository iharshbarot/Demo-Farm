package com.project.model;

import java.sql.Date;

public class milkAnimal {

	private int m_id;
	private String a_id;
	private int u_id;
	private String Milk;
	private Date date;
	private int shift;
	private int activitiy;
	private int active;
	private int Milk1;
	
	
	public int getMilk1() {
		return Milk1;
	}

	public milkAnimal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public milkAnimal(String a_id, int u_id, String milk, Date date,int shift) {
		this.a_id = a_id;
		this.u_id = u_id;
		this.Milk = milk;
		this.shift = shift;
		this.date = date;
	}

	public milkAnimal(String Milk1, Date date, int shift, int activitiy) {
		this.Milk = Milk1;
		this.date = date ;
		this.shift = shift;
		this.activitiy = activitiy;
	}

	public int getM_id() {
		return m_id;
	}

	public String getA_id() {
		return a_id;
	}

	public int getU_id() {
		return u_id;
	}

	public String getMilk() {
		return Milk;
	}

	public Date getDate() {
		return date;
	}

	public int getShift() {
		return shift;
	}

	public int getActivitiy() {
		return activitiy;
	}

	public int getActive() {
		return active;
	}
	
	
}
