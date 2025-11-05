package PR12.Задание7;// Файл: ThrowsDemo7.java
import java.util.Scanner;

public class ThrowsDemo7 {

    // Шаг 1: Метод, который либо ловит, либо объявляет (throws) исключение
    public void getKey() { // Должен объявить throws Exception!
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        String key = myScanner.next();

        // Так как printDetails объявляет throws Exception, getKey должен поймать или объявить.
        try {
            printDetails(key);
        } catch (Exception e) {
            System.err.println("getKey caught: " + e.getMessage());
        }
    }

    // Метод, который ловит, но затем повторно выбрасывает (requires 'throws Exception')
    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            // throw e выбрасывает проверяемое исключение, поэтому метод должен объявить 'throws Exception'
            throw e;
        }
    }

    // Метод, который выбрасывает проверяемое исключение (requires 'throws Exception')
    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    // Добавленный метод main для запуска
    public static void main(String[] args) {
        ThrowsDemo7 demo = new ThrowsDemo7();

        System.out.println("--- Задание 7: Проверяемое исключение ---");
        // Введите: "" (пустая строка) для вызова исключения.
        demo.getKey();

        System.out.println("\nПрограмма завершена (исключение перехвачено в getKey).");
    }
}