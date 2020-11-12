package com.simple.notepadsimple.listeners;

import com.simple.notepadsimple.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
