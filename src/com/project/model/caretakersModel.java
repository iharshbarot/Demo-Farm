package com.project.model;

public class caretakersModel {
	
	
	private int c_id;
	private int u_id;
	private String caretakersName;
	private long caretakersContact;
	private String caretakers_address;
	
	
	public caretakersModel() {
		super();
	}

	
	public caretakersModel(int u_id,String caretakersName, long caretakersContact, String caretakers_address) {
		this.u_id = u_id;
		this.caretakersName = caretakersName;
		this.caretakersContact = caretakersContact;
		this.caretakers_address = caretakers_address;
	}


	public caretakersModel(int c_id, String caretakersName, long caretakersContact) {
		this.c_id =c_id;
		this.caretakersName = caretakersName;
		this.caretakersContact = caretakersContact;
	}


	public int getC_id() {
		return c_id;
	}
	
	public int getU_id() {
		return u_id;
	}
	public String getCaretakersName() {
		return caretakersName;
	}
	public long getCaretakersContact() {
		return caretakersContact;
	}


	public String getCaretakers_address() {
		return caretakers_address;
	}
	
	
}
