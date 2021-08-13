package com.project.model;

import java.sql.Date;

public class milkanimalDetail {
	
	private int m_id;
	private int a_id;
	private int u_id;
	private int Milk;
	private Date date;
	private int shift;
	private int activitiy;
	private int active;
	

	private String 	animalType;
	private String animalBread;
	private String animalName;
	private String animalTagid;
	private int animalEntry;
	public milkanimalDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public milkanimalDetail(String animalType, String animalBread, String animalTagid, int Milk, Date date, int shift, int activitiy) {
		this.animalType = animalType;
		this.animalBread = animalBread;
		this.animalTagid = animalTagid;
		this.Milk = Milk;
		this.date = date;
		this.shift = shift;
		this.activitiy = activitiy;
	}
	

}
