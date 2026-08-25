package com.fundoonotes.batch;

import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.User;
import com.fundoonotes.repository.NoteRepository;
import com.fundoonotes.repository.UserRepository;
import org.springframework.batch.infrastructure.item.ItemReader;

import java.util.Iterator;
import java.util.List;

public class UserNotesReader implements ItemReader<Note> {

    private final NoteRepository noteRepository;
    private final UserRepository userRepository;
    private final int userId;
    private Iterator<Note> noteIterator;
    private boolean initialized = false;

    public UserNotesReader(NoteRepository noteRepository, UserRepository userRepository, int userId) {
        this.noteRepository = noteRepository;
        this.userRepository = userRepository;
        this.userId = userId;
    }

    @Override
    public Note read() throws Exception {
        if (!initialized) {
            User owner = userRepository.findById(userId)
                    .orElseThrow(() -> new IllegalArgumentException("User not found: " + userId));
            List<Note> notes = noteRepository.findByOwner(owner);
            this.noteIterator = notes.iterator();
            this.initialized = true;
        }

        if (noteIterator != null && noteIterator.hasNext()) {
            return noteIterator.next();
        }
        return null; // Return null to signal end of data
    }
}
