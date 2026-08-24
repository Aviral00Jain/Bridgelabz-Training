package com.fundoonotes.service;

import java.util.List;

import com.fundoonotes.dto.request.NoteRequestDTO;
import com.fundoonotes.dto.response.NoteResponseDTO;
import com.fundoonotes.entity.Note;

public interface NoteService {

	NoteResponseDTO createNote(int userId, NoteRequestDTO request);

	boolean deleteNote(int noteId, int requestingUserId);

	NoteResponseDTO archiveNote(int noteId, int userId);

	NoteResponseDTO trashNote(int noteId, int userId);

	NoteResponseDTO restoreNote(int noteId, int userId);

	NoteResponseDTO pinNote(int noteId, int userId);

	List<NoteResponseDTO> searchNotes(int userId, String title, Note.NoteState state, Boolean pinned);

	void addTag(int noteId, int userId, int tagId);

	void removeTag(int noteId, int userId, int tagId);
}