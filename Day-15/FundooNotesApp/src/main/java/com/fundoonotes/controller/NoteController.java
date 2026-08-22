package com.fundoonotes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fundoonotes.dto.request.NoteRequestDTO;
import com.fundoonotes.dto.response.NoteResponseDTO;
import com.fundoonotes.entity.Note;
import com.fundoonotes.security.CustomUserDetails;
import com.fundoonotes.service.NoteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notes")
public class NoteController {

	private final NoteService noteService;

	public NoteController(NoteService noteService) {
		this.noteService = noteService;
	}

	private int currentUserId() {

		CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder
				.getContext()
				.getAuthentication()
				.getPrincipal();

		return userDetails.getUserId();
	}

	
	
	
	@PostMapping
	public ResponseEntity<NoteResponseDTO> createNote(@Valid @RequestBody NoteRequestDTO request) {

		NoteResponseDTO savedNote = noteService.createNote(currentUserId(), request);

		return ResponseEntity.status(HttpStatus.CREATED).body(savedNote);
	}

	
	
	
	@GetMapping
	public List<NoteResponseDTO> getMyNotes(@RequestParam(required = false) String title,
											@RequestParam(required = false) Note.NoteState state,
											@RequestParam(required = false) Boolean pinned) {

		return noteService.searchNotes(currentUserId(), title, state, pinned);
	}

	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteNote(@PathVariable int id) {

		boolean deleted = noteService.deleteNote(id, currentUserId());

		return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
	}

	
	
	
	@PatchMapping("/{id}/archive")
	public ResponseEntity<NoteResponseDTO> archiveNote(@PathVariable int id) {

		return ResponseEntity.ok(noteService.archiveNote(id, currentUserId()));
	}

	
	
	
	@PatchMapping("/{id}/trash")
	public ResponseEntity<NoteResponseDTO> trashNote(@PathVariable int id) {

		return ResponseEntity.ok(noteService.trashNote(id, currentUserId()));
	}

	
	
	
	@PatchMapping("/{id}/restore")
	public ResponseEntity<NoteResponseDTO> restoreNote(@PathVariable int id) {

		return ResponseEntity.ok(noteService.restoreNote(id, currentUserId()));
	}

	
	
	
	@PatchMapping("/{id}/pin")
	public ResponseEntity<NoteResponseDTO> pinNote(@PathVariable int id) {

		return ResponseEntity.ok(noteService.pinNote(id, currentUserId()));
	}

	
	
	
	@PostMapping("/{id}/tags/{tagId}")
	public ResponseEntity<Void> addTag(@PathVariable int id, @PathVariable int tagId) {

		noteService.addTag(id, currentUserId(), tagId);

		return ResponseEntity.ok().build();
	}

	
	
	
	@DeleteMapping("/{id}/tags/{tagId}")
	public ResponseEntity<Void> removeTag(@PathVariable int id, @PathVariable int tagId) {

		noteService.removeTag(id, currentUserId(), tagId);

		return ResponseEntity.noContent().build();
	}
}