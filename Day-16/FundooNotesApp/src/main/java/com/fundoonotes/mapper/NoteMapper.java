package com.fundoonotes.mapper;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.fundoonotes.dto.response.NoteResponseDTO;
import com.fundoonotes.dto.response.TagResponseDTO;
import com.fundoonotes.entity.Note;

@Component
public class NoteMapper {

    public NoteResponseDTO toResponseDTO(Note note) {

        return new NoteResponseDTO(
                note.getNoteId(),
                note.getTitle(),
                note.getContent(),
                note.getCreatedAt(),
                note.getState(),
                note.isPinned(),
                note.getTags()
                        .stream()
                        .map(tag -> new TagResponseDTO(tag.getTagId(),tag.getName()))
                        .collect(Collectors.toSet())
        );
    }
}