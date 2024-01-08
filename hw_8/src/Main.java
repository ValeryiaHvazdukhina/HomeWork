import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Pinocchio", "Carlo Collodi of Florence", " "));
        books.add(new Book("Alice's Adventures in Wonderland", "Lewis Carrolle", " "));
        books.add(new Book("Dyadya Stepa", "Sergey Mikhalkove", " "));

        Book Pinocchio = books.get(0);
        Book Alice_in_Wonderland = books.get(1);
        Book Dyadya_Stepa = books.get(2);

        List<Reader> readers = new ArrayList<>();
        readers.add(new Reader("Vasiliy", 111, "FES", "09.09.91", "111"));
        readers.add(new Reader("Eugenia", 222, "FES", "11.11.91", "222"));

        Reader Vasiliy  = readers.get(0);
        Reader Eugenia  = readers.get(1);

        Vasiliy.takeBook(Pinocchio);
        Vasiliy.takeBook(Alice_in_Wonderland);
        Vasiliy.printStatus();
        Vasiliy.returnBook(Alice_in_Wonderland);
        Vasiliy.returnBook(Dyadya_Stepa);

    }
}