package PR12.Задание1;// Файл: Exception1.java
import java.util.Scanner;

public class Exception1 {

    // Шаг 1: Код, который "ломается" (закомментирован, чтобы можно было запустить Шаг 3)
    /*
    public void exceptionDemo_step1() {
        System.out.println(2/0); 
    }
    */

    // Шаг 3: Код с try-catch (Листинг 18.3)
    public void exceptionDemo() {
        try {
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    // Добавленный метод main для запуска
    public static void main(String[] args) {
        Exception1 demo = new Exception1();

        System.out.println("--- Задание 1, Шаг 3: Обработка ---");
        demo.exceptionDemo();
        System.out.println("Программа не сломалась!");

        // Чтобы увидеть сбой Шага 1, раскомментируйте код ниже 
        // и перезапустите (программа упадет до вывода сообщения "Программа завершена").
        // System.out.println("\n--- Задание 1, Шаг 1: Сбой ---");
        // demo.exceptionDemo_step1(); 

        System.out.println("Программа завершена.");
    }
}