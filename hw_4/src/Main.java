import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Pinocchio", "Carlo Collodi of Florence", " ");
        Book book2 = new Book("Alice's Adventures in Wonderland", "Lewis Carrolle", " ");
        Book book3 = new Book("Dyadya Stepa", "Sergey Mikhalkove", " ");

        Reader Vasiliy = new Reader("Vasiliy", 111, "FES", "11.11.91", "111");

        Vasiliy.takeBook(book1);
        Vasiliy.takeBook(book2);
        Vasiliy.printStatus();
        Vasiliy.returnBook(book2);
        Vasiliy.printStatus();
        Vasiliy.returnBook(book3);
    }
}