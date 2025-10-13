package PR5.Задание7;

import PR5.Задание6.Printable;

public class Book implements Printable {
    private String title;
    public Book(String title) { this.title = title; }
    @Override
    public void print() {
        System.out.println("Печать книги: " + title);
    }
}