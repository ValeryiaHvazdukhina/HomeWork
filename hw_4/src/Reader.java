public class Reader {
    private String FIO;
    private int readerTicket;
    private String Faculty;
    private String dateOfBirth;
    private String phoneNumber;
    private Book[] books;
    private int bookAmount;


    Reader(String FIO, int readerTicket, String Faculty, String dateOfBirth, String phoneNumber) {
        this.FIO = FIO;
        this.readerTicket = readerTicket;
        this.Faculty = Faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        books = new Book[10];
        bookAmount = 0;
    }

    public void takeBook(Book book) {
        // <Book> Books.add(book());
        books[bookAmount] = book;
        bookAmount++;
        System.out.println(FIO + " взял книгу " + book.getName());
    }

    public void printStatus() {
        System.out.print(FIO + " взял " + bookAmount + " книгу/книги: ");
        for (int i = 0; i < bookAmount; i++) {
            System.out.print(books[i].getName() + ", ");
        }
        System.out.println();
    }


    public void returnBook(Book book) {
        boolean hasBook = false;
        for (int i = 0; i < bookAmount; i++) {
            if (books[i].equals(book)) {
                System.out.println(FIO + " вернул книгу " + book.getName());
                for (books[i] = book; i < bookAmount; i++) {
                    books[i] = books[i + 1];
                }
                bookAmount -= 1;
                hasBook = true;
                break;
            }
        }
        if (!hasBook) {
            System.out.println(FIO + " не хранит книгу " + book.getName());
        }
    }
}