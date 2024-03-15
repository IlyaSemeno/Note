
import java.util.Date;
public class Note {
    private String title;
    private String content;
    private Date dateCreated;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.dateCreated = new Date(); // Дата создания заметки - текущая дата и время
    }

    // Геттеры и сеттеры

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "[" + dateCreated.toString() + "] " + title + ": " + content;
    }
}
