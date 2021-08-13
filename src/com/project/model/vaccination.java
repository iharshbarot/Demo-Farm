package com.project.model;

public class vaccination {
private int v_id;
private int a_id;
private int u_id;
private int age;
private String vaccination;
private String animaltype;
private String va_id;
public vaccination() {
	super();
	// TODO Auto-generated constructor stub
}


public vaccination(int v_id, int age, String vaccination, String animaltype) {
	this.v_id = v_id;
	this.age = age;
	this.vaccination = vaccination;
	this.animaltype = animaltype;
}


public vaccination(int a_id, int u_id, String va_id) {
	this.a_id = a_id;
	this.u_id = u_id;
	this.va_id = va_id;
}



public String getVa_id() {
	return va_id;
}


public void setVa_id(String va_id) {
	this.va_id = va_id;
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


public int getV_id() {
	return v_id;
}
public void setV_id(int v_id) {
	this.v_id = v_id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getVaccination() {
	return vaccination;
}
public void setVaccination(String vaccination) {
	this.vaccination = vaccination;
}
public String getAnimaltype() {
	return animaltype;
}
public void setAnimaltype(String animaltype) {
	this.animaltype = animaltype;
}



}
