package PR11;

public class Task14 {

    /**
     * Рекурсивно выводит цифры числа N слева направо.
     * @param n Натуральное число.
     */
    public static void printDigitsLeftToRight(int n) {
        if (n < 10) {
            // Базовый случай: Достигнута первая цифра
            System.out.print(n + " ");
        } else {
            // Шаг рекурсии: Сначала рекурсивный вызов для n / 10
            printDigitsLeftToRight(n / 10);

            // Затем вывод последней цифры (которая была следующей слева направо)
            System.out.print(n % 10 + " ");
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Цифры числа " + number + " слева направо:");
        printDigitsLeftToRight(number); // Вывод: 1 2 3 4 5
    }
}