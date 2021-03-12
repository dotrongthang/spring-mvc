package com.project.dao;

import java.util.List;

import com.project.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {

	List<NewModel> findAll();

}
