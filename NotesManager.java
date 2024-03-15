import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotesManager {
    private List<Note> notes;

    public NotesManager() {
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public void editNote(int index, Note editedNote) {
        if (index >= 0 && index < notes.size()) {
            notes.set(index, editedNote);
        } else {
            System.out.println("Неверный индекс заметки");
        }
    }

    public void deleteNote(int index) {
        if (index >= 0 && index < notes.size()) {
            notes.remove(index);
        } else {
            System.out.println("Неверный индекс заметки");
        }
    }

    public List<Note> getNotes() {
        return notes;
    }

    public List<Note> filterNotesByDate(Date startDate, Date endDate) {
        List<Note> filteredNotes = new ArrayList<>();
        for (Note note : notes) {
            if (note.getDateCreated().after(startDate) && note.getDateCreated().before(endDate)) {
                filteredNotes.add(note);
            }
        }
        return filteredNotes;
    }
}
