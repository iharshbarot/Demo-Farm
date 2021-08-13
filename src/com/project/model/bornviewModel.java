package com.project.model;

import java.sql.Date;

public class bornviewModel {
	private int a_id;
	private int u_id;
	private String 	animalType;
	private String animalBread;
	private String animalName;
	private String animalTagid;
	private int animalEntry;
	private int b_id;
	private int perentId;
	private Date bornDate;
	private int avg_milk;
	private int bornidelMilk;
	private int active;
	
	public bornviewModel() {
		super();
		
	}

	public bornviewModel(int a_id,String animalType, String animalBread, String animalName, String animalTagid, int animalEntry, int b_id, int perentId,Date bornDate,
			 int avg_milk, int bornidelMilk) {
		this.a_id =a_id;
		this.animalType = animalType;
		this.animalBread =animalBread;
		this.animalName = animalName;
		this.animalTagid = animalTagid;
		this.animalEntry = animalEntry;
		this.b_id = b_id;
		this.perentId = perentId;
		this.bornDate = bornDate;
		this.avg_milk = avg_milk;
		this.bornidelMilk = bornidelMilk;
		
		
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

	public int getB_id() {
		return b_id;
	}

	public int getPerentId() {
		return perentId;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public int getAvg_milk() {
		return avg_milk;
	}

	public int getBornidelMilk() {
		return bornidelMilk;
	}

	public int getActive() {
		return active;
	}

}
