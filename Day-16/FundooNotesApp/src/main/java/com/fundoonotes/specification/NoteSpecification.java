package com.fundoonotes.specification;

import org.springframework.data.jpa.domain.Specification;

import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.User;

public class NoteSpecification {

	public static Specification<Note> hasOwner(User owner) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("owner"), owner);
	}

	
	
	
	public static Specification<Note> hasTitle(String title) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.like(criteriaBuilder.lower(root.get("title")),
				"%" + title.toLowerCase() + "%");
	}

	
	
	
	public static Specification<Note> hasState(Note.NoteState state) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("state"), state);
	}

	
	
	
	public static Specification<Note> isPinned(boolean pinned) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("pinned"), pinned);
	}
}