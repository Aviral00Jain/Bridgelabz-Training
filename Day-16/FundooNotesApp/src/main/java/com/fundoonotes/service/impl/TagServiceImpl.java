package com.fundoonotes.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fundoonotes.dto.request.TagRequestDTO;
import com.fundoonotes.dto.response.TagResponseDTO;
import com.fundoonotes.entity.Tag;
import com.fundoonotes.mapper.TagMapper;
import com.fundoonotes.repository.TagRepository;
import com.fundoonotes.service.TagService;

@Service
public class TagServiceImpl implements TagService {

	private final TagRepository tagRepository;
	private final TagMapper tagMapper;

	public TagServiceImpl(TagRepository tagRepository, TagMapper tagMapper) {

		this.tagRepository = tagRepository;
		this.tagMapper = tagMapper;
	}

	
	
	
	@Override
	public TagResponseDTO createTag(TagRequestDTO request) {

		if (tagRepository.findByName(request.getName()).isPresent()) {
			throw new IllegalArgumentException("Tag already exists");
		}

		Tag tag = tagMapper.toEntity(request);

		Tag savedTag = tagRepository.save(tag);

		return tagMapper.toResponseDTO(savedTag);
	}

	
	
	
	@Override
	public List<TagResponseDTO> getAllTags() {

		return tagRepository.findAll().stream().map(tagMapper::toResponseDTO).toList();
	}

	
	
	
	@Override
	public void deleteTag(int tagId) {

		Tag tag = tagRepository.findById(tagId).orElseThrow(() -> new IllegalArgumentException("Tag not found"));

		tagRepository.delete(tag);
	}
}