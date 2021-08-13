package com.project.model;

import java.sql.Date;

public class sellModel {
	private int s_id;
	private int u_id;
	private int a_id;
	private String sell_owner_name;
	private long sell_owner_contact_number;
	private String sell_owner_address;
	private int sell_avg_milk;
	private double sellingPrice;
	private Date sellDate;
	private String sellMedicalIssues;
	private String sell_idProof;
    private int active;
	
	public sellModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public sellModel(int a_id, int u_id, String sell_owner_name, long sell_owner_contact_number,
			String sell_owner_address, int sell_avg_milk, double sellingPrice, Date sellDate,
			String sellMedicalIssues) 
	{
		
		this.a_id = a_id;
		this.u_id = u_id;
		this.sell_owner_name = sell_owner_name;
		this.sell_owner_contact_number = sell_owner_contact_number;
		this.sell_owner_address = sell_owner_address;
		this.sell_avg_milk = sell_avg_milk;
		this.sellingPrice = sellingPrice;
		this.sellDate = sellDate;
		this.sellMedicalIssues = sellMedicalIssues;
		
	}

	public sellModel(int a_id, String sell_owner_name, long sell_owner_contact_number, String sell_owner_address, int sell_avg_milk, double sellingPrice, Date sellDate,
			String sellMedicalIssues) {
		this.a_id = a_id;
		this.sell_owner_name = sell_owner_name;
		this.sell_owner_contact_number = sell_owner_contact_number;
		this.sell_owner_address = sell_owner_address;
		this.sell_avg_milk = sell_avg_milk;
		this.sellingPrice = sellingPrice;
		this.sellDate = sellDate;
		this.sellMedicalIssues = sellMedicalIssues;
	}

	public int getS_id() {
		return s_id;
	}

	public int getU_id() {
		return u_id;
	}

	public int getA_id() {
		return a_id;
	}

	public String getSell_owner_name() {
		return sell_owner_name;
	}

	public long getSell_owner_contact_number() {
		return sell_owner_contact_number;
	}

	public String getSell_owner_address() {
		return sell_owner_address;
	}

	public int getSell_avg_milk() {
		return sell_avg_milk;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public Date getSellDate() {
		return sellDate;
	}

	public String getSellMedicalIssues() {
		return sellMedicalIssues;
	}

	public String getSell_idProof() {
		return sell_idProof;
	}

	public int getActive() {
		return active;
	}
	
	
}
