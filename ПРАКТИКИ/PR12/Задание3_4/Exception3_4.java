package PR12.Задание3_4;// Файл: Exception3_4.java (На основе Задания 2)
import java.util.Scanner;

public class Exception3_4 {

    // Объединение Задания 2, 3 и 4
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        } catch (NumberFormatException e) {
            System.err.println("CATCH (Specific): Input is not a valid integer.");
        } catch (ArithmeticException e) {
            System.err.println("CATCH (Specific): Attempted division by zero.");
        } catch (Exception e) { // Задание 3: Общее исключение (должно быть последним!)
            System.err.println("CATCH (General): An unexpected exception occurred: " + e.getClass().getName());
        } finally { // Задание 4: Блок, который выполняется всегда
            System.out.println("FINALLY: Execution of exceptionDemo is complete.");
        }
        // myScanner.close();
    }

    // Добавленный метод main для запуска
    public static void main(String[] args) {
        Exception3_4 demo = new Exception3_4();

        System.out.println("--- Задание 3 & 4: Общее CATCH и FINALLY ---");
        // Введите Qwerty (NFE), 0 (AE), 2 (успех)
        demo.exceptionDemo();
    }
}