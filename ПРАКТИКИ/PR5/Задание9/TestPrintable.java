package PR5.Задание9;

import PR5.Задание6.Printable;
import PR5.Задание7.Book;
import PR5.Задание8.ShopPrintable;

public class TestPrintable {
    public static void main(String[] args) {
        System.out.println("\n--- Задание 9: Тестирование Printable ---");
        Printable[] printables = new Printable[4];
        printables[0] = new Book("Война и мир");
        printables[1] = new Magazine("Наука и жизнь");
        printables[2] = new Book("Мастер и Маргарита");
        printables[3] = new ShopPrintable("Озон");

        for (Printable p : printables) {
            p.print();
        }
    }
}