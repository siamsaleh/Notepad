package com.simple.notepadsimple.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.simple.notepadsimple.dao.NoteDao;
import com.simple.notepadsimple.entities.Note;

@Database(entities = Note.class, version = 1, exportSchema = false)

public abstract class NoteDatabase extends RoomDatabase {
    private static NoteDatabase noteDatabase;

    public static synchronized NoteDatabase getDatabase(Context context){
        if (noteDatabase == null){
            noteDatabase = Room.databaseBuilder(
                    context,
                    NoteDatabase.class,
                    "notes_db"
            ).build();

        }
        return noteDatabase;
    }

    public abstract NoteDao noteDao();

}
