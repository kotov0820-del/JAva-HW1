
import java.util.Scanner;

 public class Задание2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 1. Вводим размер массива
            System.out.print("Введите количество элементов массива: ");
            int n = sc.nextInt();

            int[] numbers = new int[n];

            // 2. Вводим элементы массива
            System.out.println("Введите " + n + " целых чисел:");
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }

            // 3. Сумма элементов с помощью do while
            int i = 0;
            int sumDoWhile = 0;
            do {
                sumDoWhile += numbers[i];
                i++;
            } while (i < n);

            // 4. Сумма элементов с помощью while
            int j = 0;
            int sumWhile = 0;
            while (j < n) {
                sumWhile += numbers[j];
                j++;
            }

            // 5. Находим минимальный и максимальный элемент
            int min = numbers[0];
            int max = numbers[0];

            for (int k = 1; k < n; k++) {
                if (numbers[k] < min) {
                    min = numbers[k];
                }
                if (numbers[k] > max) {
                    max = numbers[k];
                }
            }

            // 6. Выводим результат
            System.out.println("Сумма элементов (do while): " + sumDoWhile);
            System.out.println("Сумма элементов (while): " + sumWhile);
            System.out.println("Минимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);
        }
    }
