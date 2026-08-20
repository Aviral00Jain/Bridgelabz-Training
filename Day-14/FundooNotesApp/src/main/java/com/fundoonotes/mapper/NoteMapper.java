package com.fundoonotes.mapper;

import org.springframework.stereotype.Component;

import com.fundoonotes.dto.response.NoteResponseDTO;
import com.fundoonotes.entity.Note;

@Component
public class NoteMapper {

    public NoteResponseDTO toResponseDTO(Note note) {

        return new NoteResponseDTO(
                note.getNoteId(),
                note.getTitle(),
                note.getContent(),
                note.getCreatedAt()
        );
    }
}