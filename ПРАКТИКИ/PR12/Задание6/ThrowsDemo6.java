package PR12.Задание6;

// Файл: ThrowsDemo6.java
public class ThrowsDemo6 {

    // Вызывающий метод - ловит исключение
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            // Исключение обработано здесь, в вызывающем методе
            System.err.println("Error in printMessage: Key was null. Handling gracefully.");
        }
    }

    // Вызванный метод - выбрасывает исключение
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    // Добавленный метод main для запуска
    public static void main(String[] args) {
        ThrowsDemo6 demo = new ThrowsDemo6();

        System.out.println("--- Задание 6: Обработка выше по стеку ---");

        System.out.println("\nСценарий 1: null ключ (Exception handled)");
        demo.printMessage(null);

        System.out.println("\nСценарий 2: валидный ключ (Success)");
        demo.printMessage("test_key");
    }
}