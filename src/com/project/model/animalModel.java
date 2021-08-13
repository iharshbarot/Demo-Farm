package com.project.model;
import java.sql.Date;
public class animalModel
{

	private int a_id;
	private int u_id;
	private String 	animalType;
	private String animalBread;
	private String animalName;
	private String animalTagid;
	private int animalEntry;
	private int active;	
	private int age;	
	private Date dob;
	private int month;
	private int cow;
	private int buffalo;
	
	public animalModel() {
		super();
	
	}

	public animalModel(int u_id, String animalType, String animalBread, String animalName, String animalTagid,
			int i) {
		this.u_id = u_id;
		this.animalType = animalType;
		this.animalBread = animalBread;
		this.animalName = animalName;
		this.animalTagid = animalTagid;
		this.animalEntry = i;
		}

	public animalModel(int a_id, String animalType, String animalBread, String animalName, String animalTagid) {
		this.a_id =a_id;
		this.animalType = animalType;
		this.animalName = animalName;
		this.animalBread = animalBread;
		this.animalTagid = animalTagid;
	}

	public animalModel(String animalTagid) {
		this.animalTagid = animalTagid;
	}

	public animalModel(int a_id, String animalTagid) {
		this.a_id = a_id;
		this.animalTagid = animalTagid;
	}

	public animalModel(int a_id, String animalBread, String animalName, String animalTagid, int animalEntry) {
		this.a_id = a_id;
		this.animalName = animalName;
		this.animalBread = animalBread;
		this.animalTagid = animalTagid;
		this.animalEntry = animalEntry;
	}

	public animalModel(Date dob, int age) {
		this.dob = dob;
		this.age = age;
	}

	public animalModel(Date dob,String animalType,int a_id, String animalBread, String animalTagid, int age) {
		this.dob = dob;
		this.animalBread = animalBread;
		this.animalTagid = animalTagid;
		this.age = age;
		this.a_id = a_id;
		this.animalType = animalType;
	}

	public animalModel(Date dob,int a_id,String animalType, String animalBread, String animalTagid, int age, int Month) {
		this.dob = dob;
		this.animalBread = animalBread;
		this.animalTagid = animalTagid;
		this.age = age;
		this.month = Month;
		this.animalType = animalType;
		this.a_id = a_id;
	}

	public animalModel(int cow, int buffalo) {
		this.cow = cow;
		this.buffalo = buffalo;
	}

	public int getMonth() {
		return month;
	}


	public int getA_id() {
		return a_id;
	}

	public int getU_id() {
		return u_id;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getAnimalBread() {
		return animalBread;
	}

	public String getAnimalName() {
		return animalName;
	}

	public String getAnimalTagid() {
		return animalTagid;
	}

	public int getAnimalEntry() {
		return animalEntry;
	}

	public int getActive() {
		return active;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCow() {
		return cow;
	}

	public void setCow(int cow) {
		this.cow = cow;
	}

	public int getBuffalo() {
		return buffalo;
	}

	public void setBuffalo(int buffalo) {
		this.buffalo = buffalo;
	}	
}
