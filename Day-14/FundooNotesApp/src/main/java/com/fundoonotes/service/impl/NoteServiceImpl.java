package com.fundoonotes.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fundoonotes.dto.response.NoteResponseDTO;
import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.User;
import com.fundoonotes.mapper.NoteMapper;
import com.fundoonotes.repository.NoteRepository;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;
    private final UserRepository userRepository;
    private final NoteMapper noteMapper;

    public NoteServiceImpl(NoteRepository noteRepository, UserRepository userRepository, NoteMapper noteMapper) {

        this.noteRepository = noteRepository;
        this.userRepository = userRepository;
        this.noteMapper = noteMapper;
    }

    
    
    @Override
    public NoteResponseDTO createNote(int userId, String title, String content) {

        User owner = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        Note note = new Note();

        note.setTitle(title);
        note.setContent(content);
        note.setOwner(owner);

        Note savedNote = noteRepository.save(note);

        return noteMapper.toResponseDTO(savedNote);
    }

    
    
    @Override
    public List<NoteResponseDTO> findByOwner(int userId) {

        User owner = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        return noteRepository.findByOwner(owner)
                .stream()
                .map(noteMapper::toResponseDTO)
                .toList();
    }

    
    
    @Override
    public boolean deleteNote(int noteId, int requestingUserId) {

        User owner = userRepository.findById(requestingUserId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        return noteRepository
                .findByNoteIdAndOwner(noteId, owner)
                .map(note -> {
                    noteRepository.delete(note);
                    return true;
                })
                .orElse(false);
    }
}