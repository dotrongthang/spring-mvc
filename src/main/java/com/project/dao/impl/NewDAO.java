package com.project.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

//import org.apache.commons.lang.StringUtils;

import com.project.dao.INewDAO;
import com.project.mapper.NewMapper;
import com.project.model.NewModel;


@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	


	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		
		return query(sql.toString(), new NewMapper());
	}


}
