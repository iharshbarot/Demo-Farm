package com.project.dao;

import java.util.List;

import com.project.model.animalModel;
import com.project.model.deathAnimalModel;
import com.project.model.sellModel;

public interface sellDao {
	
	Boolean insert(sellModel sm);
	Boolean updateRecord(int active,int a_id);
	Boolean insertDeth(deathAnimalModel dm);
	List<sellModel> viewSell(int id);
	List<animalModel> viewAnimal(int id);
	List<deathAnimalModel> viewDead(int id);
}
