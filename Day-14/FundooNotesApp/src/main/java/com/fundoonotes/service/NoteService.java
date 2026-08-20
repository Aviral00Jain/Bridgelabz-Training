package com.fundoonotes.service;

import java.util.List;

import com.fundoonotes.dto.response.*;

public interface NoteService {

    NoteResponseDTO createNote(int userId, String title, String content);

    List<NoteResponseDTO> findByOwner(int userId);

    boolean deleteNote(int noteId,int requestingUserId);
}