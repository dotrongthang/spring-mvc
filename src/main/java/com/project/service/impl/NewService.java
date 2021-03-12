package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.INewDAO;
import com.project.model.NewModel;
import com.project.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private INewDAO newDao;

	
	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}

	

}
