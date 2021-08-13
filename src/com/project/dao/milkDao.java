package com.project.dao;

import java.sql.Date;
import java.util.List;

import com.project.model.animalModel;
import com.project.model.bornanimalModel;
import com.project.model.milkAnimal;
import com.project.model.purAnimalModel;


public interface milkDao {
	
	Boolean insert(milkAnimal sm);
	List<milkAnimal> singleDay(int a_id,Date date,int u_id);
	List<milkAnimal> dayWise(int a_id,Date date1,Date date2,int u_id);
	List<animalModel> animalList(int a_id,int u_id);
	List<bornanimalModel> checkBorn(int a_id);
	List<purAnimalModel> checkPur(int a_id);

}
