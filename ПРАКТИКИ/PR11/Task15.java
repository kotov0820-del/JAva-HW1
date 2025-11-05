package PR11;

public class Task15 {

    /**
     * Рекурсивно выводит цифры числа N справа налево.
     * @param n Натуральное число.
     */
    public static void printDigitsRightToLeft(int n) {
        // Шаг рекурсии (Вывод): Выводим последнюю цифру текущего числа
        System.out.print(n % 10 + " ");

        if (n >= 10) {
            // Шаг рекурсии (Вызов): Вызываем для оставшейся части числа
            printDigitsRightToLeft(n / 10);
        }
        // Базовый случай: n < 10 (одна цифра), рекурсия останавливается
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Цифры числа " + number + " справа налево:");
        printDigitsRightToLeft(number); // Вывод: 5 4 3 2 1
    }
}