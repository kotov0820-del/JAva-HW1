package PR4.Задание4_1.Задание5;
import java.time.LocalDate;

public class LibraryTester {
    public static void main(String[] args) {
        // Создаем массив объектов класса Reader
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В. В.", "001", "Информатика", LocalDate.of(1990, 5, 15), "111-22-33");
        readers[1] = new Reader("Сидорова А. И.", "002", "Филология", LocalDate.of(1988, 11, 22), "444-55-66");
        readers[2] = new Reader("Козлов И. С.", "003", "Экономика", LocalDate.of(1995, 3, 10), "777-88-99");

        System.out.println("--- Список читателей ---");
        for (Reader reader : readers) {
            System.out.println(reader);
        }

        // Создаем несколько объектов книг
        Book book1 = new Book("Приключения", "Жюль Верн");
        Book book2 = new Book("Словарь", "Ожегов С.И.");
        Book book3 = new Book("Энциклопедия", "Большая Советская Энциклопедия");
        Book book4 = new Book("Война и мир", "Л.Н. Толстой");

        System.out.println("\n--- Демонстрация методов takeBook() ---");

        // takeBook, который будет принимать количество взятых книг.
        readers[0].takeBook(3);

        // takeBook, который будет принимать переменное количество названий книг.
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");

        // takeBook, который будет принимать переменное количество объектов класса Book.
        readers[0].takeBook(book1, book2, book3);
        System.out.println("Книги у Петрова: " + readers[0].getTakenBooks());


        System.out.println("\n--- Демонстрация методов returnBook() ---");

        // returnBook, который будет принимать количество возвращенных книг.
        readers[0].returnBook(3);

        // returnBook, который будет принимать переменное количество названий книг.
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");

        // returnBook, который будет принимать переменное количество объектов класса Book.
        readers[0].returnBook(book1, book4); // book4 не была взята, но для примера

        System.out.println("Книги у Петрова после возврата: " + readers[0].getTakenBooks());
    }
}