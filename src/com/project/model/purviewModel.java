package com.project.model;

import java.sql.Date;

public class purviewModel {

	private int a_id;
	private int u_id;
	private String 	animalType;
	private String animalBread;
	private String animalName;
	private String animalTagid;
	private int animalEntry;	
	private int p_id; 
	private String owner_name;
	private long owner_contact_number;
	private String owner_add;
	private Date dob;
	private Date pur_dob;
	private int avgMilk;
	private int idealMilk;
	private int beforePregnancy;
	private String medical_issues;
	private String Medical_certificate;
	private String pur_doc;
	private int active;
	
	public purviewModel() {
		super();
		
	}
	
	public purviewModel(int a_id, int u_id, String animalType, String animalBread, String animalName, String animalTagid, int animalEntry,
			int p_id, String owner_name, long owner_contact_number, String owner_add, Date dob, Date pur_dob, int avgMilk,
			int idealMilk, int beforePregnancy, String medical_issues) 
	{
		this.a_id = a_id;
		this.u_id = u_id;
		this.animalType = animalType;
		this.animalBread = animalBread;
		this.animalName = animalName;
		this.animalTagid = animalTagid;
		this.animalEntry = animalEntry;
		this.p_id = p_id;
		this.owner_name = owner_name;
		this.owner_contact_number = owner_contact_number;
		this.owner_add = owner_add;
		this.dob = dob;
		this.pur_dob = pur_dob;
		this.avgMilk = avgMilk;
		this.idealMilk = idealMilk;
		this.beforePregnancy = beforePregnancy;
		this.medical_issues = medical_issues;
		
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

	public int getP_id() {
		return p_id;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public long getOwner_contact_number() {
		return owner_contact_number;
	}

	public String getOwner_add() {
		return owner_add;
	}

	public Date getDob() {
		return dob;
	}

	public Date getPur_dob() {
		return pur_dob;
	}

	public int getAvgMilk() {
		return avgMilk;
	}

	public int getIdealMilk() {
		return idealMilk;
	}

	public int getBeforePregnancy() {
		return beforePregnancy;
	}

	public String getMedical_issues() {
		return medical_issues;
	}

	public String getMedical_certificate() {
		return Medical_certificate;
	}

	public String getPur_doc() {
		return pur_doc;
	}

	public int getActive() {
		return active;
	}
	

}
