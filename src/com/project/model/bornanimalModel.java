package com.project.model;

import java.sql.Date;

public class bornanimalModel {
	
	private int b_id;
	private int a_id;
	private int u_id;
	private int perentId;
	private Date bornDate;
	private int avg_milk;
	private int bornidelMilk;
	private int active;
	
	public bornanimalModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public bornanimalModel(int a_id, int u_id, int perentId, Date bornDate, int avg_milk, int bornidelMilk) {
		this.a_id = a_id;
		this.u_id = u_id;
		this.perentId = perentId;
		this.bornDate = bornDate;
		this.avg_milk = avg_milk;
		this.bornidelMilk =  bornidelMilk;
	}

	public bornanimalModel(int avg_milk) {
		
		this.avg_milk = avg_milk;
	}

	public int getB_id() {
		return b_id;
	}

	public int getA_id() {
		return a_id;
	}

	public int getU_id() {
		return u_id;
	}

	public int getPerentId() {
		return perentId;
	}

	public Date getBornDOB() {
		return bornDate;
	}

	public int getBornavrageMilk() {
		return avg_milk;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public int getAvg_milk() {
		return avg_milk;
	}

	public void setAvg_milk(int avg_milk) {
		this.avg_milk = avg_milk;
	}

	public int getBornidelMilk() {
		return bornidelMilk;
	}

	public void setBornidelMilk(int bornidelMilk) {
		this.bornidelMilk = bornidelMilk;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public void setPerentId(int perentId) {
		this.perentId = perentId;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getIdealMilk() {
		return bornidelMilk;
	}

	public int getActive() {
		return active;
	}
	
	
	

}
