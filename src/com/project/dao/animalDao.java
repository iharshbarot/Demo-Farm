package com.project.dao;

import java.util.List;

import com.project.model.animalModel;
import com.project.model.bornanimalModel;
import com.project.model.bornviewModel;
import com.project.model.purAnimalModel;
import com.project.model.purviewModel;
import com.project.model.vaccination;

public interface animalDao {
	
	Boolean insert(animalModel am);
	Boolean insertvac(vaccination am);
	List<animalModel> newPurches(int id,String tagID);
	List<animalModel> perent(int id,String animalType);
	Boolean purAnimal(purAnimalModel am);
	Boolean bornAnimal(bornanimalModel bm);
	List<animalModel> animalList(int id,String animalType);
	List<animalModel> animalAge(int id,String animalType);
	List<animalModel> bornAge(int id,String animalType);
	List<animalModel> bornData(int id);
	List<animalModel> purData(int id);
	List<vaccination> vac(String animalType);
	List<animalModel> sellList(int id,String animalType);
	List<animalModel> dethList(int id,String animalType);
	List<bornviewModel> vewBorn(int id);
	List<purviewModel> vewPur(int id);
	List<vaccination> viewVac(int id);
	List<animalModel> viewexistingCow(int id);
	List<animalModel> existingHeatphase(int id);
	List<animalModel> prag(int id);
	List<animalModel> sell(int id);
	List<animalModel> dead(int id);

	
}
