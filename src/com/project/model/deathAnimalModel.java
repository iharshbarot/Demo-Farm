package com.project.model;

import java.sql.Date;

public class deathAnimalModel {

	private int d_id;
	private int a_id;
	private int u_id;
	private Date Death_date;
	private String death_Reason;
	private String dormanBy;
	private String dorman_Report;
	private int active;
	
	public deathAnimalModel() {
		super();
		
	}

	public deathAnimalModel(int u_id, int a_id, Date death_date, String death_Reason, String dormanBy)
	{
		this.u_id = u_id;
		this.a_id = a_id;
		this.Death_date = death_date;
		this.death_Reason = death_Reason;
		this.dormanBy = dormanBy;
	}

	public deathAnimalModel(int a_id, Date death_date, String death_Reason, String dormanBy) {
		this.a_id = a_id;
		this.Death_date = death_date;
		this.death_Reason = death_Reason;
		this.dormanBy = dormanBy;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public Date getDeath_date() {
		return Death_date;
	}

	public void setDeath_date(Date death_date) {
		Death_date = death_date;
	}

	public String getDeath_Reason() {
		return death_Reason;
	}

	public void setDeath_Reason(String death_Reason) {
		this.death_Reason = death_Reason;
	}

	public String getDormanBy() {
		return dormanBy;
	}

	public void setDormanBy(String dormanBy) {
		this.dormanBy = dormanBy;
	}

	public String getDorman_Report() {
		return dorman_Report;
	}

	public void setDorman_Report(String dorman_Report) {
		this.dorman_Report = dorman_Report;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	
}
