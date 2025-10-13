package PR4.Задание4_1.Задание5;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String fullName;
    private String readerTicketNumber;
    private String faculty;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private List<Book> takenBooks;

    public Reader(String fullName, String readerTicketNumber, String faculty, LocalDate dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.takenBooks = new ArrayList<>();
    }

    // Методы takeBook() и returnBook()

    // takeBook(), который будет принимать количество взятых книг.
    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    // takeBook, который будет принимать переменное количество названий книг (String...).
    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    // takeBook, который будет принимать переменное количество объектов класса Book.
    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            this.takenBooks.add(books[i]); // Добавляем книги в список читателя
            System.out.print(books[i].toString());
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    // returnBook(), который будет принимать количество возвращенных книг.
    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги.");
    }

    // returnBook, который будет принимать переменное количество названий книг (String...).
    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            // В реальной реализации здесь нужно удалять книги из takenBooks
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    // returnBook, который будет принимать переменное количество объектов класса Book.
    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            this.takenBooks.remove(books[i]); // Удаляем книги из списка читателя (простое удаление по объекту)
            System.out.print(books[i].toString());
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    // Геттеры для информации о читателе
    public String getFullName() {
        return fullName;
    }

    public String getReaderTicketNumber() {
        return readerTicketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Book> getTakenBooks() {
        return takenBooks;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", readerTicketNumber='" + readerTicketNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", takenBooksCount=" + takenBooks.size() +
                '}';
    }
}