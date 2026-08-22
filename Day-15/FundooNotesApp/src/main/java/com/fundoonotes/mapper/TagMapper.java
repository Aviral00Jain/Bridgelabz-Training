package com.fundoonotes.mapper;

import org.springframework.stereotype.Component;

import com.fundoonotes.dto.request.TagRequestDTO;
import com.fundoonotes.dto.response.TagResponseDTO;
import com.fundoonotes.entity.Tag;

@Component
public class TagMapper {

	public Tag toEntity(TagRequestDTO request) {

		Tag tag = new Tag();

		tag.setName(request.getName());

		return tag;
	}

	public TagResponseDTO toResponseDTO(Tag tag) {

		return new TagResponseDTO(tag.getTagId(), tag.getName());
	}
}