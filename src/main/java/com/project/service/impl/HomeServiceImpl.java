package com.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.service.HomeService;


@Service
public class HomeServiceImpl implements HomeService{

	@Override
	public List<String> loadMenu() {
		List<String> menus = new ArrayList<>();
		menus.add("Blog Java");
		menus.add("Hướng dẫn Java");
		return menus;
	}



}
