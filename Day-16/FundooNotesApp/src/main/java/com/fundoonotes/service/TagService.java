package com.fundoonotes.service;

import java.util.List;

import com.fundoonotes.dto.request.TagRequestDTO;
import com.fundoonotes.dto.response.TagResponseDTO;


public interface TagService {

	TagResponseDTO createTag(TagRequestDTO request);

	List<TagResponseDTO> getAllTags();

	void deleteTag(int tagId);
}