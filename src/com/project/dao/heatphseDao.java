package com.project.dao;

import java.util.List;

import com.project.model.animalModel;
import com.project.model.heatphaseModel;

public interface heatphseDao {
	List<animalModel> animalList(int id,String animalType);
	Boolean insert(heatphaseModel am);
	Boolean close(heatphaseModel am);
	List<animalModel> heatPhaselist(int id,String animalType);
	List<animalModel> pregnanceyList(int id,String animalType);
	List<heatphaseModel> viewPregnancey(int id);
	List<heatphaseModel> getMonth(int id);
}
