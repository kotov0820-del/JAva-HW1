package PR12.Задание8;

import java.util.Scanner;

public class ThrowsDemo8 {

    // Главный метод, который обрабатывает ввод и исключения
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean inputSuccessful = false;

        // Цикл повторяется до тех пор, пока ввод не будет успешным
        while (!inputSuccessful) {
            System.out.print("\nEnter key (enter nothing, i.e., empty string, to trigger error): ");

            // Внимание: nextLine() используется для считывания пустой строки
            String key = myScanner.nextLine();

            try {
                // Вызываем метод, который может выбросить исключение
                printDetails(key);

                // Если printDetails выполнился успешно, выходим из цикла
                inputSuccessful = true;
            } catch (Exception e) {
                // Перехватываем исключение, выброшенное в printDetails/getDetails
                System.err.println("--- Error: " + e.getMessage() + " ---");
                System.out.println("Please try again.");
                // inputSuccessful остается false, цикл повторяется
            }
        }
        myScanner.close();
    }

    // Метод, который передает проверяемое исключение выше (throws Exception)
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println("Result: " + message);
    }

    // Метод, который генерирует (выбрасывает) проверяемое исключение (throw new Exception)
    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) { // Используем isEmpty() для проверки на пустую строку
            // Генерируем исключение
            throw new Exception("Key cannot be an empty string!");
        }
        return "data for " + key;
    }

    // Добавленный метод main для запуска
    public static void main(String[] args) {
        System.out.println("--- Задание 8: Обработка ошибок в цикле ---");
        new ThrowsDemo8().getKey();
        System.out.println("\nПрограмма завершена успешно после корректного ввода.");
    }
}