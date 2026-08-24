package com.fundoonotes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.User;

public interface NoteRepository extends JpaRepository<Note, Integer>, JpaSpecificationExecutor<Note> {

	List<Note> findByOwner(User owner);

	Optional<Note> findByNoteIdAndOwner(int noteId, User owner);
}