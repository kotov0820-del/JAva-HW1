package PR12.Задание5;

// Файл: ThrowsDemo5.java
public class ThrowsDemo5 {

    // Шаг 2: Метод с try-catch внутри
    public void getDetails(String key) {
        try {
            if (key == null) {
                // throw new NullPointerException(...)
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
            System.out.println("Key processed successfully.");
        } catch (NullPointerException e) {
            System.err.println("Exception handled locally: " + e.getMessage());
        }
    }

    // Добавленный метод main для запуска
    public static void main(String[] args) {
        ThrowsDemo5 demo = new ThrowsDemo5();

        System.out.println("--- Задание 5: Локальная обработка ---");
        demo.getDetails(null); // Вызывает исключение
        demo.getDetails("test"); // Успешное выполнение
        System.out.println("Программа не сломалась.");
    }
}
