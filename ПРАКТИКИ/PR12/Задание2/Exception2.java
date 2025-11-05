package PR12.Задание2;// Файл: Exception2.java
import java.util.Scanner;

public class Exception2 {

    // Шаг 3: Код с try-catch (исправленный для перехвата двух исключений)
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString); // NumberFormatException при "Qwerty", "1.2"
            System.out.println(2/i);             // ArithmeticException при "0"
        } catch (NumberFormatException e) {
            System.err.println("Error: Input is not a valid integer. Details: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Error: Attempted division by zero.");
        }
        // myScanner.close();
    }

    // Добавленный метод main для запуска
    public static void main(String[] args) {
        Exception2 demo = new Exception2();

        System.out.println("--- Задание 2: Тестирование исключений ---");
        // Введите: Qwerty, затем 0, затем 1 для проверки всех путей.
        demo.exceptionDemo();
        demo.exceptionDemo();
        demo.exceptionDemo();
    }
}