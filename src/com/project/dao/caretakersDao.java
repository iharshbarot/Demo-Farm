package com.project.dao;

import java.util.List;

import com.project.model.caretakersModel;

public interface caretakersDao {
	boolean insert(caretakersModel cm);
	List<caretakersModel> exisiting(int id);
}
