public class Book {
    private String name;
    private String authorName;
    private String text;

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setText(String text) {
        this.text = text;
    }

    Book(String name, String authorName, String text) {
        this.name = name;
        this.authorName = authorName;
        this.text = text;
    }
}