package com.fundoonotes.service.impl;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.fundoonotes.dto.request.NoteRequestDTO;
import com.fundoonotes.dto.response.NoteResponseDTO;
import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.Tag;
import com.fundoonotes.entity.User;
import com.fundoonotes.mapper.NoteMapper;
import com.fundoonotes.repository.NoteRepository;
import com.fundoonotes.repository.TagRepository;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.service.NoteService;
import com.fundoonotes.specification.NoteSpecification;

@Service
public class NoteServiceImpl implements NoteService {

	private final NoteRepository noteRepository;
	private final UserRepository userRepository;
	private final NoteMapper noteMapper;
	private final TagRepository tagRepository;

	public NoteServiceImpl(NoteRepository noteRepository, UserRepository userRepository, NoteMapper noteMapper,
			TagRepository tagRepository) {

		this.noteRepository = noteRepository;
		this.userRepository = userRepository;
		this.noteMapper = noteMapper;
		this.tagRepository = tagRepository;
	}

	
	
	
	@Override
	public NoteResponseDTO createNote(int userId, NoteRequestDTO request) {

		User owner = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));

		Note note = new Note();

		note.setTitle(request.getTitle());
		note.setContent(request.getContent());
		note.setOwner(owner);

		Note savedNote = noteRepository.save(note);

		return noteMapper.toResponseDTO(savedNote);
	}

	
	
	
	@Override
	public boolean deleteNote(int noteId, int requestingUserId) {

		User owner = userRepository.findById(requestingUserId)
				.orElseThrow(() -> new IllegalArgumentException("User not found"));

		return noteRepository.findByNoteIdAndOwner(noteId, owner).map(note -> {
			noteRepository.delete(note);
			return true;
		}).orElse(false);
	}

	
	
	
	@Override
	public NoteResponseDTO archiveNote(int noteId, int userId) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		note.setState(Note.NoteState.ARCHIVED);
		note.setPinned(false);

		Note savedNote = noteRepository.save(note);

		return noteMapper.toResponseDTO(savedNote);
	}

	
	
	
	@Override
	public NoteResponseDTO trashNote(int noteId, int userId) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		note.setState(Note.NoteState.TRASHED);
		note.setPinned(false);

		Note savedNote = noteRepository.save(note);

		return noteMapper.toResponseDTO(savedNote);
	}

	
	
	
	@Override
	public NoteResponseDTO restoreNote(int noteId, int userId) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		note.setState(Note.NoteState.ACTIVE);

		Note savedNote = noteRepository.save(note);

		return noteMapper.toResponseDTO(savedNote);
	}

	
	
	
	@Override
	public NoteResponseDTO pinNote(int noteId, int userId) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		if (note.getState() == Note.NoteState.TRASHED) {
			throw new IllegalStateException("Cannot pin a note that is in Trash");
		}

		note.setPinned(true);

		Note savedNote = noteRepository.save(note);

		return noteMapper.toResponseDTO(savedNote);
	}

	
	
	
	@Override
	public List<NoteResponseDTO> searchNotes(int userId, String title, Note.NoteState state, Boolean pinned) {

		User owner = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));

		Specification<Note> specification = NoteSpecification.hasOwner(owner);

		if (title != null && !title.isBlank()) {
			specification = specification.and(NoteSpecification.hasTitle(title));
		}

		if (state != null) {
			specification = specification.and(NoteSpecification.hasState(state));
		}

		if (pinned != null) {
			specification = specification.and(NoteSpecification.isPinned(pinned));
		}

		return noteRepository.findAll(specification).stream().map(noteMapper::toResponseDTO).toList();
	}

	
	
	
	@Override
	public void addTag(int noteId, int userId, int tagId) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		Tag tag = tagRepository.findById(tagId).orElseThrow(() -> new IllegalArgumentException("Tag not found"));

		note.getTags().add(tag);

		noteRepository.save(note);
	}

	
	
	
	@Override
	public void removeTag(int noteId, int userId, int tagId) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		Tag tag = tagRepository.findById(tagId).orElseThrow(() -> new IllegalArgumentException("Tag not found"));

		note.getTags().remove(tag);

		noteRepository.save(note);
	}

	
	
	
	private Note getOwnedNoteOrThrow(int noteId, int userId) {

		User owner = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));

		return noteRepository.findByNoteIdAndOwner(noteId, owner)
				.orElseThrow(() -> new IllegalArgumentException("Note not found"));
	}
}