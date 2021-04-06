package com.project.converter;

import org.springframework.stereotype.Component;

import com.project.dto.NewDTO;
import com.project.entity.NewEntity;

@Component
public class NewConverter {

	public NewDTO toDto(NewEntity entity) {
		NewDTO result = new NewDTO();
		result.setId(entity.getId());
		result.setTitle(entity.getTitle());
		result.setShortDescription(entity.getShortDescription());
		result.setThumbnail(entity.getThumbnail());
		result.setContent(entity.getContent());
		result.setCategoryCode(entity.getCategory().getCode());
		return result;
	}
	
	public NewEntity toEntity(NewDTO dto) {
		NewEntity result = new NewEntity();
		result.setTitle(dto.getTitle());
		result.setShortDescription(dto.getShortDescription());
		result.setThumbnail(dto.getThumbnail());
		result.setContent(dto.getContent());
		return result;
	}
	
	public NewEntity toEntity(NewEntity result, NewDTO dto) {
		result.setTitle(dto.getTitle());
		result.setShortDescription(dto.getShortDescription());
		result.setThumbnail(dto.getThumbnail());
		result.setContent(dto.getContent());
		return result;
	}
}
