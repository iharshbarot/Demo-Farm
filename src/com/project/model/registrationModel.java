package com.project.model;

public class registrationModel {

	private  int u_id;
	private String farm_name;
	private String farm_address;
	private String distrit;
	private String state;
	private String owner_name;
	private String farm_email;
	private long farm_contact_no;
	private long owner_contact_no;
	private String username;
	private String password;
	private String farm_reg_no;
	private int active;
	private int role;
	private int cc;
	public registrationModel(String username, String password) {
		this.username = username;
		this.password = password;
		
	}
	public registrationModel(int u_id, String username, String farm_name, int role) {
		this.u_id = u_id;
		this.username = username;
		this.farm_name = farm_name;
		this.role = role;
	}
	public registrationModel(String farm_name, String farm_address, String district, String state,
			String owner_name, String farm_email, long farm_contact_no, long owner_contact_no, String username,
			String password, String farm_reg_no) {
		this.farm_name = farm_name;
		this.farm_address = farm_address;
		this.distrit = district;
		this.state = state;
		this.owner_name = owner_name;
		this.farm_email = farm_email;
		this.farm_contact_no = farm_contact_no;
		this.owner_contact_no = owner_contact_no;
		this.username = username;
		this.password = password;
		this.farm_reg_no = farm_reg_no;
		
		
	}
	public registrationModel(int u_id,String farm_name, String farm_address, String owner_name, Long farm_contact_no) {
		this.u_id = u_id;
		this.farm_name = farm_name;
		this.farm_address = farm_address;
		this.owner_name = owner_name;
		this.farm_contact_no = farm_contact_no;
	}
	public registrationModel(int u_id,String farm_name, String farm_address, String owner_name, Long farm_contact_no,int role) {
		this.u_id = u_id;
		this.farm_name = farm_name;
		this.farm_address = farm_address;
		this.owner_name = owner_name;
		this.farm_contact_no = farm_contact_no;
		this.role = role;
	}
	
	public registrationModel(int u_id, String farm_name, String farm_address, String district, String state, String owner_name,
			String farm_email, long farm_contact_no,long owner_contact_no, String farm_reg_no,int role) {
		this.u_id = u_id;
		this.farm_name = farm_name;
		this.farm_address = farm_address;
		this.distrit = district;
		this.state = state;
		this.owner_name = owner_name;
		this.farm_contact_no = farm_contact_no;
		this.owner_contact_no = owner_contact_no;
		this.farm_email = farm_email;
		this.farm_reg_no = farm_reg_no;
		this.role = role;
	}
	
	public registrationModel(int u_id,String farm_name, String farm_address, String district, String state,
			String owner_name,String farm_email, long farm_contact_no, long owner_contact_no,
			String farm_reg_no) {
		this.u_id = u_id;
		this.farm_name = farm_name;
		this.farm_address = farm_address;
		this.distrit = district;
		this.state = state;
		this.owner_name = owner_name;
		this.farm_contact_no = farm_contact_no;
		this.owner_contact_no = owner_contact_no;
		this.farm_email = farm_email;
		this.farm_reg_no = farm_reg_no;
	}
	public registrationModel(int u_id) {
		this.u_id=u_id;
	}
	public registrationModel(int cc, int u_id) {
		this.cc=cc;
		this.u_id=u_id;
	}
	public registrationModel(String password) {
		this.password = password;
	}
	public registrationModel(int u_id, String password) {
	
		this.u_id = u_id;
		this.password = password;
	}
	public int getU_id() {
		return u_id;
	}
	public String getFarm_name() {
		return farm_name;
	}
	public String getFarm_address() {
		return farm_address;
	}
	public String getDistrit() {
		return distrit;
	}
	public String getState() {
		return state;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public String getFarm_email() {
		return farm_email;
	}
	public long getFarm_contact_no() {
		return farm_contact_no;
	}
	public long getOwner_contact_no() {
		return owner_contact_no;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getFarm_reg_no() {
		return farm_reg_no;
	}
	public int getActive() {
		return active;
	}
	public int getRole() {
		return role;
	}
	public int getCc() {
		return cc;
	}
	
}
