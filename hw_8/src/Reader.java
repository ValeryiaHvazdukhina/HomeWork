import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String FIO;
    private int readerTicket;
    private String Faculty;
    private String dateOfBirth;
    private String phoneNumber;
    private List<Book> takenBooks;

    Reader(String FIO, int readerTicket, String Faculty, String dateOfBirth, String phoneNumber) {
        this.FIO = FIO;
        this.readerTicket = readerTicket;
        this.Faculty = Faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.takenBooks = new ArrayList<>();
    }

    public void takeBook(Book book) {
        takenBooks.add(book);
        System.out.println(FIO + " взял книгу " + "\"" + book.getName() + "\"");
    }


    public void printStatus() {
        System.out.print(FIO + " взял " + takenBooks.size() + " книгу/книги: ");
        for (int i = 0; i < takenBooks.size(); i++) {
            System.out.print("\"" + takenBooks.get(i).getName() + "\"" + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book book) {
        boolean bookReturned = false;
        for (int i = 0; i < takenBooks.size(); i++) {
            if (takenBooks.get(i).equals(book)) {
                System.out.println(FIO + " вернул книгу " + "\"" + book.getName() + "\"");
                takenBooks.remove(book);
                bookReturned = true;
                break;
            }
        }
        if (!bookReturned) {
            System.out.println(FIO + " не хранит книгу " + "\"" + book.getName() + "\"");
        }
    }
}