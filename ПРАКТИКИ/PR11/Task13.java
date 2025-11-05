package PR11;

import java.util.Scanner;

public class Task13 {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Рекурсивно выводит 1-й, 3-й, 5-й... элементы последовательности.
     * Не принимает параметров и использует Scanner внутри.
     */
    public static void printOddIndexedElements() {
        // Шаг 1: Считываем элемент с нечетным номером (например, 1-й, 3-й, 5-й)
        if (scanner.hasNextInt()) {
            int oddElement = scanner.nextInt();

            if (oddElement == 0) {
                // Базовый случай 1: Последовательность завершена
                return;
            }

            // Выводим элемент с нечетным номером
            System.out.println(oddElement);

            // Шаг 2: Считываем элемент с четным номером (например, 2-й, 4-й, 6-й)
            if (scanner.hasNextInt()) {
                int evenElement = scanner.nextInt();

                if (evenElement == 0) {
                    // Базовый случай 2: Последовательность завершена после четного элемента
                    return;
                }

                // Шаг рекурсии: Переходим к следующей паре элементов
                printOddIndexedElements();
            }
        }
    }

    public static void main(String[] args) {
        // Основная программа состоит только из вызова этой функции [cite: 96, 101]
        // (Для тестирования можно ввести, например: 1 2 3 4 5 6 0)
        printOddIndexedElements();
    }
}