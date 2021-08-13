package com.project.model;

import java.sql.Date;

public class heatphaseModel {
	private int h_id;
	private int a_id;
	private int u_id;
	private Date stratDay;
	private Date endDay;
	private String sexualActivity;
	private int preg;
	private int active;
	private String 	animalType;
	private String animalBread;
	private String animalName;
	private String animalTagid;
	private int age;
	public heatphaseModel() {
		super();
		
	}
	public heatphaseModel(int a_id, int id, Date date, int active) 
	{
		this.a_id = a_id;
		this.u_id = id;
		this.stratDay = date;
		this.active = active; 
		
	}
	public heatphaseModel(int a_id, int id, Date date, String sexualActivity, int preg, int active)
	{
		this.a_id = a_id;
		this.u_id = id;
		this.endDay = date;
		this.sexualActivity = sexualActivity;
		this.preg = preg;
		this.active = active;
		
	}
		
	public heatphaseModel(int h_id, int a_id, Date startDay, Date endDay, String sexualActivity, int preg, String animalType,
			String animalBread, String animalName, String animalTagid) {
		this.a_id = a_id;
		this.h_id = h_id;
		this.stratDay = startDay;
		this.endDay = endDay;
		this.sexualActivity = sexualActivity;
		this.preg = preg;
		this.animalType = animalType;
		this.animalBread = animalBread;
		this.animalTagid = animalTagid;
		this.animalName = animalName;
		
		
	}
	public heatphaseModel(int age) {
		this.age = age;
	}
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
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
	public Date getStratDay() {
		return stratDay;
	}
	public void setStratDay(Date stratDay) {
		this.stratDay = stratDay;
	}
	public Date getEndDay() {
		return endDay;
	}
	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}
	public String getSexualActivity() {
		return sexualActivity;
	}
	public void setSexualActivity(String sexualActivity) {
		this.sexualActivity = sexualActivity;
	}
	public int getPreg() {
		return preg;
	}
	public void setPreg(int preg) {
		this.preg = preg;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public String getAnimalBread() {
		return animalBread;
	}
	public void setAnimalBread(String animalBread) {
		this.animalBread = animalBread;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getAnimalTagid() {
		return animalTagid;
	}
	public void setAnimalTagid(String animalTagid) {
		this.animalTagid = animalTagid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
