package com.project.dao;

import java.util.List;


import com.project.model.registrationModel;

public interface dao {

	registrationModel check(registrationModel m);
	registrationModel cp(registrationModel m);
	boolean insert(registrationModel mr);
	boolean update(int role,int u_id);
	boolean updateProfile(registrationModel m);
	boolean updatePassword(registrationModel m);
	boolean tempdel(int u_id,int active);
	boolean delete(int u_id);
	boolean restore(int u_id,int active);
	List<registrationModel> display();
	List<registrationModel> trashFarm();
	List<registrationModel> displayPanding();
	List<registrationModel> displayDeactive();
	List<registrationModel> view(int u_id);
	List<registrationModel> existFarm();
	List<registrationModel> paddingFarm();
	List<registrationModel> deaciveFarm();
	List<registrationModel> trashFarmlist();
	
}
