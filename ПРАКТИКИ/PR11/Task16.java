package PR11;

import java.util.Scanner;

public class Task16 {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Рекурсивно находит максимум и количество его повторений.
     * @return Массив int[2], где [0] - максимум, [1] - количество его повторений.
     * Не принимает параметров, считывает данные с клавиатуры. [cite: 111]
     */
    public static int[] findMaxAndCount() {
        if (!scanner.hasNextInt()) {
            return new int[]{0, 0}; // Ошибка считывания
        }

        int current = scanner.nextInt();

        if (current == 0) {
            // Базовый случай: Конец последовательности (число 0) [cite: 109]
            // Возвращаем "пустой" результат.
            // Гарантируется, что последовательность не пуста (кроме нуля) [cite: 116]
            return new int[]{0, 0};
        }

        // Шаг рекурсии: Получаем результат для остальной части
        int[] resultTail = findMaxAndCount();
        int maxTail = resultTail[0];
        int countTail = resultTail[1];

        // Сравниваем текущий элемент с максимумом оставшейся части
        if (current > maxTail) {
            // Текущий элемент - новый, больший максимум
            return new int[]{current, 1};
        } else if (current == maxTail) {
            // Текущий элемент равен максимуму, увеличиваем счетчик
            return new int[]{maxTail, countTail + 1};
        } else { // current < maxTail
            // Текущий элемент меньше максимума, возвращаем старые значения
            return new int[]{maxTail, countTail};
        }
    }

    public static void main(String[] args) {
        // Для тестирования можно ввести, например: 10 5 20 10 20 0
        System.out.println("Введите последовательность (завершите нулем):");
        int[] result = findMaxAndCount();
        System.out.println("Максимальный элемент: " + result[0]);
        System.out.println("Количество элементов, равных максимуму: " + result[1]);
    }
}