import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotesManager manager = new NotesManager();
        Scanner scanner = new Scanner(System.in);

        // Пример добавления заметок
        manager.addNote(new Note("Заметка 1", "Содержание заметки 1"));
        manager.addNote(new Note("Заметка 2", "Содержание заметки 2"));
        manager.addNote(new Note("Заметка 3", "Содержание заметки 3"));

        // Пример редактирования заметки
        Note editedNote = new Note("Изменённая заметка", "Новое содержание заметки");
        manager.editNote(1, editedNote);

        // Пример удаления заметки
        manager.deleteNote(0);

        // Пример чтения списка заметок
        List<Note> notes = manager.getNotes();
        for (Note note : notes) {
            System.out.println(note);
        }

        // Пример фильтрации заметок по дате
        // Для фильтрации можно использовать, например, Calendar для установки даты начала и конца периода
        // Здесь просто создаётся две даты для демонстрации
        Date startDate = new Date();
        Date endDate = new Date(startDate.getTime() + 86400000); // Дата начала + 1 день в миллисекундах
        List<Note> filteredNotes = manager.filterNotesByDate(startDate, endDate);
        System.out.println("Заметки в период с " + startDate.toString() + " по " + endDate.toString() + ":");
        for (Note note : filteredNotes) {
            System.out.println(note);
        }
    }
}
