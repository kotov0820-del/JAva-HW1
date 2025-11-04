package PR6.Задание8;

import PR6.Задание7.Printable;
import PR6.Задание7.Journal;

// Класс Book, реализующий Printable
public class Book implements Printable {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году\n", name, author, year);
    }

    // Статический метод printBooks (Задание 8) [cite: 121]
    public static void printBooks(Printable[] printable) {
        System.out.println("\n--- Книги (Задание 8) ---");
        for (Printable p : printable) {
            // Используем instanceof для проверки типа [cite: 121]
            if (p instanceof Book) {
                Book b = (Book) p;
                System.out.println("Название книги: " + b.getName());
            }
        }
    }

    // main для тестирования Заданий 7, 8
    public static void main(String[] args) {
        System.out.println("--- Тест Заданий 7, 8: Printable ---");

        Printable[] items = new Printable[] {
                new Book("Война и мир", "Л. Н. Толстой", 1863),
                new Journal("Хакер"),
                new Book("Отцы и дети", "И. Тургенев", 1862),
                new Journal("Компьютерра")
        };

        // 1. Вывод всех объектов (полиморфизм)
        System.out.println("--- Все объекты ---");
        for (Printable item : items) {
            item.print();
        }

        // 2. Тест Задания 7 (Журналы)
        Journal.printMagazines(items);

        // 3. Тест Задания 8 (Книги)
        Book.printBooks(items);
    }
}